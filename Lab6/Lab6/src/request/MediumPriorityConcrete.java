package request;

public class MediumPriorityConcrete extends RequestProduct {
	
	@Override
	public void setExpire() {
		this.expireDay = "28/6/2024";
	}
	@Override
	public void setPriority() {
		this.priority = "Medium";
	}
	@Override
	public void setStatus() {
		this.status = "Accepted";
	}
	@Override
	public void processRequest() {
		System.out.println("Request accept, estimated completion date is 28/6/2024");
	}
}