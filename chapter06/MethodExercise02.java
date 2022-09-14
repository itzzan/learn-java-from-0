
public class MethodExercise02 {
	//编写一个main方法
	public static void main(String[] args) {
		//1) 编写类 MyTools 类，编写一个方法可以打印二维数组的数据。 
		//2) 编写一个方法 copyPerson，可以复制一个 Person 对象，
		//返回复制的对象。克隆对象， 
		//注意要求得到新对象和原来的 对象是两个独立的对象，只是他们的属性相同
		Person p = new Person();
		p.name = "jack";
		p.age = 20;

		//创建一个Mytools对象
		Mytools tools = new Mytools();
		Person p2 = tools.copyPerson(p);

		//p 和 p2 是两个独立的对象，都是Person对象，属性相同
		System.out.println("p的属性 age = " + p.age + " 名字 = " + p.name);
		System.out.println("p2的属性 age = " + p2.age + " 名字 = " + p2.name);

		//提示：可以通过 对象比较看看是否为同一个对象
		System.out.println(p == p2);//false
	}
}

class Person {
	String name;
	int age;
}

class Mytools {
	//克隆
	//编写方法的思路
	//1. 方法的返回类型 Person
	//2. 方法名 copyPerson
	//3. 方法的形参 (Person p)
	//4. 方法体 ：创建一个新对象并复制属性，返回即可
	public Person copyPerson(Person p) {
		//创建一个新的对象
		Person p2 = new Person();
		//复制内容
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
}