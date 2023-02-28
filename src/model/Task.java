package model;

import java.util.TimerTask;

public final class Task extends TimerTask {
    private final int runningTimeInSeconds;

    public Task(int runningTimeInSeconds) {
        this.runningTimeInSeconds = runningTimeInSeconds;
    }

    public int runningTimeInSeconds() {
        return runningTimeInSeconds;
    }

    @Override
    public void run() {
        System.out.println(runningTimeInSeconds);
    }

    @Override
    public String toString() {
        return "Task{" +
                "runningTimeInSeconds=" + runningTimeInSeconds +
                '}';
    }
}
