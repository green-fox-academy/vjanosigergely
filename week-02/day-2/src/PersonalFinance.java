import java.util.ArrayList;
import java.util.Arrays;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> expenses = new ArrayList<Integer>();

        Integer[] costs = {500, 1000, 1250, 175, 800, 120};

        expenses.addAll(Arrays.asList(costs));


        int sumSpend = 0;

        for (int expense : expenses) {
            sumSpend += expense;
        }

        System.out.println("In total we have spent: " + sumSpend);

        System.out.println("Our biggest expense was: " + greatestExpense(expenses));

        System.out.println("Our cheapest expense was: " + cheapestExpense(expenses));

        System.out.println("Our average expense was: " + sumSpend/expenses.size());

    }

    public static int greatestExpense (ArrayList <Integer> expenses){
        int topExpense = 0;
        for (int expense: expenses) {
            if (expense > topExpense) {
                topExpense = expense;
            }
        }
        return topExpense;

    }
    public static int cheapestExpense (ArrayList<Integer> expenses){
        int minExpense = expenses.get(0);
        for (int expense: expenses) {
            if (expense < minExpense) {
                minExpense = expense;
            }

        }
        return minExpense;
    }

}


   /* We are going to represent our expenses in a list containing integers.

        Create a list with the following items.
        500, 1000, 1250, 175, 800 and 120
        Create an application which solves the following problems.
        How much did we spend?
        Which was our greatest expense?
        Which was our cheapest spending?
        What was the average amount of our spendings?*/