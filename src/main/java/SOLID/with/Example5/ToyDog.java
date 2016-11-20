package SOLID.with.Example5;

import lombok.Data;


@Data
public class ToyDog extends Dog {

    private String material;

    @Override
    public String toString() {
        return "ToyDog{" +
                "material='" + material + '\'' +
                "} " + super.toString();
    }


}
