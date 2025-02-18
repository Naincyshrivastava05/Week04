package annotation.roleallowedannotation;

public class RoleAccessExample {

    public static void main(String[] args) {
        AdminService adminService = new AdminService();
        User admin = new User("Abhi", "ADMIN");
        User regularUser = new User("Muskan", "USER");

        System.out.println("\n Attempting as ADMIN:");
        RoleBasedAccessControl.invokeMethod(adminService, "deleteUser", admin, "Nitesh");

        System.out.println("\n Attempting as USER:");
        RoleBasedAccessControl.invokeMethod(adminService, "deleteUser", regularUser, "Nitesh");

        System.out.println("\n Any user can view:");
        RoleBasedAccessControl.invokeMethod(adminService, "viewUser", regularUser, "Nitesh");
    }
}
