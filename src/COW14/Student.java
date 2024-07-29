package COW14;

public class Student
{
    private double gpa;
    
    public Student(double gpa){
        this.gpa = gpa;
    }
    
    public double getGPA(){
        return gpa;
    }
    
    public int compareTo(Student other){
        double thisGPA = this.getGPA();
        double otherGPA = other.getGPA();

        if (thisGPA > otherGPA)
            return 1;
        else if (thisGPA < otherGPA)
            return -1;
        else
            return 0;
    }
}
