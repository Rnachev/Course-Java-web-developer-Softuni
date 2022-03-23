import java.util.Scanner;

public class P06ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Напишете програма, която прочита от конзолата име, фамилия, възраст и град и печата следното съобщение
        // :
        String firstName=scanner.nextLine();
        String lastName=scanner.nextLine();
        String age=scanner.nextLine();
        String town=scanner.nextLine();
        System.out.println("You are "+firstName+" "+lastName+", a "+age+"-years old person from "+town+".");
    }
}
