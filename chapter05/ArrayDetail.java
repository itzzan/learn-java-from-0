
public class ArrayDetail {
	//编写一个main函数
	public static void main(String[] args) {
		
		//1. 数据是多个相同类型数据的组合，实现对这些数据的统一管理
		//int arr1[] = {1, 2, 3, 60}//ok
		//int arr1[] = {1, 2, 3, 60, 1.1}//error double->int
		//int arr1[] = {1, 2, 3, 60, "hello"}//error Sring->int
		
		//double arr2[] = {1.1, 2.2, 3, 60};//ok
		double arr2[] = {1.1, 2.2, 3, 60.6, 100};//ok int -> double 自动转换

		//2. 数组中的元素可以是任意数据类型，包括基本类型和引用类型，但是不能混用
		String arr3[] = {"北京", "jack", "milan"};//引用类型

		//3. 数组创建后，如果没有赋值，会有默认值
		//int 0，short 0，byte 0，long 0，float 0.0，double 0.0，char \u0000
		//boolean false，String null
		
		short arr4[] = new short[3];
		System.out.println("====数组4====");
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}

		//4. 使用数组的步骤
		//（1）声明数据并开辟空间
		//（2）给数组各个元素赋值
		//（3）使用数组
		
		//5. 数组的下标是从 0 开始的
		
		//6. 数组下标必须指定范围内使用，否则报错：下标越界异常
		//比如：int arr[] = new int[5]; 则有效下标为 0-4
		//即数组的下标/索引 最小为0 最大为数组长度-1
		int arr5[] = new int[5];
		System.out.println(arr5[5]);//数组越界

		//7. 数组属引用类型，数组型数据是对象(object)



	}
}