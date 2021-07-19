package week2;

public class IfDemo {
    public static void main (String[] args) {
        int cost = 6;

        buyDecision(cost);
    }

    public static void buyDecision(int cost) {

        if (cost > 7) {
            System.out.println("Prea scump");
        } else {
            System.out.println("Cumpar");
        }

        if (cost == 7) {
            System.out.println("Rezonabil!");
        }

        int baniInPortofel = 11;
        if (cost > 7) {
            System.out.println("Prea scump!");
        } else if (baniInPortofel >= cost*2) {
            System.out.println("Imi permit sa cumpar");
        } else {
            System.out.println("Am bani, dar raman cu prea putin");
        }

        boolean isRaining = true;
        if (isRaining) {
            System.out.println("Iau umbrela");
        } else {
            System.out.println("Nu iau umbrela");
        }
    }
}
