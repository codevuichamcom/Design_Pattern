package com.example.demo.plastic;

import com.example.demo.FurnitureType;
import com.example.demo.IFurniture;
import com.example.demo.IFurnitureFactory;
import com.example.demo.plastic.models.PlasticChair;
import com.example.demo.plastic.models.PlasticTable;

public class PlasticFactory implements IFurnitureFactory {
    public IFurniture getFurniture(FurnitureType furnitureType) {
        switch (furnitureType) {
            case Chair:
                return new PlasticChair();
            case Table:
                return new PlasticTable();
            default:
                throw new IllegalArgumentException("Plastic type is unsupported");
        }
    }
}
