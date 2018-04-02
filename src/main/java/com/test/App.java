package com.test;

import data.Person;
import data.Vehicle;

/**
 * Created by deshanchathusanka on 4/2/18.
 */
public class App 
{
    public static void main( String[] args )
    {
        //original vehicle
        Vehicle original=new Vehicle("Range Rover", "Europe",new Person("Deshan","Engineer",25));
        try {
            //clone vehicle from original
            Vehicle cloned=original.clone();

            //change properties in cloned object
            cloned.getOwner().setName("Chathusanka");
            cloned.setBrand("Land Rover");

            //compare changed properties
            System.out.println("name (original) : " + original.getOwner().getName()+"\tname(cloned) : "+cloned.getOwner().getName());
            System.out.println("brand (original) : " + original.getBrand()+"\tbrand(cloned) : "+cloned.getBrand());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
