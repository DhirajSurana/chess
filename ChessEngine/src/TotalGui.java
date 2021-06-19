

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class TotalGui extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Board board;
	private final int TOTAL_WIDTH = 64 * 9;
	private final int TOTAL_HEIGHT = 64 * 9;

	public TotalGui() {
		board = new Board();
		board.setBounds(new Rectangle(64 / 2, 64 / 2, 64 * 8, 64 * 8));
		this.add(board);
		this.setPreferredSize(new Dimension(TOTAL_WIDTH, TOTAL_HEIGHT));
	}

	protected void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, TOTAL_WIDTH, TOTAL_HEIGHT);
	}
}
