package chapter14;
import static com.zhangxiuwu.util.Print.*;
/**
 * RTTI: 利用多态实现，编译时时获取类型信息
 * @author ZhangXiuwu
 *
 */
public class Exercise4 {
	public static void main(String[] args) {
		Rhomboid rhomboid = new Rhomboid();
		print("rhomboid " + rhomboid);
		Shape shape = (Shape)rhomboid;
		print("shape " + shape);
		rhomboid = (Rhomboid)shape;
		print("shape=>rhomboid " + rhomboid);
//		Cricle cricle = (Cricle)rhomboid; 编译器就会报错
		if (shape instanceof Cricle)
		{
			Cricle cricle = (Cricle)shape;
			print("shape => Cricle" + cricle);
		} else
		{
			print("can't shape => Cricle");
		}
		
	}
}





