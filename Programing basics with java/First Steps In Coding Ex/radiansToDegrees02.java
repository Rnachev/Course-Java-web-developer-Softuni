import java.util.Scanner;

public class radiansToDegrees02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double radian=Double.parseDouble(scanner.nextLine());
        Double degree=radian*180/Math.PI;
        System.out.println(degree);
    }
}
