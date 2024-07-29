package COW7.Testers;

import COW7.*;

import java.util.*;
public class CompareToAndEqualsTester
{
    public static void main(String [] arg){
        System.out.println("Does compareTo and Equals work: " + testCompareToAndEquals());
    }
    
    public static boolean testCompareToAndEquals(){
        int numPeople = 12;
        ArrayList<Name> names = new ArrayList<Name>();
        ArrayList<MyDate> dates = new ArrayList<MyDate>();
        ArrayList<Address> addresses = new ArrayList<Address>();
        ArrayList<Integer> socialSecNums = new ArrayList<Integer>();
        ArrayList<String []> interests = new ArrayList<String []>();
        //{"Becoming President", "gaming", "painting", "gardening", "sewing", "cartography", "dancing"}; 

        for(int i = 0; i < 13; i++){
            socialSecNums.add((int)(Math.random() * 1000000000));
        }

        names.add(new Name("Justin", "Drew", "Bieber"));
        dates.add(new MyDate(1, 3, 1994));
        addresses.add(new Address(3001, "Arrowhead Lane", "Los Angeles", "CA", 900689270, "USA"));
        String [] a = {"singing", "dancing"};
        interests.add(a);

        names.add(new Name("Dippy", "Goofy", "Dawg"));
        dates.add(new MyDate(3, 9, 1932));
        addresses.add(new Address(3, "Walt Disney World Resort", "Orlando", "FL", 328301234, "USA"));
        String [] b = {"goofing around"};
        interests.add(b);

        names.add(new Name("Bill", "Henry", "Gates"));
        dates.add(new MyDate(28, 10, 1955));
        addresses.add(new Address(1835, "73rd Ave", "Seattle", "WA", 981017463, "USA"));
        String [] c = {"computer science", "business", "philanthropy"};
        interests.add(c);

        names.add(new Name("Melinda", "Ann", "Gates"));
        dates.add(new MyDate(15, 9, 1964));
        addresses.add(new Address(1835, "73rd Ave", "Seattle", "WA", 981017463, "USA"));
        String [] d = {"computer science", "business", "philanthropy"};
        interests.add(d);

        names.add(new Name("Yaroslav", "Borys", "Mayewsky"));
        dates.add(new MyDate(13, 1, 1978));
        addresses.add(new Address(1234, "Milky Way Lane", "Sterling", "VA", 201656503, "USA"));
        String [] z = {"singing", "dancing", "computer science", "art"};
        interests.add(z);

        names.add(new Name("Mickey", "Fauntleroy", "Mouse"));
        dates.add(new MyDate(18, 11, 1928));
        addresses.add(new Address(1, "Walt Disney World Resort", "Orlando", "FL", 328301234, "USA"));
        String [] e = {"dancing", "comedy", "cheese"};
        interests.add(e);

        names.add(new Name("Minerva", "Minnie", "Mouse"));
        dates.add(new MyDate(18, 11, 1928));
        addresses.add(new Address(2, "Walt Disney World Resort", "Orlando", "FL", 328301234, "USA"));
        String [] f = {"singing", "comedy", "hair bows", "cheese"};
        interests.add(f);

        names.add(new Name("Stuart", "Little", "Mouse"));
        dates.add(new MyDate(22, 1, 1945));
        addresses.add(new Address(1900, "5th Ave", true, 128, "New York", "NY", 100228374, "USA"));
        String [] g = {"cooking", "hiking"};
        interests.add(g);

        names.add(new Name("Barack", "Hussein", "Obama"));
        dates.add(new MyDate(4, 9, 1961));
        addresses.add(new Address(1600, "Pennsylvania Ave NW", "Washington", "DC", 205000000, "USA"));
        String [] h = {"law", "politics", "basketball"};
        interests.add(h);

        names.add(new Name("Michelle", "LaVaughn-Robinson", "Obama"));
        dates.add(new MyDate(17, 1, 1964));
        addresses.add(new Address(1600, "Pennsylvania Ave NW", "Washington", "DC", 205000000, "USA"));
        String [] i = {"politics", "medicine", "fitness"};
        interests.add(i);

        names.add(new Name("Donald", "John", "Trump"));
        dates.add(new MyDate(14, 6, 1946));
        addresses.add(new Address(725, "5th Ave", true, 666, "New York", "NY", 100223742, "USA"));
        String [] j = {"money", "politics", "beauty pagents"};
        interests.add(j);

        names.add(new Name("Melania", "the 3rd wife", "Trump"));
        dates.add(new MyDate(26, 4, 1970));
        addresses.add(new Address(725, "5th Ave", true, 666, "New York", "NY", 100223742, "USA"));
        String [] k = {"modeling"};
        interests.add(k);

        Group[] groups = new Group [5];
        Person [] peeps = new Person[numPeople];
        for(int n = 0; n < numPeople; n++){
            peeps[n] = new Person(names.get(n), dates.get(n), addresses.get(n), socialSecNums.get(n), interests.get(n));
        }
        groups[0] = new Group(peeps);

        Person [] peeps2 = new Person[numPeople];
        for(int n = 0; n < numPeople; n++){
            peeps2[n] = new Person(names.get(n), dates.get(n), addresses.get(n), socialSecNums.get(n), interests.get(n));
        }
        groups[1] = new Group(peeps2);

        Person [] peeps3 = new Person[4];
        for(int n = 0; n < 4; n++){
            peeps3[n] = new Person(names.get(n), dates.get(n), addresses.get(n), socialSecNums.get(n), interests.get(n));
        }
        groups[2] = new Group(peeps3);

        Person [] peeps4 = new Person[4];
        for(int n = 4; n < 8; n++){
            peeps4[n-4] = new Person(names.get(n), dates.get(n), addresses.get(n), socialSecNums.get(n), interests.get(n));
        }
        groups[3] = new Group(peeps4);

        Person [] peeps5 = new Person[4];
        for(int n = 8; n < 12; n++){
            peeps5[n-8] = new Person(names.get(n), dates.get(n), addresses.get(n), socialSecNums.get(n), interests.get(n));
        }
        groups[4] = new Group(peeps5);

        int num = 1;
        for(Group next: groups){
            System.out.println("=========People in COW7.Group " + num + "===============");
            next.toString();
            System.out.println();
            System.out.println();
            num++;
        }
        
        boolean compareToSuccess = true;
        
        System.out.println("+++++++++++++++Testing compareTo+++++++++++++");
        System.out.print("Does COW7.Group 1 compare exactly to COW7.Group 2? ");
        if(groups[0].compareTo(groups[1])==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
            compareToSuccess = false;
        }
        System.out.print("Does COW7.Group 1 compare greater than COW7.Group 3? ");
        if(groups[0].compareTo(groups[2])>0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
            compareToSuccess = false;
        }
        System.out.print("Does COW7.Group 3 compare less than COW7.Group 2? ");
        if(groups[2].compareTo(groups[1])<0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
            compareToSuccess = false;
        }
        if(compareToSuccess){
            System.out.println("compareToSuccess works");
        }else{
            System.out.println("compareToSuccess fails");
        }
        
        boolean equalsSuccess = true;
        
        System.out.println("+++++++++++++++Testing equals+++++++++++++");
        System.out.print("Is COW7.Group 1 equal to COW7.Group 2? ");
        if(groups[0].equals(groups[1])){
            System.out.println("YES");
        }else{
            System.out.println("NO");
            equalsSuccess = false;
        }
        System.out.print("Is COW7.Group 2 not equal to COW7.Group 3? ");
        if(!groups[1].equals(groups[2])){
            System.out.println("YES");
        }else{
            System.out.println("NO");
            equalsSuccess = false;
        }
        System.out.print("Is COW7.Group 3 not equal to COW7.Group 4? ");
        if(!groups[2].equals(groups[3])){
            System.out.println("YES");
        }else{
            System.out.println("NO");
            equalsSuccess = false;
        }
        System.out.println();
        if(equalsSuccess){
            System.out.println("equalsSuccess works");
        }else{
            System.out.println("equalsSuccess fails");
        }
        
        
        if(compareToSuccess && equalsSuccess){
            return true;
        }else{
            return false;
        }
    }
}
