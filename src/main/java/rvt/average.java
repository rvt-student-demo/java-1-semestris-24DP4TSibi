import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);

        System.out.println("First num.: ");
        double num= one.nextDouble();

        System.out.println("Sec.: ");
        double num2= one.nextDouble();

        System.out.println("Third.: ");
        double num3= one.nextDouble();

        System.out.println((num+num2+num3)/3);
    }
}
