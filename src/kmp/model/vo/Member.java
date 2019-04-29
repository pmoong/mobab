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
	private int charged;
	private boolean favoriteBeer;
	private boolean favoriteGram;
	private boolean favoriteSandwich;
	private boolean favoriteNoodle;



	public Member() {}


	public Member(String id, String pwd, String name, String email, String phone, int age, String academy,
			char classroom, char gender, int point, int charged, boolean favoriteBeer, boolean favoriteGram,
			boolean favoriteSandwich, boolean favoriteNoodle) {
		super();
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
		this.charged = charged;
		this.favoriteBeer = favoriteBeer;
		this.favoriteGram = favoriteGram;
		this.favoriteSandwich = favoriteSandwich;
		this.favoriteNoodle = favoriteNoodle;

	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAcademy() {
		return academy;
	}


	public void setAcademy(String academy) {
		this.academy = academy;
	}


	public char getClassroom() {
		return classroom;
	}


	public void setClassroom(char classroom) {
		this.classroom = classroom;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}


	public int getCharged() {
		return charged;
	}


	public void setCharged(int charged) {
		this.charged = charged;
	}


	public boolean isFavoriteBeer() {
		return favoriteBeer;
	}


	public void setFavoriteBeer(boolean favoriteBeer) {
		this.favoriteBeer = favoriteBeer;
	}


	public boolean isFavoriteGram() {
		return favoriteGram;
	}


	public void setFavoriteGram(boolean favoriteGram) {
		this.favoriteGram = favoriteGram;
	}


	public boolean isFavoriteSandwich() {
		return favoriteSandwich;
	}


	public void setFavoriteSandwich(boolean favoriteSandwich) {
		this.favoriteSandwich = favoriteSandwich;
	}


	public boolean isFavoriteNoodle() {
		return favoriteNoodle;
	}
	
	public void setFavoriteNoodle(boolean favoriteNoodle) {
		this.favoriteNoodle = favoriteNoodle;
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", age=" + age + ", academy=" + academy + ", classroom=" + classroom + ", gender=" + gender
				+ ", point=" + point + ", charged=" + charged + ", favoriteBeer=" + favoriteBeer + ", favoriteGram="
				+ favoriteGram + ", favoriteSandwich=" + favoriteSandwich + ", favoriteNoodle=" + favoriteNoodle + "]";

	}

	
}