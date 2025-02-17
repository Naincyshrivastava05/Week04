package junit;

public class DataBaseConnection {
    public static  boolean connection = false;
    public static void connect(){
        connection = true;
        System.out.println("DataBase connected successfully");
    }
    public static void disconnect(){
        connection = false;
        System.out.println("DataBase disconnected successfully");
    }
    public static boolean isConnect(){
        return connection;
    }

    public static void main(String[] args) {
        connect();
        disconnect();
        System.out.println(isConnect());
    }
}
