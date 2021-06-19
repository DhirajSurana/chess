

import javax.swing.JComponent;

public class Square extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int row, col;

	Square(int row, int col) {
		this.row = row;
		this.col = col;
	}
}
