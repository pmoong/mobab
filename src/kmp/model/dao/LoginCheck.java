//package kmp.model.dao;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class LoginCheck {
//	public LoginCheck() {}
//	
//	public boolean loginCheck(String id, String pwd) {
//		//1. ���̵�˻�
//		//���̵� ���� ���� �̸� �޾ƿ���
//		String fileName = id + ".txt";
//		File member = new File(fileName);
//		
//		//�ش� �̸��� ������ ���� ��� false ����
//		if(!member.isFile()) {
//			return false;
//		}
//		
//		//2. �н����� �˻�
//		BufferedReader br = null;
//		try{
//			//�ʿ��� ���� �б�
//			br = new BufferedReader(new FileReader(id + ".txt"));
//			String temp = br.readLine();
//			
//			//split�� �̿��� ", " �� �����ڷ� �Ͽ� ���Ͽ� ����� ���� ������
//			String[] info = temp.split(", ");
//			
//			//�Է��� pwd�� ���Ͽ� ����Ǿ��ִ� pwd�� ���� ���� ��� false ���
//			if(!pwd.equals(info[1])) {
//				return false;
//			}		
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//		//���̵� �˻�� �н����� �˻翡�� �ƹ� �̻��� ���ٸ� true ����
//		return true;
//	}
//}
