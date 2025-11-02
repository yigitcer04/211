public class Engine {
    private int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    public void startEngine() {
        System.out.println("Engine with " + horsepower + " HP started.");
    }

    public int getHorsepower() {
        return horsepower;
    }
}
