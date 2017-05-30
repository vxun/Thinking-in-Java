package chapter17_containers;
import java.util.*;

import com.zhangxiuwu.util.Countries;

public class SlowMap<K, V> extends AbstractMap<K, V> {

	private List<K> keys = new ArrayList<K>();
	private List<V> values = new ArrayList<V>();
	
	public V put(K key, V value)
	{
		V oldValue = get(key);
		if (!keys.contains(key))
		{
			keys.add(key);
			values.add(value);
		} else 
		{
			values.set(keys.indexOf(key), value);
		}
		return oldValue;
	}
	
	public V get(Object key) {
		if (!keys.contains(key))
		{
			return null;
		}
		return values.get(keys.indexOf(key));
	}

	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
		Iterator<K> kit = keys.iterator();
		Iterator<V> vit = values.iterator();
		while(kit.hasNext())
		{
			set.add(new SimpleEntry<K, V>(kit.next(), vit.next()));
		}
		return set;
	}

	public static void main(String[] args) {
		SlowMap<String ,String> m = new SlowMap<String, String>();
		m.putAll(Countries.capitals());
		System.out.println(m);
		System.out.println(m.get("BULGARIA"));
		System.out.println(m.entrySet());
	}
	
	
}
