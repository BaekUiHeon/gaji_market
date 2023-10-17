package kh.spring.gaji.goods.controller;

import java.io.File;
import java.io.IOException;
import java.security.Principal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import io.github.cdimascio.dotenv.Dotenv;
import kh.spring.gaji.category.model.service.CategoryService;
import kh.spring.gaji.file.controller.UploadController;
import kh.spring.gaji.file.model.dto.FileDto;
import kh.spring.gaji.file.model.service.FileService;
import kh.spring.gaji.goods.model.Service.GoodsService;
import kh.spring.gaji.goods.model.dto.GoodsDto;
import kh.spring.gaji.goods.model.dto.GoodsInfoDto;
import kh.spring.gaji.goods.model.dto.GoodsListDto;
import kh.spring.gaji.goods.model.dto.GuDongInfoDto;
import kh.spring.gaji.region.model.dto.DongDto;
import kh.spring.gaji.region.model.service.RegionService;
import kh.spring.gaji.user.model.dto.UserSafeTradingDto;
import kh.spring.gaji.user.model.service.UserService;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	Dotenv dotenv = Dotenv.load();
	Cloudinary cloudinary = new Cloudinary(dotenv.get("CLOUDINARY_URL"));

	private final int PAGESIZE=20;
	private final int PAGEBLOCKSIZE=5;
	
	@Autowired
	private GoodsService goodsService;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private RegionService regionService;

	@Autowired
	private FileService fileService;
	
	@Autowired
	private UserService userService;

	@GetMapping("/board")
	public String board(Model model,Integer currentPage,String searchWord,Integer sort,Integer priceFloor, Integer priceCeiling,Integer category,Integer guId,String guName,String dongName,Integer dongId,Principal principal) { // 중고거래 게시판
		model.addAttribute("guList", regionService.guList());
	
		String userId=null;
		try{
		if((userId=principal.getName())!=null) {
			model.addAttribute("userId",userId);
		if(guId==null && dongId==null) {
			GuDongInfoDto guDongInfo=goodsService.getGuDongInfo(userId);
			model.addAttribute("guId",guId=guDongInfo.getGuId());
			model.addAttribute("dongList", regionService.dongList(guId));
			model.addAttribute("guName",guName=guDongInfo.getGuName());
			model.addAttribute("dongId",dongId=guDongInfo.getDongId());
			model.addAttribute("dongName",guName=guDongInfo.getDongName());
		}
		else {
			if(guId!=null) {
				model.addAttribute("guId",guId);
				model.addAttribute("guName",guName);
				model.addAttribute("dongList", regionService.dongList(guId));
			}

			if(dongName!=null&&!dongName.equals("")) {
				model.addAttribute("dongName",dongName);
				model.addAttribute("dongId", dongId);
			}
			}
		}

		}catch(NullPointerException e) {
			if(guId!=null) {
				model.addAttribute("guId",guId);
				model.addAttribute("guName",guName);
				model.addAttribute("dongList", regionService.dongList(guId));
			}
			if(dongName!=null&&!dongName.equals("")) {
				model.addAttribute("dongName",dongName);
				model.addAttribute("dongId", dongId);
			}
			e.printStackTrace();
		}
		
		int totalCnt=0;
		List<GoodsListDto> goodsListDto=null;
		
		if(currentPage==null)	//현재 페이지가 들어온게 없다면 1페이지.
			currentPage=1;
		
		if(searchWord==null||searchWord.equals("")) {
			searchWord="";
		}	
		else if(searchWord.charAt(0)!='%')
			searchWord="%"+searchWord+"%";
		
		if(priceCeiling==null)
			priceCeiling=-1;			
		if(category==null)
			category=-1;
		if(sort==null)
			sort=-1;
		if(dongId==null)
			dongId=-1;
		
		
		Map<String,Object> map= goodsService.getGoodsList((int)currentPage,PAGESIZE,sort,priceCeiling,category,dongId,searchWord);
		goodsListDto = (List<GoodsListDto>)map.get("goodsListDto");
		totalCnt= (int)map.get("totalCnt");	

		//구해온 목록으로 페이징번호들 구하고 JSP로 전송하기
		int totalPageNum = totalCnt/PAGESIZE + (totalCnt%PAGESIZE == 0 ? 0 : 1);
		int startPageNum = 1;
		if((currentPage%PAGEBLOCKSIZE) == 0) {
			startPageNum = ((currentPage/PAGEBLOCKSIZE)-1)*PAGEBLOCKSIZE +1;
		} else {
			startPageNum = ((currentPage/PAGEBLOCKSIZE))*PAGEBLOCKSIZE +1;
		}
		int endPageNum = (startPageNum+PAGEBLOCKSIZE > totalPageNum) ? totalPageNum : startPageNum+PAGEBLOCKSIZE-1;
		model.addAttribute("totalPageNum", totalPageNum);
		model.addAttribute("startPageNum", startPageNum);
		model.addAttribute("endPageNum", endPageNum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("goodsListDto",goodsListDto);
		model.addAttribute("totalCnt",totalCnt);
		model.addAttribute("category",category);
		model.addAttribute("priceCeiling",priceCeiling);
		model.addAttribute("searchWord",searchWord);
		model.addAttribute("goodsListDto",goodsListDto);
		model.addAttribute("sort",sort);
		model.addAttribute("topPrice",(int)map.get("topPrice"));
		model.addAttribute("averagePrice",(int)map.get("averagePrice"));
		model.addAttribute("bottomPrice",(int)map.get("bottomPrice"));
		return "goods/goodsboard";
	}

	@GetMapping("/write")
	public ModelAndView write(ModelAndView mv) { // 중고거래 게시판 글 작성
		mv.setViewName("goods/goodswrite");
		mv.addObject("categoryList", categoryService.categoryList());
		mv.addObject("dongList", regionService.dongList());
		mv.addObject("guList", regionService.guList());
		return mv;
	}

	@Transactional
	@PostMapping("/write.do")
	public String wirteDo(GoodsDto goodsDto, RedirectAttributes ra,
			@RequestParam(value = "files", required = false) MultipartFile[] files, FileDto fileDto)
			throws IOException {
		if (goodsService.insertGoods(goodsDto) > 0) {
			System.out.println(files.length);
			if (files != null && files.length > 0) {
				Map params1 = ObjectUtils.asMap("use_filename", true, "unique_filename", true, "overwrite", false);
				for (MultipartFile file : files) {
					if (file.getSize() > 0) {
						System.out.println(file.getName());
						System.out.println(file.getSize());
						File imageFile = new UploadController().convertMultipartFileToFile(file);
						Map imageUrl2 = cloudinary.uploader().upload(imageFile, params1);
						String imageUrl = cloudinary.url().generate((String) imageUrl2.get("secure_url"));
						fileDto.setUrl(imageUrl);
						fileService.insertFile(fileDto);
					}
				}
			}
			ra.addFlashAttribute("msg", "상품 등록이 성공하였습니다.");
			return "redirect:/goods/board"; // 성공 시 게시판으로 리다이렉트
		} else {
			ra.addFlashAttribute("msg", "상품 등록이 실패하였습니다. 다시 시도해주십시오.");
			return "redirect:/goods/goodswrite"; // 실패 시 다시 글 작성 페이지로 이동
		}
	}
	
	@GetMapping("/get")
	public ModelAndView getBoard(ModelAndView mv,int goodsId, GoodsInfoDto goodsDto) {	// 중고거래 게시판 글 상세보기
		
		System.out.println("getBoard진입확인");
		mv.setViewName("goods/goodsget");
		mv.addObject("goodsDto",goodsService.getGoodsInfo(goodsId)); //상품글 정보와 해당 상품 등록한 사용자의 정보
		mv.addObject("userInfo",goodsService.goodsUserInfo(goodsId));
		mv.addObject("userGoodsList", goodsService.userGoodsList(goodsId));
		goodsService.updateViewCount(goodsId);
		return mv;
	}
	
//	@GetMapping("/update")
//	public String update() { // 중고거래 게시판 글 수정
//		return "goods/goodsupdate";
//	}
	
	@PostMapping("/wish")
	@ResponseBody
	public String likeButton(@RequestParam Map<String, String> map) {
		
		
		try {
	        userService.insertWishList(map);
	        return "added"; // 찜하기 추가 성공
	    } catch (Exception e) {
	        userService.deleteWishList(map);
	        return "removed"; // 찜하기 제거 성공
	    }
		
	}

	
	@PostMapping("/getdong")
	@ResponseBody
	public List<DongDto> getdong(int guId) {
		return regionService.dongList(guId);
	}

//	@GetMapping("/get/map")
//	public String map() { // 중고거래 게시판에서 위치 설정 기능 -- 모달을 사용할 예정이라 페이지를 만들지 글 작성 페이지에 넣을지 고민 -천
//		return "goods/goodsmap";
//	}
}
