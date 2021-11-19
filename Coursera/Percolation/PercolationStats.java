
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {

	private int count;
	private double[] arr;
	/**
	 * 
	 * @param n : độ rộng của lưới ô
	 * @param trials số lần thí nghiệm
	 */
	public PercolationStats(int n, int trials) {
		if (n <= 0 || trials <= 0) {
			throw new IllegalArgumentException();
		}
		count = trials;
		arr = new double[count];
		for (int i = 0; i < count; i++) {
			Percolation percolation = new Percolation(n);
			int open = 0;
			while (!percolation.percolates()) {
				int p = StdRandom.uniform(1, n + 1);
				int q = StdRandom.uniform(1, n + 1);
				if (!percolation.isOpen(p, q)) {
					percolation.open(p, q);
					open++;
				}
			}
			double frac = (double) open / (n * n);
			arr[i] = frac;
		}
	}

	/** Giá trị trung bình của mẫu. */
	public double mean() {
		return StdStats.mean(arr);
	}

	/** Độ lệch chuẩn. */
	public double stddev() {
		return StdStats.stddev(arr);
	}

	/** Giới hạn dưới của khoảng tin cậy 95%. */
	public double confidenceLo() {
		return mean() - ((1.96 * stddev()) / Math.sqrt(count));
	}

	/** Giới hạn trên của khoảng tin cậy 95%. */
	public double confidenceHi() {
		return mean() + ((1.96 * stddev()) / Math.sqrt(count));
	}

	public static void main(String[] args) {

	}

}
