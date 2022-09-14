
public class Homework13 { 
	//编写一个main方法
	public static void main(String[] args) {
		Circle c = new Circle();
		PassObject po = new PassObject();
		po.printAreas(c, 5);

	}
}

//1. 定义一个Circle类，包含一个double型的radius属性代表圆的半径，findArea()方法返回圆的面积
//2. 定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
//public void printAreas(Circle c, int times) //方法签名/声明
//3. 在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积
//例如：times为5，则输出半径1，2，3，4，5.以及对应的圆面积
//4. 在main方法中调用printAreas()方法，调用完毕后输出当前半径值

class Circle {
	double radius;
	public Circle() {
		//无参构造器
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double findArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	//添加方法setRedius 修改对象的半径值
	public void setRedius(double radius) {
		this.radius = radius;
	}

}

class PassObject {
	public void printAreas(Circle c, int times) {
		System.out.println("Radius\t" + "Area");
		for (int i = 1; i <= times; i++) {
			c.setRedius(i);
			System.out.println(i + "\t" + c.findArea());
		}
	}
}
