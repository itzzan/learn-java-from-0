//��������Բ�İ뾶������Բ���ܳ�������������
//���������
import java.util.Scanner;
public class Round {
    public static void main(String[] args) {
        //����Scanner����
        Scanner yuan = new Scanner(System.in);
        //��������
        double round_r = yuan.nextDouble();//�뾶

        double round_pre = 2 * 3.14 * round_r;//�ܳ�
        double round_s = 3.14 * Math.pow(round_r, 2);//���
        //���
        System.out.println("�ܳ� = " + round_pre);
        System.out.println("��� = " + round_s);


    }
}