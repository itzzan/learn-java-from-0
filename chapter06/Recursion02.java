
public class Recursion02 {
	//��дһ��main����
	public static void main(String[] args) {
		T t1 = new T();
		// t1.test(4);
		
		int res = t1.factorial(5);
		System.out.println(res);
	}
}

class T {
	//����
	public void test(int n) {
		if (n > 2) {
			test(n - 1);
		} 
		System.out.println("n = " + n);
	}

	//factorial �׳�
	public int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}
}
