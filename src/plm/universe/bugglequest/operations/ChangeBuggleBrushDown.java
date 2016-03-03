package plm.universe.bugglequest.operations;

import plm.universe.bugglequest.AbstractBuggle;

public class ChangeBuggleBrushDown extends BuggleOperation {
	private boolean oldBrushDown;
	private boolean newBrushDown;

	public ChangeBuggleBrushDown(AbstractBuggle buggle, boolean oldBrushDown, boolean newBrushDown) {
		super("changeBuggleBrushDown", buggle.getName());
		this.oldBrushDown = oldBrushDown;
		this.newBrushDown = newBrushDown;
	}

	public boolean getOldBrushDown() {
		return oldBrushDown;
	}

	public boolean getNewBrushDown() {
		return newBrushDown;
	}
}