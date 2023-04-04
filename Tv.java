package homework;

public class Tv {
	public String maker;
	public String size;
	public int price;
	
	public Tv() {};
	public Tv(String maker, int price, String size) {
		this.maker = maker;
		this.price = price;
		this.size = size;
	}
}

class SmartTv extends Tv implements TvInterface {
	
	private String type;
	private String It;
	private String B;
	
	public SmartTv() {  }
	public SmartTv(String maker, int price, String size, String type, String It, String B) { 
		super(maker, price, size);
		this.type = type;
		this.It = It;
		this.B = B;
	}
	public void printSmartTv() {
		System.out.println("제조사:" + maker + ", " + "가격:" + price + ", " + "크기: " + size + " ," + "타입:" + type + ", " + "인터넷:" + It + ", " + "블루투스:" + B);
		}
	@Override
	public void youtubePlay() {
		// TODO Auto-generated method stub
		System.out.println("유튜브 재생~~");
	}
	@Override
	public void youtubeStop() {
		// TODO Auto-generated method stub
		System.out.println("유튜브 재생중단!");
	}
	@Override
	public void internetPlay() {
		// TODO Auto-generated method stub
		System.out.println("인터넷 접속합니다~");
	}
	@Override
	public void internetStop() {
		// TODO Auto-generated method stub
		System.out.println("인터넷은 여기까지~");
	}
}