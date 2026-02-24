import java.util.Scanner;

public class WeeklyHourTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] days = {
                "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"
        };

        double totalHours = 0;

        System.out.println("=== Weekly Hour Tracker v2.3 ===");

        for (int i = 0; i < days.length; i++) {
            System.out.print("Enter hours for " + days[i] + ": ");
            
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                System.out.print("Enter hours for " + days[i] + ": ");
            }

            double hours = scanner.nextDouble();
            
            if (hours < 0) {
                System.out.println("Hours cannot be negative. Setting to 0.");
                hours = 0;
            }

            totalHours += hours;
        }

        double overtime = totalHours > 40 ? totalHours - 40 : 0;

        System.out.println("\n===== Weekly Summary =====");
        System.out.printf("Total Hours: %.2f\n", totalHours);
        System.out.printf("Overtime Hours: %.2f\n", overtime);

        scanner.close();
    }
}
