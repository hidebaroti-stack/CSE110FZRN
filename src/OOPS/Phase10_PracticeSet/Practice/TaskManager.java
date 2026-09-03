package OOPS.Phase10_PracticeSet.Practice;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface TaskFilter {
    boolean matches(TaskManager.Task t); //The reference TaskManager.Task uses the outer class name to reach the inner class from outside
}

public class TaskManager {

    // Inner class Task
    class Task {
        String name;
        int priority;

        Task (String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return name + " (Priority: " + priority + " )";
        }
    }

    private List<Task> tasks = new ArrayList<>();

    // Add task
    public void addTask(String name, int priority) {
        tasks.add(new Task(name, priority));
    }

    // Sort by priority descending
    public void sortByPriority() {
        tasks.sort((a, b) -> Integer.compare(b.priority, a.priority));
    }

    // Print tasks using forEach + lambda
    public void printTask() {
        tasks.forEach(t -> System.out.println(t));
    }

    // Filter tasks using TaskFilter
    public List<Task> filterTasks(TaskFilter filter) {
        List<Task> result = new ArrayList<>();
        for (Task t : tasks) {
            if (filter.matches(t)) {
                result.add(t);
            }
        }
        return result;
    }
    // tasks.stream().filter(filter::matches).collect(Collectors.toList());

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Add 5 tasks
        manager.addTask("Complete assignment", 5);
        manager.addTask("Buy groceries", 2);
        manager.addTask("Prepare presentation", 4);
        manager.addTask("Call friend", 1);
        manager.addTask("Read book", 3);

        // Sort by priority
        manager.sortByPriority();

        System.out.println("=== All Tasks Sorted by Priority ===");
        manager.printTask();

        // Filter tasks with priority > 3
        List<Task> highPriority = manager.filterTasks(t -> t.priority > 3);

        System.out.println("\n=== Filtered Tasks (priority > 3 ===");
        highPriority.forEach(t -> System.out.println(t));
    }
}
