package com.zhangxiuwu.typeinfo.pets;

public class Pet {
	private String name;

	public Pet() {
	}

	public Pet(String name) {
		this.name = name;
	}

	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pet) {
			Pet pet = (Pet)obj;
			return this.name.equals(pet.getName());
		}
		return false;
	}
	
}
