import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {

	private static final int X = 0;
	private final int n;
	private int[][] blocks;

	/**
	 * Tạo bảng kích thước n x n ô
	 * 
	 * @param inBlocks
	 */
	public Board(int[][] inBlocks) {
		n = inBlocks.length;
		blocks = new int[n][n];
		copy(blocks, inBlocks);
	}

	/**
	 * Tạo ra một mảng copy
	 * @param blocks mảng mới
	 * @param inBlocks mảng cũ
	 */
	private void copy(int[][] blocks, int[][] inBlocks) {
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				blocks[row][col] = inBlocks[row][col];
			}
		}

	}

	/**
	 * Kích thước bảng
	 * 
	 * @return
	 */
	public int dimension() {
		return n;
	}

	/**
	 * Lấy giá trị của ô khi đúng vị trí
	 * 
	 * @param row
	 * @param col
	 * @return
	 */
	private int getValue(int row, int col) {
		return row * n + col + 1;
	}

	/**
	 * Kiểm tra xem bảng hiện tại có bao nhiêu ô bị lệch vị trí hiện tại so với vị
	 * trí đích
	 * 
	 * @return trả về số ô không đúng vị trí
	 */
	public int hamming() {
		int hamming = 0;
		for (int row = 0; row < n; row++)
			for (int col = 0; col < n; col++)
				if (blocks[row][col] != X && blocks[row][col] != getValue(row, col))
					hamming++;
		return hamming;
	}

	/**
	 * Tính khoảng cách của các ô vị trí hiện tại cần di chuyển bao nhiêu bước để về
	 * đúng vị trí
	 * 
	 * @return tổng khoảng cách các ô với đích
	 */
	public int manhattan() {
		int manhattan = 0;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (blocks[row][col] != X && blocks[row][col] != getValue(row, col)) {
					manhattan += Math.abs(((blocks[row][col] - 1) / n) - row)
							+ Math.abs(((blocks[row][col] - 1) % n) - col);
				}
			}
		}

		return manhattan;
	}

	/**
	 * Bảng này có phải là bảng mục tiêu hướng đến không
	 * 
	 * @return nếu bảng này là bảng đích thì trả về true nếu không trả về false
	 */
	public boolean isGoal() {
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (blocks[row][col] != X && blocks[row][col] != getValue(row, col)) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Bảng có được sau khi trao đổi với bất kì ô nào
	 * 
	 * @return
	 */
	public Board twin() {
		Board board = new Board(blocks);
		int i = 0;
		int j = 0;
		if (blocks[i][j] == X) {
			j++;
		}
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (blocks[row][col] != blocks[i][j] && blocks[row][col] != X) {
					board.swap(i, j, row, col);
					return board;
				}
			}
		}
		return board;
	}

	/**
	 * Đổi vị trí 2 ô trong bảng cho nhau
	 * @param i
	 * @param j
	 * @param row
	 * @param col
	 */
	private void swap(int i, int j, int row, int col) {
		int t = blocks[i][j];
		blocks[i][j] = blocks[row][col];
		blocks[row][col] = t;
	}

	/**
	 * Kiểm tra bảng này có bằng y không
	 */
	public boolean equals(Object y) {

		if (y == null) {
			return false;
		}
		if (y == this) {
			return true;
		}
		if (y.getClass().equals(this.getClass())) {
			Board other = (Board) y;
			if (other.n != this.n) {
				return false;
			} else {
				for (int row = 0; row < n; row++)
					for (int col = 0; col < n; col++)
						if (other.blocks[row][col] != blocks[row][col])
							return false;
				return true;
			}
		} else
			return false;
	}

	/**
	 * Đổi chỗ phần tử hiện tại với các phần tử hàng xóm liền kề trên, dưới, trái , phải
	 * @return
	 */
	public Iterable<Board> neighbors() {

		ArrayList<Board> neighbors = new ArrayList<Board>();
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (blocks[row][col] == X) {

					if (row > 0) {
						Board leftNeighbor = new Board(blocks);
						leftNeighbor.swap(row, col, row - 1, col);
						neighbors.add(leftNeighbor);
					}
					if (row < n - 1) {
						Board rightNeighbor = new Board(blocks);
						rightNeighbor.swap(row, col, row + 1, col);
						neighbors.add(rightNeighbor);
					}
					if (col > 0) {
						Board upperNeighbor = new Board(blocks);
						upperNeighbor.swap(row, col, row, col - 1);
						neighbors.add(upperNeighbor);
					}
					if (col < n - 1) {
						Board downNeighbor = new Board(blocks);
						downNeighbor.swap(row, col, row, col + 1);
						neighbors.add(downNeighbor);
					}
				}
			}
		}
		return neighbors;
	}

	public String toString() {
		String result = new String();
		result += n + "\n";
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				result += blocks[row][col];
				if (col != n - 1)
					result += "  ";
			}
			if (row != n - 1)
				result += "\n";
		}
		return result;
	}
	public static void main(String[] args) {
		
	}
}