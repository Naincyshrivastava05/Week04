package ai_driven_resume_screening_system;

import java.util.*;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = Resume.processResume(new SoftwareEngineer());
        Resume<DataScientist> dsResume = Resume.processResume(new DataScientist());
        Resume<ProductManager>pnResume =Resume.processResume(new ProductManager());

        System.out.println(seResume.getResumeDetails());
        System.out.println(dsResume.getResumeDetails());
        System.out.println(pnResume.getResumeDetails());
    }
}