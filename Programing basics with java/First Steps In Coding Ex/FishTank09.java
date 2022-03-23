import java.util.Scanner;

public class FishTank09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int weight = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        Double percent = Double.parseDouble(scanner.nextLine());
        int volume = length * weight * height;
        Double maxLiters = volume * 0.001;
        Double percent1 = percent * 0.01;
        Double litresNeeded = maxLiters * (1 - percent1);
        System.out.printf("%.2f", litresNeeded);
    }
}