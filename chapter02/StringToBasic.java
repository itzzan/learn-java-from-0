
public class StringToBasic {
	public static void main(String[] args) {
		
		//基本数据类型->String
		//
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";	
		String s2 = f1 + "";	
		String s3 = d1 + "";	
		String s4 = b1 + "";	
		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

		// String->基本数据类型
		String s5 = "123";
		//在oop 将对象和方法的时候详细说
		//解读 使用 基本数据类型对应的包装类的相应方法，得到基本数据类型
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		byte num5 = Byte.parseByte(s5);
		boolean num6 = Boolean.parseBoolean("true");
		short num7 = Short.parseShort(s5);

		System.out.println("================");
		System.out.println(num1 + 1);//123+1=124
		System.out.println(num2);//123.0
		System.out.println(num3);//123
		System.out.println(num4);//123
		System.out.println(num5);//123
		System.out.println(num6);//true
		System.out.println(num7);//123

		//怎么将字符串转成字符char -> 含义是指把字符串的第一个字符取出
		//解读：s5.charAt(0)，得到s5字符串的第一个字符 ‘1’
		System.out.println(s5.charAt(0));

	}
}