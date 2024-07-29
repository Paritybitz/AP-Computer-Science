package COW7;

public class Name
{
    private String firstName, middleName, lastName; 

    public Name(String firstName, String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getMiddleName(){
        return middleName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String toString(){
        return firstName + " " + middleName + " " + lastName;
    }
    
    public boolean equals(Name otherName){
        return toString().equals(otherName.toString());
    }
    
    public int compareTo(Name otherName){
        if(!lastName.equals(otherName.getLastName())){
            return lastName.compareTo(otherName.getLastName());
        }else if(!firstName.equals(otherName.getFirstName())){
            return firstName.compareTo(otherName.getFirstName());
        }else{
            return middleName.compareTo(otherName.getMiddleName());
        }
    }

}
