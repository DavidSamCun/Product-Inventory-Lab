package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaptopTest {

    @Test
    public void setIdTest(){

        Laptop lap1 = new Laptop();
        int expected = 1;

        lap1.setId(expected);

        Assertions.assertEquals(expected, lap1.getId());
    }

    @Test
    public void setNameTest(){

        String expected = "ZephyrusG14";

        Laptop lap1 = new Laptop();
        lap1.setName(expected);

        Assertions.assertEquals(expected, lap1.getName());

    }

    @Test
    public void setBrandTest(){

        String expected = "Asus";

        Laptop lap1 = new Laptop();
        lap1.setBrand(expected);

        Assertions.assertEquals(expected, lap1.getBrand());
    }

    @Test
    public void setTypeTest(){
        LaptopType type = LaptopType.gaming;
        Laptop lap1 = new Laptop();

        lap1.setType(type);

        Assertions.assertEquals(type, lap1.getType());

    }

    @Test
    public void setProcessor(){
        Processor amd = Processor.AMD;
        Laptop lap1 = new Laptop();

        lap1.setProcessor(amd);

        Assertions.assertEquals(amd, lap1.getProcessor());
    }

    @Test
    public void setQtyTest(){
        Laptop lap1 = new Laptop();
        int expected = 50;

        lap1.setQty(expected);

        Assertions.assertEquals(expected, lap1.getQty());

    }

    @Test
    public void setPriceTest(){
        Laptop lap1 = new Laptop();
        float expected = 1250;

        lap1.setPrice(expected);

        Assertions.assertEquals(expected, lap1.getPrice());

    }

    @Test
    public void setYearTest(){

        Laptop lap1 = new Laptop();
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

        Laptop lap1 = new Laptop(id, name, brand, type,processor,qty,year,price);

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