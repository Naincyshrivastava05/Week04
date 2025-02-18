package annotation.serializationannotaion;
public class JsonSerializationExample {

    public static void main(String[] args) {
        User user = new User("Abhishek", 22, "Pass@123");

        try {
            String jsonString = JsonSerializer.toJson(user);
            System.out.println("Generated JSON: " + jsonString);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}