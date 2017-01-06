package chapter15_generics;

import java.util.List;

/**
 * @author ZhangXiuwu
 * 在继承的每个层次上添加边界
 */
interface SuperPower{}
interface XRayVision extends SuperPower{
	void seeThroughWalls();
}
interface SuperHearing extends SuperPower{
	void hearSubtleNoises();
}
interface SuperSmell extends SuperPower {
	void trackBySmell();
}

class SuperHero<P extends SuperPower> {
	P p;
	SuperHero(P p)
	{
		this.p = p;
	}
	P getPower() { return p; }
}

// 警犬
class SuperSleuth<P extends XRayVision> extends SuperHero<P>{
	SuperSleuth(P p)
	{
		super(p);
	}
	void see()
	{
		p.seeThroughWalls();
	}
}

// 狗
class CanineHero<P extends SuperHearing & SuperSmell> extends SuperHero<P> {
	CanineHero(P p)
	{
		super(p);
	}
	void hear()
	{
		p.hearSubtleNoises();
	}
	void smell() 
	{
		p.trackBySmell();
	}
}

class SuperHearSmell implements SuperHearing, SuperSmell {

	@Override
	public void trackBySmell() {
	}

	@Override
	public void hearSubtleNoises() {
	}
}

class DogBoy extends CanineHero<SuperHearSmell> {
	DogBoy(){
		super(new SuperHearSmell());
	}
}


public class EpicBattle {

	static <P extends SuperHearing> void useSuperHearing(SuperHero<P> hero) 
	{
		hero.getPower().hearSubtleNoises();
	}
	static <P extends SuperHearing & SuperSmell> void superFind(SuperHero<P> hero)
	{
		hero.getPower().hearSubtleNoises();
		hero.getPower().trackBySmell();
	}
	
	public static void main(String[] args)
	{
		DogBoy dogBoy = new DogBoy();
		useSuperHearing(dogBoy);
		superFind(dogBoy);
		
		List<? extends SuperHearing> audioBoys;
//		List<? extends SuperHearing & SuperSmell> dogBoys;  Error
	}
	
	
}
