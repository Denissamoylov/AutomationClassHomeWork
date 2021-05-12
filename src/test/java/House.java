public class House {
    int price;
    int squareFeet;
    int numberOfBedrooms;
    String type;
    String color;
    int discount;
    int updatedPrice;

    public House(int price, int squareFeet, int numberOfBedrooms, String type, int discount){
        this.price = price;
        this.squareFeet = squareFeet;
        this.numberOfBedrooms = numberOfBedrooms;
        this.type = type;
        this.discount = discount;




    }

    void buy(){
        System.out.println("HOUSE IS BOUGHT");
    }

    void sell(){
        System.out.println("HOUSE IS SOLD");
    }
    void printAllInfo(){
        System.out.println("Price: " + price + " Square Feet: " + squareFeet + " Number of bedrooms: " +
                numberOfBedrooms + " Type: " + type);
    }
    void addDiscountToPrice(){
        updatedPrice = price - discount;
        System.out.println("New prise: " + updatedPrice);
    }
    void setPrice(int newPrice){
        this.price = newPrice;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }
}
