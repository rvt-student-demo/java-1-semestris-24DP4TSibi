import java.util.Scanner;
 public class greeting {
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String name = scanner.NextLine();
        System.out.println("What's your name: "+ name);
    }
}
