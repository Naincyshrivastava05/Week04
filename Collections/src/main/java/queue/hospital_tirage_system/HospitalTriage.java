package queue.hospital_tirage_system;

import java.util.PriorityQueue;

public class HospitalTriage {
    public static PriorityQueue<Patient> triagePatients(Patient[] patients) {
        PriorityQueue<Patient> queue = new PriorityQueue<>();
        for (Patient p : patients) {
            queue.add(p);
        }
        return queue;
    }

    public static void main(String[] args) {
        Patient[] patients = {
                new Patient("John", 3),
                new Patient("Alice", 5),
                new Patient("Bob", 2)
        };

        PriorityQueue<Patient> queue = triagePatients(patients);

        System.out.println("Treatment Order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
