
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LookupTable<Integer> implements Iterator<Integer> {
	private Map<String, List<Integer>> Word = new HashMap<>();

	private void add(String key, Integer value) {
		List<Integer> list = Word.get(key);
		if (list == null) {
			list = new ArrayList<>();
			Word.put(key, list);
		}
		list.add(value);
	}

	private List<Integer> getAll(String key) {
		List<Integer> list = Word.get(key);
		if (list == null)
			list = new ArrayList<>();
		return list;
	}

	private void remove(String key, Integer value) {
		List<Integer> list = Word.get(key);
		if (list == null)
			return;
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer listValue = iterator.next();
			if (listValue.equals(value)) {
				iterator.remove();
			}
		}
	}

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Integer next() {
		return null;
	}
}
