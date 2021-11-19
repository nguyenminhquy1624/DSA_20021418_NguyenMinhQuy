import java.util.LinkedList;

import edu.princeton.cs.algs4.MinPQ;

public class Solver {

	private Node goal;

	/**
	 * Tìm giải pháp cho bảng ban đầu
	 * 
	 * @param initial
	 */
	public Solver(Board initial) {
		if (initial == null) {
			throw new java.lang.IllegalArgumentException();
		}
		this.goal = InitNode(initial);
	}

	/**
	 * Tạo 1 min PQ lưu trữ trạng thái các lần dịch chuyển với các thành phần hàng xóm liền kề với nó 
	 * insert trạng thái board vào pq
	 * @param initial
	 * @return
	 */
	private static Node InitNode(Board initial) {
		MinPQ<Node> pq = new MinPQ<>();
		pq.insert(new Node(initial, 0, null));
		pq.insert(new Node(initial.twin(), 0, null));
		while (!pq.isEmpty()) {
			Node curent = pq.delMin();
			if (curent.board.isGoal()) {
				return curent;
			}
			for (Board neighbor : curent.board.neighbors()) {
				if ((curent.pre == null) || (!neighbor.equals(curent.pre.board))) {
					pq.insert(new Node(neighbor, curent.move + 1, curent));
				}
			}
		}
		return null;
	}

	/**
	 * Tạo class để lưu trữ trạng thái của board
	 * @author MINH QUY
	 * pre để chỉ trạng thái trước, move đếm số bước,
	 *  priority đếm tổng số sai lệch và số bước đi để tìm đường nhỏ nhất
	 *  compareTo để so sánh 2 trạng thái bảng xem cái nào tốt hơn
	 */
	private static class Node implements Comparable<Node> {
		public Node pre;
		public Board board;
		public int move;
		public int priority;

		Node(Board board, int move, Node pre) {
			this.board = board;
			this.move = move;
			this.pre = pre;
			this.priority = board.manhattan() + move;
		}

		@Override
		public int compareTo(Node that) {
			return this.priority - that.priority;
		}
	}

	// Bảng ban đầu có giải quyết được không
	public boolean isSolvable() {
		return this.goal != null;
	}

	// Số lần di chuyển tối thiểu để giải quyết bài trả về -1 nếu không thể giải
	// quyết
	public int moves() {
		if (isSolvable()) {
			return this.goal.move;
		}
		return -1;
	}

	// Dãy bảng là cách giải ngắn nhất , trả về null nếu không thể giải quyết được
	public Iterable<Board> solution() {
		if (!isSolvable()) {
			return null;
		}
		LinkedList<Board> result = new LinkedList<>();
		Node curent = this.goal;
		while (curent != null) {
			result.addFirst(curent.board);
			curent = curent.pre;
		}
		return result;
	}
	public static void main(String[] args) {
		
	}
}