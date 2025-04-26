import taxes.TaxEarnindsMinus;
import taxes.TaxEarnings;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Alpac", new TaxEarnings());

        company.shiftMoney(50_000);
        company.shiftMoney(20_000);
        company.shiftMoney(-30_000);
        company.shiftMoney(-15_000);

        company.payTaxes();

        company.setTaxSystem(new TaxEarnindsMinus());

        company.shiftMoney(20_000);
        company.shiftMoney(-10_000);
        company.shiftMoney(-5_000);

        company.payTaxes();

        Company company1 = new Company("Poltorashca", new TaxEarnings());

        company1.shiftMoney(8_000);
        company1.shiftMoney(-3_000);
        company1.payTaxes();
    }
}