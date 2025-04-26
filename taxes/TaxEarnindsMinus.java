package taxes;

public class TaxEarnindsMinus extends TaxSystem {
    @Override
    public int calcTaxSystem(int debit, int credit) {
        int tax = (debit - credit) * 15 / 100;
        return Math.max(tax, 0);
    }
}
