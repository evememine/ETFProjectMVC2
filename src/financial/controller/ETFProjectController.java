package financial.controller;

import financial.exception.DuplicationProjectException;
import financial.exception.ProjectNotFoundException;
import financial.model.dto.ETFCustomer;
import financial.model.dto.ETFManager;
import financial.model.dto.ETFProject;
import financial.service.ETFProjectService;
import view.Failview;
import view.SuccessView;

public class ETFProjectController {

	private static ETFProjectController instance = new ETFProjectController();
		
	private static ETFProjectService service = ETFProjectService.getInstance();

	private ETFProjectController() {
		} // private로 생성자 태클걸어서 생성 못하게 막기. instance만 할 수 있음
	
	public static ETFProjectController getInstance() {
		return instance;
	}
		
//service에 있는 project 입력 기능 호출
	public void etfprojectInsert(ETFProject etf) {
		if(etf != null) {
			try {
				service.etfProjectInsert(etf);
			} catch (DuplicationProjectException e) {

			}
		}else {
			Failview.failview("입력 기능에 null값이 입력되었습니다.");
			
		}
		}

	public void getetfProjectList() {
		try {
			SuccessView.projectListView(service.getetfProjectList());
		} catch (ProjectNotFoundException e) {
			e.printStackTrace();
			Failview.failview(e.getMessage());
		}
		}

// Project 한개 출력 
	public void getetfProject(String etf) {
		if(etf != null) {
			try {
				SuccessView.projectView(service.getetfproject(etf));
			} catch (ProjectNotFoundException e) {
				e.printStackTrace();
				Failview.failview(e.getMessage());
			}
		}else {
			Failview.failview("null값이 입력되었습니다.");
		}
		
	}

/* Project Customer 수정 메소드
 * 1. s 혹은 customer가 null일 경우 예외처리
 * 2. 수정할 project의 이름이 미존재 시 예외처리
 * 3. true면 성공 false면 실패
 * 
 */
	public void etfCustomerUpdate(String s, ETFCustomer customer) {
		if(s== null || customer == null ) {
			Failview.failview("Update메소드에 null값이 입력되었습니다.");
		}else {
			try {
				service.etfCustomerUpdate(s,customer);
				SuccessView.successView("Update가 완료되었습니다.");
			} catch (ProjectNotFoundException e) {
				e.printStackTrace();
				Failview.failview(e.getMessage());
			}
		}
	}

//project manager 수정 메소드
	public void etfManagerUpdate(String s, ETFManager manager) {
		if(s == null || manager == null) {
			Failview.failview("Update메소드에 null값이 입력되었습니다.");
		}else {
			try {
				service.etfManagerUpdate(s,manager);
				SuccessView.successView("update가 완료되었습니다");
			} catch (ProjectNotFoundException e) {
				e.printStackTrace();
				Failview.failview(e.getMessage());
			}
		}
	}

//project 삭제 메소드
	public void etfProjectDelete(String s) {
		if(s==null) {
			Failview.failview("Delete 메소드에 null 값이 입력되었습니다.");
		}else {
			try {
				service.etfProjectDelete(s);
				SuccessView.successView("삭제를 성공했습니다.");
			} catch (ProjectNotFoundException e) {
				e.printStackTrace();
				Failview.failview(e.getMessage());
			}
		}
		
	}
	
	

}
