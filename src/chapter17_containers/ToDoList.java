package chapter17_containers;

import java.util.PriorityQueue;

public class ToDoList extends PriorityQueue<ToDoList.ToDoItem>{

	private static final long serialVersionUID = -9095430658709156274L;

	static class ToDoItem implements Comparable<ToDoItem>
	{
		private char primary;
		private int secondary;
		private String item;
		public ToDoItem(String item, char primary, int secondary) {
			this.item = item;
			this.primary = primary;
			this.secondary = secondary;
		}
		@Override
		public int compareTo(ToDoItem o) {
			if (primary > o.primary) {
				return +1;
			} else if (primary == o.primary)
			{
				if (secondary > o.secondary)
				{
					return +1;
				} else if (secondary == o.secondary)
				{
					return 0;
				}
			} 
			return -1;
		}
		
		public String toString() {
			return Character.toString(primary)
					+ secondary + ": " + item;
		}
		
	}
	
	public void add(String td, char pri, int sec)
	{
		super.add(new ToDoItem(td, pri, sec));
	}
	/**
	 * compare的结果， 数值小的优先级高
	 * @param args
	 */
	public static void main(String[] args) {
		ToDoList l = new ToDoList();
		l.add("Empty trash", 'C', 4);
		l.add("Feed Dog", 'A', 2);
		l.add("Feed Bird", 'B', 7);
		l.add("Mow lawn", 'C', 3);
		l.add("Water lawn", 'A', 1);
		l.add("Feed cat", 'B', 1);
		while (!l.isEmpty())
		{
			System.out.println(l.remove());
		}
	}
	
}
