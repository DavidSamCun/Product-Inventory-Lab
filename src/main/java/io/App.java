package io;

import models.Laptop.Laptop;
import models.Laptop.LaptopType;
import models.Laptop.Processor;
import services.LaptopService;

import java.util.Scanner;

public class App {

    private LaptopService laptopService = new LaptopService();
    private Scanner in = new Scanner(System.in);
    private boolean running = true;
    private boolean selecting = true;


    public static void main(String... args) {
        App application = new App(); // (2)
        application.init();  // (3)
    }

    private void init () {
        Console.printWelcome();
        String commandline;

        while(running) {
            System.out.println("Enter a selection");
            commandline = in.nextLine();


            if(commandline.equals("build")) {
                System.out.println("Enter Laptop to Build\nChoices are zephyrusg14, zephyrusg15, macbookpro, and new");
                commandline = in.nextLine();
                switch (commandline){
                    case "zephyrusg14": buildAsusG14();
                    break;
                    case "zephyrusg15": buildAsusG15();
                    break;
                    case "macbookpro": buildMacBookPro();
                    break;
                    case "new": buildnewlaptop();
                    break;
                }


                continue;
            }

            if(commandline.equals("end") || commandline.equals("exit")){
                running = false;
            }

        }
    }

    public void buildAsusG14(){
        laptopService.Create("ZephyrusG14", "Asus", LaptopType.gaming, Processor.AMD, 1, 2021, 1500);
    }

    public void buildAsusG15(){
        laptopService.Create("ZephyrusG15", "Asus", LaptopType.gaming, Processor.AMD, 1, 2021, 1850);
    }

    public void buildMacBookPro(){
        laptopService.Create("MacBookPro", "Apple", LaptopType.ultrabook, Processor.AppleM1, 1, 2022, 2200);
    }

    public void buildnewlaptop(){

        System.out.println("Enter Laptop Name");
        String name = in.nextLine();
        System.out.println("Enter Laptop Brand");
        String brand = in.nextLine();
        String typeChoice = in.nextLine();
        LaptopType laptopType = selectLaptopType();
        Processor processor = selectProcessor();
        System.out.println("Enter amount");
        int qty = in.nextInt();
        System.out.println("Enter Year");
        int year = in.nextInt();
        System.out.println("Enter Price");
        float price = in.nextFloat();
        laptopService.Create(name, brand, laptopType,processor,qty,year,price);

/*        while(true) {
            System.out.println("Enter Laptop Type\nultrabook, gaming, desktopReplacement, or chromebook");
            typeChoice = in.nextLine();
            if (typeChoice.equals("ultrabook")) {
                LaptopType laptopType = LaptopType.ultrabook;
                break;
            } else if (typeChoice.equals("gaming")) {
                LaptopType laptopType = LaptopType.gaming;
                break;
            } else if (typeChoice.equals("desktopReplacement")) {
                LaptopType laptopType = LaptopType.desktopReplacement;
                break;
            } else if (typeChoice.equals("chromebook")) {
                LaptopType laptopType = LaptopType.chromebook;
                break;
            } else {
                System.out.println("That was not a choice! Please pick again!");
            }
        }*/
/*        while(true){
            System.out.println("Enter Processor Type\namd, intel, applem1");
            typeChoice = in.nextLine();
            if (typeChoice.equals("amd")){
                Processor processer = Processor.AMD;
                break;
            } else if (typeChoice.equals("intel")){
                Processor processor = Processor.Intel;
                break;
            } else if (typeChoice.equals("applem1")){
                Processor processor = Processor.AppleM1;
                break;
            } else {
                System.out.println("That was not a choice! Please pick again!");
            }
        }*/

    }

    public LaptopType selectLaptopType(){
        String typeChoice;
        LaptopType laptopType;
        while(true) {
            System.out.println("Enter Laptop Type\nultrabook, gaming, desktopReplacement, or chromebook");
            typeChoice = in.nextLine();
            if (typeChoice.equals("ultrabook")) {
                return laptopType = LaptopType.ultrabook;
            } else if (typeChoice.equals("gaming")) {
                return laptopType = LaptopType.gaming;
            } else if (typeChoice.equals("desktopReplacement")) {
                return laptopType = LaptopType.desktopReplacement;
            } else if (typeChoice.equals("chromebook")) {
                return laptopType = LaptopType.chromebook;
            } else {
                System.out.println("That was not a choice! Please pick again!");
            }
        }
    }

    public Processor selectProcessor(){
        String typeChoice;
        Processor processor;
        while(true){
            System.out.println("Enter Processor Type\namd, intel, applem1");
            typeChoice = in.nextLine();
            if (typeChoice.equals("amd")){
                return processor = Processor.AMD;
            } else if (typeChoice.equals("intel")){
                return processor = Processor.Intel;
            } else if (typeChoice.equals("applem1")){
                return processor = Processor.AppleM1;
            } else {
                System.out.println("That was not a choice! Please pick again!");
            }
        }
    }

    public void updateProduct(){

    }
}