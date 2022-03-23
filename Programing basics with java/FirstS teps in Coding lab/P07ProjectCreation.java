import java.util.Scanner;

public class P07ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String nameOfArchitect=scanner.nextLine();
        int numbOfProjects=Integer.parseInt(scanner.nextLine());
        int hoursOfProject=numbOfProjects*3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",nameOfArchitect,hoursOfProject,numbOfProjects);
    }
}
