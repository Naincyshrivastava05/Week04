import org.junit.jupiter.api.*;
import serialization.Employee;
import serialization.EmployeeSerialization;

import java.io.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeSerializationTest {
    private static final String TEST_FILE = "test_employees.dat";

    @BeforeEach
    void setUp() {
        new File(TEST_FILE).delete();
    }

    @AfterEach
    void tearDown() {
        new File(TEST_FILE).delete();
    }

    @Test
    void testSerializationAndDeserialization() {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "IT", 75000),
                new Employee(2, "Bob", "HR", 50000),
                new Employee(3, "Charlie", "Finance", 65000)
        );

        EmployeeSerialization.serializeEmployees(employees);
        List<Employee> deserializedEmployees = EmployeeSerialization.deserializeEmployees();

        assertNotNull(deserializedEmployees, "Deserialized list should not be null");
        assertEquals(3, deserializedEmployees.size(), "List size should match the original");
        assertEquals("Alice", deserializedEmployees.get(0).toString().contains("Alice") ? "Alice" : "", "First employee should be Alice");
    }
}

