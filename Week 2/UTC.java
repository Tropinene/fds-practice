import java.util.Scanner;

public class UTC 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int BTC = in.nextInt();
        int UTC;

        if ((BTC / 100) >= 8) 
        {
            UTC = BTC - 800;
        } 
        else 
        {
            UTC = BTC + 24 - 800;
        }
        System.out.println(UTC);
    }

}
