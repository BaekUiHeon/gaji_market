# Gaji_Market (가지마켓) 

## [홈페이지 구경하기](http://ec2-3-34-124-55.ap-northeast-2.compute.amazonaws.com/)
게스트ID: rkwlakzpt(가지마켓) <br> 비밀번호: rkwlakzpt123(가지마켓123)
 <br> <br> <br><br>

<details>
<summary>목차</summary>



1. [기간](#프로젝트-기간)
2. [노션](#가지마켓-노션-구경하기click)
3. [팀원](#-팀-프로젝트)
4. [개발환경](#개발환경)
5. [다이어그램](#erd-cloud-구경하러-가기)
	- [ERD](#)
	- [UML](#)
6. [화면구성](#페이지)
- [메인페이지](#)
	- [헤더](#)/
	- [푸터](#)
- [로그인페이지](#)
	- [회원가입](#)
	- [아이디 찾기](#)
	- [비밀번호 찾기](#)
- [마이페이지](#)
	- [사이드바](#) 
	- [회원정보](#) (주소변경)
	- [비밀번호 변경](#)
	- [구매내역](#) (리뷰작성 신고)
	- [판매내역](#) (운송장등록 )
	- [판매 상품 글](#)
	- [찜 목록](#)
	- [모아보기 목록](#)
	- [알림 조회](#)
- [상품페이지](#)
	- [상품리스트](#)
	- [상품 상세조회](#) (결제)
	- [상품 등록](#) (수정)
- [결제페이지](#)
- [채팅페이지](#)
- [관리자페이지](#)
	- [유저리스트](#) ()

<br>
<br>
<br>
<br>
<br>

- [메인,상품 페이지 ](#메인-페이지-상품-리스트-페이지)
	- [메인페이지](#메인-페이지)
    - [상품 리스트 페이지](#상품-리스트-페이지)
- [마이페이지](#마이페이지---구매내역-판매내역-판매글-찜목록-모아보기-유저상품)
	- [구매,판매 내역](#구매-판매내역)
	- [판매글](#판매글)
	- [즐겨찾기](#즐겨찾기)
	- [상품 더보기](#상품-더보기)
- [결제](#결제-페이지-주소-변경-결제-진행-리뷰작성-추가-기능-ajax-구현)
	- [주소 변경](#주소-변경)
	- [결제 진행](#결제-진행)
	- [리뷰 작성](#리뷰-작성)
- [알림](#알림-기능)
	
7. [기능구현](#-프로젝트-기능구현)
8. [주요기능](#-주요기능)

</details>

<br>

## 프로젝트 기간
### 2023.08.22~2023.09.18 (프로젝트 설계) 
### 2023.09.19~2023.10.26 (프로젝트 구현 및 테스트)
### 2023.10.27~2023.10.30 (발표 자료 및 발표준비)

<br><br>

## [가지마켓 노션 구경하기(Click)](https://brave-hall-1f1.notion.site/98ac7c797b4443bb924189bb4d820d05?pvs=4)
<br><br>

## 📣 팀 프로젝트
- 팀장 : 김종호
- 팀원 : 천영준, 신정훈, 백의헌 

<br><br><br>


## 개발환경
|Category|Detail|
|--------|------|
|FrontEnd|HTML5, CSS, JavaScript, JQuery|
|BackEnd|Java(JDK 11.0.2), Spring Framework(5.3.19)|
|OS|Windows 10, MacOS|
|IDE|SpringToolSuite3, VSCode ,SQL Developer, DBeaver|
|Server|Tomcat 9.0|
|DateBase|Oracle(21c)|
|API|IamPort, CK Editor, Kakao Map, cloudinary, ipstack, Kakao(Daum) PostCode, Gmail SMPT|
|Library|AspectJ 1.9.19<br>ojdbc8 23.2.0.0<br>commons-lang3 3.8.1<br>slf4j 1.6.6<br>mybatis 3.5.9<br>spring-session 2.3.3.RELEASE<br>log4j 1.2.15<br>mybatis-spring 2.0.6<br>inject 1.0.0<br>lombok 1.18.28<br>Servlet API 4.0.1<br>spring-security 5.7.5<br>jackson 2.14.2<br>JSP API2.1<br>gson2.8.9<br>JSTL1.2<br>DBCP1.4<br>jackson2.10.2<br>iamport0.2.14<br>commons-fileupload 1.4<br>commons-io 2.6<br>cloudinary-http44 1.32.2<br>cloudinary-taglib 1.32.2<br>dotenv-java 2.2.4<br>javax.mail 1.4.7<br>spring-context-support 5.3.19<br>spring-websocket 5.3.19<br>stomp-websocket 2.3.3-1|

#
## [ERD Cloud 구경하러 가기](https://www.erdcloud.com/d/Lm5qwJ8DbtZ92bk3R)
#### ERD 담당자- `백의헌`

![](https://github.com/bellho/gaji_market/assets/135290607/67e87eab-1541-4db1-add1-3dfa03ff6d87)

## [UML]유스케이스 다이어그램(Usecase Diagram)


<br>

# 화면 구성

<!-- 여기에 화면구성 내용 -->

## 메인페이지
<!-- 여기에 메인페이지 내용 -->

<details><summary>

#### <u>***HEADER, FOOTER***</u>
</summary>

### 헤더
<!-- 여기에 헤더 내용 -->
### 푸터
<!-- 여기에 푸터 내용 -->
</details>

## 로그인 페이지
<!-- 여기에 로그인 내용 -->

<details><summary>

#### <u>***회원가입***</u>
</summary>

<!-- 여기에 회원가입 내용 -->
</details>
<!-- 회원가입 아이디찾기 간 사이 -->
<details><summary>

#### <u>***아이디 찾기, 비밀번호 찾기***</u>
</summary>
<!-- 여기에 아이디 비밀번호 내용 -->

### 아이디 찾기
<!-- 여기에 아이디 내용 -->
### 비밀번호 찾기
<!-- 여기에 비밀번호 내용 -->
</details>
<!-- 여기에 로그인페이지 마지막 내용 -->

## 마이 페이지
<!-- 여기에 마이페이지 내용 -->
<details><summary>

#### <u>***사이드바*** </u>
</summary>
<!-- 여기에 사이드바 내용 -->
</details>
<!-- 사이드바 회원정보 사이-->
<details><summary>

#### <u>***회원정보*** </u>
</summary>
<!-- 여기에 회원정보 내용 -->
</details>
<!-- 회원정보 비밀번호 변경 사이-->
<details><summary>

#### <u>***비밀번호 변경*** </u>
</summary>
<!-- 여기에 비밀번호 변경 내용 -->
</details>
<!-- 비밀번호 변경 구,판매내역 사이-->
<details><summary>

#### <u>***구매내역, 판매내역,*** </u>
</summary>
<!-- 여기에 구매내역 , 판매내역 내용 -->
</details>
<!-- 구매판매내역 판매상품글 사이-->
<details><summary>

#### <u>***판매 상품 글*** </u>
</summary>
<!-- 여기에 판매 상품 글 내용 -->
</details>
<!-- 판매상품글 찜, 모아보기 사이-->
<details><summary>

#### <u>***찜 목록, 모아보기 목록*** </u>
</summary>
<!-- 여기에 찜 목록,모아보기 내용 -->
</details>
<!-- 찜, 모아보기 알림 사이-->
<details><summary>

#### <u>***알림조회*** </u>
</summary>
<!-- 알림 조회 내용 -->
</details>
<!-- 마이페이지 마지막 내용-->

## 상품 페이지
<!--여기에 상품 페이지 내용-->
<details><summary>

#### <u>***상품리스트*** </u>
</summary>
<!--여기에 상품리스트 내용-->
</details>
<!--상품리스트 상품 상세조회 사이-->
<details><summary>

#### <u>***상품 상세조회*** </u>
</summary>
<!--여기에 상품 상세조회 내용-->
</details>
<!--상품상세조회 상품등록 사이-->
<details><summary>

#### <u>***상품 등록*** </u>
</summary>
<!--여기에 상품등록 내용-->
</details>
<!--상품등록 찜 추가제거 사이-->
<details><summary>

#### <u>***찜 추가, 찜 제거*** </u>
</summary>
<!--여기에 찜추가제거 내용-->
</details>
<!--찜 추가제거 모아보기 추가제거 사이-->
<details><summary>

#### <u>***모아보기 추가, 제거*** </u>
</summary>
<!--여기에 모아보기 추가제 거 내용-->
</details>
<!--여기에 상품 페이지 마지막-->

## 채팅 페이지

<!--여기에 채팅페이지 내용-->
## 관리자 페이지

<!--여기에 관리자 페이지-->
<details><summary>

#### <u>***유저 리스트*** </u>
</summary>
<!--여기에 유저 리스트 내용-->
</details>
<!--여기에 관리자 페이지 마지막-->


## 메인 페이지

#### 화면구현- `신정훈`, 기능구현- `백의헌`

<img src="https://github.com/bellho/gaji_market/assets/135290607/36b400fe-e7c8-49ef-921d-73d97ce22d9e"  width="700" height="400">
<br>

## 상품 리스트 페이지

<img src="https://github.com/bellho/gaji_market/assets/135290607/bb9a295a-d2b6-4bb6-b02b-d99819c6884f"  width="700" height="400">

<details>
  <summary> 검색 조건에 따른 데이터를 불러오기 위한 동적 쿼리문(Click) </summary>
  <br>
  동적 쿼리문을 통해 여러가지 입력 가능한 정렬 조건중 입력된 값에 대해서만 where절이 적용 되도록 하였습니다.
  
  <br>

    <select id="getGoodsList" parameterType="map"	
		resultType="GoodsListDto">
		select list2.*,(select f.url from goods_file f where
		f.goods_id=list2.goods_id and rownum between 0 and 1) url from
		(select
		list.*,rownum rn from(
		(select
		g.view_count,g.title,g.price,g.goods_Id,u.nickname,g.status,g.safe_Trading_Yn,d.dong_Name,g.refreshed_at,
		g.created_at,

		(select count(*) from wishList w where
		g.goods_id=w.goods_id) likeCount
		from goods g join users u
		using(user_id) join dong d on g.dong_id=d.dong_id
		where
		active_status='Y'
		<if test='category!=null'>
			and category_id=#{category}
		</if>
		<if test='searchWord!=null'>
			and title like #{searchWord}
		</if>
		<choose>
			<when test="priceCeiling==100000">
				and price &lt;= 100000
			</when>
			<when test="priceCeiling==300000">
				and price &gt;= 100000 and price &lt;= 300000
			</when>
			<when test="priceCeiling==500000">
				and price &gt;= 300000 and price &lt;= 500000
			</when>
			<when test="priceCeiling==700000">
				and price &gt;= 500000
			</when>
		</choose>
				<choose>
		<when test='onsale!=null'>
			and g.status=1
		</when>
		<otherwise>
			and g.status!=4
		</otherwise>
		</choose>
		<if test='dongId!=null'>
			and g.dong_id=#{dongId}
		</if>
		<choose>
			<when test="sort==1">
				order by likeCount desc, g.refreshed_at desc
			</when>
			<when test="sort==3">
				order by price asc, g.refreshed_at desc
			</when>
			<when test="sort==4">
				order by price desc, g.refreshed_at desc
			</when>
			<otherwise>
				order by g.refreshed_at desc
			</otherwise>
		</choose>
		)
		list)
		)list2 where list2.rn between #{startRownum} and #{endRownum}
	</select>

</details>
<br>

<details>
  <summary>조건 검색 JSP 로직(Click)</summary>
	
	이전에 적용한 조건들이 유지되면서, 새로운 조건들을 추가해 나가기 위해
	하나의 form 태그 안에 미리 input 태그를 준비해 놓은 후 새로운 값이 추가 될 때마다
	input태그에 값을 추가해 submit 하고. 
	Controller에서부터 JSP로는 이전에 적용 된 조건값들을 다시 넘겨주었습니다.
 
 </details>

#
## 마이페이지 - 구매내역, 판매내역, 판매글, 찜목록, 모아보기, 유저상품
#### 화면구현- `신정훈, 백의헌`, 기능구현- `백의헌`


### 구매내역
<img src="https://github.com/bellho/gaji_market/assets/135290607/d79c28d2-ec15-4cfa-9a24-47acd01386b4" width="700" height="400"><br>

### 판매내역
<img src="https://github.com/bellho/gaji_market/assets/135290607/d5dd7f26-399c-4be9-bf60-4754e2f6e737" width="700" height="400"><br>

### 판매글 페이지
<img src="https://github.com/bellho/gaji_market/assets/135290607/4d7b155b-9820-49b8-9fb4-ddb12c1bdee4" width="700" height="400"><br>



### 즐겨찾기 유저 페이지(모아보기), 찜 페이지
<img src="https://github.com/bellho/gaji_market/assets/135290607/4ff71d5d-4258-442c-b4d0-49d0a96f64dc" width="700" height="400"><br>

### 특정유저 상품 더보기
<img src="https://github.com/bellho/gaji_market/assets/135290607/ee3f10b5-5ab1-489b-9d99-1ac76910a912" width="700" height="400"><br>

#
## 결제 페이지 주소 변경, 결제 진행, 리뷰작성 (추가 기능 ajax 구현)
#### 화면구현 - `신정훈, 백의헌` 기능구현- `백의헌`  

### 주소 변경
<img src="https://github.com/bellho/gaji_market/assets/135290607/13c3a2fb-9cbc-41a0-a2bd-5c786c461385" width="700" height="400">
<details>
<br>
  <summary>주소 변경, 삭제, 추가를 위한 Mapper코드(Click)</summary>
      <알고리즘 설명><br>
    &nbsp;&nbsp;&nbsp; 1. 주소순서 1번을 대표주소로 본다.<br>
    &nbsp;&nbsp;&nbsp; 2. 대표주소 변경시 모든 주소순서를 +1 한다.<br>
    &nbsp;&nbsp;&nbsp; 3. 대표주소로 설정할 주소의 주소순서를 1로 설정한다.<br>
    &nbsp;&nbsp;&nbsp; 4. 마지막으로 대표주소로 변경한 주소의 주소순서보다 큰 주소에 대해서 -1을 적용한다.
    <br><br>

>    

    <!-------------------------------------------대표주소 변경을 위한 mapper--------------------------------------->
     <!-- 대표주소를 변경하기위해 주소순서를 하나씩 뒤로 민다 -->
    <update id="updateMainAddressNo" parameterType="string">	
		update user_address set address_no=address_no+1 where user_id=#{userId}
	</update>
	
	<update id="updateMainAddress" parameterType="map">	<!--주소순서를 1로 바꿈으로써 대표주소 변경 -->
		update user_address set address_no=1 where user_id=#{userId} and address_no=#{addressNo}+1
	</update>
	
	<update id="updateMainAddress2" parameterType="map"> <!-- 대표주소가 된 주소보다 높은순서들을 다시 1씩 내려주기. -->
		update user_address set address_no=address_no-1 where user_id=#{userId} and address_no &gt; #{addressNo}
	</update>

    <!------------------------------------------------주소 추가 mapper -------------------------------------------->
	<!-- 새로입력된 주소를 count+1 주소순서에 추가한다 -->
	<insert id="insertAddress" parameterType="UserInsertAddressDto">	
		insert into user_address values(#{detailAddress},#{postCode},#{userId},#{roadAddress},#{address},#{addressNickname},(select count(*) from user_address where user_id=#{userId})+1)
	</insert>
    
	 <!-----------------------------------------------주소 삭제 mapper -------------------------------------------->
     <!-- 주소삭제 1단계 작업(주소삭제)-->
	<delete id="deleteAddress1" parameterType="map">	
		delete from user_address where address_no=#{addressNo} and user_id=#{userId}
	</delete>

	<!-- 주소삭제 2단계 작업(삭제된 주소순서보다 작은 주소들 -1)  -->
	<update id="deleteAddress2" parameterType="map">	
		update user_address set Address_no=Address_no-1 where Address_no &gt; #{addressNo} and user_id=#{userId}
	</update>
</details>
<br>

### 결제 진행
<img src="https://github.com/bellho/gaji_market/assets/135290607/c80ada47-991e-438a-b36e-1956bda96da5" width="700" height="400">



<details>
  <summary>안전거래 유효성 검사 코드(Click)</summary>

> 

  안전거래의 핵심은 `유효성 검사`입니다. JSP를 통해 결제가 이루어지게 되면 <br> 클라이언트는 개발자 도구를 통해 상품가격과 같은 결제정보를 변조하여 결제를 시도 할 수 있습니다.<br>이를 방지하고자 JSP에서 아임포트 API를 통해 결제가 이루어지면 <br>`Controller`에서는 `Database`에 저장된 정보와 `API`에서 결제된 정보를 `대조`합니다.<br>
  이 결과에 따라 `Database`에 안전결제에 대한 데이터를 삽입한 후 <br>
  삽입이 성공하였다면
  최종적으로 안전결제 성공여부를 `클라이언트`에게 전달합니다.

  
>   

    @PostMapping("payment/callback")
	@ResponseBody
	public IamportResponse<Payment> callback(String impUid,InsertSafeTradingDto insertSafeTradingDto,Integer goodsId,HttpServletRequest request,Principal principal) {
		IamportResponse<Payment> result=null;
		String userId=principal.getName();
		try {
			result= api.paymentByImpUid(impUid);
			int amount =(int)Math.round(payServiceImpl.getAmount(goodsId) * 1.035);
			String goodTitle=result.getResponse().getName();
			if(result.getResponse().getStatus().equals("paid")&&amount==result.getResponse().getAmount().intValue()) {	// 금액이 일치하고 지불이 완료되었다면.
				insertSafeTradingDto.setTransactionId(impUid);
				insertSafeTradingDto.setGoodsTitle(goodTitle);
				insertSafeTradingDto.setPrice(amount);
				insertSafeTradingDto.setPurchaseMethod(result.getResponse().getPayMethod());
				insertSafeTradingDto.setBuyerId(userId);
				
				int addResult = payServiceImpl.addSafeTrading(insertSafeTradingDto); 
                //데이터베이스에 안전거래에 대한 데이터를 넣음
				
				if(addResult==1) { // 가지 데이터베이스에 값이 정상적으로 들어갔다면
					Map<String, Object> map=new HashMap<String, Object>();
					map.put("status", 2);
					map.put("goodsId",goodsId);
					if(payServiceImpl.updateStatus(map)==1) {
						TitleBuyerDto titleBuyerDto=payServiceImpl.getIdFromTransactionId(impUid);
						insertNotificationDto.setBuyerId(titleBuyerDto.getBuyerId());  
						insertNotificationDto.setSellerId(titleBuyerDto.getSellerId()); 
						insertNotificationDto.setType(2);
						insertNotificationDto.setReferenceId(impUid);
						insertNotificationDto.setMessage(titleBuyerDto.getGoodsTitle()+"의 안전거래가 신청되었습니다.");
						payServiceImpl.insertNoti(insertNotificationDto);
						return result;	// 거래정보 반환.
					}
				}
				else			// 가지 데이터베이스에 값이 입력되지 않았거나 거래중으로 변경이 안되었다면 거래취소함.
				{
					cancelData=new CancelData(impUid, true); 
					api.cancelPaymentByImpUid(cancelData);
					return result;	//거래 정보 반환
				}
			}
			
			else {
				cancelData=new CancelData(impUid, true); // imp_uid를 이용하여 거래취소함수에 인자가될 객체생성
				api.cancelPaymentByImpUid(cancelData);	// api의 취소함수에 cancelData를 인자로하여 거래취소.
				return result;	//거래 정보 반환
			}
		} catch (IamportResponseException | IOException e) {
			e.printStackTrace();
		}
		return result;
	}
</details>
<br>

#### 안전결제 시퀀스 다이어그램
![image](https://github.com/bellho/gaji_market/assets/135290607/1da567b3-5808-4129-8769-808e0280b68a)

#

### 리뷰 작성
<img src="https://github.com/bellho/gaji_market/assets/135290607/18f935e1-8afb-437f-920e-f9bf13cabfe8" width="700" height="400"><br>

<details>
  <summary>리뷰작성 프로시저 코드(Click)</summary>
<br>


>   `프로시저`를 활용하여 `리뷰작성`과 `유저평점 업데이트`를 `Transactional`하게 처리<br><br>
    리뷰작성이 발생하였을 경우 리뷰점수를 바탕으로 해당 유저의 평점도 항상 업데이트 됩니다.<br>  떄문에 `transactional` 또는 `프로시저`로 처리하는것이 적절합니다. <br><br> 프로시저를 사용함으로써 spring 코드의 복잡성을 줄이고 한번의 입력으로 데이터베이스에서 여러가지 실행을 하도록 하여 네트워크 오버헤드를 줄일 수 있습니다.<br>

    CREATE OR REPLACE PROCEDURE updateRatingScore(
    goodsId IN NUMBER,
    userId IN VARCHAR,
    message IN VARCHAR,
    mannerPoint IN NUMBER,
    timePoint IN NUMBER,
    goodsPoint IN NUMBER,
    result1 OUT NUMBER
    ) AS 
    BEGIN
    BEGIN
        INSERT INTO deal_review VALUES (goodsId, userId, message, mannerPoint, timePoint, goodsPoint);
        result1 := 1; -- 성공
    EXCEPTION
        WHEN OTHERS THEN
            result1 := 0; -- 실패
    END;
    -- rating_score 업데이트
    IF result1 = 1 THEN
        BEGIN
            UPDATE users
            SET rating_score = rating_score + (mannerPoint + timePoint + goodsPoint - 11) / 5
            WHERE user_Id = (select user_Id from goods where goods_Id=goodsId);
            COMMIT;
        EXCEPTION
            WHEN OTHERS THEN
                result1 := 0; -- 실패
                ROLLBACK;
        END;
    END IF;
    END;
</details>
<br>

#
## 알림 기능
#### 화면구현 - `신정훈` 기능구현- `신정훈`  
<img src="https://github.com/bellho/gaji_market/assets/135290607/46a3b6f9-e128-4688-ba41-339a0b39457c" width="700" height="400">
<details>
  <summary>알림 기능 설명(Click)</summary>
	안전결제 신청, 수락, 취소, 운송장 등록, 결제확정 등에 대해서 알림이 생성되며 <br>
	ajax를 통해 주기적으로 알림갯수를 불러와 최신화 합니다.<br>
	알림 선택시 해당하는 안전거래 상세페이지로 이동하며<br>
	개별삭제 및 선택알림 일괄삭제가 가능합니다.<br><br>
	
</details>
<br>

## 페이징
#### 화면구현 - `신정훈` 기능구현- `백의헌`
##### 구현 알고리즘
![image](https://github.com/bellho/gaji_market/assets/135290607/77e9ea17-1fbc-45e8-bfe0-81c715f5d3f1)


#
## 🧑‍🤝‍🧑 프로젝트 기능구현
|담당자|내용|
|------|----|
|**팀장 김종호**|Spring Framework 초기 셋팅<br>Spring Sercurity 적용 <br> URL Mapping<br>요구사항 정의서 초안 작성 <br>채팅 화면/기능 구현|
|팀원 천영준|유스케이스 다이어그램 작성<br>Controller Mapping작업<br>회원가입(이메일인증SMPT, 주소추가)<br>아이디찾기<br>비밀번호찾기(이메일인증SMPT)<br>마이페이지(회원정보변경)<br>관리자페이지(가입유저조회, 정지된 유저 리스트, 신고된 유저가 등록한 게시글 신고리스트, 신고상세페이지, 정지, 정지해제, 검토)<br>게시글 작성, 수정, 삭제(cloudinary파일업로드 추가 및 삭제, ckeditor5 ckfinder 내용 이미지업로드, <br>kakoMap 약속위치지정, ipstack 사용자 기본 위치 지정)<br>게시글 상세보기(kakoMap 약속장소맵및링크)<br>회원 모아보기 추가, 모아보기 해제하기<br>상품 찜, 찜 해제<br>|
|팀원 신정훈||
|팀원 백의헌|노션 세팅 및 회의록 작성<br>ERD 다이어그램  작성<br>mapper, Service, Dao 초안 작성<br> API 아임포트 안전결제(결제, 결제취소, 결제수락, 결제확정)<br>거래상태 변경에 따른 상품상태 변경<br>안전거래 알림 생성, 삭제, 조회<br>상품 신고<br>주소(추가, 변경, 삭제)<br>리뷰 및 유저평점 업데이트 기능(프로시저 사용)<br>상품 리스트 페이지(각종 조회 조건 처리)<br>판매내역 조회<br>구매내역 조회<br>특정 유저 상품 조회<br>모아보기 페이지<br>찜 페이지<br>페이징 처리<br>|
#
## 📌 주요기능
- 여러가지 검색 조건 및 페이징을 적용한 상품리스트 조회
- 채팅을 통한 직거래
- 안전거래
- 사진업로드 및 텍스트 설정 가능한 글 작성
#
