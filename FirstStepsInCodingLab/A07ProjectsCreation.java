import java.util.Scanner;

public class A07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int time = 3;

        int timeForProjects = projects * time;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",
                name, timeForProjects, projects);
    }
}
