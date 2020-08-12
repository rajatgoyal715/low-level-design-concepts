package oops.designPatterns.abstractfactory;

import oops.designPatterns.abstractfactory.cards.CreditCard;

/**
 * TODO: Class Doc
 *
 * @author rajatgoyal715
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) throws Exception {

        CreditCardFactory creditCardFactory = CreditCardCompanyFactory.getCreditCardCompanyFactory("ICICI");
        CreditCard creditCard = creditCardFactory.getCreditCard("Silver");

        System.out.println(creditCard.getName());
    }
}
