package services;

import models.LaptopEnums_beta.LaptopEnums;
import models.LaptopEnums_beta.LaptopType;
import models.LaptopEnums_beta.Processor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import services.LaptopServiceEnums_beta.LaptopServiceEnums;

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

        LaptopServiceEnums lappieService = new LaptopServiceEnums();
        LaptopEnums lap1 = lappieService.Create(name, brand, type,processor,qty,year,price);
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

        LaptopServiceEnums laptopservice = new LaptopServiceEnums();
        LaptopEnums newbie = laptopservice.Create(name, brand, type,processor,qty,year,price);
        LaptopEnums newbie2 = laptopservice.Create(name, brand, type,processor,qty,year,price);

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

        LaptopServiceEnums laptopservice = new LaptopServiceEnums();
        LaptopEnums newbie = laptopservice.Create(name, brand, type,processor,qty,year,price);
        LaptopEnums newbie2 = laptopservice.Create(name, brand, type,processor,qty,year,price);
        LaptopEnums[] list = {newbie, newbie2};

        Assert.assertEquals(list, laptopservice.findAll());
    }

    @Test
    public void deleteTest(){

        int id = 1;
        String name = "ZephyrusG15";
        String brand = "Asus";
        LaptopType type = LaptopType.gaming;
        Processor processor = Processor.AMD;
        int qty = 50;
        int year = 2021;
        float price = 1550;

        LaptopServiceEnums laptopservice = new LaptopServiceEnums();
        LaptopEnums newbie = laptopservice.Create(name, brand, type,processor,qty,year,price);
        LaptopEnums newbie2 = laptopservice.Create(name, brand, type,processor,qty,year,price);

        Assert.assertEquals(true, laptopservice.delete(id));
        Assert.assertEquals(null, laptopservice.findLaptop(id));
    }


}