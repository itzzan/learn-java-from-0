//需求：根据学生成绩（成绩在0～100之间）
// 输出等级：
// 当成绩大于90（含90），输出A；
// 当成绩在80-90之间（含80），输出B ；
// 当成绩在60-80之间（含60），输出C；
// 当成绩小于60，输出D，分别用if语句和switch语句实现

//if 语句
//引入输入包
import java.util.Scanner;
public class ScoreGrade {
    public static void main(String[] args) {
        //定义Scanner对象
        Scanner sc = new Scanner(System.in);
        //接受数据
        //假设成绩为 int 类型
        int score = sc.nextInt();
        //成绩在0-100之间，因此给个限制条件
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println('A');
            } else if (score >= 80 && score < 90) {
                System.out.println('B');
            } else if (score >= 60 && score < 80) {
                System.out.println('C');
            } else {
                System.out.println('D');
            }
        } else {
            System.out.println("输入错误，输入范围为0-100，请重新输入");
        }
    }
}
