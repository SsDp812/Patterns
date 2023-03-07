public class Map {
    protected int size;
    protected String name;
    static Map map;
    protected Map(int size,String name){
        this.name = name;
        this.size = size;
    }

    public static Map Instance(int size,String name){
        if(map == null || map.size != size ||map.name != name ){
            map = new Map(size,name);
        }
        return map;
    }
    public void showMap(){
        System.out.println(name + " " + size);
    }
}
