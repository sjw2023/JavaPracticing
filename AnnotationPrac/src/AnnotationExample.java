import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 이 어노테이션은 메소드에 사용가능함을 의미
@Retention(RetentionPolicy.RUNTIME) // 실행시에 이 어노테이션을 참조하게됨
public @interface AnnotationExample { // @interface로 선언하면 @AnnotationExample로 어노테이션을 사용 가능
    public int number();
    public String text() default "This is Annotation sample";
}
//default 가 사용된 메소드가 기본 메소드가 된다
