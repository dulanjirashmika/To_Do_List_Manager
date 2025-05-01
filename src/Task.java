/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

public class Task {
    int id;
    String title;
    String description;
    String dueDate;
    boolean isCompleted;

    public Task(int id, String title, String description, String dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    public void markCompleted() {
        isCompleted = true;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Due: " + dueDate + ", Completed: " + isCompleted;
    }
}
