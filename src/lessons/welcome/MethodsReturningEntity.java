package lessons.welcome;


public class MethodsReturningEntity extends universe.bugglequest.SimpleBuggle {
	@Override
	public void forward(int i)  { 
		throw new RuntimeException("forward(int) forbidden in this exercise");
	}

	@Override
	public void backward(int i) {
		throw new RuntimeException("backward(int) forbidden in this exercise");
	}


	@Override
	public void run() { 
		for (int i=0; i<7; i++) {
			if (haveBaggle()) 
				return;
			turnRight();
			forward();
			turnLeft();
		}
	}
	/* BEGIN SOLUTION */
	public boolean haveBaggle() {
		boolean res = false;
		for (int i=0; i<6; i++) {
			if (isOverBaggle()) 
				res = true;
			forward();
		}
		for (int i=0; i<6; i++) 
			backward();
		return res;
	}
	/* END TEMPLATE */
}
