public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println("Hawkeye FLAP-FLAP-FLAP");
    }

    @Override
    public int ascend(int meters) {
        int altitude = meters;
        System.out.println("Hawkeye flies altitude " + altitude);
        return altitude;
    }

    @Override
    public int descend(int meters) {
        int downward = meters;
        System.out.println("Hawkeye flies downward " + downward);
        return downward;
    }

    @Override
    public void land() {
       System.out.println(" Hawkeye is too high, it can't land ");
    }

}


