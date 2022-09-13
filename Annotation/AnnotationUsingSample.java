package Annotation;

public class AnnotationUsingSample {
    @AnnotationExample(number = 0)
    public static void main( String args[] ){
        AnnotationUsingSample sample = new AnnotationUsingSample();
    }
    @AnnotationExample(number=1)
    public void annotationSample(){}
    @AnnotationExample(number=2,text="second")
    public void annotationSample2(){}
    @AnnotationExample(number=3,text="third")
    public void annotationSample3(){}
}
