package com.monocept.test;

//import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.reflect.*;

public class ReflectionTest {
	public static void main(String[] args) throws Exception {
		Class cls = Class.forName(args[0]);
		System.out.println("Class name : " + cls.getName());
		System.out.println("\n---Methods Information---\n ");
		Method[] methods = cls.getDeclaredMethods();
		// System.out.println(Modifier.toString(methods[0].getModifiers()));
		for (Method m : methods) {
			int a = m.getModifiers();
			System.out.println("Method Name : " + m.getName());
			System.out.println("Access Specifier : " + Modifier.toString(a));
			System.out.println("Return type : " + m.getReturnType() + "\n");
		}
		Constructor[] constructors = cls.getDeclaredConstructors();
		System.out.println("\n---Constructors Information---\n ");
		for (Constructor c : constructors) {
			System.out.println(c);
		}
		System.out.println("\n---Fields Information---\n");
		Field[] fields = cls.getFields();

		for (Field f : fields) {
			int value = f.getModifiers();
			System.out.println("Field Name : " + f.getName());
			System.out.println("Access Specifier : " + Modifier.toString(value) + "\n");

		}

	}

}
