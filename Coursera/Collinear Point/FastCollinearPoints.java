import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FastCollinearPoints {

	private LineSegment[] lines;
	private int count = 0;

	public FastCollinearPoints(Point[] points) {
		if (points == null) {
			throw new IllegalArgumentException();
		}
		int n = points.length;
		Point[] copy1 = new Point[n];
		Point[] copy2 = new Point[n];
		LineSegment[] lineset = new LineSegment[n * n];
		copy(points, copy1);
		Arrays.sort(copy1);
		copy(copy1, copy2);

		for (int i = 1; i < copy1.length; i++) {
			if (copy1[i].compareTo(copy1[i - 1]) == 0) {
				throw new IllegalArgumentException();
			}
		}

		for (int i = 0; i < n; i++) {
			Arrays.sort(copy2, copy1[i].slopeOrder());
			Point min = copy2[0];
			Point max = copy2[0];
			int count = 1;
			for (int j = 1; j < n; j++) {
				if (Double.compare(copy1[i].slopeTo(copy2[j]), copy1[i].slopeTo(copy2[j - 1])) == 0) {
					if (copy2[j].compareTo(min) < 0) {
						min = copy2[j];
					} else if (copy2[j].compareTo(max) > 0) {
						max = copy2[j];
					}
					count++;
					if (j == (n - 1) && count >= 3 && min.compareTo(copy1[i]) > 0) {
						lineset[count++] = new LineSegment(copy1[i], max);
					}
				} else {
					if (count >= 3 && min.compareTo(copy1[i]) > 0) {
						lineset[count++] = new LineSegment(copy1[i], max);
					}
					min = copy2[j];
					max = copy2[j];
					count = 1;
				}
			}
		}
		lines = Arrays.copyOf(lineset, count);
	}

	private void copy(Point[] arr, Point[] copyPoints) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == null) {
				throw new IllegalArgumentException();
			}
			copyPoints[i] = arr[i];
		}
	}

	public int numberOfSegments() {
		return count;
	}

	public LineSegment[] segments() {
		return Arrays.copyOf(this.lines, this.count);
	}

}