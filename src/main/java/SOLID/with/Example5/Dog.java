package SOLID.with.Example5;

import SOLID.with.Iinterface.DogRanIntr;
import lombok.Data;


@Data
public class Dog extends Animal implements DogRanIntr{
    private String dogBreed;

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogBreed='" + dogBreed + '\'' +
                "} " + super.toString();
    }
}
