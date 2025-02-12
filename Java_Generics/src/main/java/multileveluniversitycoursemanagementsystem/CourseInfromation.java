package multileveluniversitycoursemanagementsystem;
import java.util.*;

public class CourseInfromation {
    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }
    public Course<?> getItem(int index) {

        return courses.get(index);
    }

    public List<?> getAllItems() {
        return courses;
    }

    public void displayCourses() {
        for (Course<?> course : courses) {
            course.diplay();
        }
    }
}