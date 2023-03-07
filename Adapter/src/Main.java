public class Main {
    public static void main(String[] args) {
        TvAdapter tv = new TvAdapter();
        SmartPhone phone = new SmartPhone();
        tv.showNews();
        phone.showNews();
        tv.off();
        phone.off();
    }
}