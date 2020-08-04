package oops.designPatterns.builder;

public class Client {

	public static void main(String[] args) {
		
		SubWaySandwichOrderV1 sub1 = new SubWaySandwichOrderV1();
		sub1.setBread("Wheat bread");
		sub1.setCondiments("Chilly");
		sub1.setFillings("Chana chatpata");
		sub1.setVeggies("Lettuce");
		
		
		System.out.println(sub1.getBread());
		System.out.println(sub1.getCondiments());
		System.out.println(sub1.getFillings());
		System.out.println(sub1.getVeggies());

		StringBuilderImpl sb = new StringBuilderImpl("Hello").append(" ").append("World");
		String res = sb.toString();
		System.out.println(res);
	}

}
