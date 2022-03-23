import java.util.Scanner;

public class P09YardGardening {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            int squareMeters=Integer.parseInt(scanner.nextLine());
            double squareMeter=7.61;
            double finalPrice=squareMeters*squareMeter;
            double discount=0.18*finalPrice;
            double finalP=finalPrice-discount;
        System.out.printf("The final price is: %.2f lv.%n",finalP);
        System.out.printf("The discount is: %.2f lv.",discount);
    }
}
