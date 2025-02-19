package reflaction.advancelevel.methodexecutiontiming;



public class MathOperations {

    public void fastMethod() {
        System.out.println("Executing fastMethod...");
    }

    public void slowMethod() {
        System.out.println("Executing slowMethod...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int add(int a, int b) {
        return a + b;
    }
}