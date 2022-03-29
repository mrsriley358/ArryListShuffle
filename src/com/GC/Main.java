package com.GC;
//Dev: Justin Fredericks
//Date: 3/28/2022
//Class: 171
//Script: arr sort
import java.util.*;

public class Main {

    public static void main(String[] args) {

       List<Person> personList = new ArrayList<Person>();
        //create instances of Person
        Person p1 = new Person("Kole","a@gmail.com","555-555-5555","123 e east st");
        Person p2 = new Person("Sara","s@gmail.com","777-555-5555","901 e east st");
        Person p3 = new Person("Beth","b@gmail.com","888-555-5555","567 e east st");

        //add objs to arrList
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        PersonList<Person> listP = new PersonList<>();
        listP.push(p1);
        listP.push(p2);
        listP.push(p3);

        Collections.sort(listP);
        Collections.shuffle(listP);
       // shuffle(listP);

        //sort the person objs
        Collections.sort(personList);
        //display sorted list
        for(Person p: listP){
            System.out.println(p);
        }
        for(Person p: personList){
            System.out.println(p);
        }


//not working method calls
//        sort1(personList);
//        sort1(p1);
//        sort1(listP);

        Integer[] array = { 1, 2, 3, 4, 5, 6, 7 };
        sort1(array);

    }//main

    //totally lost, the whoile point of gernerics is so you dont have to specifiy type.
    //when ii try to sort or shuffle my array list objects and pass them in a gerneics
    // the error is asking me to specify type.
    //exactly what i should have to with generics
    //all classes are generic.
    public static <E extends Comparable<E>> void sort1(E[] list) {
    //public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    /** Print an array of objects */
    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
//    public static <T> void  shuffle(PersonList<T> list){
    //public static <T> void  shuffle(ArrayList<T> list){

//
//        Random rand = new Random();
//
//        for (int i = 0; i < list.length; i++) {
//            int randomIndexToSwap = rand.nextInt(list.length);
//            int temp = list[randomIndexToSwap];
//            array[randomIndexToSwap] = array[i];
//            array[i] = temp;
//        }
//        System.out.println(Arrays.toString(array));
   // }
}
