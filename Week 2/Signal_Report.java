import java.util.Scanner;

public class Signal_Report {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        int S = R;
        R /= 10;
        S %= 10;
        String print_S = "";
        String print_R = "";

        switch (S) {
            case 1:
                print_S = "Faint signals, barely perceptiblel, ";
                break;
            case 2:
                print_S = "Very weak signals, ";
                break;
            case 3:
                print_S = "Weak signals, ";
                break;
            case 4:
                print_S = "Fair signals, ";
                break;
            case 5:
                print_S = "Fairly good signals, ";
                break;
            case 6:
                print_S = "Good signals, ";
                break;
            case 7:
                print_S = "Moderately strong signals, ";
                break;
            case 8:
                print_S = "Strong signals, ";
                break;
            case 9:
                print_S = "Extremely strong signals, ";
                break;
            default:
        }

        switch (R) {
            case 1:
                print_R = "unreadable.";
                break;
            case 2:
                print_R = "barely readable, occasional words distinguishable.";
                break;
            case 3:
                print_R = "readable with considerable difficulty.";
                break;
            case 4:
                print_R = "readable with practically no difficulty.";
                break;
            case 5:
                print_R = "perfectly readable.";
                break;
            default:
        }
        System.out.println(print_S + print_R);
    }
}
