import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Class<?> clazz = Example.class;

        // Get class-level annotation
        Author classAuthor = clazz.getAnnotation(Author.class);
        if (classAuthor != null) {
            System.out.println("Class Author: " + classAuthor.value());
        }

        // Get method-level annotations
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            Author methodAuthor = method.getAnnotation(Author.class);
            if (methodAuthor != null) {
                System.out.println("Method '" + method.getName() + "' Author: " + methodAuthor.value());
            }
        }

        // Get constructor-level annotations
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            Author constructorAuthor = constructor.getAnnotation(Author.class);
            if (constructorAuthor != null) {
                System.out.println("Constructor Author: " + constructorAuthor.value());
            }
        }

        // Get field-level annotations
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Author fieldAuthor = field.getAnnotation(Author.class);
            if (fieldAuthor != null) {
                System.out.println("Field '" + field.getName() + "' Author: " + fieldAuthor.value());
            }
        }
    }
}