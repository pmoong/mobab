package kmp.model.vo;

import java.io.Serializable;

public class Member implements Serializable{
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String phone;
	private int age;
	private String academy;
	private char classroom;
	private char gender;
	private int point;


	public Member() {}

	public Member(String id,String pwd,String name,String email,String phone,int age,String academy,char classroom,char gender,int point) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.academy = academy;
		this.classroom = classroom;
		this.gender = gender;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public int getAge() {
		return age;
	}

	public String getAcademy() {
		return academy;
	}

	public char getClassroom() {
		return classroom;
	}

	public char getGender() {
		return gender;
	}
	public int getPoint() {
		return point;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}

	public void setClassroom(char classroom) {
		this.classroom = classroom;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", age=" + age + ", academy=" + academy + ", classroom=" + classroom + ", gender=" + gender + "]";
	}

}