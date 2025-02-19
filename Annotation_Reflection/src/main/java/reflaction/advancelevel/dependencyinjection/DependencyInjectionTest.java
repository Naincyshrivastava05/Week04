package reflaction.advancelevel.dependencyinjection;


public class DependencyInjectionTest {
    public static void main(String[] args) throws Exception {
        DependencyInjector injector = new DependencyInjector();

        injector.register(ServiceA.class);
        injector.register(ServiceB.class);

        Consumer consumer = new Consumer();
        injector.injectDependencies(consumer);

        consumer.performTasks();
    }
}
