package homework;

public class TvEx {
	public static void main(String [] args) {
		SmartTv tv = new SmartTv("LG", 15000000 , "80인치", "QLED", "지원함", "지원안함");
		tv.printSmartTv();
		tv.youtubePlay();
		tv.youtubeStop();
		tv.internetPlay(); 
		tv.internetStop(); 
		
		SmartTv OL = new SmartTv("삼성", 2100000 , "100인치", "OLED", "지원안함", "지원함");
		OL.printSmartTv();
	}
}
