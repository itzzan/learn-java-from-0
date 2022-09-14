
public class Homework04 {
	//编写一个main方法
	public static void main(String[] args) {
		A03 a3 = new A03();
		int[] arr1 = {1, 2, 5, 6, 7};
		int[] res = a3.copyArr(arr1);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
			
		
	}
}

//编写类A03，实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样
class A03 {
	public int[] copyArr(int[] arr1) {
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		return arr2;
	}
}