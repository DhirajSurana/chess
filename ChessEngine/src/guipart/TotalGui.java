package guipart;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class TotalGui extends JComponent {
	private Board board;
	private Controls controls;
	private final int TOTAL_WIDTH = 64 * 9;
	private final int TOTAL_HEIGHT = 64 * 9;

	public TotalGui() {
		board = new Board();
		controls = new Controls();
		board.setBounds(new Rectangle(64 / 2, 64 / 2, 64 * 8, 64 * 8));
		this.add(board);
		controls.setBounds(new Rectangle(50, 680, 600, 70));
		this.add(controls);
		this.setPreferredSize(new Dimension(TOTAL_WIDTH, TOTAL_HEIGHT));
	}

	protected void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, TOTAL_WIDTH, TOTAL_HEIGHT);
	}
}
