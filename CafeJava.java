public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 2.0;
        double latte = 3.0;
        double cappucino = 3.25;

        double DripCoffee = 2.4;
        double Latte = 3.1;
        double Cappucino = 3.15;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        
        // 1.) Cindhuri ordered a coffee. 
        // show her the status message.
        System.out.println(customer1 + pendingMessage);

        // 2.) Noah ordered a cappucino
        // Check the status of his order and let him know. If it is ready, also tell him his total.

        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappucino);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }
        
        // 3.) Sam ordered 2 lattes, and would like to know the total up front. 
        // Also tell them their order status.
        System.out.println(displayTotalMessage + latte * 2);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }


        // 4.) Jimmy just realized he was charged for a coffee but had ordered a latte.
        // Tell him his new total to make up the difference.
        System.out.println(displayTotalMessage + (latte - dripCoffee));
    }
}
