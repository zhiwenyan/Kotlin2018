package annotation;

import java.lang.reflect.Method;

public class Test {
    @Hello("hello")
    public static void main(String[] args) throws NoSuchMethodException {
        Class cls = Test.class;
        Method method = cls.getMethod("main", String[].class);
        Hello hello = method.getAnnotation(Hello.class);
        System.out.println(hello.value());
    }
}
