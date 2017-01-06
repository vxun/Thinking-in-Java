package chapter13;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Turtle ： 海龟， 捕海龟
 * @author ZhangXiuwu
 * Java 格式化功能都在java.util.Formatter类中
 */
public class Turtle {

	private String name;
	private Formatter f;
	
	public Turtle(String name, Formatter f) {
		this.name = name;
		this.f = f;
	}
	
	public void move(int x, int y) {
		f.format("%s The Turtle is at (%d, %d)\n", name, x, y);
	}
	public static void main (String[] args) {
		PrintStream out = System.err;
		Turtle tommy = new Turtle("Tommy", new Formatter(System.out));
		Turtle terry = new Turtle("Terry", new Formatter(out));
		tommy.move(0, 0);
		terry.move(4, 8);
		tommy.move(3, 4);
		terry.move(2, 5);
		tommy.move(3, 3);
		terry.move(3, 3);
	}
	
}
