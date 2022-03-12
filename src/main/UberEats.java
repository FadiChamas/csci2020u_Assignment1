package main;
import java.util.Scanner;
public class UberEats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strResponse = "";
        while ("y" !=  strResponse) {
            System.out.print("Order Now? (y/n) ");
            strResponse = input.nextLine();
            if (null == strResponse) {
                throw new IllegalArgumentException("strResponse cannot be null, must be string");
            }
            if ("y" != strResponse) {
                System.out.println("Okay, returning to menu!");
            }
        }
        System.out.println("Okay, submitting information regarding order.");
        if (true == PaymentProcessor.SubmitPayment()){
            KitchenList.AddQueue();
            Delivery.findDeliverer();
        }
        else {
            System.out.println("Failure! Order Withdrawn, returning to menu.");
            System.exit(0);
        }
    }
}
