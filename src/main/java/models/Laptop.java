package models;

public class Laptop {

    private int id;
    private String name;
    private String brand;
    private LaptopType type;
    private Processor processor;
    private int qty;
    private int year;
    private float price;

    public void setName(String name) {this.name = name;}

    public String getName() {return name;}

    public void setBrand(String brand) {this.brand = brand;}

    public String getBrand() {return brand;}

    public void setType(LaptopType type) {this.type = type;}

    public LaptopType getType() {return this.type;}

    public void setProcessor(Processor processor) {this.processor = processor;}

    public Processor getProcessor() {return processor;}

    public void setQty(int qty) {this.qty = qty;}

    public int getQty() {return qty;}

    public void setPrice(float price) {this.price = price;}

    public float getPrice() {return price;}

    public void setYear(int year) {this.year = year;}

    public int getYear() {return year;}
}
