package chapter14;
import static com.zhangxiuwu.util.Print.*;
/**
 * RTTI: 利用多态实现，编译时时获取类型信息
 * @author ZhangXiuwu
 *
 */
public class Exercise3 {
	public static void main(String[] args) {
		Rhomboid rhomboid = new Rhomboid();
		print("rhomboid " + rhomboid);
		Shape shape = (Shape)rhomboid;
		print("shape " + shape);
		rhomboid = (Rhomboid)shape;
		print("shape=>rhomboid " + rhomboid);
//		Cricle cricle = (Cricle)rhomboid; 编译器就会报错
		Cricle cricle = (Cricle)shape;
		print("shape => Cricle" + cricle);
	}
}

// 菱形
class Rhomboid extends Shape
{
	@Override
	public String toString() {
		return "Rhomboid";
	}
	
}



