package COW7;

public class Address
{
    private int number;
    private String street;
    private boolean isApartment;
    private int apartmentNumber;
    private String county, state;
    private int zipCode;
    private String country;
    
    public Address(int number, String street, boolean isApartment, int apartmentNumber, String county, String state, int zipCode, String country){
        this.number = number;
        this.street = street;
        this.isApartment = isApartment;
        this.apartmentNumber = apartmentNumber;
        this.county = county;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }
    
    public Address(int number, String street, String county, String state, int zipCode, String country){
        this.number = number;
        this.street = street;
        this.isApartment = false;
        this.apartmentNumber = 1;
        this.county = county;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }
    
    public int getNumber(){
        return number;
    }
    
    public String getStreet(){
        return street;
    }
    
    public boolean isApartment(){
        return isApartment;
    }
    
    public int getApartmentNumber(){
        return apartmentNumber;
    }
    
    public String getCounty(){
        return county;
    }
    
    public String getState(){
        return state;
    }
    
    public int getZipCode(){
        return zipCode;
    }
    
    public String getCountry(){
        return country;
    }
    
    public String toString(){
        String stringZip = ""+zipCode;
        String firstPartZip = stringZip.substring(0, 5);
        String secondPartZip = stringZip.substring(5);
        if(isApartment){
            return number + " " + street + ", Apt " + apartmentNumber + "\n" + county + ", " + state + " " + firstPartZip + "-" + secondPartZip + "\n" + country;
        }else{
            return number + " " + street + "\n" + county + ", " + state + " " + firstPartZip + "-" + secondPartZip + "\n" + country;
        }
    }
    
    public boolean equals(Address otherAddress){
        return toString().equals(otherAddress.toString());
    }
}
