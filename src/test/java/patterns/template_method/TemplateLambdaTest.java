package patterns.template_method;

import org.junit.Test;

/**
 * TemplateTest
 */
public class TemplateLambdaTest {

    @Test
    public void testTemplateLambdaResourceUser() {
        TemplateLambda.withResource(resource -> resource.useResource());
    }

    @Test
    public void testTemplateLambdaResourceEmployer() {
        TemplateLambda.withResource(resource -> resource.employResource());
    }
}
