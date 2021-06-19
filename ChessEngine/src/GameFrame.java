

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TotalGui totalgui;
	private ImageIcon icon;

	public GameFrame(String title) {
		icon = new ImageIcon(getClass().getResource("/queen.png"));
		totalgui = new TotalGui();
		this.add(totalgui);
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setIconImage(icon.getImage());
		this.pack();
		this.setLocationRelativeTo(null);
	}
}
