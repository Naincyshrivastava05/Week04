package reflaction.advancelevel.generatejsonrepresentation;



public class JsonConverter {
    public static void main(String[] args) {
        Person person = new Person("Abhishek", 22, true);

        String jsonString = ObjectToJsonConverter.toJson(person);
        System.out.println(jsonString);
    }
}
