package oops.designPatterns.abstractfactory;

import oops.designPatterns.abstractfactory.cards.CreditCard;

/**
 * TODO: Class Doc
 *
 * @author rajatgoyal715
 */
public abstract class CreditCardFactory {

    abstract CreditCard getCreditCard(String type) throws Exception;
}
