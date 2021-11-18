import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.princeton.cs.algs4.Point2D;

public class BruteCollinearPoints {

	private final List<LineSegment> list;

	// finds all line segments containing 4 points
	public BruteCollinearPoints(Point[] points) {
		checkPoints(points);
		this.list = new ArrayList<>();
		if (points.length >= 4)
			brute(points);
	}

	/**
	 * Kiểm tra tất cả trong mảng points có các điểm thẳng hàng nào
	 * @param points
	 */
	private void brute(Point[] points) {
		Arrays.sort(points);
		for (int a = 0; a < points.length - 3; a++) {
			for (int b = a + 1; b < points.length - 2; b++) {
				for (int c = b + 1; c < points.length - 1; c++) {
					for (int d = c + 1; d < points.length; d++) {
						if (collinear(points[a], points[b], points[c], points[d]))
							this.list.add(new LineSegment(points[a], points[d]));
					}
				}
			}
		}
	}

	/**
	 * Kiểm tra độ dốc 4 điểm
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @return
	 */
	private static boolean collinear(Point a, Point b, Point c, Point d) {
		final double slopeAB = a.slopeTo(b);
		return slopeAB == a.slopeTo(c) && slopeAB == a.slopeTo(d);
	}

	private static void checkPoints(Point[] points) {
		if (points == null)
			throw new java.lang.IllegalArgumentException();
		for (Point p : points) {
			if (p == null)
				throw new java.lang.IllegalArgumentException();
		}
		for (int i = 0; i < points.length - 1; i++) {
			for (int j = i + 1; j < points.length; j++) {
				if (points[i].compareTo(points[j]) == 0)
					throw new java.lang.IllegalArgumentException();
			}
		}
	}

	// the number of line segments
	public int numberOfSegments() {
		return this.list.size();
	}

	// the line segments
	public LineSegment[] segments() {
		return this.list.toArray(new LineSegment[0]);
	}

}