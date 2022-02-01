package financial.view;

import financial.controller.ETFProjectController;
import financial.model.dto.ETF;
import financial.model.dto.ETFCustomer;
import financial.model.dto.ETFManager;
import financial.model.dto.ETFProject;

public class StartView {

	public static void main(String[] args) {
		
		ETF etf1 = new ETF("�Ƿ�", "KB�ڻ���", "1���̳�", "50��̸�");
		ETF etf2 = new ETF("�Ƿ�", "�Ｚ�ڻ���", "1���̳�", "50��̸�");
		ETF etf3 = new ETF("�Ƿ�", "�̷������ڻ���", "1���̳�", "50��̸�");
		
		ETF etf4 = new ETF("����", "KB�ڻ���", "3���̳�", "100��~1õ��̸�");
		ETF etf5 = new ETF("����", "�Ｚ�ڻ���", "3���̳�", "100��~1õ��̸�");
		ETF etf6 = new ETF("����", "�̷������ڻ���", "3���̳�", "100��~1õ��̸�");
		
		ETF etf7 = new ETF("IT", "KB�ڻ���", "3�����̳�", "50��~100��̸�");
		ETF etf8 = new ETF("IT", "�Ｚ�ڻ���", "3�����̳�", "50��~100��̸�");
		ETF etf9 = new ETF("IT", "�̷������ڻ���", "3�����̳�", "50��~100��̸�");

		ETFCustomer etfCustomer1 = new ETFCustomer("����â", 26, "1��", "01071136103");
		ETFCustomer etfCustomer2 = new ETFCustomer("������", 26, "2��", "01012345678");
		ETFCustomer etfCustomer3 = new ETFCustomer("������", 27, "3��", "01077777777");
		ETFCustomer etfCustomer4 = new ETFCustomer("������", 27, "50��", "01055555555");
		ETFCustomer etfCustomer5 = new ETFCustomer("�����", 27, "300��", "01066666666");
		ETFCustomer etfCustomer6 = new ETFCustomer("��ȣ��", 27, "20��", "01088888888");
		ETFCustomer etfCustomer7 = new ETFCustomer("������", 27, "10��", "01099999999");


		ETFManager etfManager1 = new ETFManager("������", 29, "����", "01012346598");
		ETFManager etfManager2 = new ETFManager("���缮", 37, "����", "01012346598");
		ETFManager etfManager3 = new ETFManager("����ȣ", 33, "����", "01012346598");
		
		ETFProject project1 = new ETFProject("������Ʈ1",etf1, etfCustomer1,etfManager1,"2022�� 1�� 1��","�ݸ� �λ� �� ����");
		ETFProject project2 = new ETFProject("������Ʈ2",etf2, etfCustomer2,etfManager2,"2022�� 1�� 2��","�ݸ� �λ� �� ����");
		ETFProject project3 = new ETFProject("������Ʈ3",etf3, etfCustomer3,etfManager3,"2021�� 12�� 25��","�ݸ� �λ� �� ����");
		ETFProject project4 = new ETFProject("������Ʈ4",etf4, etfCustomer4,etfManager2,"2021�� 12�� 24��","�Ƿ��� ���� Ȯ�� �� ����");
		ETFProject project5 = new ETFProject("������Ʈ5",etf5, etfCustomer5,etfManager3,"2021�� 12�� 22��","�Ƿ��� ���� Ȯ�� �� ����");
		ETFProject project6 = new ETFProject("������Ʈ6",etf6, etfCustomer5,etfManager2,"2021�� 12�� 21��","�Ƿ��� ���� Ȯ�� �� ����");
		ETFProject project7 = new ETFProject("������Ʈ7",etf7, etfCustomer5,etfManager1,"2021�� 10�� 29��","IT ���� ���� Ȯ�� �� ����");
		ETFProject project8 = new ETFProject("������Ʈ8",etf8, etfCustomer6,etfManager2,"2021�� 12�� 12��","IT ���� ���� Ȯ�� �� ����");
		ETFProject project9 = new ETFProject("������Ʈ9",etf9, etfCustomer7,etfManager3,"2021�� 11�� 25��","IT ���� ���� Ȯ�� �� ����");
		
		
		ETFProjectController controller = ETFProjectController.getInstance();
		
		//ETF������Ʈ �����ϱ�
		System.out.println("***01. ������Ʈ ����***");
		controller.etfprojectInsert(project1);
		controller.etfprojectInsert(project2);
		controller.etfprojectInsert(project3);
		controller.etfprojectInsert(project4);
		controller.etfprojectInsert(project5);
		controller.etfprojectInsert(project6);
		controller.etfprojectInsert(project7);
		controller.etfprojectInsert(project8);
		controller.etfprojectInsert(project9);

		//��� project �˻�
		System.out.println("\n***02. ��� ������Ʈ �˻�***");
		controller.getetfProjectList();
		
		//������ �ڻ� ������ ������ ������Ʈ ����
		System.out.println("\n***������ �ڻ� ������ ������ ������Ʈ ����***");

		//������Ʈ �̸����� �˻�
		System.out.println("\n***03.'������Ʈ1' Project �˻�***");
		controller.getetfProject("������Ʈ1");
		
		//������ �����ϱ�
		System.out.println("\n***04.'������Ʈ1' Project�� ������ ���� �� Ȯ��***");
		controller.etfCustomerUpdate("������Ʈ1",etfCustomer2);
		controller.getetfProject("������Ʈ1");
		
		//�Ǹ��� �����ϱ�
		System.out.println("\n***05.'������Ʈ1' Project�� �Ǹ��� ���� �� Ȯ��***");
		controller.etfManagerUpdate("������Ʈ1", etfManager2);
		controller.getetfProject("������Ʈ1");
		
		//ETF������Ʈ �����ϱ�
		System.out.println("\n***06.'������Ʈ1' ������Ʈ ���� �� ������ Project �˻�***");
		controller.etfProjectDelete("������Ʈ1");
		controller.getetfProject("������Ʈ1");
		


	}

}
