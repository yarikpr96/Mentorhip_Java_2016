package test_17_12_2016.t4;




public class Square extends Figure implements FigureInt {


    public Square(int weight, int height) {
        super(weight, height);
    }



    @Override
    public void Area() {
        System.out.println(getHeight()*getHeight());
    }
}
