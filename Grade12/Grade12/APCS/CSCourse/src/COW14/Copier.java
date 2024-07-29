package COW14;

public class Copier
{
    private double speed;
    private boolean isWorking;
    
    public Copier(double speed, boolean isWorking){
        this.speed = speed;
        this.isWorking = isWorking;
    }
    
    public double getSpeed(){
        return speed;
    }
    
    public boolean isWorking(){
        return isWorking;
    }

    public int compareTo(Copier other) {
        if (this.isWorking() && !other.isWorking()) {
            return 1;
        } else if (!this.isWorking() && other.isWorking()) {
            return -1;
        } else if (this.isWorking() && other.isWorking()) {
            if (this.getSpeed() > other.getSpeed()) {
                return 1;
            } else if (this.getSpeed() < other.getSpeed()) {
                return -1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}