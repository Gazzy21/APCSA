public class Bus {
    private int totalStops;
    private int currentStop;
    private boolean forward;

    public Bus(int numOfStops) {
        totalStops = numOfStops;
        currentStop = 1;
        forward = true;
    }

    public void move() {
        if (currentStop >= totalStops)
            forward = false;
        else if (currentStop <= 1)
            forward = true;
        if (forward == false)
            currentStop--;
        else
            currentStop++;
    }

    public int getCurrentStop() {
        return currentStop;
    }
}
