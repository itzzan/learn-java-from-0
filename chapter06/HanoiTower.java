
public class HanoiTower {
	//��дһ��main����
	public static void main(String[] args) {
		Tower tower = new Tower();
		tower.move(2, 'A', 'B', 'C');
	}
}

class Tower {
	//����
	//num��ʾҪ�ƶ��ĸ�����a b c �ֱ��ʾ A�� B�� C��
	//��Ŀ����Ҫ���ǽ����Ӵ�A���ƶ���C�����м���Խ���B��
	//					 
	public void move(int num, char a, char b, char c) {
							//��ʼ��   ������   Ŀ����
		//���һ���̣�num = 1
		if (num == 1) {
			System.out.println(a + "->" + c);
		} else {
			//����ж���̣����Կ���������������ĺ������������
			//1. ���ƶ��������е��̵� b�� Ҫ����c
			//������̶���A������СaΪ��ʼ���������ƶ���B�����СbΪĿ������д��Сc��
			move(num - 1, a, c, b);
			//2. �������������̣��ƶ���c
			System.out.println(a + "->" + c);
			//3. �ٰ�b�����������Ƶ�c������a��
			//�ƶ�һ�κ����������ʼλ�ö���B�ˣ����СbΪ��ʼ�����ƶ���C����СcΪĿ����
			move(num - 1, b, a, c);
		}
	}
}

