
public class BlogAddress implements AddressInterface {
	private String address;
	
	@Override
	public String getAddress() {
		return "blog.naver.com/nexus7";
	}
	
	@Override
	public void setAddress(String address) {
		this.address = address;
	}
}
