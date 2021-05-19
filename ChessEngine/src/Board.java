

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class Board extends JComponent {
	private final int SIZE = 64;
	private final int BOARD_WIDTH = (8 * SIZE);
	private final int BOARD_HEIGHT = (int) (8 * SIZE);
	private Color color1;
	private Color color2;
	private Square[][] squares;
	private BufferedImage b;

	public Board() {

		color1 = new Color(118, 150, 86);
		color2 = new Color(238, 238, 210);
		this.setLayout(new GridLayout(8, 8));
		addSquares();
		// pieces = new DrawPieces(SIZE);
		// pieces.setBounds(new Rectangle(BOARD_WIDTH, BOARD_HEIGHT));
		// this.add(pieces);
		this.setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
	}

	private void addSquares() {
		squares = new Square[8][8];
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				squares[row][col] = new Square(row, col);
			}
		}
	}

	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHints(rh);
		boolean color = true;
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				if (color) {
					g2d.setColor(color1);

				} else {
					g2d.setColor(color2);
				}
				g2d.fillRect(row * SIZE, col * SIZE, SIZE, SIZE);
				color = !color;
			}
			color = !color;
		}
		drawKings(g2d);
		drawQueens(g2d);
		drawBishops(g2d);
		drawKnights(g2d);
		drawRooks(g2d);
		drawPawns(g2d);
	}

	private void drawKings(Graphics2D g2d) {
		try {
			b = ImageIO.read(getClass().getResource("/black/bK.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g2d.drawImage(b, 4 * SIZE, 0, this);

		try {
			b = ImageIO.read(getClass().getResource("/white/wK.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g2d.drawImage(b, 4 * SIZE, 7 * SIZE, this);
	}

	private void drawQueens(Graphics2D g2d) {
		try {
			b = ImageIO.read(getClass().getResource("/black/bQ.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g2d.drawImage(b, 3 * SIZE, 0, this);

		try {
			b = ImageIO.read(getClass().getResource("/white/wQ.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g2d.drawImage(b, 3 * SIZE, 7 * SIZE, this);

	}

	private void drawBishops(Graphics2D g2d) {
		try {
			b = ImageIO.read(getClass().getResource("/black/bB.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g2d.drawImage(b, 2 * SIZE, 0, this);
		g2d.drawImage(b, 5 * SIZE, 0, this);

		try {
			b = ImageIO.read(getClass().getResource("/white/wB.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g2d.drawImage(b, 2 * SIZE, 7 * SIZE, this);
		g2d.drawImage(b, 5 * SIZE, 7 * SIZE, this);

	}

	private void drawKnights(Graphics2D g2d) {
		try {
			b = ImageIO.read(getClass().getResource("/black/bN.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g2d.drawImage(b, 1 * SIZE, 0, this);
		g2d.drawImage(b, 6 * SIZE, 0, this);

		try {
			b = ImageIO.read(getClass().getResource("/white/wN.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g2d.drawImage(b, 1 * SIZE, 7 * SIZE, this);
		g2d.drawImage(b, 6 * SIZE, 7 * SIZE, this);

	}

	private void drawRooks(Graphics2D g2d) {

		try {
			b = ImageIO.read(getClass().getResource("/black/bR.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g2d.drawImage(b, 0, 0, this);
		g2d.drawImage(b, 7 * SIZE, 0, this);
		try {
			b = ImageIO.read(getClass().getResource("/white/wR.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g2d.drawImage(b, 0, 7 * SIZE, this);
		g2d.drawImage(b, 7 * SIZE, 7 * SIZE, this);
	}

	private void drawPawns(Graphics2D g2d) {
		for (int i = 0; i < 8; i++) {

			try {
				b = ImageIO.read(getClass().getResource("/black/bp.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			g2d.drawImage(b, i * SIZE, 1 * SIZE, this);
			try {
				b = ImageIO.read(getClass().getResource("/white/wp.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			g2d.drawImage(b, i * SIZE, 6 * SIZE, this);

		}
	}
}
