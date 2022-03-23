import java.util.Scanner;

public class VacationBookList04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            int numbOfPages=Integer.parseInt(scanner.nextLine());
            int pages=Integer.parseInt(scanner.nextLine());
            int numbOfDays=Integer.parseInt(scanner.nextLine());
            int pagesADay=numbOfPages/pages;
            int hoursNeeded= pagesADay/numbOfDays;
        System.out.println(hoursNeeded);
    }
}
