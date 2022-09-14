
public class This01 {
	//编写一个main方法
	public static void main(String[] args) {
		Dog dog1 = new Dog("大壮", 3);
		System.out.println("dog1的hashCode=" + dog1.hashCode());
		//dog1 调用了 info() 方法
		dog1.info();
		System.out.println("====================");
		Dog dog2 = new Dog("大黄", 2);
		System.out.println("dog2的hashCode=" + dog2.hashCode());
		dog2.info();
	}
}

class Dog {//类

	String name;
	int age;
	// public Dog(String dName, int dAge) {//构造器
	// 	name = dName;
	// 	age = dAge;
	// }
	//如果我们的构造器的形参，能够直接写成属性名，就更好了
	//这里出现了个问题，根据变量的作用域原则，构造器的name 就是 局部变量了，而不是属性了
	//									   构造器的age 就是 局部变量了，而不是属性了
	//==> 引出 this 关键字
	public Dog(String name, int age) {//构造器
		//this.name 就是当前对象的属性
		this.name = name;
		//this.age 就是当前对象的属性
		this.age = age;
		System.out.println("当前对象的hashCode=" + this.hashCode());
	}

	public void info() {//成员方法 - 输出对象的属性信息
		System.out.println(name + "\t" + age + "\t" + "当前对象的hashCode=" + this.hashCode());
	}

}