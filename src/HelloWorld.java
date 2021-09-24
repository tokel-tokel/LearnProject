public class HelloWorld implements IScript
{

    private final IHelloWorldable hw = new HelloWorldObject();

    @Override
    public void run()
    {
        hw.printHelloWorld();
    }
}
