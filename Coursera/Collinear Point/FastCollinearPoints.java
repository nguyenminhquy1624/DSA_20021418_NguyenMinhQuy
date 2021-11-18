import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FastCollinearPoints {

	private LineSegment[] lines;
    private int linenum = 0;

    public FastCollinearPoints(Point[] points) 
    {
        if (points == null)
        {
            throw new  IllegalArgumentException();
        }
        int len = points.length;
        Point[] copy1 = new Point[len];
        Point[] copy2 = new Point[len];
        LineSegment[] lineset = new LineSegment[len * len];
        copy(points,copy1);
        Arrays.sort(copy1);
        copy(copy1,copy2);
        if (isduplicate(copy1))
        {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < len; i++)
        {
            Arrays.sort(copy2,copy1[i].slopeOrder());
            Point min = copy2[0];
            Point max = copy2[0];
            int count = 1;
            for (int j = 1; j < len; j++)
            {
                if (Double.compare(copy1[i].slopeTo(copy2[j]), copy1[i].slopeTo(copy2[j-1])) == 0 )
                {
                    if (copy2[j].compareTo(min) < 0)
                    {
                        min = copy2[j];
                    }
                    else if (copy2[j].compareTo(max) > 0)
                    {
                        max = copy2[j];
                    }
                    count++;
                    if (j == (len - 1) && count >= 3 && min.compareTo(copy1[i]) > 0)
                    {
                        lineset[linenum++] = new LineSegment(copy1[i],max);
                    }
                }
                else
                {
                    if (count >= 3 && min.compareTo(copy1[i]) > 0) {
                        lineset[linenum++] = new LineSegment(copy1[i],max);
                    }
                        min = copy2[j];
                        max = copy2[j];
                        count = 1;
                }
            }
        }
        lines = Arrays.copyOf(lineset, linenum);
    }
    public int numberOfSegments()        
    {
        return linenum;
    }

    public LineSegment[] segments()                
    {
        LineSegment[] result = new LineSegment[linenum];
        for(int i = 0; i < linenum; i++)
        {
            result[i] = lines[i];
        }
        return result;
    }

    private void copy(Point[] origin, Point[] newarray)
    {
        int len = origin.length;
        for(int i = 0 ; i < len ; i++) 
        {
            if (origin[i] == null) {
                throw new IllegalArgumentException();
            }
            newarray[i] = origin[i];
        }
    }

    private boolean isduplicate(Point[] items)
    {
        for (int i = 1; i < items.length; i++)
        {
            if (items[i].compareTo(items[i-1]) == 0)
            {
                return true;
            }
        }
        return false;
    }


	

}