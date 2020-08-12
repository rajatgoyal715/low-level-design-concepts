package oops.designPatterns.abstractfactory;

/**
 * TODO: Class Doc
 *
 * @author rajatgoyal715
 */
public class CreditCardCompanyFactory {

    private static final CreditCardFactory axisCreditCardFactory = new AxisCreditCardFactory();
    private static final CreditCardFactory iciciCreditCardFactory = new IciciCreditCardFactory();

    public static CreditCardFactory getCreditCardCompanyFactory(String company) throws Exception {
        switch (company) {
            case "ICICI":
                return iciciCreditCardFactory;
            case "Axis":
                return axisCreditCardFactory;
            default:
                throw new Exception("There exists no credit card factory for company: " + company);
        }
    }
}
