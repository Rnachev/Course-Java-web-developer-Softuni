    import java.util.Scanner;

    public class SpeedInfo06 {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            double a=Double.parseDouble(scanner.nextLine());
            //•	При скорост до 10 (включително) отпечатайте "slow"
            if (a <= 10){
                System.out.println("slow");
            }else if (a > 10 && a <= 50){
                System.out.println("average");
            }else if (a > 50 && a <= 150){
                System.out.println("fast");
            }else if (a >150 && a<=1000){
                System.out.println("ultra fast");
            }else if (a>1000){
                System.out.println("extremely fast");
            }
            //•	При скорост над 10 и до 50 (включително) отпечатайте "average"
            //•	При скорост над 50 и до 150 (включително) отпечатайте "fast"
            //•	При скорост над 150 и до 1000 (включително) отпечатайте "ultra fast"
            //•	При по-висока скорост отпечатайте "extremely fast"
        }
    }
