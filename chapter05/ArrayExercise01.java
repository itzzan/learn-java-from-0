
public class ArrayExercise01 {
	//编写一个main函数
	public static void main(String[] args) {
		//1. 创建一个char类型的26个元素的数组，分别放置'A'-'Z'
		//使用for循环访问所有元素并打印出来
		//提示：char类型数据运算 'A' + 1 -> 'B'
		//
		//思路分析
		//1. 定义一个 数组 char[] chars = new char[26];
		//2. 因为'A' + 1 = 'B' 类推，所有使用for来赋值
		//3. 使用for循环访问所有元素
		char chars[] = new char[26];
		for (int i = 0; i < chars.length; i++) {//循环26次
			chars[i] = (char)('A' + i);//由于得到的是int类型，因此需要强转成char类型
			System.out.print(chars[i] + " ");
		}
		
		

	}
}