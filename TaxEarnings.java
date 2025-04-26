package taxes;

public class TaxEarnings extends TaxSystem {
    @Override
    public int calcTaxSystem(int debit, int credit) {
        int tax = debit * 6 / 100;
        return Math.max(tax, 0);
    }
}
