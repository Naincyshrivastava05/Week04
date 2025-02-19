package reflection;



import org.junit.jupiter.api.Test;
import reflaction.advancelevel.customloggingproxy.Greeting;
import reflaction.advancelevel.customloggingproxy.GreetingImpl;
import reflaction.advancelevel.customloggingproxy.LoggingProxy;


import static org.junit.jupiter.api.Assertions.*;

public class LoggingProxyTest {

    @Test
    public void testProxyLogging() {
        Greeting originalGreeting = new GreetingImpl();
        Greeting proxyGreeting = LoggingProxy.createProxy(originalGreeting, Greeting.class);

        String message = proxyGreeting.sayHello("Naincy");
        assertEquals("Hello, Naincy!", message);
    }
}
