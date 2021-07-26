package week3;

public class OOPIntro {
    public static void main(String[] args) {

        int[] pointA = {1, -1, 2};
        int[] pointB = {2, 5};

        // vrem sa 'adunam' punctele intr-un pct C cu suma coordonatelor de pe fiecare axa
        int xC = pointA[0] + pointB[0]; // 1+2
        int yC = pointA[1] + pointB[1]; // -1+5
        int[] pointC = {xC, yC};

        int xC2 = pointA[0] + pointB[0]; // 1+2
        int yC2 = pointA[1] + pointB[1]; // -1+5
        // int zC2 = pointA[2] + pointB[2]; // 2+??
        // int[] pointD = {xC2, yC2, zC2};

        Point punctulA = new Point();
        punctulA.x = 1;
        punctulA.y = -1;

        Point punctulB = new Point();
        punctulB.x = 2;
        punctulB.y = 5;

        Point punctulC = add(punctulA, punctulB);
        System.out.println("PunctulC are xul: " + punctulC.x);
        System.out.println("PunctulC are yul: " + punctulC.y);

        Point punctulD = punctulA.plus(punctulB);
        System.out.println("PunctulD are xul: " + punctulD.x);
        System.out.println("PunctulD are yul: " + punctulD.y);
    }

    public static Point add(Point p1, Point p2){
        Point result = new Point();

        result.x = p1.x + p2.x;
        result.y = p1.y + p2.y;

        return result;
    }
}
