package com.sdl.prototypedesign;




import java.io.Serializable;
import java.util.Arrays;

public class DeepCopy {

    public static void main(String[] args)  {
        Person person = new Person(new String[]{"Gabriel", "Simon", "Mbaiorga"}, new Address("NO 20","George Innih" ));
        Person person1 =  person;
        person1.address.houseNumber="No 24";
        person1.names[0]="David";
        person1.names[1]="Emmanuel";


        System.out.println(person1);
        System.out.println(person);
    }
}

class Person implements Serializable {
    public String[] names;
    public Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }
}

class Address implements Serializable{
    public String houseNumber;
    public String streetName;

    public Address(String houseNumber, String streetName) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber='" + houseNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                '}';
    }
}
