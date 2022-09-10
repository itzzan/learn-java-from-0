
public class MethodParameter01 {
	//编写一个main方法
	public static void main(String[] args) {
		//创建AA对象aa
		AA aa = new AA();
		int a = 10;
		int b = 20;
		aa.swap(a, b);
		System.out.println("a=" + a + " b=" + b);


	}
}

class AA {
	public void swap(int a, int b) {

		System.out.println("\na和b交换前的值\na=" + a + " b=" + b);

		//完成a和b的交换
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("\na和b交换后的值\na=" + a + " b=" + b);
	}
}