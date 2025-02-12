package multileveluniversitycoursemanagementsystem;

public class Course<T extends CourseType> {
    private static String courseName;

    private T courseType;

    public Course(String courseName,  T courseType) {
        this.courseName = courseName;

        this.courseType = courseType;
    }

    public static String getCourseName() {
        return courseName;
    }



    public  T getCourseType() {
        return courseType;
    }
    public void diplay(){

        System.out.println(courseName +"  "+courseType.print());
    }

}