package dy11_29;

public class StudentEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("홍길동", "서울", "010-1111-1111");
		System.out.println(p1);
		p1.setAddr("경기도");
		p1.setPhone("010-2222-2222");
		System.out.println(p1.getName() + "," + p1.getAddr() + "," + p1.getPhone());
		Student s1 = new Student("송중기", "서울", "010-3333-3333", 2201, "컴소");
		System.out.println(s1);
		s1.setJeongong("경영학과");
		System.out.println(s1.getName() + "," + s1.getJeongong());
	}
}
