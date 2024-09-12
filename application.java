import java.util.ArrayList;
import java.util.Scanner;

public class application {

    // List to hold tasks
    private static ArrayList<String> tasks = new ArrayList<>();

    // Method to add a task
    private static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    // Method to list all tasks
    private static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Method to remove a task
    private static void removeTask(int index) {
        if (index >= 1 && index <= tasks.size()) {
            tasks.remove(index - 1);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // Main method to drive the application
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTask Manager Application");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the task description: ");
                    String task = scanner.nextLine();
                    addTask(task);
                    break;

                case 2:
                    listTasks();
                    break;

                case 3:
                    listTasks();
                    System.out.print("Enter the task number to remove: ");
                    int taskNumber = scanner.nextInt();
                    removeTask(taskNumber);
                    break;

                case 4:
                    System.out.println("Exiting the application...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
