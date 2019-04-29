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
//		//1. 아이디검사
//		//아이디를 통해 파일 이름 받아오기
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
//	}
//}
