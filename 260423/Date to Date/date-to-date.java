
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int m1, d1, m2, d2;

        Scanner scn = new Scanner(System.in);
        String[] tmp = scn.nextLine().split(" ");

        m1 = Integer.parseInt(tmp[0]);
        d1 = Integer.parseInt(tmp[1]);
        m2 = Integer.parseInt(tmp[2]);
        d2 = Integer.parseInt(tmp[3]);

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;

        while (true) {
            if (m1 == m2 && d1 == d2)
                break;
                
            d1++;
            sum++;
            if (d1 > days[m1]) {
                m1++;
                d1 = 1;
            }
        }
        System.out.println(sum);
    } // end of main()
}
