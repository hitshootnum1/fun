package advance.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by duc on 2/19/17.
 */
@CustomAnnotationClass(date = "2016-12-31")
public class AnnotatedClass {

    @CustomAnnotationMethod(date = "2017-01-02", description = "ahihi")
    public void annotatedMethod(){

    }

    public static void main(String[] args) {
        Class<AnnotatedClass> target = AnnotatedClass.class;
        Annotation[] annotations = target.getAnnotations();
        for(Annotation annotation : annotations){
            System.out.println(annotation);
        }

        if(target.isAnnotationPresent(CustomAnnotationClass.class)){
            Annotation annotation = target.getAnnotation(CustomAnnotationClass.class);
            System.out.println(annotation);
        }

        for(Method method : target.getDeclaredMethods()){
            if(method.isAnnotationPresent(CustomAnnotationMethod.class)) {
                Annotation annotation = method.getAnnotation(CustomAnnotationMethod.class);
                System.out.println(annotation);
            }
        }
    }
}
