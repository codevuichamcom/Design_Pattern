package com.example.demo;

public class App {
    public static void main(String[] args) throws Exception {
        IFurnitureFactory plasticFactory = AbstractFurnitureFactory.getFactory(FactoryType.PLASTIC_FACTORY);
        IFurniture furniture = plasticFactory.getFurniture(FurnitureType.Table);
        furniture.display();

    }
}
