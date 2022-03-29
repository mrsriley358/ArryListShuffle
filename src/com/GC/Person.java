package com.GC;
public class Person<T> implements Comparable{

//    T name;
//    T email;
//    T phone;
//    T address;
//
//    public Person(T name, T email, T phone, T address) {
//        this.name = name;
//        this.email = email;
//        this.phone = phone;
//        this.address = address;
//    }
    String name;
    String email;
    String phone;
    String address;

    public Person(String name, String email, String phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
    @Override
    public int compareTo(Object o) {
        return name.compareTo(o.toString());
    }

    @Override
    public String toString(){
        return name + " " + email + " " + phone + " " + address;
    }


//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
}//class
