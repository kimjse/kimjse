package dy11_29;

public class Person {
	private String name;
	private String addr;
	private String phone;
	public String setAddr;
	public String setPhone;
	//2생성자
	public Person() {}
	public Person(String name,String addr, String phone) {
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	//3메소드
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
class Student {
	//1월드
	private int stuId;
	private String jeongong;
	//2메소드
	public Student() {  }
	public Student(String name, String addr, String phone, int stuId, String jeongong) {
		super();
		this.stuId = stuId;
		this.jeongong = jeongong;
	}
	public int getStuId() {
		return stuId;
	}
	public String getJeongong() {
		return jeongong;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public void setJeongong(String jeongong) {
		// TODO Auto-generated method stub
		this.jeongong = jeongong;
	}
}
 