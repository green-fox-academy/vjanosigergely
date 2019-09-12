public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondsInADay = 24*60*60;
        int secondsPassed = currentHours*3600 + currentMinutes*60 + currentSeconds;


        int remainingSeconds = secondsInADay - secondsPassed;

        System.out.println(remainingSeconds);

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variable
    }
}
