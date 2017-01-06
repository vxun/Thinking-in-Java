package chapter12;

/**
 * 
 * @author ZhangXiuwu Exception BaseBallException in throws clause of
 *         Inning.event() is not compatible with Storm.event() 在Inning
 *
 */
public class StormyInning extends Inning implements Storm {

	/**
	 * 异常限制对构造器不起作用 基类构造器只抛出BaseBallException,
	 * 派生类构造器可以抛出任何异常(必须有BaseBallException)。
	 * 
	 * @throws BaseBallException
	 * @throws RainedOut
	 */
	public StormyInning() throws BaseBallException, RainedOut {
		super();
		// throw new RainedOut();
	}

	@Override
	public void rainHard() throws RainedOut {
		// TODO Auto-generated method stub
	}

	@Override
	/**
	 * 
	 */
	public void atBat() throws PopFoul {
	}

	/**
	 * Inning 类中event() 抛出了BaseBallException，
	 * 而Storm中的event抛出了RainedOut异常，这会出现错误。
	 * 
	 * 所以定义派生类的event不抛出异常，这是可以的
	 * 
	 */
	public void event() {
	}

	public static void main(String[] args) {
		/**
		 * 派生类对象要处理派生类异常
		 */
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch (PopFoul e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (RainedOut e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (BaseBallException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		/**
		 * 基类引用就需要处理基类的异常
		 */
		try {
			Inning i = new StormyInning();
			i.atBat();
		} catch (RainedOut e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Strike e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Foul e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BaseBallException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

// BaseBall 棒球
class BaseBallException extends Exception {
	private static final long serialVersionUID = 7487187485333927255L;
}

// Foul 违反规则的
class Foul extends BaseBallException {
	private static final long serialVersionUID = -5733463100720785742L;
}

// Strike 攻击，撞
class Strike extends BaseBallException {
	private static final long serialVersionUID = -6302782187998060561L;
}

abstract class Inning {
	public Inning() throws BaseBallException {
		// throw new BaseBallException();
	}

	public void event() throws BaseBallException {
	}

	public abstract void atBat() throws Strike, Foul;

	public void walk() {
	};
}

// Storm 袭击，怒骂， 暴风雪
class StormException extends Exception {
	private static final long serialVersionUID = -2186256303558093878L;
}

// Rained out 取消，延期
class RainedOut extends StormException {
	private static final long serialVersionUID = 4783031270977473971L;
}

class PopFoul extends Foul {
	private static final long serialVersionUID = 7720855505779867788L;
}

interface Storm {
	public void event() throws RainedOut;

	public void rainHard() throws RainedOut;
}
