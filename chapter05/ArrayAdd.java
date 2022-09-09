import java.util.Scanner;
public class ArrayAdd {
	//编写一个main函数
	public static void main(String[] args) {
		//要求：实现动态的给数组添加元素效果，实现对数组扩容。ArrayAdd.java 
		//1) 原始数组使用静态分配 int[] arr = {1,2,3} 
		//2) 增加的元素 4，直接放在数组的最后 arr = {1,2,3,4} 
		
		//思路分析
		//1. 定义初始数组 int arr[] = {1,2,3};
		//2. arr[3] = 4;//error 由于原先的下标最大为2，这样就会显示下标越界
		//3. 定义一个新的数组 int arrNew = new int[arr.length+1];
		//4. 遍历arr 数组，依次将arr的元素拷贝到 arrNew 数组
		//5. 将 4 赋给 arrNew[arrNew.length - 1] = 4;//把4赋给 arrNew 的最后一个元素
		//6. 让arr 指向 arrNew ，那么原来的arr数组就会被销毁

		int arr[] = {1, 2, 3};
		int arrNew[] = new int[arr.length + 1]; 
		for (int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}
		//把4赋给arrNew的最后一个元素
		arrNew[arrNew.length - 1] = 4;
		//让 arr 指向 arrNew
		arr = arrNew;
		//输出arr 看看效果
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}
} 