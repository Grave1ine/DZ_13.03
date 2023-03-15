import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String cunt = null;
            while (cunt == null) {
                System.out.println("a * x + b = 0");
                System.out.print("a = ");
                double a = in.nextDouble();
                System.out.print("b = ");
                double b = in.nextDouble();
                System.out.print("x = ");
                System.out.println(-1 * (b / a));
            }



    }
}
