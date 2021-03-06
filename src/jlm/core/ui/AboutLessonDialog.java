package jlm.core.ui;

import javax.swing.JFrame;

import jlm.core.model.Game;

public class AboutLessonDialog extends AbstractAboutDialog {

	private static final long serialVersionUID = 1766486738385426108L;

	public AboutLessonDialog(JFrame parent) {
		super(parent);
		currentLessonHasChanged();
	}

	@Override
	public void currentLessonHasChanged() {
		setTitle("About lesson - " + Game.getInstance().getCurrentLesson().getName());

		//area.setText(Game.getInstance().getCurrentLesson().getAbout());
		//area.setCaretPosition(0);
		md_doc.loadMarkDownDocument(Game.getInstance().getCurrentLesson().getAboutFileName());
		super.path = Game.getInstance().getCurrentLesson().getAboutFileName();
	}

}
