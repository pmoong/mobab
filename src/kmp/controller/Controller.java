package kmp.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import kmp.model.vo.Member;
import kmp.view.PopUp;

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
	}


	public boolean loginCheck(String id, String pwd) {
		//1. ���̵�˻�
		//���̵� ���� �����̸� �޾ƿ���
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
	
	@SuppressWarnings("resource")
	public boolean findId(String name, String email) {
		try {
			File member = new File("MemberList.txt");
			BufferedReader br = null;
			br = new BufferedReader(new FileReader(member));
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] info = line.split(", ");
				if (name.equals(info[2])) {
					if (email.equals(info[3])) {
						return true;
					}
				} else {
					return false;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	@SuppressWarnings("resource")
	public boolean findPwd(String id, String name, String email) {
		try {
			File member = new File("MemberList.txt");
			BufferedReader br = null;
			br = new BufferedReader(new FileReader(member));
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] info = line.split(", ");
				if (id.equals(info[0])) {
					if (name.equals(info[2])) {
						if (email.equals(info[3])) {
							return true;
						}
					} 
				}else {
					return false;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean isDuplicatedId(String id) {		

		String fileName = id + ".txt";
		File member = new File(fileName);

		if(!member.isFile()) {
			return false;
		}else {
			return  true;			
		}
	}
	public void isDuplicatedEmail(String email) {

	}
	
	public void join(String id, String pwd, String name, String email, String phone,
			int age, String academy, char classroom, char gender) {
		Scanner sc = new Scanner(System.in);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("MemberList.txt", true));
		
			
			bw.write(id + ", " + pwd + ", " + name + ", " + email + ", " + phone
					 + ", " + academy + ", " + classroom + ", " + age + ", " + gender
					 + ", " + 0 + ", " + 0 + ", " + false + ", " + false + ", " + false + ", " + false);
			bw.newLine();
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	public boolean isDuplicatedPhone(String phone) {

		try {
			File member = new File("MemberList.txt");
			BufferedReader br = null;
			br = new BufferedReader(new FileReader(member));
			String line = "";
			while((line = br.readLine()) != null) {
				String[] info = line.split(", ");
				if(phone.equals(info[4])) {
					return true;
				}else {	
					return false;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;

	}
	
}

