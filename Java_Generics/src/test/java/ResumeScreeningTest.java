import ai_driven_resume_screening_system.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResumeScreeningTest {
    @Test
    void testSoftwareEngineerResume() {
        Resume<SoftwareEngineer> resume = Resume.processResume(new SoftwareEngineer());
        assertEquals("Software Engineer: Proficient in Java, Python, and system design.", resume.getResumeDetails());
    }

    @Test
    void testDataScientistResume() {
        Resume<DataScientist> resume = Resume.processResume(new DataScientist());
        assertEquals("Data Scientist: Skilled in machine learning, statistics, and data visualization.", resume.getResumeDetails());
    }

    @Test
    void testProductManagerResume() {
        Resume<ProductManager> resume = Resume.processResume(new ProductManager());
        assertEquals("Product Manager: Expert in product strategy, roadmap planning, and team leadership.", resume.getResumeDetails());
    }

    @Test
    void testInvalidJobRole() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Resume.processResume(null);
        });
        assertEquals("Invalid Job Role", exception.getMessage());
    }

    @Test
    void testProcessMultipleResumes() {
        List<JobRole> jobRoles = Arrays.asList(new SoftwareEngineer(), new DataScientist(), new ProductManager());
        assertDoesNotThrow(() -> Resume.processMultipleResumes(jobRoles));
    }

}