package patterns.template_method;

import java.util.Random;

/**
 * Resource
 */
public class Resource {

    public Resource() {
        System.out.println("Resource Initialized");
    }

    public String useResource() {
        riskyOperation();
        return "Resource used";
    }

    public String employResource() {
        riskyOperation();
        return "Resource employed";
    }

    public String dispose() {
        return "Resource disposed";
    }

    private void riskyOperation() {
        if (new Random().nextInt(10) == 0) {
            throw new RuntimeException();
        }
    }
}
