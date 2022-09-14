
public class Homework04 {
	//编写一个main函数
	public static void main(String[] args) {
		//已知有个升序的数组，要求插入一个数组，该数组顺序依然是升序
		//比如：[10, 12, 45, 90]
		//添加23后，数组为[10, 12, 23, 45, 90]
		//思路：本质数组扩容 + 定位
		//1. 先确定添加的数应该插入到哪个索引
		//2. 然后扩容
		
		//先定义原数组
		// int[] arr = {10, 12, 45, 90};
		// int insertNum = 23;
		// int index = -1;//index就是要插入的位置
		// //遍历arr数组，如果发现insertNum <= arr[i]
		// //说明 i 就是要插入的位置
		// //就用index = i，保留位置
		// //如果遍历完后，没有发现 insertNum <= arr[i] 
		// //说明 index = arr.length;
		// //即:添加到arr的最后
		
		// for (int i = 0 ; i < arr.length; i++) {
		// 	if (insertNum <= arr[i]) {
		// 		index = i;
		// 		break; // 找到位置后就退出
		// 	}
		// }
		// //判断index的值，看是否找到位置
		// if (index == -1) {
		// 	//说明没找到位置
		// 	index = arr.length;
		// }

		// //扩容
		// //先创建一个新的数组，大小为 arr.length + 1
		// int[] arrNew = new int[arr.length + 1];
		// //之后将arr的元素拷贝到arrNew，并且要跳过index的位置
		
		// for (int i = 0, j = 0; i < arrNew.length; i++) {
		// 	if (i != index) {
		// 		//说明可以把arr的元素拷贝到arrNew
		// 		arrNew[i] = arr[j];
		// 		j++;
		// 	} else {//i这个位置就是要插入的数字
		// 		arrNew[i] = insertNum;
		// 	}
		// }
		// arr = arrNew;
		// System.out.println("===插入后，arr数组的元素情况===");
		// for (int i = 0; i < arr.length; i++) {
		// 	System.out.print(arr[i] + " ");
		// }

		




		//自己的写法
		int[] arr = {10, 12, 45, 90};
		int[] arr2 = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		arr2[arr.length] = -1;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length - 1 - i; j++) {
				if (arr2[j] > arr2[j+1]) {
					int temp = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
	}
} 