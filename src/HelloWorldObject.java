public class HelloWorldObject implements IHelloWorldable
{

    private final String str = "Hello World!";

    @Override
    public void printHelloWorld()
    {
        System.out.println(str);
    }
}
