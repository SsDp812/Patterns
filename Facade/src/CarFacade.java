public class CarFacade {
    BoardComputer computer;
    Engine engine;
    GpsSystem gps;
    public CarFacade(){
        computer = new BoardComputer();
        engine = new Engine();
        gps = new GpsSystem();
    }
    public void startCar(){
        engine.startEngine();
        computer.startComputer();
        gps.updateGpsSystem();
    }
    public void offCar(){
        computer.offComputer();
        engine.offEngine();
    }
}
