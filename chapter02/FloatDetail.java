public class FloatDetail {
	public static void main(String[] args) {
		//浮点类型的细节
		//Java 的浮点型常量（具体值）默认为double型，声明为float型常量，须后加‘f’或‘F’
		//float num1 = 1.1;//error，不兼容，内存损失
		float num2 = 1.1F;//对
		double num3 = 1.1;//对

		double num4 = 1.1F;//小到大可以

		//十进制数形式：如5.12   512.0f    .512 (0可以省略，但必须要有小数点)
		double num5 = 0.123;
		double num6 = .123;//可以，等价num5
		System.out.println(num5);
		System.out.println(num6);

		//科学计数法形式，如：5.12e2[5.12*10的2次方]   5.12E-2[5.12*10的-2次方]
		System.out.println(5.12e2);//512.0
		System.out.println(5.12e-2);//0.0512

		//通常情况下，应该使用 double 型，因为它比 float 型更精确。 
		////[举例说明]
		double num9 = 2.1234567851;
		float num10 = 2.1234567851F; 

		System.out.println(num9); 
		System.out.println(num10);

		//浮点数使用陷阱: 2.7 和 8.1 / 3 比较 
		//看看一段代码
		double num11 = 2.7;
		double num12 = 8.1 / 3;//
		System.out.println(num11);//2.7
		System.out.println(num12);//接近2.7的一个小数，不是2.7
		//得到与一个重要的使用点：当我们对运算结果是小数的进行相等比较判断时，需要小心
		//应该是以两个数的差值的绝对值，在某个精度范围类判断
		if (num11 == num12) {
			System.out.println("相等");
		}

		// //正确的写法 - 注释快捷键 ctrl + /，再次输入就取消注释
		if (Math.abs(num11 - num12) < 0.000001) {
			System.out.println("差值非常小，到我的规定精度，认为相等");
		}
		
		//可以通过java API 来看
		System.out.println(Math.abs(num11 - num12));

		//细节：如果是直接查询得的的小数或者直接赋值的值，是可以直接判断相等
		// 即：
		double num13 = 2.7;//那么就可以直接判断相等
		if (num11 == num13) {
			System.out.println("相等");
		}

	}
}