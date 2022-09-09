
public class ArrayCopy {
	//编写一个main函数
	public static void main(String[] args) {
		//编写代码 实现数组拷贝（内容复制）
		//将int arr1[] = {10, 20, 30};拷贝到 arr2数组
		//要求：数据空间是独立的
		//思路：
		//创建一个新的数组arr2，开辟一个新的数据空间
		//大小跟 arr1.length 相同
		
		int arr1[] = {10, 20, 30};
		int arr2[] = new int[arr1.length];
		//遍历arr1，把每个元素拷贝到arr2对应的元素位置
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		//输出arr1
		System.out.println("===arr1的值===");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		//修改arr2的值
		arr2[0] = 100;
		System.out.println("===arr2的值===");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}
}