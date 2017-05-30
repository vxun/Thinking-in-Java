package chapter17_containers;
import java.util.*;

import com.zhangxiuwu.util.Countries;

public class SimpleHashMap<K, V> extends AbstractMap<K, V>{

	
	static final int SIZE = 997;
	LinkedList<SimpleEntry<K, V>>[] buckets = new LinkedList[SIZE];
	public V put(K key, V value)
	{
		V oldValue = null;
		int index = Math.abs(key.hashCode()) % SIZE;
		System.out.println("index = " + index + "; hashCode = " + key.hashCode());
		if (buckets[index] == null)
		{
			buckets[index] = new LinkedList<SimpleEntry<K, V>>();
		}
		LinkedList<SimpleEntry<K, V>> bucket = buckets[index];
		SimpleEntry<K, V> pair = new SimpleEntry<K, V>(key, value);
		boolean found = false;
		ListIterator<SimpleEntry<K, V>> it = bucket.listIterator();
		while(it.hasNext())
		{
			SimpleEntry<K, V> iPair = it.next();
			if (iPair.getKey().equals(key))
			{
				oldValue = iPair.getValue();
				it.set(pair);
				found = true;
				break;
			}
		}
		if (!found)
		{
			buckets[index].add(pair);
		}
		return oldValue;
	}
	
	public V get(Object key)
	{
		int index = Math.abs(key.hashCode()) % SIZE;
		if (buckets[index] == null)
			return null;
		for (SimpleEntry<K, V> simpleEntry : buckets[index])
		{
			if (simpleEntry.getKey() != null && simpleEntry.getKey().equals(key))
			{
				return simpleEntry.getValue();
			}
		}
		return null;
	}
	
	@Override
	public Set<Entry<K, V>> entrySet() {
		Set<Entry<K, V>> set = new HashSet<Entry<K, V>>();
		for (LinkedList<SimpleEntry<K, V>> bucket : buckets)
		{
			if (bucket == null) 
				continue;
			set.addAll(bucket);
		}
		return set;
	}

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		SimpleHashMap<String, String> m = new SimpleHashMap<String, String>();
		m.putAll(Countries.capitals(25));
		System.out.println(m);
		System.out.println(m.get("ERITREA"));
		System.out.println( m.entrySet().size() + " " + m.entrySet() );
		System.out.println(" Time " + (System.currentTimeMillis() - time));
	}
	
}
