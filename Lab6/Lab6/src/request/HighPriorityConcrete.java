package request;

public class HighPriorityConcrete extends RequestProduct {

	@Override
	public void setExpire() {
		this.expireDay = "28/5/2024";
	}
	@Override
	public void setPriority() {
		this.priority = "Emergency";
	}
	@Override
	public void setStatus() {
		this.status = "Accept";
	}
	@Override
	public void processRequest() {
		System.out.println("Emergency request, our Administer will contact you immediately!");
	}
}
