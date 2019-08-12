/*
 * Tablica punktów definiuje prostokąt, oraz dostarcza 4 punkty do sprawdzenia ich położenia względem okręgu
 * punkt centralny okręgu oraz długość promienia dobrane celowo, aby wystąpiły wszystkie 3 przewidziane przypadki
 * położenia punktów względem okręgu<br>
 *
 * @author K.Malysa
 */
public class TestClass {

    public static void main(String[] args) {
        Point[] point = new Point[4];
        point[0] = new Point(0,0);
        point[1] = new Point(-4.5,0);
        point[2] = new Point(-4.5,5);
        point[3] = new Point(0,5);

        Point centralPoint = new Point(-4.5,0);  //for circle

        Rectangle rectangle = new Rectangle(point);
        double rectangleField = Calculator.rectangleField(rectangle);
        System.out.println("pole prostokąta wynosi: "+ rectangleField);
        System.out.println();

        Circle circle = new Circle(centralPoint, 4.5);

        Calculator.isPointInsideCircle(circle, point[0]);
        Calculator.isPointInsideCircle(circle, point[1]);
        Calculator.isPointInsideCircle(circle, point[2]);
        Calculator.isPointInsideCircle(circle, point[3]);


    }
}
