import org.testng.annotations.Test;

public class HouseTestClass {
    @Test
    public void testHouseClass() {
        House myFirstHouse = new House(1000, 150,3, "Condo", 0);
        myFirstHouse.buy();
        myFirstHouse.printAllInfo();
        House mySecondHouse = new House(1500,500,4,"Stucco", 0);
        mySecondHouse.sell();
        House myThirdHouse = new House(1500,150, 3, "One Story", 100);
        myThirdHouse.addDiscountToPrice();
        System.out.println("Type of house: " + myFirstHouse.getType());
        myThirdHouse.setDiscount(400);
        myThirdHouse.addDiscountToPrice();

        myFirstHouse.setColor("Blue");
        String firstHouseColor = myFirstHouse.getColor();
        System.out.println("First house color: " + myFirstHouse.getColor());

        boolean isEqualTo = false;
        if(firstHouseColor != null){
            String color = myFirstHouse.getColor();
            isEqualTo = color.equalsIgnoreCase("Blue");
        }
        System.out.println("Is Equal To: " + isEqualTo);
    }

}
