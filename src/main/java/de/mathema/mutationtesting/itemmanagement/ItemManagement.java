package de.mathema.mutationtesting.itemmanagement;

/**
 * Created by rai on 23.04.17.
 */
public class ItemManagement {

	public boolean checkItem(Item item) {
		if(item.getCategory() == Category.A
				&& item.isInStock()
				&& item.getArticleNumber() != -1) {
			return true;
		}

		return (item.getArticleNumber() > 1000);
	}
}



