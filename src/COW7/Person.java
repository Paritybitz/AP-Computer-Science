package COW7;

public class Person
{
    private Name theName;
    private MyDate birthDay;
    private Address home;
    private int socialSecurityNumber;
    private String [] interests;
    
    public Person(Name theName, MyDate birthDay, Address home, int socialSecurityNumber, String [] interests){
        this.theName = theName;
        this.birthDay = birthDay;
        this.home = home;
        this.socialSecurityNumber = socialSecurityNumber;
        this.interests = interests;
        
    }
    
    public Name getName(){
        return theName;
    }
    
    public MyDate getBirthDay(){
        return birthDay;
    }
    
    public Address getHomeAddress(){
        return home;
    }
    
    public int getSocSecNumber(){
        return socialSecurityNumber;
    }
    
    public String [] getInterests(){
        return interests;
    }
    
    public String toString(){
        String interestsListing = "";
        for(String interest : interests){
            interestsListing = interestsListing + interest + ", ";
        }
        interestsListing = interestsListing.substring(0, interestsListing.length() - 2);
        
        return theName.toString() + "\n" + "Birth Day: " + birthDay.toString() + "\n" + home.toString() + "\n" + "Social Security Number: " + socialSecurityNumber + "\n" + interestsListing + "\n"; 
    }
    
    public boolean equals(Person otherPerson){
        return socialSecurityNumber == otherPerson.getSocSecNumber();
    }
    
    public int compareTo(Person otherPerson){
        return theName.compareTo(otherPerson.getName());
    }
}
