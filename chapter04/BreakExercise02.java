import java.util.Scanner;
public class BreakExercise02 {
	//��дһ��main����
	public static void main(String[] args) {
		//ʵ�ֵ�¼��֤���� 3 �λ��ᣬ����û���Ϊ"����" ,����"666"��ʾ��¼�ɹ���������ʾ���м��λ��ᣬ
		//��ʹ�� for+break ��� BreakExercise02.java
		
		//˼·����
		//1. ����Scanner��������û�����
		//2. ���� String name��String passwd�������û���������
		//3. ���ѭ��3��[��¼3��]�����������������ǰ�˳�
		//4. ����һ������ int chance ��¼���м��ε�¼����
		Scanner myScanner = new Scanner(System.in);
		int chance = 3;
		String name = "";
		String passwd = "";
		for (int i = 1; i <= 3; i++) {
			System.out.println("����������");
			name = myScanner.next();
			System.out.println("����������");
			passwd = myScanner.next();
			//�Ƚ���������ֺ������Ƿ���ȷ
			//�����ַ��������� �Ƚ� ʹ�õķ��� equals
			if ("����".equals(name) && "666".equals(passwd)) {
				System.out.println("��ϲ�㣬��¼�ɹ�~");
				break;
			}
			//��¼�Ļ���ͼ���һ��
			chance--;
			System.out.println("�㻹��" + chance +"�ε�¼����");

		}

	}
}