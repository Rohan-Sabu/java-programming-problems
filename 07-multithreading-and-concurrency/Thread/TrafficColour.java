package Thread;

public enum TrafficColour {

    RED(9000),
    YELLOW(3000),
    GREEN(5000);

    private int timeinmillis;

    public int getTimeinmillis() {
        return timeinmillis;
    }

    private TrafficColour(int timeinmillis) {
        this.timeinmillis = timeinmillis;
    }

}
