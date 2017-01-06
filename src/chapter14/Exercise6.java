package chapter14;
import java.util.*;
import static com.zhangxiuwu.util.Print.*;
class HShape{
	boolean highlight = false;
	public void highlight()
	{
		this.highlight = true;
	}
	public void clearHighlight() 
	{
		this.highlight = false;
	}
	void draw()
	{
		print(this + " .draw()");
	}
	public String toString() 
	{
		return this.getClass().getName() + " " + (this.highlight ? " highlight " : " normal ");
	}
	public static List<HShape> shapes = new ArrayList<HShape>();
	public HShape(){
		shapes.add(this);
	}
	
	static void highlight1(Class<?> type) {
		for(HShape shape : shapes)
		{
			if (type.isInstance(shape))
			{
				shape.highlight();
			}
		}
	}
	static void clearHighlight1(Class<?> type)
	{
		for(HShape shape : shapes)
		{
			if (type.isInstance(shape))
			{
				shape.clearHighlight();
			}
		}
	}
}

class HCricle extends HShape{}
class HSquare extends HShape{}
class HTriangle extends HShape{}


public class Exercise6 {

	public static void main(String[] args) {
		List<HShape> shapes = Arrays.asList(new HCricle(), new HSquare(), new HTriangle(), new HCricle(), new HSquare(), new HTriangle());
		
		HShape.highlight1(HCricle.class);
		for(HShape shape : shapes) {
			shape.draw();
		}
		
	}
}
