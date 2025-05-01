/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

public class TaskList {
    private Node head;

    public void addTask(Task task) {
        Node newNode = new Node(task);
        newNode.next = head;
        head = newNode;
    }

    public void deleteTask(int id) {
        if (head == null) return;

        if (head.task.id == id) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.task.id != id) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public Task findTask(int id) {
        Node current = head;
        while (current != null) {
            if (current.task.id == id) return current.task;
            current = current.next;
        }
        return null;
    }

    public void displayTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public void displayCompletedTasks() {
        Node current = head;
        while (current != null) {
            if (current.task.isCompleted) {
                System.out.println(current.task);
            }
            current = current.next;
        }
    }

    public void markTaskCompleted(int id) {
        Task task = findTask(id);
        if (task != null) {
            task.markCompleted();
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Task not found.");
        }
    }

    public void sortTasksByTitle() {
        if (head == null || head.next == null) return;

        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.task.title.compareToIgnoreCase(j.task.title) > 0) {
                    Task temp = i.task;
                    i.task = j.task;
                    j.task = temp;
                }
            }
        }
    }
}
