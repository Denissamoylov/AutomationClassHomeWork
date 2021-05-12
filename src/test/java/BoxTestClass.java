import org.testng.annotations.Test;

public class BoxTestClass {
    @Test
    public void testBoxes() {
        Box paper = new Box(5,15,"HomeDepot");
        Box plastic = new Box(15,10, "IKEA");
        Box used = new Box(0,4, "Public Storage");
        paper.concernPrice();
        plastic.concernPrice();
        used.concernPrice();
        paper.addBonus();

    }
}
