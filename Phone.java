package homework;

public class Phone {
	public int PhoNo;
	public String maker;
	public String price;
	
	public Phone() {};
	public Phone(int PhoNo, String maker, String price) {
		this.PhoNo = PhoNo;
		this.maker = maker;
		this.price = price;
	}
	public void Phone() {
		System.out.println("폰번호: " + PhoNo + " ," + "제조사:" + maker + ", " + "가격:" + price );
	}
}

class SmartPhone extends Phone implements PhoneInterface {
	private String type;
	private String size;
	private String B;
	
	public SmartPhone() {  }
	public SmartPhone(int PhoNo, String maker, String price, String type, String size, String B) {
		super(PhoNo,maker,price);
		this.size = size;
		this.type = type;
		this.B = B;
	}
	public void printSmartPhone() {
	System.out.println("폰번호: " + PhoNo + " ," + "제조사:" + maker + ", " + "가격:" + price + ", " +"타입:" + type + ", " + "메모리 크기:" + size + ", " + "블루투스:" + B);
	}
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("따르릉따르릉~~");
	}
	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 왔어요.");
	}
	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자갑니다.");
	}
	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자왔어요.");
	}
	@Override
	public void mp3Play() {
		// TODO Auto-generated method stub
		System.out.println("음악 연주합니다.");
	}
	@Override
	public void mp3Stop() {
		// TODO Auto-generated method stub
		System.out.println("음악 중단합니다.");
	}
	
}