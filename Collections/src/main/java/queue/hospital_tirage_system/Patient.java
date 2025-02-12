package queue.hospital_tirage_system;

public class Patient implements Comparable<Patient> {
   public String name;
    public int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.severity, this.severity); // Higher severity first
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}
