package annotation.markimportantmethod;

public class TaskManager {

    @ImportantMethod
    public void processCriticalTask() {
        System.out.println("Processing critical task");
    }

    @ImportantMethod(level = "MEDIUM")
    public void processRegularTask() {
        System.out.println("Processing regular task");
    }

    public void normalTask() {
        System.out.println("This is a normal task");
    }
}