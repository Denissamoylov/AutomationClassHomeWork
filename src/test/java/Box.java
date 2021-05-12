public class Box {
    int capacityGallons;
    int priceDollars;
    String brand;

    public Box(int priceDollars, int capacityGallons, String brand){
        this.priceDollars = priceDollars;
        this.capacityGallons = capacityGallons;
        this.brand = brand;
    }
    public void concernPrice(){
        int i = priceDollars;
        if (i == 0){
            System.out.println("It's free! " + "This is it - take it!!!");
        }
        else{
            if (i < 10){
                System.out.println(priceDollars + "$" + " is the price from " + brand + " with capacity " + capacityGallons +
                        " gallons " + "- it is affordable price");
            }
         else {
                System.out.println(priceDollars + "$" + " is the price from " + brand + " with capacity " + capacityGallons +
                        " gallons " + "- this is too much!!!");
            }
        }
    }


    public void addBonus() {
        int i = capacityGallons;
        if (i > 10){
            System.out.println("You have a free gift!");
        }
    }
}
