
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
	private static final int TOP = 0;
	private final boolean[][] opened;
	private final int size;
	private final int bottom;
	private int openSites;
	private final WeightedQuickUnionUF qf;

	
	/** Khởi tạo giá trị */
	public Percolation(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException();
		}
		size = n;
		bottom = size * size + 1;
		/**Vì có 2 phần tử ở đầu và cuối để kiểm tra có sự kiên thông chưa
		 * nên sẽ cần thêm 2 phần tử nữa */
		qf = new WeightedQuickUnionUF(size * size + 2);
		opened = new boolean[size][size];
		openSites = 0;
	}

	
	/**Mở ô từ giá trị false về true hay là tô màu */
	public void open(int row, int col) {
		checkException(row, col);
		opened[row - 1][col - 1] = true;
		openSites++;

		if (row == 1) {
			qf.union(getQuickFindIndex(row, col), TOP);
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

	/** kiểm tra xem giá trị nhập vào có vượt ra khỏi ngoài mảng hay không */
	private void checkException(int row, int col) {
		if (row <= 0 || row > size || col <= 0 || col > size) {
			throw new IllegalArgumentException();
		}
	}

	/**Kiểm tra xem ô hiện tại đã mở(tô màu) hay chưa */
	public boolean isOpen(int row, int col) {
		checkException(row, col);
		return opened[row - 1][col - 1];
	}

	/**Trả về số ô đã mở (tô màu) */
	public int numberOfOpenSites() {
		return openSites;
	}

	/**Kiểm tra xem bảng đã bị đầy chưa */
	public boolean isFull(int row, int col) {
		if ((row > 0 && row <= size) && (col > 0 && col <= size)) {
			return qf.find(TOP) == qf.find(getQuickFindIndex(row, col));
		} else
			throw new IllegalArgumentException();
	}

	/**Lấy vị trí trong bảng */
	private int getQuickFindIndex(int row, int col) {
		return size * (row - 1) + col;
	}

	/** Kiểm tra xem trên cùng và cuối cùng đã liên thông hay chưa
	 * Nếu như liên thông rồi thì hệ thống bị thấm */
	public boolean percolates() {
		return qf.find(TOP) == qf.find(bottom); 
	}
}
