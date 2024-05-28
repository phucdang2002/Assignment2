package request;

public abstract class RequestProduct {
	public String priority;
	public String expireDay;
	public String status;
	public abstract void setPriority();
	public abstract void setStatus();
	public abstract void setExpire();
	public abstract void processRequest();
}
