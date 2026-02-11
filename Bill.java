class Bill {

    public static void main(String[] args) {

        int invoiceId = 101;
        int productId = 5001;
        double productCost = 250.50;
        int quantity = 2;
        double discount = 20.0;

        double totalPrice = (productCost * quantity) - discount;
        boolean feedbackProvided = false;

        System.out.println("Invoice ID: " + invoiceId);
        System.out.println("Product ID: " + productId);
        System.out.println("Product Cost: " + productCost);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Feedback Provided: " + feedbackProvided);
    }
}
