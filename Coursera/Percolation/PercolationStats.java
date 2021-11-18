
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {

	private final int count;
	private final double[] fractions;

	public PercolationStats(int n, int t) {
		if (n <= 0 || t <= 0) {
			throw new IllegalArgumentException("N <= 0 or T <= 0");
		}
		count = t;
		fractions = new double[count];
		for (int i = 0; i < count; i++) {
			Percolation pr = new Percolation(n);
			int openedSites = 0;
			while (!pr.percolates()) {
				int p = StdRandom.uniform(1, n + 1);
				int q = StdRandom.uniform(1, n + 1);
				if (!pr.isOpen(p, q)) {
					pr.open(p, q);
					openedSites++;
				}
			}
			double fraction = (double) openedSites / (n * n);
			fractions[i] = fraction;
		}
	}

	/** Giá trị trung bình của mẫu. */
	public double mean() {
		return StdStats.mean(fractions);
	}

	/** Độ lệch chuẩn. */
	public double stddev() {
		return StdStats.stddev(fractions);
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
