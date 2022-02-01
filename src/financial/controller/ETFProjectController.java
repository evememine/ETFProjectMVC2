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
		} // private�� ������ ��Ŭ�ɾ ���� ���ϰ� ����. instance�� �� �� ����
	
	public static ETFProjectController getInstance() {
		return instance;
	}
		
//service�� �ִ� project �Է� ��� ȣ��
	public void etfprojectInsert(ETFProject etf) {
		if(etf != null) {
			try {
				service.etfProjectInsert(etf);
			} catch (DuplicationProjectException e) {

			}
		}else {
			Failview.failview("�Է� ��ɿ� null���� �ԷµǾ����ϴ�.");
			
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

// Project �Ѱ� ��� 
	public void getetfProject(String etf) {
		if(etf != null) {
			try {
				SuccessView.projectView(service.getetfproject(etf));
			} catch (ProjectNotFoundException e) {
				e.printStackTrace();
				Failview.failview(e.getMessage());
			}
		}else {
			Failview.failview("null���� �ԷµǾ����ϴ�.");
		}
		
	}

/* Project Customer ���� �޼ҵ�
 * 1. s Ȥ�� customer�� null�� ��� ����ó��
 * 2. ������ project�� �̸��� ������ �� ����ó��
 * 3. true�� ���� false�� ����
 * 
 */
	public void etfCustomerUpdate(String s, ETFCustomer customer) {
		if(s== null || customer == null ) {
			Failview.failview("Update�޼ҵ忡 null���� �ԷµǾ����ϴ�.");
		}else {
			try {
				service.etfCustomerUpdate(s,customer);
				SuccessView.successView("Update�� �Ϸ�Ǿ����ϴ�.");
			} catch (ProjectNotFoundException e) {
				e.printStackTrace();
				Failview.failview(e.getMessage());
			}
		}
	}

//project manager ���� �޼ҵ�
	public void etfManagerUpdate(String s, ETFManager manager) {
		if(s == null || manager == null) {
			Failview.failview("Update�޼ҵ忡 null���� �ԷµǾ����ϴ�.");
		}else {
			try {
				service.etfManagerUpdate(s,manager);
				SuccessView.successView("update�� �Ϸ�Ǿ����ϴ�");
			} catch (ProjectNotFoundException e) {
				e.printStackTrace();
				Failview.failview(e.getMessage());
			}
		}
	}

//project ���� �޼ҵ�
	public void etfProjectDelete(String s) {
		if(s==null) {
			Failview.failview("Delete �޼ҵ忡 null ���� �ԷµǾ����ϴ�.");
		}else {
			try {
				service.etfProjectDelete(s);
				SuccessView.successView("������ �����߽��ϴ�.");
			} catch (ProjectNotFoundException e) {
				e.printStackTrace();
				Failview.failview(e.getMessage());
			}
		}
		
	}
	
	

}
