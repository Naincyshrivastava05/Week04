package annotation.repeatableannotation;

public class BugTracker {
    @BugReport(description = "NullPointerException occurs on invalid input", reportedBy = "Naincy")
    @BugReport(description = "Performance issue when handling large data sets", reportedBy = "Vishal")
    public void process() {
        System.out.println("Processing data");
    }
}