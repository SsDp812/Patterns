public class SmartPhone implements IGadget{
    public SmartPhone(){

    }
    @Override
    public void showNews() {
        System.out.println("NEWS");
    }

    @Override
    public void off() {
        System.out.println("off");
    }
}
