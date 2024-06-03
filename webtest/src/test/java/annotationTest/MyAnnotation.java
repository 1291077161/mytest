package annotationTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE , ElementType.METHOD , ElementType.FIELD})
public @interface MyAnnotation {

    String value() default "aa";

    int age () default 18;

    String address() default "深圳";
}