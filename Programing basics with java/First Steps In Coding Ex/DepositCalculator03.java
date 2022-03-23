import java.util.Scanner;

public class DepositCalculator03 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double depositSum=Double.parseDouble(scanner.nextLine());
        int date=Integer.parseInt(scanner.nextLine());
        double yearPercent=Double.parseDouble(scanner.nextLine());
        double sum=depositSum+date*((depositSum*yearPercent/100)/12);
        System.out.println(sum);
    }
}
