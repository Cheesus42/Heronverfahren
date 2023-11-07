import java.util.Scanner;

public class HeronFixpoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        HeronFix(input);
    }
    public static void HeronFix(double a){
        double x = a;
        double y = -1;
        if (a == 0 || a < 0){
            System.out.println("Das verfahren kann bei Null oder negativen Zahlen nicht angewendet");
        }else {
            while (y != x) {
                y = x;
                x = (x + a / x) / 2;
                System.out.println(x);
            }
        }
    }
}