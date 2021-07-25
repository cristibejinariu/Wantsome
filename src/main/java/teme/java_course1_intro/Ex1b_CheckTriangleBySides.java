package teme.java_course1_intro;

class Ex1b_CheckTriangleBySides {

    /**
     * Method which computes if 3 given LENGTH values can be the sides of a valid triangle
     *
     * @return true if they can form a triangle, false otherwise
     */
    static boolean canFormValidTriangle(int side1, int side2, int side3) {

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Method which computes if 3 given LENGTH values:
     * - can be the sides of a valid triangle
     * - AND that triangle is also right-angled
     *
     * @return true if they can form a right-angled triangle, false otherwise
     */
    static boolean canFormValidRightAngledTriangle(int side1, int side2, int side3) {

        if ((side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) && (side1*side1 + side2*side2 == side3*side3)){
            return true;
        } else {
            return false;
        }
    }


    /**
     * MAIN method, to run some manual tests (before running all automatic tests)
     */
    public static void main(String[] args) {
        testIt(1, 2, 4);
        testIt(4, 1, 3);
        testIt(1, 2, 2);
        testIt(3, 4, 5);
        testIt(-1, -2, -2);
        testIt(0, 0, 0);
    }

    //helper method, for manual tests
    private static void testIt(int side1, int side2, int side3) {
        System.out.println("\nSides (" + side1 + "," + side2 + "," + side3 + ") -> " +
                "valid triangle? : " + canFormValidTriangle(side1, side2, side3));
        System.out.println("Sides (" + side1 + "," + side2 + "," + side3 + ") -> " +
                "right-angle triangle? : " + canFormValidRightAngledTriangle(side1, side2, side3));
    }
}
