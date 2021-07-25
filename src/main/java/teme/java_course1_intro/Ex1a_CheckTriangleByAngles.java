package teme.java_course1_intro;

class Ex1a_CheckTriangleByAngles {

    /**
     * Method which computes if 3 given ANGLE values (in degrees) can be the angles of a valid triangle
     *
     * @return true if they can form a triangle, false otherwise
     */
    static boolean canFormValidTriangle(int angle1, int angle2, int angle3) {

            if (angle1 + angle2 + angle3 == 180 && angle1 != 0 && angle2 != 0 && angle3 != 0) {
                return true;
            } else {
                return false;
        }
    }

    /**
     * Method which computes if 3 given ANGLE values (in degrees):
     * - can form a valid triangle
     * - AND that triangle is also right-angled
     *
     * @return true if they can form a right-angled triangle, false otherwise
     */
    static boolean canFormValidRightAngledTriangle(int angle1, int angle2, int angle3) {

            if ((angle1 + angle2 + angle3 == 180 && angle1 != 0 && angle2 != 0 && angle3 != 0) && (angle3 == angle1 + angle2 || angle2 == angle1 + angle3 || angle1 == angle2 + angle3)) {
                return true;
            } else {
                return false;
        }

    }


    /**
     * MAIN method, to run some manual tests (before running all automatic tests)
     */
    public static void main(String[] args) {
        testIt(-10, -100, 90);
        testIt(0, 0, 0);
        testIt(0, 0, 180);
        testIt(0, 90, 90);
        testIt(90, 90, 90);
        testIt(10, 10, 10);
        testIt(10, 30, 50);
        testIt(60, 60, 60);
        testIt(120, 30, 30);
        testIt(30, 60, 90);
        testIt(90, 20, 70);
    }

    //helper method, for manual tests
    private static void testIt(int angle1, int angle2, int angle3) {
        System.out.println("\nAngles (" + angle1 + "," + angle2 + "," + angle3 + ") -> " +
                "valid triangle? : " + canFormValidTriangle(angle1, angle2, angle3));
        System.out.println("Angles (" + angle1 + "," + angle2 + "," + angle3 + ") -> " +
                "right-angle triangle? : " + canFormValidRightAngledTriangle(angle1, angle2, angle3));
    }
}
