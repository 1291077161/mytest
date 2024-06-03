package com.yomahub.liteflow.bean.fathersontest;

public class Test {
	public static void main(String[] args) {
		Zi zi = new Zi(10, "20");


		Fu fu = new Fu();
		// fu.show();
		zi.show();  //  子类无参构造

		// Fu fu = new Fu();
	}
}


class Fu {
	int num;   //10

	public Fu() {
		System.out.println("父类无参构造");
	}
	// //
	// public Fu(int num) {
	//     this.num = num;  //10
	// }

	public void show() {
		System.out.println("aaaaaa");
	}

}

class Zi extends Fu {
	//20
	// String num;

	public Zi() {
		// this(1,2);
		// super();
		System.out.println("子类无参构造");
	}

	//同时给子类和父类的成员变量赋值
	public Zi(int fuNum, String ziNum) {

		// this.num = 100;


		//这里已经手动调用了父类的有参构造方法  所以不会调用父类的无参构造
		// this.show();
		// super();
		// super(fuNum);
		// this.num = ziNum;
		System.out.println("子类有参构造");
	}


	@Override
	public void show() {
		// this(1,"2");
		// this.show();public class CustomClassLoader extends ClassLoader {
		//     @Override
		//     protected Class<?> findClass(String name) throws ClassNotFoundException {
		//         byte[] classData = loadClassData(name);
		//         if (classData == null) {
		//             throw new ClassNotFoundException();
		//         } else {
		//             return defineClass(name, classData, 0, classData.length);
		//         }
		//     }
		//
		//     private byte[] loadClassData(String className) {
		//         String fileName = getFileName(className);
		//         try (InputStream is = getParent().getResourceAsStream(fileName)) {
		//             if (is == null) {
		//                 return null;
		//             }
		//             ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//             int bufferSize = 4096;
		//             byte[] buffer = new byte[bufferSize];
		//             int bytesNumRead;
		//             while ((bytesNumRead = is.read(buffer)) != -1) {
		//                 baos.write(buffer, 0, bytesNumRead);
		//             }
		//             return baos.toByteArray();
		//         } catch (IOException e) {
		//             e.printStackTrace();
		//         }
		//         return null;
		//     }
		// }
		System.out.println("父类的num:" + super.num);
		System.out.println("子类的num:" + this.num);
		// this.show();

	}


	public void test() {
		//final修饰基本类型，只能一次赋值以后不能被修改
		final int num;

		//等价于final int num = 1;
		num = 1;
		System.out.println(num);
		// 异常
		// num = 2;

		//final修饰引用类型，引用类型地址值不能再改变，即不能再次执行new操作；引用类型的值可以改变。
		final int[] nums = new int[2];
		nums[0] = 1;
		nums[1] = 2;
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		nums[0] = 3;
		nums[1] = 4;
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		// nums = new int[3]; 异常
	}
}