package services;

import models.Laptop;
import models.LaptopType;
import models.Processor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LaptopService {

    private static int nextId = 1;
    private List<Laptop> inventory = new ArrayList<>();


    public Laptop Create(String name, String brand, LaptopType type, Processor processor, int qty, int year, float price){
        Laptop createdLaptop = new Laptop(nextId++, name, brand, type, processor, qty, year, price);
        inventory.add(createdLaptop);
        return createdLaptop;
    }


    public Laptop findLaptop(int id) {
        Laptop output = null;
        Iterator itr = inventory.iterator();
        while (itr.hasNext()){
            Laptop laptopSearch = (Laptop) itr.next();
            if (laptopSearch.getId() == id){
                output = laptopSearch;
            }
        }

        return output;
    }

    public Laptop[] findAll() {
        Laptop[] output = new Laptop[inventory.size()];

        return inventory.toArray(output);
    }
}
