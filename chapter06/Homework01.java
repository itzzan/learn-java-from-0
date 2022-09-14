
public class Homework01 {
	//编写一个main方法
	public static void main(String[] args) {
		A01 a1 = new A01();
		double[] d1 = {1, 2, 10, 5.5, 8.3};
		Double res = a1.max(d1);
		System.out.println(res);
	}
}

//编写类A01，定义方法max，实现求某个double数组的最大值，并返回
//分析
//1. 类名 A01
//2. 方法名 max
//3. 形参 (double[])
//4. 返回值 double
class A01 {
	//大写的Double 是类， 小写的double 是基本属性
	public Double max(double[] d1) {
		//保证arr至少有一个元素
		//先判断arr是否为空，再看是否大于0
		if (d1 != null && d1.length > 0) {
			double max = d1[0];
			for (int i = 1; i < d1.length; i++) {
				if (max < d1[i]) {
					max = d1[i];
				}
			}
			return max;
		} else {
			return null;
		}
		
	}
}