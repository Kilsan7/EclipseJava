
public class CallAddress {

	private BlogAddress blogAddress;
	private CafeAddress cafeAddress;

	public static void main(String[] args) {
		
		CallAddress callAddress = new CallAddress();
//		callAddress.process(true);
		callAddress.process(false);

	}
	
	private void process(boolean isBlog) {
		if(isBlog) {
			blogAddress = new BlogAddress();
			returnAddress(blogAddress);
		}
		else {
			cafeAddress = new CafeAddress();
			returnAddress(cafeAddress);
		}
	}
	
	public void returnAddress(Object address) {
		AddressInterface ifAddress;
		if(address instanceof BlogAddress) {
			ifAddress = (BlogAddress) address;
		}
		else {
			ifAddress = (CafeAddress) address;
		}
		
	System.out.println(ifAddress.getAddress());
	}
}
