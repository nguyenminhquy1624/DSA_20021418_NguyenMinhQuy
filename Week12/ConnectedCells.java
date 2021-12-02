import java.util.ArrayList;
import java.util.List;

public class ConnectedCells {

	private static int getCell(List<List<Integer>> matrix , int row, int col) {
		if(row < 0 || col < 0 || row >= matrix.size() || col >= matrix.get(row).size()) {
			return 0;
		}
		if(matrix.get(row).get(col) == 0) {
			return 0;
		}
		
		matrix.get(row).set(col, 0);
		int size = 1;
		for (int i = row-1; i <= row+1; i++) {
			for (int j = col-1; j <= col+1; j++) {
				if(i != row || j != col) {
					size += getCell(matrix, i, j);
				}
			}
		}
		return size;
	}
	
	
    public static int connectedCell(List<List<Integer>> matrix) {
    	int result = 0;
    	for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.get(i).size(); j++) {
				int size = getCell(matrix, i, j);
				result = Math.max(result, size);
			}
		}
    	
    	return result;
    }
    public static void main(String[] args) {
		
	}
}
