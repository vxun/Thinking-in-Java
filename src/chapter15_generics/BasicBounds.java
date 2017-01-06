package chapter15_generics;

import java.awt.Color;

/**
 * @author ZhangXiuwu
 * 泛型边界
 */
interface HasColor{
	Color getColor();
}

class Colored<T extends HasColor>{
	T item;
	Colored(T item)
	{
		this.item = item;
	}
	T getItem()
	{
		return item;
	}
	Color color()
	{
		return item.getColor(); // 边界为HashColor, 可以用HasColor的方法
	}
}

// 尺寸
class Dimension{
	public int x, y, z;
}

class ColoredDimension<T extends Dimension & HasColor> {
	T item;
	ColoredDimension(T item)
	{
		this.item = item;
	}
	
	T getItem(){ return item; }
	
	Color color(){ return item.getColor(); }
	
	int getX() { return item.x; }
	int getY() { return item.y; }
	int getZ() { return item.z; }
}

interface Weight {
	int weight();
}

// 固体
class Solid<T extends Dimension & HasColor & Weight> {
	T item;
	Solid(T item) 
	{
		this.item = item;
	}
	T getItem() { return item; }
	Color color() { return item.getColor(); }
	int getX() { return item.x; }
	int getY() { return item.y; }
	int getZ() { return item.z; }
	
	int weight() { return item.weight(); }
}

// Bound 界限
class Bounded extends Dimension implements HasColor, Weight {
	@Override
	public int weight() {
		return 0;
	}
	@Override
	public Color getColor() {
		return null;
	}
}

public class BasicBounds {
	public static void main(String[] args)
	{
		Solid<Bounded> solid = new Solid<Bounded>(new Bounded());
		System.out.println(solid.color());
		System.out.println(solid.weight());
	}
}
