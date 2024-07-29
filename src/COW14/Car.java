package COW14;

/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private int year;
    private String name;
    private double cost;
    
    public Car(int year, String name, double cost){
        this.year = year;
        this.name = name;
        this.cost = cost;
    }
    
    public int getYear(){
        return year;
    }
    
    public String getName(){
        return name;
    }
    
    public double getCost(){
        return cost;
    }

    public int compareTo(Car other){
        if (this.year > other.getYear()) {
            return 1;
        } else if (this.year < other.getYear()) {
            return -1;
        } else {
            if (this.name.compareTo(other.getName()) < 0) {
                return -1;
            } else if (this.name.compareTo(other.getName()) > 0) {
                return 1;
            } else {
                if (this.cost > other.getCost()) {
                    return 1;
                } else if (this.cost < other.getCost()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}