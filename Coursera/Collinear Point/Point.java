import java.util.Comparator;
import edu.princeton.cs.algs4.StdDraw;

public class Point implements Comparable<Point> {

	private final int x;
	private final int y;

	/**
	 * Khởi tạo giá trị cho các Point
	 * 
	 * @param x : tọa độ điểm x
	 * @param y : tọa độ điểm y
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// draws this point
	public void draw() {
		StdDraw.point(x, y);
	}

	// draws the line segment from this point to that point
	public void drawTo(Point that) {
		StdDraw.line(this.x, this.y, that.x, that.y);
	}

	// the slope between this point and that point
	public double slopeTo(Point that) {
		if (that == null) {
			throw new java.lang.NullPointerException();
		}

		if (that.x == this.x) {
			if (that.y == this.y) {
				return Double.NEGATIVE_INFINITY;
			} else {
				return Double.POSITIVE_INFINITY;
			}
		}
		if (that.y == this.y) {
			return 0;
		}
		return (that.y - this.y) * 1.0 / (that.x - this.x);
	}

	// compare two points by y-coordinates, breaking ties by x-coordinates
	public int compareTo(Point that) {
		if (that == null) {
			throw new java.lang.NullPointerException();
		}
		int kq = this.y - that.y;
		if (kq == 0) {
			return this.x - that.x;
		}
		return kq;
	}

	// compare two points by slopes they make with this point
	public Comparator<Point> slopeOrder() {
		return new Comparator<Point>() {
			@Override
			public int compare(Point p1, Point p2) {
				if (p1 == null || p2 == null)
					throw new java.lang.NullPointerException();
				return Double.compare(slopeTo(p1), slopeTo(p2));
			}
		};
	}

	// string representation
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public static void main(String[] args) {

	}
}