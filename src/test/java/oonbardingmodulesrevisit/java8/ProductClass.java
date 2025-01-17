package oonbardingmodulesrevisit.java8;

public class ProductClass {
    private String name;
    private double price;
    private String category;
    private char grade;

    @Override
    public String toString() {
        return "ProductClass{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", grade=" + grade +
                '}';
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductClass(String name, double price, String category, char grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }


}
