package oops.designPatterns.abstractfactory;

import oops.designPatterns.abstractfactory.cards.*;

/**
 * TODO: Class Doc
 *
 * @author rajatgoyal715
 */
public class IciciCreditCardFactory extends CreditCardFactory {

    private static final IciciSilverCreditCard iciciSilverCreditCard = new IciciSilverCreditCard();
    private static final IciciGoldCreditCard iciciGoldCreditCard = new IciciGoldCreditCard();

    @Override
    CreditCard getCreditCard(String type) throws Exception {
        switch (type) {
            case "Silver":
                return iciciSilverCreditCard;
            case "Gold":
                return iciciGoldCreditCard;
            default:
                throw new Exception("There exists no ICICI credit card for type: " + type);
        }
    }
}
