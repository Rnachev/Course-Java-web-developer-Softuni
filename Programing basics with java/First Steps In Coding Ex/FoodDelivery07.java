import java.util.Scanner;

public class FoodDelivery07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //От конзолата се четат 3 реда:
        //•	Брой пилешки менюта – цяло число в интервала [0 … 99]
        int nmbOfChick=Integer.parseInt(scanner.nextLine());
        //•	Брой менюта с риба – цяло число в интервала [0 … 99]
        int numbOfFish=Integer.parseInt(scanner.nextLine());
        //•	Брой вегетариански менюта – цяло число в интервала [0 … 99]
        int numbOfVegetarian=Integer.parseInt(scanner.nextLine());
        // Ресторант отваря врати и предлага няколко менюта на преференциални цени:
        //•	Пилешко меню –  10.35 лв.
        double chickenMenu=nmbOfChick*10.35;
        //•	Меню с риба – 12.40 лв.
        double fishMenu=numbOfFish*12.40;
        //•	Вегетарианско меню  – 8.15 лв.
        double vegetarianMenu=numbOfVegetarian*8.15;
        double delivery=2.5;
        double sum=(chickenMenu+fishMenu+vegetarianMenu);
        double desert=sum*0.2;
        double allSum=sum+desert+delivery;
        System.out.printf("%.2f",allSum);
        //Напишете програма, която изчислява колко ще струва на група хора да си поръчат храна за вкъщи.
        //Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
        //Цената на доставка е 2.50 лв и се начислява най-накрая.
        //Вход

        //Изход
        //Да се отпечата на конзолата един ред:  "{цена на поръчката}"
    }
}
