package multileveluniversitycoursemanagementsystem;

public abstract class CourseType {
    private String evaluationTypes;

    public CourseType(String evaluationTypes) {
        this.evaluationTypes = evaluationTypes;
    }

    public String getEvaluationType() {
        return evaluationTypes;
    }


    public  String print(){
        return ""+evaluationTypes;
    }
}