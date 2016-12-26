package chapter11;

import java.util.*;

/**
 * 
 * @author ZhangXiuwu 练习1. 沙鼠
 */

class Gerbil {
	private int gerbilNumber;

	public Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}

	public void hop() {
		System.out.println(gerbilNumber + " 正在跳跃 。。。");
	}
}

public class GerbilsHop {
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		for (int i = 0; i < 3; i++) {
			gerbils.add(new Gerbil(i));
		}
		for (int i = 0; i < gerbils.size(); i++) {
			gerbils.get(i).hop();
		}
	}
}
