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

//전체 출력 메소드
	public static ETFProjectService getInstance() {
		return instance;
	}
	
/**project 입력 기능 호출*/
	public void etfProjectInsert(ETFProject etf) throws DuplicationProjectException {
		for(ETFProject e : etfProjectList ) {
			if(e.getEtfName().equals(etf.getEtfName())) {
				throw new DuplicationProjectException("이미 존재하는 프로젝트입니다.");
			}
		}
		etfProjectList.add(etf);
	}

	public void getProjectInsert(ETFProject etf) {
		
	}

	//전체 project 조회
	public ArrayList<ETFProject> getetfProjectList() throws ProjectNotFoundException {
		if(etfProjectList.size() == 0) {
			throw new ProjectNotFoundException("Project가 비었습니다.");
		}else 
		return etfProjectList;
	}

	
//하나의 프로젝트롤 조회하여 반환
	public ETFProject getetfproject(String e) throws ProjectNotFoundException {
		for(ETFProject etf : etfProjectList) {
			if(etf.getEtfName().equals(e)) {
				return etf;
			}
		}
		throw new ProjectNotFoundException("해당 프로젝트가 존재하지 않습니다.");
	}

	
//customer 수정 메소드
	public void etfCustomerUpdate(String s, ETFCustomer customer) throws ProjectNotFoundException{
		for (ETFProject etf : etfProjectList) {
			if(etf.getEtfName().equals(s)) {
				etf.setProjectEtfCustomer(customer);
				return;
			}
		}
		throw new ProjectNotFoundException("해당 프로젝트가 존재하지 않습니다.");
	}

// manager 수정 메소드
	public void etfManagerUpdate(String s, ETFManager manager) throws ProjectNotFoundException {
		for(ETFProject etf : etfProjectList) {
			if(etf.getEtfName().equals(s)) {
				etf.setProjectEtfManager(manager);
				return;
			}
		}
		throw new ProjectNotFoundException("해당 프로젝트가 존재하지 않습니다.");
	}

	public void etfProjectDelete(String s) throws ProjectNotFoundException{
		for(ETFProject etf : etfProjectList) {
			if(etf.getEtfName().equals(s)) {
				etfProjectList.remove(etf);
				return;
			}
		}
		throw new ProjectNotFoundException("해당 프로젝트가 존재하지 않습니다.");
	}

	
	
	

}
