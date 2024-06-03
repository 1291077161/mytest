package annotationTest;

@MyAnnotation
public class Student {

    @MyAnnotation
    private String name;

    @MyAnnotation(address = "中粮商务公园")
    public void read(){}
}