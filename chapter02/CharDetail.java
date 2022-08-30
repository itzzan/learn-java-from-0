
public class CharDetail {
	public static void main(String[] args) {
		
		//在Java中，chadr的本质是一个整数，在输出时，是unicode码对应的字符
		//要输出对应的数字，可以(int)字符，即强转
		char c1 = 97;
		System.out.println(c1);// a

		char c2 = 'a';//输出‘a’对应的数字
		System.out.println((int)c2);

		char c3 = '韩';
		System.out.println((int)c3);//38889

		char c4 = 38889;
		System.out.println(c4);//‘韩’

		//char类型是可以进行运算的，相当于一个整数，因为它都对应一个Unicode码
		System.out.println('a' + 10);

		//课堂小测试
		char c5 = 'b' + 1; // 98 + 1 = 99  c
		System.out.println((int)c5); //99
		System.out.println(c5); //c  99->对应的字符->编码表ASCII->c
	}
}
