import java.util.Scanner;
public class exercise {
    public static void main(String[] args) {
        ex1();
    }
    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start: ");
        Integer num= scanner.nextInt();

        System.out.println("End: ");
        Integer num2= scanner.nextInt();
        System.out.println("");

        for (int i = num; i <= num2; i++){
            System.out.println(i);
        }
        
    }
}
