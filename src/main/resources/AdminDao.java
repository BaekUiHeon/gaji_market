import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import kh.spring.gaji.trade.model.domain.InFacePurchaseDomain;
import kh.spring.gaji.trade.model.domain.InFaceTradingInfoDomain;
import kh.spring.gaji.trade.model.domain.SafeTradingDomain;
import kh.spring.gaji.trade.model.domain.SafeTradingInfoDomain;

@Repository
public class AdminDao {
	@Autowired
	private SqlSession sqlSession;
	
	public List<InFacePurchaseDomain> InFacePurchaseDomain() {	//33P 직거래 조회 
		return sqlSession.selectList("admin.getetInfacePurchaseList");
	}
	
	public List<InFacePurchaseDomain> getSearchTitleInfacePurchaseList(String searchWord) {	//33P 직거래 조회 상품명
		searchWord="%"+searchWord+"%";
		return sqlSession.selectList("admin.getSearchTitleInfacePurchaseList",searchWord);
	}
	
	public List<InFacePurchaseDomain> getSearchIdInfacePurchaseList(String searchWord) {	//33P 직거래 조회 상품ID
		searchWord="%"+searchWord+"%";
		return sqlSession.selectList("admin.getSearchIdInfacePurchaseList",searchWord);
	}
	
	public List<InFacePurchaseDomain> getSearchUserInfacePurchaseList(String searchWord) {	//33P 직거래 조회 회원ID 
		searchWord="%"+searchWord+"%";
		return sqlSession.selectList("admin.getSearchUserInfacePurchaseList",searchWord);
	}
	
	public InFaceTradingInfoDomain getInfaceTradingInfo(int inFaceTradingId) {	//34P 관리자 직거래 세부조회
		return sqlSession.selectOne("admin.getInfaceTradingInfo",inFaceTradingId);
	}
	
	public List<SafeTradingDomain> getSafeTradingList() {	//35P 안전거래조회(관리자)
		return sqlSession.selectList("admin.getSafeTradingList");
	}
	
	public List<SafeTradingDomain> getSearchSafeTradingList(String searchWorld) {	//35P 안전거래 조회 검색(안전거래번호)
		searchWord="%"+searchWord+"%";
		return sqlSession.selectList("admin.getSearchSafeTradingList",searchWorld);
	}
	
	public List<SafeTradingDomain> getIdSearchSafeTradingList(String searchWorld) { // 35P 안전거래조회 검색(판매자ID)
		searchWord="%"+searchWord+"%";
		return sqlSession.selectList("admin.getIdSearchSafeTradingList",searchWorld);
	}
	
	public List<SafeTradingDomain> getGoodsSearchSafeTradingList(String searchWorld) {	//35P 안전거래조회 검색(상품명)
		searchWord="%"+searchWord+"%";
		return sqlSession.selectList("admin.getGoodsSearchSafeTradingList",searchWorld);
	}
	
	public SafeTradingInfoDomain getSafeTradingInfo(String searchWorld) {	//36P 안전거래 세부조회(관리자)
		searchWord="%"+searchWord+"%";
		return sqlSession.selectOne("admin.getGoodsSearchSafeTradingList",searchWorld);
	}
	
	public List<UserCountReportDomain> getUserList(int transactionId) {		//37P 회원정보조회 LIST 신고상위
		searchWord="%"+searchWord+"%";
		return sqlSession.selectList("admin.getUserList");
	}
	public List<UserCountReportDomain> adminGetUserList(int transactionId) {	//37P 거래상위 회원정보조회 LIST
		searchWord="%"+searchWord+"%";
		return sqlSession.selectList("admin.getUserList");
	}
	public UserInfoDomain getUserInfo(String userId) {	// 38P 회원정보 세부조회
		return sqlSession.selectOne("admin.getUserInfo");
	}
	public int banUser(String userId) {
		return sqlSession.update("admin.banUser",userId);	// 38P 유저 계정 정지
	}
	public int unBanUser(String userId) {
		return sqlSession.update("admin.unBanUser",userId);	// 38P 유저 계정 정지 해제
	} 
	public int insertBanUser(UserBlockingDto userBlockingDto) {	// 38P 계정정지 테이블에 아이디추가
		return sqlSession.insert("admin.insertBanUser",userBlockingDto);
	}
}
