package view;

import java.util.ArrayList;

import financial.model.dto.ETFProject;

public class SuccessView {

	public static void projectView(ETFProject getEtfProject) {
		System.out.println(getEtfProject);
	}
	
	public static void projectListView(ArrayList<ETFProject> getetfProjestsList) {
		int index = 1;
		for ( ETFProject list : getetfProjestsList) {
			System.out.println("[���� ���� project :" + index + "] "+list );
			index++;
		}
	}
	
	public static void successView(String s) {
		System.out.println("Issue : "+ s);
	}
	
	
	
}
