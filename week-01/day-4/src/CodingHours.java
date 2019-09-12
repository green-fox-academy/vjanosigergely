public class CodingHours {
    public static void main(String[] args) {
        int lengthWeeks = 17;
        int dailyHours = 6;
        int averageWeeklyHours = 52;
        int weeklyCoding = 5*dailyHours;
        int codingHours = lengthWeeks*weeklyCoding;


        System.out.println("Hours spent coding: " +codingHours);
        System.out.println("Coding hours in all working hours " + weeklyCoding*100/averageWeeklyHours + "%");

        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
    }
}
