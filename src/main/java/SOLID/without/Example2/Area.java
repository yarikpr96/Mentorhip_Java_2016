package SOLID.without.Example2;

import lombok.Data;

@Data
public class Area {

    @Data
    class AreaSquare {

        private double a;
        private double b;

        public double AreaSquare() {
            return a * a;
        }

    }

    @Data
    class areaRectangle {
        private double a;
        private double b;

        public double areaRectangle() {
            return a * b;
        }
    }

}




