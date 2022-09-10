
public class MethodParameter02 {
	//编写一个main方法
	public static void main(String[] args) {
		
		//测试
		B b = new B();
		// int[] arr = {1, 2, 3};
		// b.test100(arr);//调用方法

		// //遍历数组
		// System.out.println("main的arr数组");
		// for (int i = 0; i < arr.length; i++) {
		// 	System.out.print(arr[i] + " ");
		// }
		// System.out.println();

		//测试
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		b.test200(p);
		//测试题，如果test200执行的是p = null ，下面的结果是 10;
		//测试题，如果test200执行的是p = new Person().... ，下面的结果是 10;
		
		System.out.println("main的p.age=" + p.age);
	}
}

class Person {
	String name;
	int age;
}

class B {
	//B 类中编写一个方法 test200，可以接收一个 Person(age,sal)对象，
	//在方法中修改该对象属性，看看原来的对象是否变化？
	//会变化
	public void test200(Person p) {
		//p.age = 10000;//修改对象属性
		
		//思考
		//p = null;
		p = new Person();
		p.name = "tom";
		p.age = 99;
	}

	//B 类中编写一个方法 test100，可以接收一个数组，
	//在方法中修改该数组，看看原来的数组是否变化？
	//会变化
	public void test100(int[] arr) {
		arr[0] = 200;
		//遍历数组
		System.out.println("test100的arr数组");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	

}