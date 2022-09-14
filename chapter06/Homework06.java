
public class Homework06 {
	//编写一个main方法
	public static void main(String[] args) {
		Cale cale = new Cale(2, 10);
		System.out.println("和=" + cale.sum());
		System.out.println("差=" + cale.minus());
		System.out.println("乘=" + cale.mul());
		Double divRes = cale.div();
		if (divRes != null) {
			System.out.println("除=" + cale.div());
		}
	}
}

//编程创建一个Cale计算类，在其中定义2个变量表示两个操作数
//定义四个方法实现求和、差、乘、商（要求除数为0的话，要提示）
//并创建两个对象，分别测试
class Cale {
	double n1;
	double n2;

	public Cale(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public double sum() {
		return n1 + n2;
	}

	public double minus() {
		return n1 - n2;
	}

	public double mul() {
		return n1 * n2;
	}

	public Double div() {
		if (n2 == 0) {
			System.out.println("不能为0");
			return null;//由于返回空，因此返回类型只能是Double类
		}
		return n1 / n2;
	}
}