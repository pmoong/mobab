package kmp.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import kmp.model.vo.Beer;
import kmp.model.vo.Member;
import kmp.view.JoinPage;
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

		try {
			File member = new File("MemberList.txt");
			BufferedReader br = null;
			br = new BufferedReader(new FileReader(member));
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] info = line.split(", ");
				if (id.equals(info[0])) {
					if (pwd.equals(info[1])) {
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


		//		//1. 아이디검사
		//		//아이디를 통해 파일이름 받아오기
		//		String fileName = id + ".txt";
		//		File member = new File(fileName);
		//
		//		//해당 이름의 파일이 없을 경우 false 리턴
		//		if(!member.isFile()) {
		//			return false;
		//		}
		//
		//		//2. 패스워드 검사
		//		BufferedReader br = null;
		//		try{
		//			//필요한 파일 읽기
		//			br = new BufferedReader(new FileReader(id + ".txt"));
		//			String temp = br.readLine();
		//
		//			//split을 이용해 ", " 를 구분자로 하여 파일에 저장된 값을 나누기
		//			String[] info = temp.split(", ");
		//
		//			//입력한 pwd와 파일에 저장되어있는 pwd가 같지 않을 경우 false 출력
		//			if(!pwd.equals(info[1])) {
		//				return false;
		//			}		
		//		}catch(IOException e) {
		//			e.printStackTrace();
		//		}
		//
		//		//아이디 검사와 패스워드 검사에서 아무 이상이 없다면 true 리턴
		//		return true;
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

		if(member.isFile()) {
			return  true;			
		}else {
			return false;
		}
	}

	public void join(String id, String pwd, String name, String email, String phone,
			int age, String academy, char classroom, char gender) {

		int point = 0, charged = 0;
		boolean favoriteBeer = false, favoriteGram = false, favoriteNoodles = false, favoriteSandwich = false;

		//type1 txt생성
		BufferedWriter mList = null;
		try {

			mList = new BufferedWriter(new FileWriter("MemberList.txt", true));

			mList.write(id + ", " + pwd + ", " + name + ", " + email + ", " + phone
					+ ", " + academy + ", " + classroom + ", " + age + ", " + gender
					+ ", " + point + ", " + charged);
			mList.newLine();
			mList.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				mList.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		//type2 txt생성
		BufferedWriter idList = null; 
		try {
			idList = new BufferedWriter(new FileWriter(id + ".txt"));

			idList.write(id + ", " + pwd + ", " + name + ", " 
					+ favoriteBeer + ", " + favoriteGram + ", " + favoriteNoodles + ", " + favoriteSandwich);

			idList.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				idList.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
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
	
	public int totalPrice(int price, int ea) {
	      
	      Beer b = new Beer();   
	      
	      int sum = 0;
	      
	      sum = (ea * price);
	      
	      return sum;
	      
	   }
	

}

