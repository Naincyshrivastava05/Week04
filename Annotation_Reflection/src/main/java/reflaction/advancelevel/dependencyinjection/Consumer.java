package reflaction.advancelevel.dependencyinjection;


public class Consumer {
    @Inject
    private ServiceA serviceA;

    @Inject
    private ServiceB serviceB;

    public void performTasks() {
        serviceA.doSomething();
        serviceB.execute();
    }
}
