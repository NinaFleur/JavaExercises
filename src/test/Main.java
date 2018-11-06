package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {

        int[] cats = {1, 2, 3};
        System.out.println("Here are " + cats.length + " in the shop.");

        ArrayList<String> catNames = new ArrayList<>();
        catNames.add("Fluffy");
        catNames.add("Kitty");
        catNames.add("Stinky");
        System.out.println("The first cat name is " + catNames.get(0));
        System.out.println("The second cat name is " + catNames.get(1));
        System.out.println("The third cat name is " + catNames.get(2));
        System.out.println("You can choose one of these " + catNames.size() + " cats");
        catNames.remove(2);
        catNames.remove(1);
        System.out.println("Kitty and Stinky were bought and only " + catNames.size() + " kitty need to be pet now");

        LinkedList<String> dogNames = new LinkedList<>();
        dogNames.add("Bob");
        dogNames.add("Puppy");
        dogNames.add("Dog");
        System.out.println("The first dog name is " + dogNames.get(0));
        System.out.println("The second dog name is " + dogNames.get(1));
        System.out.println("The third dog name is " + dogNames.get(2));
        System.out.println("There are " + dogNames.size() + " dogs in the shop");
        dogNames.remove(2);
        dogNames.remove(0);
        System.out.println("After Bob and Dog escaped and now only " + dogNames.size() + " dog was in the shop");

        HashMap hashMap = new HashMap();
    }
}

