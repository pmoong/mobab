package kmp.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import kmp.model.vo.Member;

public class Controller extends Member{
	public Controller() {}
	FileInputStream fin = null;
	
	
	
	public void check(String id) {
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("MemberList.txt"));
			bw.write(id);
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			BufferedReader br = new BufferedReader(
//					new FileReader("MemberList.txt"));
//			String temp;
//			while((temp=br.readLine())!=null) {
//				System.out.println(temp);
//			}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println();
	}
	
	
	public boolean loginCheck(String id, String pwd) {
		//1. ���̵�˻�
		//���̵� ���� ���� �̸� �޾ƿ���
		String fileName = id + ".txt";
		File member = new File(fileName);
		
		//�ش� �̸��� ������ ���� ��� false ����
		if(!member.isFile()) {
			return false;
		}
		
		//2. �н����� �˻�
		BufferedReader br = null;
		try{
			//�ʿ��� ���� �б�
			br = new BufferedReader(new FileReader(id + ".txt"));
			String temp = br.readLine();
			
			//split�� �̿��� ", " �� �����ڷ� �Ͽ� ���Ͽ� ����� ���� ������
			String[] info = temp.split(", ");
			
			//�Է��� pwd�� ���Ͽ� ����Ǿ��ִ� pwd�� ���� ���� ��� false ���
			if(!pwd.equals(info[1])) {
				return false;
			}		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//���̵� �˻�� �н����� �˻翡�� �ƹ� �̻��� ���ٸ� true ����
		return true;
	}
	
	

}
