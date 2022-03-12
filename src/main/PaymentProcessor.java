package main;
import java.util.Scanner;
public class PaymentProcessor {
    public static boolean checkBalance() {
        System.out.println("Checking with VISA/Mastercard...");
        return true;
    }

    public static boolean SubmitPayment() {
        System.out.println("Checking Balance...");
        if (checkBalance()) {
            System.out.println("Success! Payment approved.");
            return true;
        }
        else if (!checkBalance()) {
            System.out.println("Failure! Order Withdrawn, returning to menu.");
            return false;
        }
        return false;
    }
}
