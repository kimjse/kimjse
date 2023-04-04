package pj0323;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AddrMain {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Addr> addList = new ArrayList<Addr>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
		System.out.println("--------------------");
		System.out.println("1. 주소록 입력");
		System.out.println("2. 주소록 검색");
		System.out.println("3. 주소록 조회");
		System.out.println("4. 주소록 수정");
		System.out.println("5. 주소록 삭제");
		System.out.println("0. 종료");
		System.out.println("--------------------");
		System.out.println("메뉴를 입력하세요:");
		int num = sc.nextInt();
		if (num == 1) {
			addrInput();
			/*System.out.println("주소록을 입력합니다. ");
			System.out.println("이름을 입력하시오.");
			String name = sc.next();
			System.out.println("전화번호를 입력하시오.");
			String phone = sc.next();
			System.out.println("회사를 입력하시오.");
			String com = sc.next();
			LocalDateTime date = LocalDateTime.now();
			Addr ad1 = new Addr(name, phone, com, date);
			System.out.println(ad1);
			addList.add(ad1);*/
			
		}else if (num == 2) {
			System.out.println("주소록을 검색합니다. ");
		}else if (num == 3) {
			addrJohoi();
			System.out.println("주소록 전체 명단을 조회합니다. ");
			for (Addr addr : addList) {
				System.out.println(addr);
			}
		}else if (num == 4) {
			System.out.println("주소록을 수정합니다. ");
		}else if (num == 5) {
			System.out.println("주소록을 삭제합니다. "); 
		}else if (num == 0) {
			System.out.println("종료합니다. ");
			break;
		}else {
			System.out.println("잘못된 입력입니다. 다시 입력하세요... ");
			}
		}
		public static void addrJohoi() {
			System.out.println("주소록의 전체 명단을 조회합니다. ");
			for (Addr addr :addList) {
				System.out.println(addr);
			}
		}
		
		public static void addrInput() {
			System.out.println("주소록을 입력합니다. ");
			System.out.println("이름을 입력하시오.");
			String name = sc.next();
			System.out.println("전화번호를 입력하시오.");
			String phone = sc.next();
			System.out.println("회사를 입력하시오.");
			String com = sc.next();
			LocalDateTime date = LocalDateTime.now();
			Addr ad1 = new Addr(name, phone, com, date);
			System.out.println(ad1);
			addList.add(new Addr(name, phone, com,date));
			System.out.println("입력되었습니다.");
		}
	}


}
