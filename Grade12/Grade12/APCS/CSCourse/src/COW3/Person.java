package COW3;

public class Person {
    private Name _name;
    private MyDate _birthday;
    private int _socialSecurityNumber;

    public Person(Name theName, MyDate birthday, int socialSecurityNumber) {
        _name = theName;
        _birthday = birthday;
        _socialSecurityNumber = socialSecurityNumber;
    }

    public Name getName() {
        return (_name);
    }

    public MyDate getBirthDay() {
        return (_birthday);
    }

    public int getSocSecNumber() {
        return (_socialSecurityNumber);
    }

    public String toString() {
        return _name + " " + _birthday + " " + _socialSecurityNumber;
    }

    public boolean equals(Person other) {
        if (other.getSocSecNumber() == _socialSecurityNumber) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Person other) {
        int given = 100;
        if (other.getName().compareTo(_name) < 0) {
            given = 1;
            return given;
        } else if (other.getName().compareTo(_name) > 0) {
            given = -1;
            return given;
        } else {
            given = 0;
            return given;
        }
    }
}

