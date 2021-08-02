package week4;

import javax.sound.midi.Soundbank;

public enum Level {
    HIGH, MEDIUM, LOW
}

class LevelApp {
    public static void main(String[] args) {
        System.out.println("Pentru HIGH -> " + getMultiplierForDifficulty("HIGH"));
        System.out.println("Pentru MEDIUM -> " + getMultiplierForDifficulty("MEDIUM"));
        System.out.println("Pentru LOW -> " + getMultiplierForDifficulty("LOW"));

        System.out.println("Pentru VERY HIGH -> " + getMultiplierForDifficulty("VERY HIGH"));
        System.out.println("Pentru Marcel -> " + getMultiplierForDifficulty("Marcel"));

        System.out.println("Pentru enum HIGH - > " + getMultiplierForDifficulty(Level.HIGH));

        for(Level level : Level.values()){
            System.out.println(level);
        }

        Level myLevel = Level.HIGH;

        for(RainbowColor color:RainbowColor.values()){
            System.out.println(color);
        }
    }

    public static double getMultiplierForDifficulty(String level){
        if(level.equals("HIGH")){
            return 2.5;
        }
        if(level.equals("MEDIUM")){
            return 1;
        }
        if(level.equals("LOW")){
            return 0.75;
        }
        return 0.0;
    }

    public static double getMultiplierForDifficulty(Level level) {
        switch(level){
            case HIGH:
                return 2.5;
            case MEDIUM:
                return 1.0;
            case LOW:
                return 0.75;
        }
        return 0;
    }
}

enum RainbowColor {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}