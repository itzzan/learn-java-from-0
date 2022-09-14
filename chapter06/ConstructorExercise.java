
public class ConstructorExercise {
	//编写一个main方法
	public static void main(String[] args) {
		Person p1 = new Person();//无参构造器
		//应该输出 null 和 18
		System.out.println("p1的信息 name=" + p1.name + " age=" + p1.age);

		Person p2 = new Person("scott", 50);
		//应该输出 scott 50
		System.out.println("p2的信息 name=" + p2.name + " age=" + p2.age);

	}
}

//在前面定义的 Person 类中添加两个构造器： 
//第一个无参构造器：利用构造器设置所有人的 age 属性初始值都为 18
//
//第二个带 pName 和 pAge 两个参数的构造器：
//使得每次创建 Person 对象的同时初始化对象的 age 属性值和 name 属性值。 
//分别使用不同的构造器，创建对象

class Person {
	String name;//默认null
	int age;//默认0
	//第一个无参构造器：利用构造器设置所有人的 age 属性初始值都为 18
	public Person() {
		age = 18;
	}

	//第二个带 pName 和 pAge 两个参数的构造器：
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}
