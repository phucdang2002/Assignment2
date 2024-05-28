package creator;

import request.HighPriorityConcrete;

public class HighPriorityConcreteCreator extends RequestCreator {

	@Override
	public void createRequest() {
		this.request = new HighPriorityConcrete();
	}

}
