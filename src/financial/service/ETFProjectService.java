package financial.service;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;

import financial.controller.ETFProjectController;
import financial.exception.DuplicationProjectException;
import financial.exception.ProjectNotFoundException;
import financial.model.dto.ETFCustomer;
import financial.model.dto.ETFManager;
import financial.model.dto.ETFProject;

public class ETFProjectService {
	
	private static ETFProjectService instance = new ETFProjectService();
	
	private ArrayList<ETFProject> etfProjectList = new ArrayList<ETFProject>();

	private ETFProjectService() {
	}

//��ü ��� �޼ҵ�
	public static ETFProjectService getInstance() {
		return instance;
	}
	
/**project �Է� ��� ȣ��*/
	public void etfProjectInsert(ETFProject etf) throws DuplicationProjectException {
		for(ETFProject e : etfProjectList ) {
			if(e.getEtfName().equals(etf.getEtfName())) {
				throw new DuplicationProjectException("�̹� �����ϴ� ������Ʈ�Դϴ�.");
			}
		}
		etfProjectList.add(etf);
	}

	public void getProjectInsert(ETFProject etf) {
		
	}

	//��ü project ��ȸ
	public ArrayList<ETFProject> getetfProjectList() throws ProjectNotFoundException {
		if(etfProjectList.size() == 0) {
			throw new ProjectNotFoundException("Project�� ������ϴ�.");
		}else 
		return etfProjectList;
	}

	
//�ϳ��� ������Ʈ�� ��ȸ�Ͽ� ��ȯ
	public ETFProject getetfproject(String e) throws ProjectNotFoundException {
		for(ETFProject etf : etfProjectList) {
			if(etf.getEtfName().equals(e)) {
				return etf;
			}
		}
		throw new ProjectNotFoundException("�ش� ������Ʈ�� �������� �ʽ��ϴ�.");
	}

	
//customer ���� �޼ҵ�
	public void etfCustomerUpdate(String s, ETFCustomer customer) throws ProjectNotFoundException{
		for (ETFProject etf : etfProjectList) {
			if(etf.getEtfName().equals(s)) {
				etf.setProjectEtfCustomer(customer);
				return;
			}
		}
		throw new ProjectNotFoundException("�ش� ������Ʈ�� �������� �ʽ��ϴ�.");
	}

// manager ���� �޼ҵ�
	public void etfManagerUpdate(String s, ETFManager manager) throws ProjectNotFoundException {
		for(ETFProject etf : etfProjectList) {
			if(etf.getEtfName().equals(s)) {
				etf.setProjectEtfManager(manager);
				return;
			}
		}
		throw new ProjectNotFoundException("�ش� ������Ʈ�� �������� �ʽ��ϴ�.");
	}

	public void etfProjectDelete(String s) throws ProjectNotFoundException{
		for(ETFProject etf : etfProjectList) {
			if(etf.getEtfName().equals(s)) {
				etfProjectList.remove(etf);
				return;
			}
		}
		throw new ProjectNotFoundException("�ش� ������Ʈ�� �������� �ʽ��ϴ�.");
	}

	
	
	

}
