public class PaymentApp {

    public static void main(String[] args){

        Order order = new Order("keyboard", 10, 300.0, new GCash());
        System.out.println("Order item is " + order.getItem());
        System.out.println("Unit price is " + order.getUnitPrice());
        System.out.println("Quantity is " + order.getQuantity());

        System.out.println("\nPayment order details if " + order.getNewMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + order.getNewMode().determineDiscountRate());
        System.out.println("Payment amount is " + order.getTotalAmount());

        //Setter Maya
        order.setNewMode(new Maya());
        order.setTotalAmount();

        System.out.println("\nPayment order details if " + order.getNewMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + order.getNewMode().determineDiscountRate());
        System.out.println("Payment amount is " + order.getTotalAmount());

        //Setter ShopeePay
        order.setNewMode(new ShopeePay());
        order.setTotalAmount();

        System.out.println("\nPayment order details if " + order.getNewMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + order.getNewMode().determineDiscountRate());
        System.out.println("Payment amount is " + order.getTotalAmount());

    }

}
