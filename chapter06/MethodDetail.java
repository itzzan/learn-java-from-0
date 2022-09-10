
public class MethodDetail {
	//编写一个main方法
	public static void main(String[] args) {
		//1. 一个方法最多有一个返回值 [思考，如何返回多个结果 - 返回数组 ]
		AA a = new AA();
		int[] res = a.getSumAndSub(1, 4);
		System.out.println("和=" + res[0]);
		System.out.println("差=" + res[1]);


		//细节：调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型的参数
		byte b1 = 1;
		byte b2 = 2;
		a.getSumAndSub(b1, b2);//byte -> int
		//a.getSumAndSub(1.1, 1.8);//error double -> int
		
		//细节：形参和实参的类型要一致或兼容、个数、顺序必须一致
		// a.getSumAndSub(100);//error
		//a.getSumAndSub(1.1, 1);//error 实际参数和形式参数顺序不同
	}
}

class AA {
	//细节：方法不能嵌套定义
	// public void f4() {
	// 	public void f5() {
			
	// 	}
	// }


	//1. 一个方法最多有一个返回值 [思考，如何返回多个结果 - 返回数组 ]
	public int[] getSumAndSub(int n1, int n2) {

		int[] resArr = new int[2];//创建一个数组
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}

	//2) 返回类型可以为任意类型，包含基本类型或引用类型(数组，对象)
	//具体看getSumAndSub
	//
	//3) 如果方法要求有返回数据类型，则方法体中最后的执行语句必须为 return 值; 
	//而且要求返回值类型必须和 return 的 值类型一致或兼容
	//
	public double f1() {
	//public int f1() {
		double d1 = 1.1 * 3;
		int n = 100;
		//return n; //ok int->double
		return d1;
	}

	//4) 如果方法是 void，则方法体中可以没有 return 语句，或者 只写 return ，注意，不能写值;
	public void f2() {
		System.out.println("Hello01");
		System.out.println("Hello01");
		System.out.println("Hello01");

		return;
	}

	//方法名 遵循驼峰命名法，最好见名知义，表达出该功能的意思即可, 
	//比如 得到两个数的和 getSum, 开发中按照规范
	//最好是见名之意

}