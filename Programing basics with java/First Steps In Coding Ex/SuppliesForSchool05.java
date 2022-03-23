import java.util.Scanner;

public class SuppliesForSchool05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numbOfPens=Integer.parseInt(scanner.nextLine());
        int numbOfMarkers=Integer.parseInt(scanner.nextLine());
        int litresForBoard=Integer.parseInt(scanner.nextLine());
        int percentOfDiscount=Integer.parseInt(scanner.nextLine());
        double pens=5.80;
        double markers=7.20;
        double board=1.2;
        double allPens=numbOfPens*pens;
        double allMarkers=numbOfMarkers*markers;
        double allBoard=litresForBoard*board;
        double sum=allBoard+allMarkers+allPens;
        double discount=sum*percentOfDiscount/100;
        double allSum=sum-discount;
        System.out.println(allSum);
        }
    }

