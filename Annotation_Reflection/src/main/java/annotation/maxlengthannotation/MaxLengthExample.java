package annotation.maxlengthannotation;


public class MaxLengthExample {
    public static void main(String[] args) {
        try {
            User user1 = new User("Abhi123");
            System.out.println("User created: " + user1.getUsername());

            User user2 = new User("Abhishek123");
            System.out.println("User created: " + user2.getUsername());

        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }
}
