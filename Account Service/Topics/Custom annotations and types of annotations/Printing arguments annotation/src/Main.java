
import java.lang.annotation.ElementType;
import java.lang.annotation.*;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface PrintArgs {
boolean printReturn();
}

class TestClass {
    @PrintArgs(printReturn = true)
    public void myMethod() {
        // some code
    }
}