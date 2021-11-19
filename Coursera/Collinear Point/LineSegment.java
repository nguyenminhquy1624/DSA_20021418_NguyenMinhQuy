
public class LineSegment {
	public final Point p;
	public final Point q;
	
	// constructs the line segment between points p and q
	public LineSegment(Point p , Point q) {
		if(p == null || q == null) throw new NullPointerException();
		this.p = p;
		this.q = q;
	}
	// draws this line segment
	public void draw() {
		p.drawTo(q);
	}
	// string representation
	@Override
	public String toString() {
		return p + " -> " + q;
	}
	@Override
	public int hashCode() {
		throw new UnsupportedOperationException();
	}
}
