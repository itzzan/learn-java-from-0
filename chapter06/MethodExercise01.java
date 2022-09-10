
public class MethodExercise01 {
	//编写一个main方法
	public static void main(String[] args) {
		//1) 编写类 AA ，有一个方法：判断一个数是奇数 odd 还是偶数, 返回 boolean 
		AA a = new AA();
		// boolean judgeParity = a.parity(10);
		// if (judgeParity) {
		// 	System.out.println("是奇数");
		// } else {
		// 	System.out.println("是偶数");
		// }
		
		//2) 根据行、列、字符打印 对应行数和列数的字符，
		//比如：行：4，列：4，字符#,则打印相应的效果
		
		a.f1(30, 30, '0');



	}
}

class AA {
	//思路
	//1. 方法的返回类型 - boolean
	//2. 方法的名字 - parity
	//3. 方法的形参 - (int n)
	//4. 方法体 - 判断
	public boolean parity(int n) {
		if (n % 2 == 1) {
			return true;
		} else {
			return false;
		}
		//三元运算符
		// return n % 2 == 1 ? true: false;
	}

	//思路：
	//1. 方法的返回类型 - void
	//2. 方法的名字 - f1
	//3. 方法的形参 - (int row, int col, char c)
	//4. 方法体 - xunhuan1
	public void f1(int row, int col, char c) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
