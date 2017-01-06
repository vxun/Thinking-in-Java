package com.zhangxiuwu.typeinfo.pets;

import java.util.*;
public class Pets {

	private static Pet[] PETS = {new Pet("Rat"), new Pet("Manx"), new Pet("Cymric"), new Pet("Pug")};
	
	public static List<Pet> arrayList(int num) {
		List<Pet> result = new ArrayList<Pet>();
		int count = 0;
		for(int i = 0; i < num; i++) {
			if (count < PETS.length) {
				result.add(PETS[count]);
				count++;
			} else {
				count = 0;
				result.add(PETS[0]);
			}
		}
		return result;
	}
	
}

