import java.util.Scanner;

public class P04InchToCentimeters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double cm=Double.parseDouble(scanner.nextLine());
        double inch=2.54;
        System.out.println(cm*inch);
    }
}
