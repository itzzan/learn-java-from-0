//需求：输入圆的半径，计算圆的周长和面积，并输出
//导入输入包
import java.util.Scanner;
public class Round {
    public static void main(String[] args) {
        //定义Scanner对象
        Scanner yuan = new Scanner(System.in);
        //接受数据
        double round_r = yuan.nextDouble();//半径

        double round_pre = 2 * 3.14 * round_r;//周长
        double round_s = 3.14 * Math.pow(round_r, 2);//面积
        //输出
        System.out.println("周长 = " + round_pre);
        System.out.println("面积 = " + round_s);


    }
}