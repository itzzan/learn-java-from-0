import java.util.Scanner;
public class SeqSearch {
	//��дһ��main����
	public static void main(String[] args) {
		//) ��һ�����У���üӥ������ëʨ����������������������������Ϸ��
		//�Ӽ�������������һ�����ƣ��ж��������Ƿ� ���������ơ�˳����ҡ� 
		//Ҫ��: ����ҵ��ˣ�����ʾ�ҵ����������±�ֵ
		
		//˼·����
		//1. ����һ���ַ�������
		//2. �����������룬�������飬��һ�Ƚϣ���������У�����ʾ��Ϣ�����˳�
		String names[] = {"��üӥ��", "��ëʨ��", "��������", "��������"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������");
		String findName = myScanner.next();

		//�������飬��һ�Ƚ�
		//
		int index = -1;
		for (int i = 0; i < names.length; i++) {
			if (findName.equals(names[i])) {
				System.out.println("��ϲ���ҵ� " + findName);
				System.out.println("�±�Ϊ " + i);
				//��i���浽index
				index = i;
				break;//�˳�
			} 
		}
		if (index == -1) {
			System.out.println("û���ҵ�");
		}

	}
}