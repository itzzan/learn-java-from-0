
public class HanoiTower {
	//编写一个main方法
	public static void main(String[] args) {
		Tower tower = new Tower();
		tower.move(2, 'A', 'B', 'C');
	}
}

class Tower {
	//方法
	//num表示要移动的个数，a b c 分别表示 A塔 B塔 C塔
	//题目就是要我们将柱子从A塔移动到C塔，中间可以借助B塔
	//					 
	public void move(int num, char a, char b, char c) {
							//起始柱   借助柱   目标柱
		//如果一个盘，num = 1
		if (num == 1) {
			System.out.println(a + "->" + c);
		} else {
			//如果有多个盘，可以看成两个，最下面的和上面的所有盘
			//1. 先移动上面所有的盘到 b， 要借助c
			//上面的盘都在A，所以小a为起始柱，将其移动到B，因此小b为目标柱，写在小c处
			move(num - 1, a, c, b);
			//2. 把最下面的这个盘，移动到c
			System.out.println(a + "->" + c);
			//3. 再把b塔的所有盘移到c，借助a塔
			//移动一次后，上面的盘起始位置都在B了，因此小b为起始柱，移动到C，即小c为目标柱
			move(num - 1, b, a, c);
		}
	}
}

