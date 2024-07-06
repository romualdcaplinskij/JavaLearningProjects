import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Name: ");
            String name = scanner.nextLine();

            // breaks if Name: input is empty
            if (name.isEmpty()) break;

            System.out.println("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());

            //creates new object named program
            TelevisionProgram program = new TelevisionProgram(name, duration);

            //ads program object to programs ArrayList
            programs.add(program);
        }

        System.out.print("Program's maximum duration? ");
        int maxDuration = scanner.nextInt();
        for (TelevisionProgram i : programs) {
            if (i.getDuration() <= maxDuration) System.out.println(i.getName() + " ,duration " + i.getDuration() + " minutes");
        }


    }
}
