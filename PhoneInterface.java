package dy1122;

public interface PhoneInterface {
	public final int TIMEOUT = 10000;
	void sendCall(); 
	public abstract void receiveCall();
}
class SsPhone implements PhoneInterface {
	private String medel;
	private String phoneNo;
	public SsPhone() {}
	public SsPhone(String model, String phoneNo) {
		this.medel = model;
		this.phoneNo = phoneNo;
	}
}
