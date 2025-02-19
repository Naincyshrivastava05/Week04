package reflaction.advancelevel.customloggingproxy;


public class ProxyTest {
    public static void main(String[] args) {
        Greeting originalGreeting = new GreetingImpl();
        Greeting proxyGreeting = LoggingProxy.createProxy(originalGreeting, Greeting.class);

        String message = proxyGreeting.sayHello("Abhishek");
        System.out.println("Returned: " + message);
    }
}
