import java.util.*;

public class currencyConverter {
    public static void main(String[] args) {
        // small currency converter app
        String currencyFrom = currencyFrom();
        double fromCount = fromCount();
        String currencyTo = currencyTo();
        double result = convertCurrency(fromCount, currencyFrom, currencyTo);
        System.out.println(convertCurrency(fromCount, currencyFrom, currencyTo));
        printResult(result, currencyTo);
    }

    public static String currencyFrom() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a currency to convert from");
        System.out.println("Available currencies are the following: EUR, USD, HUF, TRY, GBP");
        String currencyFrom = scan.next();
        while (!currencyFrom.equalsIgnoreCase("EUR") && !currencyFrom.equalsIgnoreCase("USD") && !currencyFrom.equalsIgnoreCase("HUF") && !currencyFrom.equalsIgnoreCase("TRY") && !currencyFrom.equalsIgnoreCase("GBP")) {
            System.out.println("Currency is not in the system. Yet.");
            System.out.println("Try with a valid currency.");
            currencyFrom = scan.next();
        }
        return currencyFrom;
    }

    public static Double fromCount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much would you like to convert?");
        double count = 0;
        boolean needMore = true;
        while (needMore) {
            try {
                count = scan.nextDouble();
                needMore = false;
            } catch (Exception e) {
                System.out.println("Not a valid input. Double/Int needed.");
                scan.next();
            }
        }
        return count;
    }

    public static String currencyTo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a currency to convert to");
        System.out.println("Available currencies are the following: EUR, USD, HUF, TRY, GBP");
        String currencyTo = scan.next();
        while (!currencyTo.equalsIgnoreCase("EUR") && !currencyTo.equalsIgnoreCase("USD") && !currencyTo.equalsIgnoreCase("HUF") && !currencyTo.equalsIgnoreCase("TRY") && !currencyTo.equalsIgnoreCase("GBP")) {
            System.out.println("Currency is not in the system. Yet.");
            System.out.println("Try with a valid currency.");
            currencyTo = scan.next();
        }
        return currencyTo;

    }

    public static double convertCurrency(double fromCount, String from, String to) {
        double currencyFrom = fromCount;
        double currencyTo = 0;
        if (from.equalsIgnoreCase("EUR")) {
            switch (to.toUpperCase()) {
                case "EUR":
                    currencyTo = 1;
                    break;
                case "USD":
                    currencyTo = 1.08;
                    break;
                case "HUF":
                    currencyTo = 381;
                    break;
                case "TRY":
                    currencyTo = 32.2;
                    break;
                case "GBP":
                    currencyTo = 0.86;
                    break;
            }
        } else if (from.equalsIgnoreCase("USD")) {
            switch (to.toUpperCase()) {
                case "EUR":
                    currencyTo = 0.93;
                    break;
                case "USD":
                    currencyTo = 1;
                    break;
                case "HUF":
                    currencyTo = 354.4;
                    break;
                case "TRY":
                    currencyTo = 29;
                    break;
                case "GBP":
                    currencyTo = 0.79;
                    break;
            }
        } else if (from.equalsIgnoreCase("HUF")) {
            switch (to.toUpperCase()) {
                case "EUR":
                    currencyTo = 0.0026;
                    break;
                case "USD":
                    currencyTo = 0.0028;
                    break;
                case "HUF":
                    currencyTo = 1;
                    break;
                case "TRY":
                    currencyTo = 0.082;
                    break;
                case "GBP":
                    currencyTo = 0.0022;
                    break;
            }
        } else if (from.equalsIgnoreCase("TRY")) {
            switch (to.toUpperCase()) {
                case "EUR":
                    currencyTo = 0.032;
                    break;
                case "USD":
                    currencyTo = 0.034;
                    break;
                case "HUF":
                    currencyTo = 12.25;
                    break;
                case "TRY":
                    currencyTo = 1;
                    break;
                case "GBP":
                    currencyTo = 0.027;
                    break;
            }
        } else if (from.equalsIgnoreCase("GBP")) {
            switch (to.toUpperCase()) {
                case "EUR":
                    currencyTo = 1.17;
                    break;
                case "USD":
                    currencyTo = 1.26;
                    break;
                case "HUF":
                    currencyTo = 445.92;
                    break;
                case "TRY":
                    currencyTo = 36.46;
                    break;
                case "GBP":
                    currencyTo = 1;
                    break;
            }
        }
        double sum = currencyFrom * currencyTo;
        return sum;
    }

    public static void printResult(double sum, String currencyTo) {
        System.out.println("The result of conversion is: " + sum + " " + currencyTo);
    }
}
