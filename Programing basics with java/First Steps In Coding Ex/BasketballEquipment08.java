import java.util.Scanner;

public class BasketballEquipment08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Вход
        //От конзолата се четe 1 ред:
        //•	Годишната такса за тренировки по баскетбол – цяло число в интервала [0… 9999]
        double yearTax=Double.parseDouble(scanner.nextLine());
        // Джеси решава, че иска да се занимава с баскетбол, но за да тренира е нужна екипировка.
        // Напишете програма, която изчислява какви разходи ще има Джеси, ако започне да тренира,
        // като знаете колко е таксата за тренировки по баскетбол за период от 1 година. Нужна екипировка:
        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        double sneakers=yearTax-(yearTax*0.4);
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        double uniform=sneakers-(sneakers*0.2);
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        double basketball=(uniform*0.25);
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        double things=(basketball*0.2);
        double sum=yearTax+sneakers+uniform+basketball+things;
        System.out.printf("%.2f",sum);

        //Изход
        //Да се отпечата на конзолата колко ще са разходите на Джеси, ако започне да спортува баскетбол
    }
}
