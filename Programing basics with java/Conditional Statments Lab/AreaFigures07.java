import java.util.Scanner;

public class AreaFigures07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String figure=scanner.nextLine();
            //•	Ако фигурата е квадрат (square): на следващия ред се чете едно дробно число - дължина на страната му
        if (figure.equals("square")){
            double a=Double.parseDouble(scanner.nextLine());
            double area=a*a;
            System.out.printf("%.3f",area);
        }
        //•	Ако фигурата е правоъгълник (rectangle): на следващите два реда четат две дробни числа - дължините на страните му
        else if (figure.equals("rectangle")){
            double a=Double.parseDouble(scanner.nextLine());
            double b=Double.parseDouble(scanner.nextLine());
            double area=a*b;
            System.out.printf("%.3f",area);
        }
        //•	Ако фигурата е кръг (circle): на следващия ред чете едно дробно число - радиусът на кръга
        else if (figure.equals("circle")){
            double radius=Double.parseDouble(scanner.nextLine());
            double area=Math.PI*radius*radius;
            System.out.printf("%.3f",area);
        }
        //•	Ако фигурата е триъгълник (triangle): на следващите два реда четат две дробни числа - дължината на страната му и дължината на височината към нея
        else if (figure.equals("triangle")){
            double a=Double.parseDouble(scanner.nextLine());
            double h=Double.parseDouble(scanner.nextLine());
            double area=a*h/2;
            System.out.printf("%.3f",area);
        }
    }
}
