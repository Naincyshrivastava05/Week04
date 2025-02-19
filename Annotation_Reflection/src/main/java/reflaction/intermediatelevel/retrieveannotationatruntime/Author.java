package reflaction.intermediatelevel.retrieveannotationatruntime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String name();
}