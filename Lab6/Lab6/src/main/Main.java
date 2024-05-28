package main;

import creator.HighPriorityConcreteCreator;
import creator.LowPriorityConcreteCreator;
import creator.MediumPriorityConcreteCreator;
import creator.RequestCreator;

public class Main {
	public static void main(String[] args) {
		RequestCreator lowPriority = new LowPriorityConcreteCreator();
		lowPriority.createRequest();
		lowPriority.processRequest();
		RequestCreator mediumPriority = new MediumPriorityConcreteCreator();
		mediumPriority.createRequest();
		mediumPriority.processRequest();
		RequestCreator highPriority = new HighPriorityConcreteCreator();
		highPriority.createRequest();
		highPriority.processRequest();
	}
}
