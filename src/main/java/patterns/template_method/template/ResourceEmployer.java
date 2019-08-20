package patterns.template_method.template;

public class ResourceEmployer extends AbstractResourceManipulatorTemplate {
    @Override
    protected void doSomethingWithResource() {
        resource.employResource();
    }
}
