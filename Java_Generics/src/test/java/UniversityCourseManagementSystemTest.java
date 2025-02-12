import static org.junit.jupiter.api.Assertions.*;

import multileveluniversitycoursemanagementsystem.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class UniversityCourseManagementSystemTest {

    ExamCourse examCourse = new ExamCourse();
    AssignmentCourse assignmentCourse = new AssignmentCourse();
    ResearchCourse researchCourse = new ResearchCourse();

    Course<ExamCourse> dsa = new Course<>("DSA", examCourse);
    Course<AssignmentCourse> java = new Course<>("JAVA", assignmentCourse);
    Course<ResearchCourse> research = new Course<>("world Research", researchCourse);


    CourseInfromation infromation = new CourseInfromation();


    @Test
    void testAddCourse() {
        infromation.addCourse(dsa);
        assertEquals(infromation.getAllItems().size(), 1);

    }

    @Test
    void testCourseDetails() {
        infromation.addCourse(java);
        assertEquals(infromation.getItem(0).getCourseType().print(), "Assignment-Based");

    }

    @Test
    void testCatalogContainsMultipleCourses() {
        infromation.addCourse(dsa);
        infromation.addCourse(java);
        infromation.addCourse(research);

        assertEquals(infromation.getAllItems().size(), 3);

    }
}