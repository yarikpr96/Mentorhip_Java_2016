package CoolTasks_1.Football;

public class Objects {

    private String name;
    private int points;
    public Objects(String name, int points) {

        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }



    @Override
    public String toString() {
        return "" +
                " " + name +
                "-- " + points
                 ;
    }

}