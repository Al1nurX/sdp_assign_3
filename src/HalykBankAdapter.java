public class HalykBankAdapter implements PaymentProcessor {
    private HalykBankPaymentProcessor halykBankProcessor;

    public HalykBankAdapter(HalykBankPaymentProcessor halykBankProcessor) {
        this.halykBankProcessor = halykBankProcessor;
    }

    @Override
    public void processPayment(double amount) {
        halykBankProcessor.makePaymentWithHalykBank(amount);
    }
}
