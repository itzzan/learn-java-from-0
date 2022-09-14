
public class RecursionExercise02 {
	//编写一个main方法
	public static void main(String[] args) {
		T t1 = new T();
		int day = 8;
		int res = t1.peach(day);
		if (res != -1) {
			System.out.println("第" + day + "天的桃子个数=" + res);
		} 
	}
}

class T {
	//猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
	//以后每天猴子都吃其中的一半，然后再多吃一个
	//当到第10天时，想再吃时（即还没吃），发现只有1个桃子
	//问：最初有多少个桃子
	//思路
	//1. 每天都吃一半，并多吃一个
	//2. 最后吃到第10天的时候，没吃，但发现只有1个桃子了
	//逆推
	//day = 10 时，有 1 个桃子
	//day = 9  时，有 4 个桃子 = (day10 + 1) * 2
	//day = 8  时，有 10个桃子 = (day9 + 1) * 2
	//规律就是  前一天的桃子 = （后一天的桃子数 + 1）* 2
	
	public int peach(int day) {
		if (day == 10) {//第10天 - 只有一个桃
			return 1;
		} else if (day >= 1 && day <= 9) {
			return (peach(day + 1) + 1) * 2;
		} else {
			System.out.println("day在1-10");
			return -1;
		}
		
	}


}
