//������ϰ
//
public class ArithmeticOperatorExercise02 {

	//��дһ��main����
	public static void main(String[] args) {
		//1. ���绹��59�췿�ۣ��ʣ���xx��������xx��
		//˼·������
		//a��ʹ��int ������� ��i��������
		//b��һ��������7�� ��������i / 7�� ��xx�죺i % 7
		int i = 59;
		int weeks = i / 7;
		int days = i % 7;
		System.out.println("��" + weeks + "��������" + days + "��");

		//2. ����һ���������滪���¶ȣ������¶�ת�������¶ȵĹ�ʽΪ��5 / 9 * (�����¶� - 100)
		//����������¶ȶ�Ӧ�������¶ȣ�234.5��
		//˼·������
		//a��ʹ��double���� F���滪���¶�
		//b�����ݸ����Ĺ�ʽ�����м��㼴��
		//	 ������ѧ��ʽ��java���Ե�����
		double F = 234.5;
		double C = 5.0 / 9.0 * (F - 100);
		System.out.println("�����¶�Ϊ" + F);
		System.out.println("�����¶�Ϊ" + C);

	}
}