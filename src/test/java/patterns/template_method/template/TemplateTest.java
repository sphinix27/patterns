package patterns.template_method.template;

import org.junit.Test;

/**
 * TemplateTest
 */
public class TemplateTest {

    @Test
    public void testTemplateResourceUser() {
        AbstractResourceManipulatorTemplate resourceUser = new ResourceUser();

        resourceUser.execute();
    }

    @Test
    public void testTemplateResourceEmployer() {
        AbstractResourceManipulatorTemplate resourceEmployer = new ResourceEmployer();

        resourceEmployer.execute();
    }
}
