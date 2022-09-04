//演示赋值运算符的使用

public class AssignOperator {

	public static void main(String[] args) {

		int n1 = 10;
		n1 += 4;//n1 = n1 + 4;
		System.out.println(n1);
		n1 /= 3;//n1 = n1 / 3;
		System.out.println(n1);

		//复合赋值运算符会进行类型转换(有一个类型强转)
		byte b = 3;
		//b = b + 2;//error
		b += 2;// b = (byte)(b + 2);

		b++;// b = (byte)(b + 1);


	}

}