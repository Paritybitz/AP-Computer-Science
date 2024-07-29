package COW7.Testers;

import COW7.*;

import java.util.*;
public class Level2GroupTester
{
    public static void main(String [] arg){
        System.out.println("Does Level 2 work: " + testLevel2());
    }

    public static boolean testLevel2(){
        int numPeople = 14;
        ArrayList<Name> names = new ArrayList<Name>();
        ArrayList<MyDate> dates = new ArrayList<MyDate>();
        ArrayList<Address> addresses = new ArrayList<Address>();
        ArrayList<Integer> socialSecNums = new ArrayList<Integer>();
        ArrayList<String []> interests = new ArrayList<String []>();
        //{"Becoming President", "gaming", "painting", "gardening", "sewing", "cartography", "dancing"}; 

        for(int i = 0; i < 14; i++){
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

        names.add(new Name("Elon", "Reeve", "Musk"));
        dates.add(new MyDate(28, 6, 1971));
        addresses.add(new Address(2001, "Space Odyssey Road", "Austin", "TX", 486278733, "USA"));
        String [] l = {"computer science", "business", "politics", "tweeting", "space travel"};
        interests.add(l);

        names.add(new Name("Joe", "James", "Rogan"));
        dates.add(new MyDate(8, 6, 1967));
        addresses.add(new Address(2000, "Space Odyssey Road", "Austin", "TX", 486278733, "USA"));
        String [] m = {"acting", "comedy", "politics", "tweeting", "podcasting"};
        interests.add(m);

        Group aGroup;
        Person [] peeps = new Person[numPeople];
        for(int n = 0; n < numPeople; n++){
            peeps[n] = new Person(names.get(n), dates.get(n), addresses.get(n), socialSecNums.get(n), interests.get(n));
        }
        aGroup = new Group(peeps);

        boolean success = true;

        System.out.println("=========All People With the SurName Mouse===============");
        String surNameResult1 = aGroup.printAllWithSurname("Mouse");
        if(!surNameResult1.equals("Mickey Fauntleroy Mouse\nMinerva Minnie Mouse\nStuart Little Mouse\n")){
            success = false;
            System.out.println("Surname Mouse fails");
            System.out.println();
        }
        System.out.println("=========All People With the SurName Trump===============");
        String surNameResult2 = aGroup.printAllWithSurname("Trump");
        if(!surNameResult2.equals("Donald John Trump\nMelania the 3rd wife Trump\n")){
            success = false;
            System.out.println("Surname Trump fails");
            System.out.println();
        }

        System.out.println("=========All People With the First Name Yaroslav===============");
        String firstNameResult1 = aGroup.printAllWithFirstName("Yaroslav");
        if(!firstNameResult1.equals("Yaroslav Borys Mayewsky\n")){
            success = false;
            System.out.println("First Name Yaroslav fails");
            System.out.println();
        }
        System.out.println("=========All People With the SurName Elon===============");
        String firstNameResult2 = aGroup.printAllWithFirstName("Elon");
        if(!firstNameResult2.equals("Elon Reeve Musk\n")){
            success = false;
            System.out.println("First Name Elon fails");
            System.out.println();
        }

        System.out.println("=========All People That Live on 5th Ave===============");
        String streetResult1 = aGroup.printThoseOnStreet ("5th Ave");
        if(!streetResult1.equals("Stuart Little Mouse\nDonald John Trump\nMelania the 3rd wife Trump\n")){
            success = false;
            System.out.println("Street 5th Ave fails");
            System.out.println();
        }
        System.out.println("=========All People That Live on Space Odyssey Road===============");
        String streetResult2 = aGroup.printThoseOnStreet("Space Odyssey Road");
        if(!streetResult2.equals("Elon Reeve Musk\nJoe James Rogan\n")){
            success = false;
            System.out.println("Street Space Odyssey Road fails");
            System.out.println();
        }

        if(success){
            return true;
        }else{
            return false;
        }
    }

}