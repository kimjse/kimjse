package pj0323;

import java.time.LocalDateTime;

public class Addr {
		//1필드
		
		private String name;
		private String phone;
		private String company;
		private LocalDateTime date;
		//2생성자
		public Addr(String name, String phone, String company, LocalDateTime date) {
			super();
			this.name = name;
			this.phone = phone;
			this.company = company;
			this.date = date;
		}
		public Addr() {}
		//3getter,setter 메소드, toString()
		@Override
		public String toString() {
			return "[주소 : 이름=" + this.name + ", 전화번호=" + phone + ", 회사=" + company + ", 입력날짜= " + date  + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public LocalDateTime getDate() {
			return date;
		}
		public void setDate(LocalDateTime date) {
			this.date = date;
		}
		

	}


