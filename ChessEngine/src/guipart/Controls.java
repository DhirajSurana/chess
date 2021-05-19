package guipart;

import java.awt.Dimension;

import javax.swing.JComponent;

public class Controls extends JComponent {
	protected final int CONTROL_WIDTH = 600;
	protected final int CONTROL_HEIGHT = 70;

	public Controls() {
		this.setPreferredSize(new Dimension(CONTROL_WIDTH, CONTROL_HEIGHT));

	}

}
