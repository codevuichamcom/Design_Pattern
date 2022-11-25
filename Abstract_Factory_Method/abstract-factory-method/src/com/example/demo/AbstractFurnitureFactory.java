package com.example.demo;

import com.example.demo.plastic.PlasticFactory;
import com.example.demo.wood.WoodFactory;

public class AbstractFurnitureFactory {
    public static final IFurnitureFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case WOOD_FACTORY:
                return new WoodFactory();
            case PLASTIC_FACTORY:
                return new PlasticFactory();
            default:
                throw new IllegalArgumentException("Factory type is unsupported");
        }
    }
}
