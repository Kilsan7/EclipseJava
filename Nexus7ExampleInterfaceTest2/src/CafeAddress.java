
public class CafeAddress implements AddressInterface {
	private String address;
	
	@Override
	public String getAddress() {
		return "cafe.naver.com/nexus7";
	}
	
	@Override
	public void setAddress(String address) {
		this.address = address;
	}
}
