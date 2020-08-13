package oops.designPatterns.prototype;


import java.util.HashMap;
import java.util.Map;

import oops.designPatterns.prototype.items.Book;
import oops.designPatterns.prototype.items.Item;
import oops.designPatterns.prototype.items.Movie;

//Singleton
public class Registry {

	private Map<String, Item> items = new HashMap<String, Item>();

	private static Registry registry = null;

	public static Registry getInstance() {
		if (registry == null) {
			synchronized (Registry.class) {
				if (registry == null) {
					registry = new Registry();
				}
			}
		}
		return registry;
	}

	private Registry() {
		loadItems();
	}
	
	public Item createItem (String type) throws Exception {
		if (!items.containsKey(type)) {
			throw new Exception("Item is not supported of type: " + type);
		}
		Item item = null;
		
		try {
			item = (Item)(items.get(type)).clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return item;
	}
	
	private void loadItems() {
		Movie artmovie = new Movie();
		artmovie.setTitle("Basic Movie");
		artmovie.setPrice(24.99);
		artmovie.setRuntime("2 hours");
		items.put("ArtMovie", artmovie);
		
		Movie shortMovie = new Movie();
		shortMovie.setTitle("Basic Movie");
		shortMovie.setPrice(24.99);
		shortMovie.setRuntime("2 hours");
		items.put("ShortMovie", shortMovie);
		
		Book book = new Book();
		book.setNumberOfPages(335);
		book.setPrice(19.99);
		book.setTitle("Basic Book");
		items.put("Book", book);
	}
}
