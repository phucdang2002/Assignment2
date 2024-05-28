package creator;

import request.MediumPriorityConcrete;

public class MediumPriorityConcreteCreator extends RequestCreator {
	@Override
	public void createRequest() {
		this.request = new MediumPriorityConcrete();
	}
}
