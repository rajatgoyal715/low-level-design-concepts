package oops.designPatterns.abstractfactory;

import oops.designPatterns.abstractfactory.cards.AxisGoldCreditCard;
import oops.designPatterns.abstractfactory.cards.AxisSilverCreditCard;
import oops.designPatterns.abstractfactory.cards.CreditCard;

/**
 * TODO: Class Doc
 *
 * @author rajatgoyal715
 */
public class AxisCreditCardFactory extends CreditCardFactory {

    private static final CreditCard axisSilverCreditCard = new AxisSilverCreditCard();
    private static final CreditCard axisGoldCreditCard = new AxisGoldCreditCard();

    @Override
    CreditCard getCreditCard(String type) throws Exception {
        switch (type) {
            case "Silver":
                return axisSilverCreditCard;
            case "Gold":
                return axisGoldCreditCard;
            default:
                throw new Exception("There exists no Axis credit card for type: " + type);
        }
    }
}
