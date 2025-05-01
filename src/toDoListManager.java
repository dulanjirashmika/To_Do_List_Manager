/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
        
import java.util.Scanner;

public class toDoListManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();
        int choice;
        int taskId = 1;

        do {
            System.out.println("\n==== TO-DO LIST MENU ====");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Find Task");
            System.out.println("4. Display All Tasks");
            System.out.println("5. Display Completed Tasks");
            System.out.println("6. Sort Tasks by Title");
            System.out.println("7. Mark Task as Completed");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Due Date: ");
                    String dueDate = scanner.nextLine();
                    Task newTask = new Task(taskId++, title, description, dueDate);
                    taskList.addTask(newTask);
                    break;

                case 2:
                    System.out.print("Enter Task ID to delete: ");
                    int delId = scanner.nextInt();
                    taskList.deleteTask(delId);
                    break;

                case 3:
                    System.out.print("Enter Task ID to find: ");
                    int findId = scanner.nextInt();
                    Task found = taskList.findTask(findId);
                    System.out.println(found != null ? found : "Task not found.");
                    break;

                case 4:
                    System.out.println("All Tasks:");
                    taskList.displayTasks();
                    break;

                case 5:
                    System.out.println("Completed Tasks:");
                    taskList.displayCompletedTasks();
                    break;

                case 6:
                    taskList.sortTasksByTitle();
                    System.out.println("Tasks sorted by title.");
                    break;

                case 7:
                    System.out.print("Enter Task ID to mark as completed: ");
                    int completeId = scanner.nextInt();
                    taskList.markTaskCompleted(completeId);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
      
    
    

