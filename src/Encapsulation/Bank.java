package Encapsulation;

public class Bank {
	private String name;
	private int age;//age>15
	private String adharNumber;
	private String phoneNumber;
//	public Bank(String name, int age, String adharNumber, String phoneNumber) {
//		this.name = name;
//		this.age = age;
//		this.adharNumber = adharNumber;
//		this.phoneNumber = phoneNumber;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=15) {
		this.age = age;
		}
	}
	public String getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
