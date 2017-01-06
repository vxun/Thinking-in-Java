package chapter14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/**
 * 
 * @author ZhangXiuwu
 *
 */
class Part2 {
	public String toString() {
		return getClass().getSimpleName();
	}
	public static List<Class<? extends Part>> factories = 
			new ArrayList<Class<? extends Part>>();
	static {
		Collections.addAll(factories, 
				FuelFilter.class,
				AirFilter.class,
				CabinAirFilter.class,
				OilFilter.class,
				FanBelt.class,
				GeneratorBelt.class,
				PowerSteeringBelt.class);
	}
	private static Random random = new Random(47);
	
	public static Part randomCreate() {
		int idx = random.nextInt(factories.size());
		try {
			return factories.get(idx).newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			System.out.println("Instance not find");
			e.printStackTrace();
		}
		return null;
	}
}




public class Exercise14_RegisteredFactories2 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(Part2.randomCreate());
		}
	}
}
