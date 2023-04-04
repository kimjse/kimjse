package homework;

public class InterfaceEx {
	public static void main(String [] args) {
		SmartPhone phone = new SmartPhone(2201, "삼성", "200만원", "안드로이드", "512MB", "지원함");
		phone.printSmartPhone();
		phone.sendCall();
		phone.receiveCall();
		phone.sendSMS();
		phone.receiveSMS();
		phone.mp3Play();
		phone.mp3Stop();
	}
}
