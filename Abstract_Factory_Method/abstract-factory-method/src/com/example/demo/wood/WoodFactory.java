package com.example.demo.wood;

import com.example.demo.IFurniture;
import com.example.demo.IFurnitureFactory;
import com.example.demo.FurnitureType;
import com.example.demo.wood.models.WoodChair;
import com.example.demo.wood.models.WoodTable;

public class WoodFactory implements IFurnitureFactory {
    public IFurniture getFurniture(FurnitureType woodType) {
        switch (woodType) {
            case Chair:
                return new WoodChair();
            case Table:
                return new WoodTable();
            default:
                throw new IllegalArgumentException("Wood type is unsupported");
        }
    }
}
