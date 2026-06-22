import java.util.List;

public class TaskTracker {
    private List<Task> tasks;

    public TaskTracker(List<Task> tasks) {
        this.tasks = tasks;
            }

            public void addTask(String title) {
        tasks.add(new Task(title));
                System.out.println("Задача " + title + "добавлена");
            }

            public void printAllTask() {
        for (Task task : tasks) {
            task.printInfo();
        }
            }
}
