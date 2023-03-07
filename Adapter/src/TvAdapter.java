public class TvAdapter implements IGadget {
    Tv tv;
    public TvAdapter(){
        tv = new Tv();
    }
    @Override
    public void showNews() {
        tv.showChanel();
    }

    @Override
    public void off() {
        tv.powerOff();
    }
}
