
public class Homework02 {
	//编写一个main方法
	public static void main(String[] args) {
		A02 a2 = new A02();
		String[] str = {"tom", "jack", "jim", "mark"};
		String str2 = "to";
		int res = a2.find(str, str2);
		if (res == -1) {
			System.out.println("没找到");
		} else {
			System.out.println("找到了，下标=" + res);
		}
	}
}

//编写类A02，定义方法find，实现查找某字符串是否在字符串数组中，并返回索引
//如果找不到，返回-1
//分析
//1. 类型 A02
//2. 方法名 find
//3. 返回值 int
//4. 形参 （String，String[]）
class A02 {
	public int find(String[] str, String str2) {
		int index = -1;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(str2)) {
				index = i;
			}
		}
		return index;
	}
}