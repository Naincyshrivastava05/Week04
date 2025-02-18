package annotation.loggingmethodexecutiontime;

public class TaskManager {

    @LogExecutionTime
    public void heavyTask() {
        long sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        System.out.println("Heavy task completed.");
    }

    @LogExecutionTime
    public void lightweightTask() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
        System.out.println("Lightweight task completed.");
    }

    public void normalTask() {
        System.out.println("This task is not annotated.");
    }
}