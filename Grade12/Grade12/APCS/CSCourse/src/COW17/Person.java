package COW17;


public class Person
{
    private String name;
    private int age;
    private boolean isMale;
    
    public Person(String name, int age, boolean isMale){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
    
    public String getName(){ return name; }
    public int getAge(){ return age; }
    public boolean isMale(){ return isMale; }
    
    public String toString(){
        String genderDesc = "male";
        if(!isMale){
            genderDesc = "female";
        }
        return name + ", age - " + age + ", - " + genderDesc;
    }       
    
}
