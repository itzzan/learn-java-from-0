
public class Homework05 {
	//编写一个main方法
	public static void main(String[] args) {
		Circle yuan = new Circle(3);
		System.out.println("面积=" + yuan.C_s());
		System.out.println("周长=" + yuan.C_l());
	}
}

//定义一个圆类Circle，定义属性：半径，提供显式圆周长功能的方法
//提供显式圆面积的方法
class Circle {
	double r;
	public Circle(double r) {
		this.r = r;
	}

	public double C_l() {
		return Math.PI*2*r;
	}

	public double C_s() {
		return Math.PI*Math.pow(r, 2);
	}
}