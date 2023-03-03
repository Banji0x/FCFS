import model.Task;
import model.TaskScheduler;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> taskList = List.of(
                new Task(3),
                new Task(5),
                new Task(6),
                new Task(5));
        var taskScheduler = new TaskScheduler();
        taskScheduler.addTasksToScheduler(taskList);
        taskScheduler.addTaskToScheduler(new Task(4));
        taskScheduler.addTaskToScheduler(new Task(5));
        taskScheduler.addTaskToScheduler(new Task(7));
        taskScheduler.addTaskToScheduler(new Task(9));
        taskScheduler.addTaskToScheduler(new Task(7));
        taskScheduler.addTaskToScheduler(new Task(4));
        taskScheduler.run();
    }
}