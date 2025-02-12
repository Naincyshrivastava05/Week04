package queue;
import org.junit.jupiter.api.Test;
import queue.hospital_tirage_system.HospitalTriage;
import queue.hospital_tirage_system.Patient;

import java.util.PriorityQueue;
import static org.junit.jupiter.api.Assertions.*;

public class HospitalTriageTest {
    @Test
    void testTriagePatients() {
        Patient[] patients = {
                new Patient("John", 3),
                new Patient("Alice", 5),
                new Patient("Bob", 2)
        };

        PriorityQueue<Patient> queue = HospitalTriage.triagePatients(patients);

        assertEquals("Alice", queue.poll().name); // Highest severity
        assertEquals("John", queue.poll().name);
        assertEquals("Bob", queue.poll().name); // Lowest severity
        assertTrue(queue.isEmpty());
    }

    @Test
    void testTriageSinglePatient() {
        Patient[] patients = { new Patient("Emma", 4) };
        PriorityQueue<Patient> queue = HospitalTriage.triagePatients(patients);

        assertEquals("Emma", queue.poll().name);
        assertTrue(queue.isEmpty());
    }

    @Test
    void testTriageNoPatients() {
        Patient[] patients = {};
        PriorityQueue<Patient> queue = HospitalTriage.triagePatients(patients);

        assertTrue(queue.isEmpty());
    }
}
