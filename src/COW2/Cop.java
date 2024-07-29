package COW2;

public class Cop {
    public boolean areTheySpeeding(double speed, double speedLimit) {
        return (speed > speedLimit);
    }

    public boolean isItRecklessDriving(double speed, double speedLimit, boolean isOnHighway) {
        return (((speed >= speedLimit + 20) && isOnHighway)
                || ((speed >= speedLimit + 10) && !isOnHighway));
    }

    public double whatsTheFine(double speed, double speedLimit, boolean isOnHighway) {
        if(isItRecklessDriving(speed, speedLimit, isOnHighway) == true)
            return(5000);
        else if(areTheySpeeding(speed, speedLimit) && !isItRecklessDriving(speed, speedLimit, isOnHighway))
            return(120 + 10 * (speed - speedLimit));
        else
            return (0);
    }
}
