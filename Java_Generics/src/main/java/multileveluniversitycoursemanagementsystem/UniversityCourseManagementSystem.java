package multileveluniversitycoursemanagementsystem;

public class UniversityCourseManagementSystem {

    public static void main(String[] args) {
        ExamCourse examCourse = new ExamCourse();
        AssignmentCourse assignmentCourse = new AssignmentCourse();
        ResearchCourse researchCourse = new ResearchCourse();


        Course<ExamCourse> dsa = new Course<>("DSA", examCourse);
        Course<AssignmentCourse> java = new Course<>("JAVA",  assignmentCourse);
        Course<ResearchCourse> research = new Course<>("world Research",  researchCourse);


        CourseInfromation infromation = new CourseInfromation();
        infromation.addCourse(dsa);
        infromation.addCourse(java);
        infromation.addCourse(research);


        infromation.displayCourses();
    }
}