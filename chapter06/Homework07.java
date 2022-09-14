
public class Homework07 {
	//编写一个main方法
	public static void main(String[] args) {
		Dog dog1 = new Dog("tom", "白色", 2);
		dog1.show();

	}
}

//设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show()显示其信息
//并创建对象，进行测试（提示：this.属性）
class Dog {
	String name;
	String color;
	int age;
	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void show() {
		System.out.println("信息如下：");
		System.out.println("名字=" + this.name);
		System.out.println("颜色=" + this.color);
		System.out.println("年龄=" + this.age);
	}

}