package models;

public class Laptop {


    private int id; //Do I really need this?
    private String name;
    private String brand;
    private String type;
    private String processor;
    private int qty;
    private int year;
    private float price;

    public Laptop() {
    }

    public Laptop(int id, String name, String brand, String type, String processor, int qty, int year, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.processor = processor;
        this.qty = qty;
        this.year = year;
        this.price = price;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getBrand() {return brand;}

    public void setBrand(String brand) {this.brand = brand;}

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}

    public String getProcessor() {return processor;}

    public void setProcessor(String processor) {this.processor = processor;}

    public int getQty() {return qty;}

    public void setQty(int qty) {this.qty = qty;}

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}

    public float getPrice() {return price;}

    public void setPrice(float price) {this.price = price;}

}
