package resources;

public class ResourceServer implements ResourceServerMBean {
  public  static     TestResource testResource;

    public ResourceServer(TestResource testResource) {
        this.testResource = testResource;
    }

    public int geAge() {
       return   testResource.getAge();
    }

    public String getName() {
       return   testResource.getName();
    }

    @Override
    public void setAge(int age) {
        testResource.setAge(age);
    }

    @Override
    public void setName(String name) {
        testResource.setName(name);
    }

    public void setTestResource(TestResource testResource) {
        this.testResource = testResource;
    }

    public TestResource getTestResource() {
        return testResource;
    }
}
