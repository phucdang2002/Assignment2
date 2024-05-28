package creator;

import request.LowPriorityConcrete;

public class LowPriorityConcreteCreator extends RequestCreator {

	@Override
	public void createRequest() {
		this.request = new LowPriorityConcrete();
	}

}
