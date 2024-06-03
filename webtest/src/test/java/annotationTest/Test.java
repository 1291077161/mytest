package annotationTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws NoSuchMethodException {

		//需求： 解析Student类身上的注解： 类上、方法、属性

		//1. 得到student类的字节码对象
		Class clazz = Student.class;

		//1.1 查看类上有没有注解
		boolean flag = clazz.isAnnotationPresent(MyAnnotation.class);
		System.out.println("学生类上有没有MyAnnotation的注解： " + flag);

		boolean flag2 = clazz.isAnnotationPresent(Override.class);
		System.out.println("学生类上有没有Override的注解： " + flag2);

		//1.2 获取类上的注解对象
		//存在注解，返回注解对象
		Annotation annotation1 = clazz.getAnnotation(MyAnnotation.class);
		System.out.println("获取学生类上的MyAnnotation注解对象： " + annotation1);

		//不存在注解，返回null
		Annotation annotation2 = clazz.getAnnotation(Override.class);
		System.out.println("获取学生类上的Override注解对象： " + annotation2);


		//====================================================================
		//2. 判断read方法有没有MyAnnotation的注解，并且获取这个注解对象
		Method m = clazz.getMethod("read");

		boolean flag3 = m.isAnnotationPresent(MyAnnotation.class);
		System.out.println("flag3 = " + flag3);

		MyAnnotation annotation3 = m.getAnnotation(MyAnnotation.class);
		System.out.println("annotation3 = " + annotation3);

		//===================================================================
		//3. 获取注解的属性值
		String address = annotation3.address();
		int age = annotation3.age();
		String value = annotation3.value();

		System.out.println("address = " + address);
		System.out.println("age = " + age);
		System.out.println("value = " + value);


	}
}
