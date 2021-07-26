package week3;

public class Point {
    int x;
    int y;

    public Point plus(Point p){
        Point result = new Point();
        result.x = x + p.x;
        result.y = y + p.y;
        return result;
    }
}
