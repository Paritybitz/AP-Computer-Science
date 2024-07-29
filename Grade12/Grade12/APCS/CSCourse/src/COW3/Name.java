package COW3;

public class Name {
    private String _firstName;
    private String _middleName;
    private String _lastName;

    public Name(String firstName, String middleName, String lastName) {
        _firstName = firstName;
        _middleName = middleName;
        _lastName = lastName;
    }

    public String getFirstName() {
        return (_firstName);
    }

    public String getMiddleName() {
        return (_middleName);
    }

    public String getLastName() {
        return (_lastName);
    }

    public String getName() {
        String name;

        if (_middleName == "")
            name = String.format("%1$s %2$s", _firstName, _lastName);
        else
            name = String.format("%1$s %2$s %3$s", _firstName, _middleName, _lastName);

        return (name);
    }

    public String toString() {
        return (getName());
    }

    public boolean equals(Name otherName) {
        return getFirstName().equals(otherName.getFirstName()) && getMiddleName().equals(otherName.getMiddleName()) && getLastName().equals(otherName.getLastName());
    }

    public int compareTo(Name otherName) {
        /*int retVal = this.toString().compareTo(otherName.toString());
        return retVal;*/

        if (_lastName.compareTo(otherName.getLastName()) == 0) {
            if (_firstName.compareTo(otherName.getFirstName()) == 0) {
                if (_middleName.compareTo(otherName.getMiddleName()) == 0) {
                    return 0;
                } else if (_middleName.compareTo(otherName.getMiddleName()) > 0) {
                    return 1;
                } else if (_middleName.compareTo(otherName.getMiddleName()) < 0) {
                    return -1;
                }
            } else if (_firstName.compareTo(otherName.getFirstName()) > 0) {
                return 1;
            } else if (_firstName.compareTo(otherName.getFirstName()) < 0) {
                return -1;
            }
        } else if (_lastName.compareTo(otherName.getLastName()) > 0) {
            return 1;
        } else if (_lastName.compareTo(otherName.getLastName()) < 0) {
            return -1;
        }
        return -1;
    }
}