package creator;

import request.RequestProduct;

public abstract class RequestCreator {
	protected RequestProduct request;
	public abstract void createRequest();
	public void processRequest() {
		request.setExpire();
		request.setPriority();
		request.setStatus();
		request.processRequest();
	}
}
