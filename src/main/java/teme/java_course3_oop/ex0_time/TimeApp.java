package teme.java_course3_oop.ex0_time;

/**
 * This is the main class for this exercise, which contains a main() method
 * and is used to test the separate Time class (to be defined)
 */
class TimeApp {

    //some manual tests of Time class
    public static void main(String[] args) {

        //TODO: uncomment these (and add more) when Time class is ready!

        Time t1 = new Time();
        Time t2 = new Time();

        System.out.println("t1 == t2 ?: " + (t1 == t2));
        System.out.println("t1: " + t1 + ", t2: " + t2);

        t1.hours = 1;
        t1.minutes = 10;
        t1.seconds = 30;

        System.out.println(t1.description());

        Time t3 = new Time(12, 23,36);
        System.out.println(t3.description());

        Time t4 = new Time(-1, -5, -4);
        System.out.println(t4.description());
    }
}

//TODO: define the new classes below (Time, TimeUtils - including necessary fields, constructors, methods...)

class Time {

    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {

        if (hours >= 0 && hours < 25) {
            this.hours = hours;
        }

        if (minutes >= 0 && minutes < 61) {
            this.minutes = minutes;
        }

        if (seconds >= 0 && seconds < 61) {
            this.seconds = seconds;
        }

    }

    public Time (){

    }

    public String description(){
        return hours + ":" + minutes + ":" + seconds;
    }
}