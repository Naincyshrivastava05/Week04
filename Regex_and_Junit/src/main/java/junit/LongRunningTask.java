package junit;

public class LongRunningTask {
    public static String longRunningTask(){
        try{

        Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        return "Task Completed";
    }

    public static void main(String[] args) {
        System.out.println("Starting task..");
        System.out.println(longRunningTask());
    }
}
