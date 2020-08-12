package oops.designPatterns.factory;

import oops.designPatterns.factory.websites.Blog;
import oops.designPatterns.factory.websites.Shop;
import oops.designPatterns.factory.websites.Website;

public class WebsiteFactory {

	private static final Blog blog = new Blog();
	private static final Shop shop = new Shop();

	public static Website getWebsite(WebsiteType siteType) throws Exception {
		switch(siteType) {
			case BLOG : {
				return blog;
			}
		
			case SHOP : {
				return shop;
			}
			
			default : {
				throw new Exception("Could not find any website for this website type: " + siteType);
			}
 		}
	}
	
}
