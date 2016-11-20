package SOLID.without.Example5;

import lombok.Data;

/**
 * Created by Ярослав on 20.11.2016.
 */
@Data
public class Dog extends Animal {
    private String dogBreed;
    public void run(){
        System.out.println("ran");
    }
    @Override

    public String toString() {
        return "Dog{" +
                "dogBreed='" + dogBreed + '\'' +
                "} " + super.toString();
    }

}
