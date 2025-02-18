package annotation.todoannotation;

public class ProjectTask {

    @Todo(task = "Implement user authentication", assignedTo = "Abhishek Kumar", priority = "HIGH")
    public void implementAuth() {
        System.out.println("Authentication module...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Muskan Sharma")
    public void optimizeDatabase() {
        System.out.println("Optimizing queries...");
    }

    @Todo(task = "Add payment gateway integration", assignedTo = "Rahul Singh", priority = "HIGH")
    public void integratePayment() {
        System.out.println("Integrating payment gateway...");
    }

    public void completedFeature() {
        System.out.println("This feature is completed.");
    }
}