package reflection;


import org.junit.jupiter.api.Test;
import reflaction.advancelevel.dependencyinjection.Consumer;
import reflaction.advancelevel.dependencyinjection.DependencyInjector;
import reflaction.advancelevel.dependencyinjection.ServiceA;
import reflaction.advancelevel.dependencyinjection.ServiceB;


import static org.junit.jupiter.api.Assertions.*;

public class DependencyInjectorTest {

    @Test
    public void testDependencyInjection() throws Exception {
        DependencyInjector injector = new DependencyInjector();

        injector.register(ServiceA.class);
        injector.register(ServiceB.class);

        Consumer consumer = new Consumer();
        injector.injectDependencies(consumer);

        assertNotNull(consumer);
    }
}