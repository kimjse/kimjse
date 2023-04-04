package dy1206;

public class Person {
	private String name;
	private String addr;
	private String phone;
	int count;
	public Person() {
		
		count++;
	};
	public Person(String name, String addr, String phone) {
		super();
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String grtAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
class Student extends Person {
	private int stuId;
	private String jeongong;
	
	public Student() {};
	public Student(int stuId, String jeongong) {
		super(name, addr, phone);
		this.stuId = stuId;
		this.jeongong = jeongong;
	}
	
}
