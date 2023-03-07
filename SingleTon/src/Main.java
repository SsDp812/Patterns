public class Main {
    public static void main(String[] args) {
        Map mp = Map.Instance(20,"tundra");
        mp.showMap();
        mp = Map.Instance(40,"forest");
        mp.showMap();
    }
}