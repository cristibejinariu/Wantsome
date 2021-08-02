package week4;

import java.util.ArrayList;
import java.util.List;

public class ListExcercise {
    public static void main(String[] args) {
        // o lista cu preturi de produse
        List<Double> prices = new ArrayList<>();
        prices.add(1.9);
        prices.add(0.75);
        prices.add(10.25);
        prices.add(55.99);
        prices.add(12.12);

        // vreau sa calculez totalul - suma lor
        double suma = 0;
        for(int i=0; i<prices.size(); i++){
            // adunam

        }
        for(Double p : prices){
            suma+=p;
        }
        System.out.println(suma);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);
        numbers.add(55);
        numbers.add(9);
        numbers.add(28);


        // vreau sa calculez suma numerelor pare din numbers
        int sumaPare = 0;
        for(Integer nr : numbers){
            if(nr%2 == 0){
                sumaPare+=nr;
            }
        }

        System.out.println(sumaPare);
    }
}
