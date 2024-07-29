package COW7;

import java.time.Month;

public class Group
{
    private Person[] _people;

    public Group(Person[] people){
        _people = people;
    }

    public Person[] getPeople(){
        return _people;
    }

    public void printList() {
        for (Person p : _people) {
            System.out.println(p.toString());
        }
    }

    public String toString(){
        String result = "";

        for (Person p : _people) {
            result += (String.format("%1$s \n", p.getName().toString()));
        }

        return result;
    }

    public String printAllWithSurname(String lastName){
        String result = "";

        for (Person p : _people) {
            if (p.getName().getLastName().equals(lastName)) {
                System.out.println(p.getName());
                result += (String.format("%1$s\n", p.getName().toString()));
            }
        }

        return result;
    }

    public String printAllWithFirstName(String firstName){
        String result = "";

        for (Person p : _people) {
            if (p.getName().getFirstName().equals(firstName)) {
                System.out.println(p.getName().toString());
                result += (String.format("%1$s\n", p.getName().toString()));
            }
        }

        return result;
    }

    public String printThoseOnStreet(String streetName){
        String result = "";

        for (Person p : _people) {
            if (p.getHomeAddress().getStreet().equals(streetName)) {
                System.out.println(p.getName().toString());
                result += (String.format("%1$s\n", p.getName().toString()));
            }
        }

        return result;
    }

    public String printThoseInState(String state){
        String result = "";

        for (Person p : _people) {
            if (p.getHomeAddress().getState().equals(state)) {
                System.out.println(p.getName().toString());
                result += (String.format("%1$s\n", p.getName().toString()));
            }
        }

        return result;
    }

    public String printThoseBornInYear(int year){
        String result = "";

        for (Person p : _people) {
            if (p.getBirthDay().getYear() == year) {
                System.out.println(p.getName().toString());
                result += (String.format("%1$s\n", p.getName().toString()));
            }
        }

        return result;
    }

    public String printThoseBornInMonthOf(String birthMonth){
        String result = "";

        for (Person p : _people) {
            int month = p.getBirthDay().getMonth();

            if (Month.of(month).name().toLowerCase().equals(birthMonth.toLowerCase())) {
                System.out.println(p.getName().toString());
                result += (String.format("%1$s\n", p.getName().toString()));
            }
        }

        return result;
    }

    public int compareTo(Group otherGroup){
        return (this.getPeople().length - otherGroup.getPeople().length);
    }

    public boolean isInGroup(Person them){
        for (Person p : _people) {
            if (p.equals(them))
                return true;
        }

        return false;
    }

    public String printThoseWithAnInterestIn(String interest){
        String result = "";

        for (Person p : _people) {
            for(String intrst : p.getInterests()) {
                if(intrst.equals(interest)){
                    System.out.println(p.getName().toString());
                    result += (String.format("%1$s\n", p.getName()));
                    break;
                }
            }
        }

        return result;
    }

    public boolean equals(Group otherGroup){
        if (this.getPeople().length != otherGroup.getPeople().length)
            return false;

        for(Person p : otherGroup.getPeople()) {
            if (isInGroup(p) == false)
                return false;
        }

        return true;
    }

    public String printInZipCode(int zip){
        String result = "";

        for (Person p : _people) {
            if (String.valueOf(p.getHomeAddress().getZipCode()).startsWith(String.valueOf(zip))) {
                System.out.println(p.getName().toString());
                result += (String.format("%1$s\n", p.getName().toString()));
            }
        }

        return result;
    }

    public String printAllOlderThan(int numYears, MyDate currentDate){
        String result = "";

        for (Person p : _people) {
            if (Math.abs(p.getBirthDay().getYear() - currentDate.getYear()) > numYears) {
                System.out.println(p.getName().toString());
                result += (String.format("%1$s\n", p.getName().toString()));
            }
        }

        return result;
    }
}
