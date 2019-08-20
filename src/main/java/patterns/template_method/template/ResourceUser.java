package patterns.template_method.template;

public class ResourceUser extends AbstractResourceManipulatorTemplate {
    @Override
    protected void doSomethingWithResource() {
        resource.useResource();
    }
}
