package COW3;

public class Address
{
    private int _number;
    private String _street;
    private String _county;
    private String _state;
    private int _zipCode;
    private String _country;
    private boolean _isApartment;
    private int _apartmentNumber;

    public Address(int number, String street, boolean isApartment, int apartmentNumber, String county, String state, int zipCode, String country)
    {
        _number = number;
        _street = street;
        _county = county;
        _state = state;
        _zipCode = zipCode;
        _country = country;
        _isApartment = isApartment;
        _apartmentNumber = apartmentNumber;
    }

    public Address(int number, String street, String county, String state, int zipCode, String country)
    {
        this(number, street, false, 1, county, state, zipCode, country);
    }

    public int getNumber()
    {
        return(_number);
    }

    public String getStreet()
    {
        return(_street);
    }

    public boolean isApartment()
    {
        return (_isApartment);
    }

    public int getApartmentNumber()
    {
        return(_apartmentNumber);
    }

    public String getCounty()
    {
        return(_county);
    }

    public String getState()
    {
        return(_state);
    }

    public int getZipCode()
    {
        return(_zipCode);
    }

    public String getCountry()
    {
        return(_country);
    }

    public String toString()
    {
        String retVal;

        if (_isApartment)
            retVal = String.format("%1$s %2$s, Apt %3$s/n%4$s, %5$s %6$s/n%7$s", getNumber(), getStreet(), getApartmentNumber(), getCounty(), getState(), getZipCode(), getCountry());
        else
            retVal = String.format("%1$s %2$s/n%3$s, %4$s %5$s/n%6$s", getNumber(), getStreet(), getCounty(), getState(), getZipCode(), getCountry());

        return (retVal);
    }

    public boolean equals(Address other)
    {
        boolean retVal = this.toString().equals(other.toString());

        return(retVal);
    }
}
