package model;

public final class Task {
    private final int runningTime;

    public Task(int runningTime) {
        this.runningTime = runningTime;
    }

    public int runningTimeInSeconds() {
        return runningTime;
    }

    @Override
    public String toString() {
        return "Task{" +
                "runningTimeInSeconds=" + runningTime +
                '}';
    }
}
