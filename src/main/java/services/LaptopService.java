package services;

import models.LaptopEnums_beta.LaptopEnums;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LaptopService {

    private static int nextId = 1;
    private List<models.Laptop> inventory = new ArrayList<>();


    public models.Laptop Create(String name, String brand, String type, String processor, int qty, int year, float price){
        models.Laptop createdLaptop = new models.Laptop(nextId++, name, brand, type, processor, qty, year, price);
        inventory.add(createdLaptop);
        return createdLaptop;
    }


    public LaptopEnums findLaptop(int id) {
        LaptopEnums output = null;
        Iterator itr = inventory.iterator();
        while (itr.hasNext()){
            LaptopEnums laptopSearch = (LaptopEnums) itr.next();
            if (laptopSearch.getId() == id){
                output = laptopSearch;
            }
        }

        return output;
    }

    public LaptopEnums[] findAll() {
        LaptopEnums[] output = new LaptopEnums[inventory.size()];

        return inventory.toArray(output);
    }

    public Boolean delete(int id) {

        if (findLaptop(id) != null){
            inventory.remove(findLaptop(id));
            return true;
        }
        return false;
    }

}
