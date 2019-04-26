package kmp.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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

}
