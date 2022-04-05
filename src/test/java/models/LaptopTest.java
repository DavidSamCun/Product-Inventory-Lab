package models;

import models.LaptopEnums_beta.LaptopEnums;
import models.LaptopEnums_beta.LaptopType;
import models.LaptopEnums_beta.Processor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LaptopTest {

    @Test
    public void setIdTest(){

        LaptopEnums lap1 = new LaptopEnums();
        int expected = 1;

        lap1.setId(expected);

        Assertions.assertEquals(expected, lap1.getId());
    }

    @Test
    public void setNameTest(){

        String expected = "ZephyrusG14";

        LaptopEnums lap1 = new LaptopEnums();
        lap1.setName(expected);

        Assertions.assertEquals(expected, lap1.getName());

    }

    @Test
    public void setBrandTest(){

        String expected = "Asus";

        LaptopEnums lap1 = new LaptopEnums();
        lap1.setBrand(expected);

        Assertions.assertEquals(expected, lap1.getBrand());
    }

    @Test
    public void setTypeTest(){
        LaptopType type = LaptopType.gaming;
        LaptopEnums lap1 = new LaptopEnums();

        lap1.setType(type);

        Assertions.assertEquals(type, lap1.getType());

    }

    @Test
    public void setProcessor(){
        Processor amd = Processor.AMD;
        LaptopEnums lap1 = new LaptopEnums();

        lap1.setProcessor(amd);

        Assertions.assertEquals(amd, lap1.getProcessor());
    }

    @Test
    public void setQtyTest(){
        LaptopEnums lap1 = new LaptopEnums();
        int expected = 50;

        lap1.setQty(expected);

        Assertions.assertEquals(expected, lap1.getQty());

    }

    @Test
    public void setPriceTest(){
        LaptopEnums lap1 = new LaptopEnums();
        float expected = 1250;

        lap1.setPrice(expected);

        Assertions.assertEquals(expected, lap1.getPrice());

    }

    @Test
    public void setYearTest(){

        LaptopEnums lap1 = new LaptopEnums();
        int expected = 2021;

        lap1.setYear(expected);

        Assertions.assertEquals(expected, lap1.getYear());
    }



    @Test
    public void constructorTest(){
        int id = 1;
        String name = "ZephyrusG15";
        String brand = "Asus";
        LaptopType type = LaptopType.gaming;
        Processor processor = Processor.AMD;
        int qty = 50;
        int year = 2021;
        float price = 1550;

        LaptopEnums lap1 = new LaptopEnums(id, name, brand, type,processor,qty,year,price);

        Assertions.assertEquals(id, lap1.getId());
        Assertions.assertEquals(name, lap1.getName());
        Assertions.assertEquals(brand, lap1.getBrand());
        Assertions.assertEquals(type, lap1.getType());
        Assertions.assertEquals(processor, lap1.getProcessor());
        Assertions.assertEquals(qty, lap1.getQty());
        Assertions.assertEquals(price, lap1.getPrice());
        Assertions.assertEquals(year, lap1.getYear());

    }

}