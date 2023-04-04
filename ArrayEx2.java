package dy1206;

import java.util.ArrayList;

public class ArrayEx2 {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(100);
		intList.add(200);
		intList.add(300);
		for (int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + "\t");
		}
		System.out.println();
		ArrayList<Double> doubleList = new ArrayList<Double>();
		doubleList.add(1.2);
		doubleList.add(2.4);
		for (int i = 0; i < doubleList.size(); i++) {
			System.out.print(doubleList.get(i) + "\t");
		}
		System.out.println();
		ArrayList<Student> stuList = new ArrayList<Student>();
		Student hong = new Student("홍길동", "서울", "010-1111-1111", 2201, "컴소");
		stuList.add(hong);
		Student son = new Student("손흥민", "유럽", "010-2222-2222", 2001, "체육");
		stuList.add(son);
		Student lee = new Student("이순신", "서울", "010-3333-3333", 2202, "체육");
		stuList.add(lee);
		
		for(int i = 0; i < stuList.size(); i++) {
			Student st = stuList.get(i);
			System.out.println(stuList.get(i).getName() + "," + stuList.get(i).getAddr() + "," + st.getPhone() 
			+ st.getStuId() + st.getJeongong());
		}
		for
	}
}
