public class Calculator {

    public static double rectangleField(Rectangle rectangle) {

        return rectangle.side1(rectangle.getPoint())*rectangle.side2(rectangle.getPoint());
    }

    public static void isPointInsideCircle(Circle circle, Point point){

        double x = circle.getCentralPoint().getX();
        double y = circle.getCentralPoint().getY();
        double a = point.getX();
        double b = point.getY();
        double result = Math.pow((x-a), 2)+ Math.pow((y-b),2);
        double radiusPow = Math.pow(circle.getRadius(), 2);

        if (result < radiusPow){
            System.out.println("Punkt o współrzędnych X= "+ point.getX() + " Y= "+ point.getY() + " leży wewnątrz okręgu");
        }
        else {
            if (result == radiusPow){
                System.out.println("Punkt o współrzędnych X= "+ point.getX() + " Y= "+ point.getY() + " leży na okręgu");
            }
            else{
                System.out.println("Punkt o współrzędnych X= "+ point.getX() + " Y= "+ point.getY() + " leży poza okręgiem");
            }
        }

    }

}
