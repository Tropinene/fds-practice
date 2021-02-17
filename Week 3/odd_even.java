import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        int n_odd = 0;
        int n_even = 0;
        int temp;
        Scanner in = new Scanner(System.in);

        while (true) {
            temp = in.nextInt();

            if (temp == -1)
                break;

            if (temp % 2 == 0)
                n_even++;
            else
                n_odd++;
        }
        System.out.println(n_odd + " " + n_even);
    }
}
