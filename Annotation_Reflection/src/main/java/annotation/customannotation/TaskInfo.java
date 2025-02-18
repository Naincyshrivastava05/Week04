package annotation.customannotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TaskInfo {
    String priority() default "Medium";
    String assignedTo();
}