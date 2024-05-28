package request;

public class LowPriorityConcrete extends RequestProduct {
	@Override
	public void setExpire() {
		this.expireDay = "28/5/2024";
	}
	@Override
	public void setPriority() {
		this.priority = "Ignore";
	}
	@Override
	public void setStatus() {
		this.status = "Done";
	}
	@Override
	public void processRequest() {
		System.out.println("Request denied");
	}
}
