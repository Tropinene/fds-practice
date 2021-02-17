import java.util.Scanner;

public class characteristic_value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test_number = in.nextInt(); // 读入待测数据
        int digit = 0; // 统计位数
        int amount = 0;
        int n; // 临时变量

        // 统计位数
        while (test_number > 0) {
            digit++;
            n = test_number % 10;
            if ((n % 2) == (digit % 2)) {
                amount += Math.pow(2, digit - 1);
            }
            test_number /= 10;
        }
        System.out.println(amount);
    }
}
