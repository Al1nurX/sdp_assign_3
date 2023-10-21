public class Main {
    public static void main(String[] args) {
        HalykBankPaymentProcessor halykBankProcessor = new HalykBankPaymentProcessor();
        KaspiBankPaymentProcessor kaspiBankProcessor = new KaspiBankPaymentProcessor();

        PaymentProcessor halykBankAdapter = new HalykBankAdapter(halykBankProcessor);
        PaymentProcessor kaspiBankAdapter = new KaspiBankAdapter(kaspiBankProcessor);

        double paymentAmount = 15000.0;

        halykBankAdapter.processPayment(paymentAmount);
        kaspiBankAdapter.processPayment(paymentAmount);
    }
}
