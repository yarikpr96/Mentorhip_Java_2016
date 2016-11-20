package SOLID.without.Example5;

import lombok.Data;

/**
 * Created by Ярослав on 20.11.2016.
 */
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
