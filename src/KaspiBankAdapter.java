public class KaspiBankAdapter implements PaymentProcessor {
    private KaspiBankPaymentProcessor kaspiBankProcessor;

    public KaspiBankAdapter(KaspiBankPaymentProcessor kaspiBankProcessor) {
        this.kaspiBankProcessor = kaspiBankProcessor;
    }

    @Override
    public void processPayment(double amount) {
        kaspiBankProcessor.makePaymentWithKaspiBank(amount);
    }
}
