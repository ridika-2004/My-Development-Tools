package database;

public class Category {
    private int categoryId;
    private String categoryName;

    public int getCategoryId() {
        return categoryId;
    }
    public String getCategoryName() {
        return categoryName;
    }

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }


}
