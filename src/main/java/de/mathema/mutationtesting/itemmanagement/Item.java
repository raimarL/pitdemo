package de.mathema.mutationtesting.itemmanagement;

/**
 * Created by rai on 23.04.17.
 */
public class Item {

    private String name;
    private Category category;
    private int articleNumber;
    private boolean inStock;

    public Item(String name, Category category, int articleNumber, boolean inStock) {
        this.name = name;
        this.category = category;
        this.articleNumber = articleNumber;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(int articleNumber) {
        this.articleNumber = articleNumber;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
