
public class ArrayReverse {
	//编写一个main函数
	public static void main(String[] args) {
		//需求：把数组的元素内容翻转
		//arr {11,22,33,44,55,66} -> {66,55,44,33,22,11}
		//思路
		//规律：
		//1. 把arr[0] 和 arr[5] 进行交换 {66,22,33,44,55,11}
		//2. 把arr[1] 和 arr[4] 进行交换 {66,55,33,44,22,11}
		//3. 把arr[2] 和 arr[3] 进行交换 {66,55,44,33,22,11}
		//4. 一共要交换 3 次 = arr.length / 2
		//5. 每次交换时，对应的下标是 arr[i] 和 arr[arr.length - 1 - i]
		//
		//优化
		// int arr[] = {11, 22, 33, 44, 55, 66};
		// int temp = 0;
		// int len = arr.length;
		// for (int i = 0; i < len / 2; i++) {
		// 	temp = arr[len - 1 - i];//保存
		// 	arr[len - 1 - i] = arr[i];
		// 	arr[i] = temp; 
		// }
		// //打印
		// System.out.println("===翻转后数组===");
		// for (int i = 0; i < arr.length; i++) {
		// 	System.out.println(arr[i]);
		// }

		//自己的写法，将其倒着传给另一个数组
		//然后再赋给原先的数组 可以直接指向arr2 即 arr = arr2
		int arr[] = {11, 22, 33, 44, 55, 66};
		int arr2[] = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			//可以增加一个循环变量 j -> 0 -> 5
			arr2[arr.length - 1 - i] = arr[i];
		}
		//让arr 指向arr2 的数据空间，此时 arr 原来的数据空间就没有变量引用，会被当作垃圾，销毁
		arr = arr2;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
} 