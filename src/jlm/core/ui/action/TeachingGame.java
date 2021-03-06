package jlm.core.ui.action;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import jlm.core.model.Game;
import jlm.core.model.lesson.Exercise;
import jlm.core.ui.ExerciseView;
import jlm.core.ui.Global;
import jlm.core.ui.MissionEditorTabs;

/**
 * This class allow administrator to get into the teaching mode by entering a password ('foo' as default)
 * @author richard Guerci
 *
 */
public class TeachingGame extends AbstractGameAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPasswordField passwordField;
	private JMenuItem item;
	static MissionEditorTabs mission_tab;
	private AboutGame about_lesson;
	private AboutGame about_world;


	public TeachingGame(Game game, String text, ImageIcon icon, Integer mnemonic,MissionEditorTabs mission_tab) {
		super(game, text, icon, "Enter in teaching mode","Impossible to switch in teaching mode right now", mnemonic);
		passwordField = new JPasswordField(10);
		passwordField.setActionCommand("ok");
		passwordField.addActionListener(this);
		this.mission_tab=mission_tab;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(!Global.admin){
			new FramePassword(item,mission_tab,about_lesson,about_world);
		}
		else{
			Global.admin=false;
			item.setText("Teaching mode");
			JOptionPane.showMessageDialog(null,"successfully disconnected from teaching mode");
			changeMode();
			if (about_lesson.getDialog()!=null){
				about_lesson.getDialog().maj();
			}
			if (about_world.getDialog()!=null){
				about_world.getDialog().maj();
			}
		}
	}

	public void setItem(JMenuItem menuItem_teach) {
		item=menuItem_teach;
	}

	public JMenuItem getItem() {
		return item;
	}

	public void setAboutLesson(AboutGame about_lesson) {
		this.about_lesson=about_lesson;
	}

	public void setAboutWorld(AboutGame about_world) {
		this.about_world=about_world;
	}
	
	public static void changeMode(){
		mission_tab.init(true);
		if (ExerciseView.isOk())
			ExerciseView.getInstance().selectedWorldHasChanged(null);
		
	}
}

/**
 * Classe permettant d'afficher un fenetre de demande de mot de passe
 * source: http://docs.oracle.com/javase/tutorial/uiswing/components/passwordfield.html
 * @author bogy
 *
 */
class FramePassword extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	private static String OK = "ok";
	private static String HELP = "help";

	private JFrame controllingFrame;
	private JPasswordField passwordField;
	static JMenuItem item;
	static MissionEditorTabs mission_tab;
	static AboutGame about_lesson;
	static AboutGame about_world;

	public FramePassword(){
		//Création de la fenêtre
		JFrame frame = new JFrame("Teach mode password");
		final FramePassword newContentPane = new FramePassword(frame);
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);

		//Donne le focus à la frame
		frame.addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent e) {
				newContentPane.resetFocus();
			}
		});

		// Taille et positionnement de la demande password
		frame.pack();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
		// affichage
		frame.setVisible(true);
	}


	public FramePassword(JFrame f) {
		controllingFrame = f;

		passwordField = new JPasswordField(10);
		passwordField.setActionCommand(OK);
		passwordField.addActionListener(this);

		JLabel label = new JLabel("Enter the password: ");
		label.setLabelFor(passwordField);

		JComponent buttonPane = createButtonPanel();

		JPanel textPane = new JPanel(new FlowLayout(FlowLayout.TRAILING));
		textPane.add(label);
		textPane.add(passwordField);

		add(textPane);
		add(buttonPane);
	}

	public FramePassword(JMenuItem item,MissionEditorTabs mission_tab,AboutGame agl,AboutGame agw) {
		this();
		this.item=item;
		this.mission_tab=mission_tab;
		this.about_lesson=agl;
		this.about_world=agw;
	}


	protected JComponent createButtonPanel() {
		JPanel p = new JPanel(new GridLayout(0,1));
		JButton okButton = new JButton("OK");
		JButton helpButton = new JButton("Help");

		okButton.setActionCommand(OK);
		helpButton.setActionCommand(HELP);
		okButton.addActionListener(this);
		helpButton.addActionListener(this);

		p.add(okButton);
		p.add(helpButton);

		return p;
	}

	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();

		if (OK.equals(cmd)) {//Verification du password
			char[] input = passwordField.getPassword();
			if (isPasswordCorrect(input)) {
				Global.admin=true;
				controllingFrame.setVisible(false);
				item.setText("Quit teaching mode");
				TeachingGame.changeMode();
				if (about_lesson.getDialog()!=null){
					about_lesson.getDialog().maj();
				}
				if (about_world.getDialog()!=null){
					about_world.getDialog().maj();
				}
			} else {
				JOptionPane.showMessageDialog(controllingFrame,
						"Invalid password. Try again.",
						"Error Message",
						JOptionPane.ERROR_MESSAGE);
			}

			Arrays.fill(input, '0');

			passwordField.selectAll();
			resetFocus();
		} else { //Demande de l'aide
			JOptionPane.showMessageDialog(controllingFrame,
					"Default password is available on GitHub repository: https://github.com/RedFish/JLM.");
		}
	}

	/**
	 * Checks the passed-in array against the correct password.
	 * After this method returns, you should invoke eraseArray
	 * on the passed-in array.
	 */
	private static boolean isPasswordCorrect(char[] input) {
		boolean isCorrect = true;
		char[] correctPassword = {'f', 'o', 'o' };

		if (input.length != correctPassword.length) {
			isCorrect = false;
		} else {
			isCorrect = Arrays.equals (input, correctPassword);
		}

		Arrays.fill(correctPassword,'0');

		return isCorrect;
	}

	protected void resetFocus() {
		passwordField.requestFocusInWindow();
	}

}
