public class Rectangle {

    Point[] point = new Point[4];

    public Rectangle(Point[] tab){
        this.point[0] = tab[0];
        this.point[1] = tab[1];
        this.point[2] = tab[2];
        this.point[3] = tab[3];
    }

    public Point[] getPoint() {
        return point;
    }

    public void setPoint(Point[] point) {
        this.point = point;
    }


    public double side1(Point[]tab){
        if (point[0].getX()==point[1].getX()){
            return Math.abs(point[0].getY() - point[1].getY());
        }else{
            return  Math.abs(point[0].getX() - point[1].getX());
        }
    }

    public double side2(Point[]tab){
        if (point[1].getX()==point[2].getX()){
            return Math.abs(point[1].getY() - point[2].getY());
        }else{
            return  Math.abs(point[1].getX() - point[2].getX());
        }
    }


}
