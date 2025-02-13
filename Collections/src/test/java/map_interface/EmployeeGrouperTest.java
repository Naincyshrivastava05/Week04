package map_interface;

import map_interface.group_objects.Employee;
import map_interface.group_objects.EmployeeGroup;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeGrouperTest {
    @Test
    void testGroupByDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> expectedOutput = new HashMap<>();
        expectedOutput.put("HR", Arrays.asList(new Employee("Alice", "HR"), new Employee("Carol", "HR")));
        expectedOutput.put("IT", Collections.singletonList(new Employee("Bob", "IT")));

        Map<String, List<Employee>> actualOutput = EmployeeGroup.groupByDepartment(employees);

        assertEquals(expectedOutput.keySet(), actualOutput.keySet());
        for (String department : expectedOutput.keySet()) {
            List<Employee> expectedList = expectedOutput.get(department);
            List<Employee> actualList = actualOutput.get(department);
            assertNotNull(actualList);
            assertEquals(expectedList.size(), actualList.size());
            assertTrue(actualList.containsAll(expectedList) && expectedList.containsAll(actualList));
        }
    }

    @Test
    void testGroupByDepartmentEmptyList() {
        List<Employee> employees = new ArrayList<>();
        assertTrue(EmployeeGroup.groupByDepartment(employees).isEmpty());
    }

    @Test
    void testGroupByDepartmentSingleDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "HR"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> actualOutput = EmployeeGroup.groupByDepartment(employees);
        assertEquals(1, actualOutput.size());
        assertEquals(3, actualOutput.get("HR").size());
    }
}
