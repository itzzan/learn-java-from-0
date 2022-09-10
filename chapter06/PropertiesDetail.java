
public class PropertiesDetail {
	//编写一个main方法
	public static void main(String[] args) {
		//创建Person对象
		//p1 - 对象名（对象引用）
		//new Person() 创建的对象空间（数据） 才是真正的对象
		Person p1 = new Person();//p1只是指向这个对象，真正的对象是开辟出来的

		//对象的属性默认值，遵守数组规则
		System.out.println("当前这个人的信息");
		System.out.println("age=" + p1.age);
		System.out.println("name=" + p1.name);
		System.out.println("sal=" + p1.sal);
		System.out.println("isPass=" + p1.isPass);
	}
}

class Person {
	int age;
	String name;
	double sal;
	boolean isPass;
}