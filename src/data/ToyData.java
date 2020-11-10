package data;

import base.Bike;
import base.Location;
import base.Parcel;
import base.ParcelStatus;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        // your code

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        // your code

        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
            parcels[0] = new Parcel(20.0,ParcelStatus.DELIVERED,new Location(10.38612,45.682644));
            parcels[1] = new Parcel(35.2,ParcelStatus.READY_TO_SHIP);
            parcels[2] = new Parcel(5.82,ParcelStatus.READY_TO_SHIP);
            parcels[3] = new Parcel(16.2,ParcelStatus.SHIPPING,new Location(32.311249,-90.035011));
            parcels[4] = new Parcel(21,ParcelStatus.DELIVERED,new Location(12.610350,102.103653));
            parcels[5] = new Parcel(34.5,ParcelStatus.SHIPPING);
            parcels[6] = new Parcel(2.1,ParcelStatus.READY_TO_SHIP,new Location(13.653900,100.517970));
            parcels[7] = new Parcel(16.7,ParcelStatus.SHIPPING);
            parcels[8] = new Parcel(3.45,ParcelStatus.DELIVERED);
            parcels[9] = new Parcel(7.14,ParcelStatus.SHIPPING,new Location(19.911631,99.831810));
        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
