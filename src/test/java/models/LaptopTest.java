package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaptopTest {

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

}