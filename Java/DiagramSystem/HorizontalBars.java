package system;

import app.DrawingApp;
import gui.BoardCell;

public class HorizontalBars implements Diagram {
	private int animationType;
	private char[][] board;

	/*
	 * Constructor that initializes the animationType with the provided parameter
	 * value and initializes the board with the diagram resulting from calling the
	 * DrawingApp.getHorizontalBars() method. You can use the method
	 * BoardCell.getCharArray() to generate a two-dimensional array of characters
	 * from the string returned by DrawingApp.getHorizontalBars().
	 */
	public HorizontalBars(int maxRows, int maxCols, int bars, char color1, char color2, char color3,
			int animationType) {
		String boardChars = DrawingApp.getHorizontalBars(maxRows, maxCols, bars, color1, color2, color3);
		char[][] newBoard = BoardCell.getCharArray(boardChars);

		this.animationType = animationType;
		this.board = newBoard;

	}// HorizontalBars constructor

	// Returns the board
	public char[][] getBoard() {
		return board;
	}// getBoard

	/*
	 * Returns a two-dimensional array of characters representing the next animation
	 * step. If the animationType is 1, the board instance variable will be updated
	 * with by rotating the top row. No other animationType value needs to be
	 * handled.
	 */
	public char[][] nextAnimationStep() {
		if (animationType == 1) {
			TwoDimArrayUtil.rotateTopOneRow(board);
		}

		return board;
	}// nextAnimationStep

	// Number of rows associated with the diagram
	public int getNumberRows() {
		return board.length;
	}// getNumberRows

	// Number of columns associated with the diagram
	public int getNumberCols() {
		return board[0].length;
	}// getNumberCols

}// HorizontalBars
