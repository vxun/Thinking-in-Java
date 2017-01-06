package chapter14;

import java.util.Arrays;
import java.util.List;

/**
 * RTTI: 利用多态实现，编译时时获取类型信息
 * @author ZhangXiuwu
 *
 */
abstract class Shape{
	void draw() {System.out.println(this + ".draw()");}
	// this 会调用toString 方法
	abstract public String toString();
}
public class Shapes {
	public static void main(String[] args) {
		List<Shape> shapes = Arrays.asList(new Cricle(), new Square(), new Triangle());
		for (Shape shape : shapes) {
			shape.draw();
		}
	}
}
class Cricle extends Shape{
	@Override
	public String toString() {
		return "Cricle";
	}
}
class Square extends Shape{
	public String toString(){return "Square";}
}
class Triangle extends Shape {
	public String toString() {return "Triangle";}
}




