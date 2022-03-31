package services;

import models.Laptop;
import models.LaptopType;
import models.Processor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class LaptopServiceTest {

    @Test
    public void createTest(){

        int id = 1;
        String name = "ZephyrusG15";
        String brand = "Asus";
        LaptopType type = LaptopType.gaming;
        Processor processor = Processor.AMD;
        int qty = 50;
        int year = 2021;
        float price = 1550;

        LaptopService lappieService = new LaptopService();
        Laptop lap1 = lappieService.Create(name, brand, type,processor,qty,year,price);
        //Laptop lap2 = new Laptop(id, name, brand, type,processor,qty,year,price);

        Assertions.assertEquals(id, lap1.getId());
        Assertions.assertEquals(name, lap1.getName());
        Assertions.assertEquals(brand, lap1.getBrand());
        Assertions.assertEquals(type, lap1.getType());
        Assertions.assertEquals(processor, lap1.getProcessor());
        Assertions.assertEquals(qty, lap1.getQty());
        Assertions.assertEquals(price, lap1.getPrice());
        Assertions.assertEquals(year, lap1.getYear());

    }

    @Test
    public void laptopFindLaptopTest(){

        int id = 1;
        String name = "ZephyrusG15";
        String brand = "Asus";
        LaptopType type = LaptopType.gaming;
        Processor processor = Processor.AMD;
        int qty = 50;
        int year = 2021;
        float price = 1550;

        LaptopService laptopservice = new LaptopService();
        Laptop newbie = laptopservice.Create(name, brand, type,processor,qty,year,price);
        Laptop newbie2 = laptopservice.Create(name, brand, type,processor,qty,year,price);

        Assertions.assertEquals(newbie, laptopservice.findLaptop(id));
    }

    @Test
    public void findAllTest(){
        int id = 1;
        String name = "ZephyrusG15";
        String brand = "Asus";
        LaptopType type = LaptopType.gaming;
        Processor processor = Processor.AMD;
        int qty = 50;
        int year = 2021;
        float price = 1550;

        LaptopService laptopservice = new LaptopService();
        Laptop newbie = laptopservice.Create(name, brand, type,processor,qty,year,price);
        Laptop newbie2 = laptopservice.Create(name, brand, type,processor,qty,year,price);
        Laptop[] list = {newbie, newbie2};


        laptopservice.findAll();

        Assert.assertEquals(list, laptopservice.findAll());

    }



}