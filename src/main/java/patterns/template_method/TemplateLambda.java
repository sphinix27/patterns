package patterns.template_method;

import java.util.function.Consumer;

/**
 * TemplateLambda
 */
public class TemplateLambda {

    public static void withResource(Consumer<Resource> consumer) {
        Resource resource = new Resource();
        try {
            consumer.accept(resource);
        } finally {
            resource.dispose();
        }
    }
}
