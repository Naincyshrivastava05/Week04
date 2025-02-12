package ai_driven_resume_screening_system;

import java.util.List;

public class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public String getResumeDetails() {
        return jobRole.getRoleDescription();
    }

    public static <T extends JobRole> Resume<T> processResume(T jobRole) {
        if (jobRole == null) {
            throw new IllegalArgumentException("Invalid Job Role");
        }
        return new Resume<>(jobRole);
    }

    public static void processMultipleResumes(List<? extends JobRole> jobRoles) {
        for (JobRole role : jobRoles) {
            System.out.println(role.getRoleDescription());
        }
    }
}