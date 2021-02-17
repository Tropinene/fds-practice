import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        int f;
        int c;

        Scanner in = new Scanner(System.in);
        f = in.nextInt();
        c = (f - 32) * 5 / 9;
        System.out.println(c);
        // 或者通过强制类型转换，直接输出
        // System.out.println((int)((f - 32) * 5 / 9));
    }
}
