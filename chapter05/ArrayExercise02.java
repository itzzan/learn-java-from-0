
public class ArrayExercise02 {
	//编写一个main函数
	public static void main(String[] args) {
		//2. 请求出一个数组int[]的最大值 {4, -1, 9, 10, 23} 并得到对应的下标
		//思路分析
		//1. 先定义一个int数组
		//2. 假定一个最大值为max = arr[0]
		//3. 然后遍历比较
		
		int arr[] = {4, -1, 9, 10, 23, 888, 80, 90};
		int max = arr[0];
		int maxIndex = 0;//得到对应下标，定义存储下标
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("最大值=" + max);
		System.out.println("对应的下标=" + maxIndex);
		
	}
}