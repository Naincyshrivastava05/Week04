package annotation.loggingmethodexecutiontime;

public class LogExecutionExample {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        PerformanceLogger.logExecutionTime(taskManager, "heavyTask");
        PerformanceLogger.logExecutionTime(taskManager, "lightweightTask");
        PerformanceLogger.logExecutionTime(taskManager, "normalTask");
    }
}