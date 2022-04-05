package services.LaptopServiceEnums_beta;

import models.LaptopEnums_beta.LaptopEnums;
import models.LaptopEnums_beta.LaptopType;
import models.LaptopEnums_beta.Processor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LaptopServiceEnums {

    private static int nextId = 1;
    private List<LaptopEnums> inventory = new ArrayList<>();


    public LaptopEnums Create(String name, String brand, LaptopType type, Processor processor, int qty, int year, float price){
        LaptopEnums createdLaptop = new LaptopEnums(nextId++, name, brand, type, processor, qty, year, price);
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
