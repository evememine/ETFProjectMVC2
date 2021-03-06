package financial.view;

import financial.controller.ETFProjectController;
import financial.model.dto.ETF;
import financial.model.dto.ETFCustomer;
import financial.model.dto.ETFManager;
import financial.model.dto.ETFProject;

public class StartView {

	public static void main(String[] args) {
		
		ETF etf1 = new ETF("의료", "KB자산운용", "1년이내", "50억미만");
		ETF etf2 = new ETF("의료", "삼성자산운용", "1년이내", "50억미만");
		ETF etf3 = new ETF("의료", "미래에셋자산운용", "1년이내", "50억미만");
		
		ETF etf4 = new ETF("금융", "KB자산운용", "3년이내", "100억~1천억미만");
		ETF etf5 = new ETF("금융", "삼성자산운용", "3년이내", "100억~1천억미만");
		ETF etf6 = new ETF("금융", "미래에셋자산운용", "3년이내", "100억~1천억미만");
		
		ETF etf7 = new ETF("IT", "KB자산운용", "3개월이내", "50억~100억미만");
		ETF etf8 = new ETF("IT", "삼성자산운용", "3개월이내", "50억~100억미만");
		ETF etf9 = new ETF("IT", "미래에셋자산운용", "3개월이내", "50억~100억미만");

		ETFCustomer etfCustomer1 = new ETFCustomer("임혜창", 26, "1억", "01071136103");
		ETFCustomer etfCustomer2 = new ETFCustomer("손현오", 26, "2억", "01012345678");
		ETFCustomer etfCustomer3 = new ETFCustomer("양지현", 27, "3억", "01077777777");
		ETFCustomer etfCustomer4 = new ETFCustomer("박지성", 27, "50억", "01055555555");
		ETFCustomer etfCustomer5 = new ETFCustomer("손흥민", 27, "300억", "01066666666");
		ETFCustomer etfCustomer6 = new ETFCustomer("강호동", 27, "20억", "01088888888");
		ETFCustomer etfCustomer7 = new ETFCustomer("은지원", 27, "10억", "01099999999");


		ETFManager etfManager1 = new ETFManager("김혜경", 29, "과장", "01012346598");
		ETFManager etfManager2 = new ETFManager("유재석", 37, "부장", "01012346598");
		ETFManager etfManager3 = new ETFManager("조세호", 33, "차장", "01012346598");
		
		ETFProject project1 = new ETFProject("프로젝트1",etf1, etfCustomer1,etfManager1,"2022년 1월 1일","금리 인상 시 수혜");
		ETFProject project2 = new ETFProject("프로젝트2",etf2, etfCustomer2,etfManager2,"2022년 1월 2일","금리 인상 시 수혜");
		ETFProject project3 = new ETFProject("프로젝트3",etf3, etfCustomer3,etfManager3,"2021년 12월 25일","금리 인상 시 수혜");
		ETFProject project4 = new ETFProject("프로젝트4",etf4, etfCustomer4,etfManager2,"2021년 12월 24일","의료기기 수요 확장 시 수혜");
		ETFProject project5 = new ETFProject("프로젝트5",etf5, etfCustomer5,etfManager3,"2021년 12월 22일","의료기기 수요 확장 시 수혜");
		ETFProject project6 = new ETFProject("프로젝트6",etf6, etfCustomer5,etfManager2,"2021년 12월 21일","의료기기 수요 확장 시 수혜");
		ETFProject project7 = new ETFProject("프로젝트7",etf7, etfCustomer5,etfManager1,"2021년 10월 29일","IT 서비스 수요 확장 시 수혜");
		ETFProject project8 = new ETFProject("프로젝트8",etf8, etfCustomer6,etfManager2,"2021년 12월 12일","IT 서비스 수요 확장 시 수혜");
		ETFProject project9 = new ETFProject("프로젝트9",etf9, etfCustomer7,etfManager3,"2021년 11월 25일","IT 서비스 수요 확장 시 수혜");
		
		
		ETFProjectController controller = ETFProjectController.getInstance();
		
		//ETF프로젝트 생성하기
		System.out.println("***01. 프로젝트 생성***");
		controller.etfprojectInsert(project1);
		controller.etfprojectInsert(project2);
		controller.etfprojectInsert(project3);
		controller.etfprojectInsert(project4);
		controller.etfprojectInsert(project5);
		controller.etfprojectInsert(project6);
		controller.etfprojectInsert(project7);
		controller.etfprojectInsert(project8);
		controller.etfprojectInsert(project9);

		//모든 project 검색
		System.out.println("\n***02. 모든 프로젝트 검색***");
		controller.getetfProjectList();
		
		//구매자 자산 내림차 순으로 프로젝트 정렬
		System.out.println("\n***구매자 자산 내림차 순으로 프로젝트 정렬***");

		//프로젝트 이름으로 검색
		System.out.println("\n***03.'프로젝트1' Project 검색***");
		controller.getetfProject("프로젝트1");
		
		//구매자 변경하기
		System.out.println("\n***04.'프로젝트1' Project의 구매자 수정 후 확인***");
		controller.etfCustomerUpdate("프로젝트1",etfCustomer2);
		controller.getetfProject("프로젝트1");
		
		//판매자 변경하기
		System.out.println("\n***05.'프로젝트1' Project의 판매자 수정 후 확인***");
		controller.etfManagerUpdate("프로젝트1", etfManager2);
		controller.getetfProject("프로젝트1");
		
		//ETF프로젝트 삭제하기
		System.out.println("\n***06.'프로젝트1' 프로젝트 삭제 후 삭제한 Project 검색***");
		controller.etfProjectDelete("프로젝트1");
		controller.getetfProject("프로젝트1");
		


	}

}
