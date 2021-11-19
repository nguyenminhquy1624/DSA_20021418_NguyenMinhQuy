
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
	private static int top = 0;
	private boolean[][] opened;
	private int size;
	private int bottom;
	private int openSites;
	private WeightedQuickUnionUF qf;

	
	/**
	 * Khởi tạo giá trị ban đầu
	 * @param n : 
	 */
	public Percolation(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException();
		}
		size = n;
		bottom = size * size + 1;
		/**
		 * khởi tạo mảng 2 chiều size*size để khởi tạo mảng ban đầu
		 * thêm 2 phần tử đầu(top) và cuối(bottom) để kiểm tra 2 phần đó đã liên thông hay chưa
		 */
		qf = new WeightedQuickUnionUF(size * size + 2);
		opened = new boolean[size][size];
		openSites = 0;
	}

	
	/**
	 * Mở ô từ giá trị false về true hay là tô màu 
	 * @param row : vị trí hàng
	 * @param col : vị trí cột
	 */
	public void open(int row, int col) {
		checkException(row, col);
		opened[row - 1][col - 1] = true;
		openSites++;

		if (row == 1) {
			qf.union(getQuickFindIndex(row, col), top);
		}

		if (row == size) {
			qf.union(getQuickFindIndex(row, col), bottom);
		}

		if (row > 1 && isOpen(row - 1, col)) {
			qf.union(getQuickFindIndex(row, col), getQuickFindIndex(row - 1, col));
		}

		if (row < size && isOpen(row + 1, col)) {
			qf.union(getQuickFindIndex(row, col), getQuickFindIndex(row + 1, col));
		}

		if (col > 1 && isOpen(row, col - 1)) {
			qf.union(getQuickFindIndex(row, col), getQuickFindIndex(row, col - 1));
		}

		if (col < size && isOpen(row, col + 1)) {
			qf.union(getQuickFindIndex(row, col), getQuickFindIndex(row, col + 1));
		}
	}

	/**
	 * kiểm tra xem giá trị nhập vào có vượt ra khỏi ngoài mảng hay không
	 * @param row : vị trí hàng
	 * @param col : vị trí cột
	 */
	private void checkException(int row, int col) {
		if (row <= 0 || row > size || col <= 0 || col > size) {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * 
	 * @param row : vị trí hàng
	 * @param col : vị trí cột
	 * @return : 
	 */
	public boolean isOpen(int row, int col) {
		checkException(row, col);
		return opened[row - 1][col - 1];
	}

	/**
	 * 
	 * @return : trả về số ô đã mở
	 */
	public int numberOfOpenSites() {
		return openSites;
	}

	/**
	 * 
	 * @param row : vị trí hàng
	 * @param col : vị trí cột
	 * @return : kiểm tra xem số ô vị trí (row,col) đã liên thông chưa
	 */
	public boolean isFull(int row, int col) {
		if ((row > 0 && row <= size) && (col > 0 && col <= size)) {
			return qf.find(top) == qf.find(getQuickFindIndex(row, col));
		} else
			throw new IllegalArgumentException();
	}

	/**
	 * 
	 * @param row : vị trí hàng
	 * @param col : vị trí cột
	 * @return trả về vị trí row và col trong bảng
	 */
	private int getQuickFindIndex(int row, int col) {
		return size * (row - 1) + col;
	}

	/**
	 * Kiểm tra xem 2 phần tử top và bottom đã liên thông hay chưa
	 * @return nếu 2 phần tử đã liên thông trả về true nếu không trả về false
	 */
	public boolean percolates() {
		return qf.find(top) == qf.find(bottom); 
	}
}
