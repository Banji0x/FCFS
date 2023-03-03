package model;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

//The task scheduler uses a Dequeue which is a type of Queue to perform its operations,
// because a queue by default uses the FIFO(First In First At Out) principle.
public class TaskScheduler {
    private final Queue<Task> taskQueue;
    private int count;
    private int seconds;

    public TaskScheduler(Queue<Task> taskQueue) {
        this.taskQueue = taskQueue;
    }

    public TaskScheduler() {
        this.taskQueue = new ArrayDeque<>(10);
    }

    public void addTaskToScheduler(Task task) {
        boolean added = taskQueue.add(task);
        if (!added) System.out.println(task + " couldn't be added to the scheduler because is currently full.");
        System.out.println(task + " has been added to the scheduler.");
    }

    public void addTasksToScheduler(List<Task> tasks) {
        boolean added = taskQueue.addAll(tasks);
        if (!added) System.out.println(tasks + " couldn't be added to the scheduler because is currently full.");
        tasks.forEach(task -> System.out.println(task + " has been added to the scheduler."));
    }

    public void run() {
        if (taskQueue.isEmpty()) return;
        var firstTask = taskQueue.peek();
        int runningTimeInSeconds = firstTask.runningTimeInSeconds();
        timer(firstTask, runningTimeInSeconds);
        if (taskQueue.iterator().hasNext()) {
            run(); //recursion
        } else {
            System.out.println("The Scheduler executed a total of " + count + " tasks and ran for a total number of " + seconds + " seconds");
        }
    }

    private void timer(Task task, int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(task + " was just executed and it took a total of " + seconds + " seconds.");
        taskQueue.remove();
        this.seconds += seconds;
        count++;
    }

}