import model.Task;
import model.TaskScheduler;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> taskList = List.of(
                new Task(5),
                new Task(3),
                new Task(5),
                new Task(6));
        var taskScheduler = new TaskScheduler();
        taskScheduler.processManyTasks(taskList);
        taskScheduler.processTask(new Task(1000));
        taskScheduler.run();
    }
}