package org.springblade.sbd.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

	String name;

	int age;

	Pet pet;


	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
