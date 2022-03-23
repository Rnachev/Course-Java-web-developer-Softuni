import java.util.Scanner;

public class Repainting06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //6.	Пребоядисване
        //Входът се чете от конзолата и съдържа точно 4 реда:
        //1.	Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
        double nylonNeeded=Double.parseDouble(scanner.nextLine());
        //2.	Необходимо количество боя (в литри) - цяло число в интервала [1…100]
        double paintNeeded=Double.parseDouble(scanner.nextLine());
        //3.	Количество разредител (в литри) - цяло число в интервала [1…30]
        double liquidNeeded=Double.parseDouble(scanner.nextLine());
        //4.	Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]
        double hoursNeeded=Double.parseDouble(scanner.nextLine());
        // Румен иска да пребоядиса хола и за целта е наел майстори. Напишете програма,
        // която изчислява разходите за ремонта, предвид следните цени:
        //•	Предпазен найлон - 1.50 лв. за кв. метър
        double nylon=(nylonNeeded+2)*1.50;
        //•	Боя - 14.50 лв. за литър
        double paint=(paintNeeded+(paintNeeded*0.1))*14.50;
        //•	Разредител за боя - 5.00 лв. за литър
        double liquid=liquidNeeded*5.0;
        double bags=0.40;
        //Сумата, която се заплаща на майсторите за 1 час работа,
        // е равна на 30% от сбора на всички разходи за материали.
        double sum=(nylon+paint+liquid+bags);
        double hours=(sum*0.3)*hoursNeeded;
        double allSum=hours+sum;
        System.out.printf("%.2f",allSum);
        //Вход

        //Изход
        //Да се отпечата на конзолата един ред:
        //•	"{сумата на всички разходи}"
    }
}
