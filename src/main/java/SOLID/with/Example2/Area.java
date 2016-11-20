package SOLID.with.Example2;

import SOLID.with.Iinterface.AreaRectangleIntr;
import SOLID.with.Iinterface.AreaSquareIntr;
import lombok.Data;

@Data
public class Area implements AreaSquareIntr,AreaRectangleIntr {
        private double a;
        private double b;


    @Override
    public double area() {
        return a*a;
    }

    @Override
    public double areaRectangle() {
        return a*b;
    }
}




