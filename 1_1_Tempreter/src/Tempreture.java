//导入输入的包
import java.util.Scanner;
public class Tempreture {
    public static void main(String[] args) {
        //定义Scanner对象，名为scanner
        Scanner scanner = new Scanner(System.in);
        //接受数据
        int f = scanner.nextInt();
        int c = (int)(5.0 / 9.0 * (f - 32));
        System.out.println(c);
    }
}

