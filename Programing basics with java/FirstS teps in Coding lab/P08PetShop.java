import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int packDogFood=Integer.parseInt(scanner.nextLine());
        int packCatFood=Integer.parseInt(scanner.nextLine());
        double dogFood=packDogFood*2.5;
        double catFood=packCatFood*4.0;
        Double finalPrice=dogFood+catFood;
        System.out.println(finalPrice);

    }
}
