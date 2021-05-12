import org.testng.annotations.Test;

public class FirstClass {

    @Test
    public void testMyFirstTest() {
        System.out.println("Hello, World!");
    }

    @Test
    public void testNumbers() {
        int myNumber;
        myNumber = 5;
        System.out.println(myNumber);
    }

    @Test
    public void testConcatenation() {
        String messagePrefix = "Dogs are!";
        String messageSuffix = " Who who who who!";
        String concatenated = messagePrefix + messageSuffix;
        System.out.println(concatenated); //using extra variable
        System.out.println(messagePrefix + messageSuffix); //concatenating in print
    }
    @Test
    public void testConcatenation02() {
        String messagePrefix = "Dogs are!";
        String messageSuffix = " Who who who who! ";
        int numberForMessage = 3;
        String concatenated = messagePrefix + messageSuffix + numberForMessage;
        System.out.println(concatenated); //using extra variable
        System.out.println(messagePrefix + messageSuffix + numberForMessage); //concatenating in print
    }

    @Test
    public void testClicks() {
        String messagePrefix = "I Clicked ";
        int numberOfClicks = 5;
        String messageSuffix = " times and ";
        System.out.println(messagePrefix + numberOfClicks + messageSuffix);
    }

    @Test
    public void testMethods() {
        String messagePrefix = "I tapped on the screen ";
        int numberOfTaps = 10;
        String messageSuffix = " times ";
        combineStringsAndNumber(messagePrefix, messageSuffix, numberOfTaps);
    }

    public void combineStringsAndNumber(String prefix, String suffix, int numberOfTimes){
        System.out.println(prefix + numberOfTimes + suffix);
    }

    @Test
    public void testBoolean() {
        boolean b = true;
        boolean toBe = false;
        b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
        }
    }

    @Test
    public void testIfStatement() {
        boolean isElementVisible = true;
        if(isElementVisible){
            System.out.println("Click on the Element");
        } else {
            System.out.println("Wait until it will be visible");
        }
    }

    @Test
    public void testArrays() {
        int[] arrayOfIntegers = {1, 2, 3, 4, 5};
        System.out.print("Array of integers: ");
        for (int i = 0; i < arrayOfIntegers.length; i++){
            System.out.print(arrayOfIntegers[i] + " ");
        }
        System.out.printf("%n");
        System.out.println("Array of integers column: ");
        for (int el : arrayOfIntegers){
            System.out.println(el);
        }
    }

    @Test
    public void testForLoopEnhancement() {
        String[] cats = {"black", "grey", "black and white", "brown"};
        for (String el : cats){
            System.out.println(el);
        }
    }

    @Test
    public void testBrake() {
        int i;
        for (i = 0; i < 5; i++) {
            if (i >= 2) {
                break;
            }
            System.out.println("Yuhu");
        }
        System.out.println(i);
    }

    @Test
    public void testBreakAndContinue() {
        int i;
        for (i = 0; i < 5; i++) {
            if (i >= 3) {
                break;
            }
            System.out.println("Yuhu");
            if (i >= 1) {
                continue;
            }
            System.out.println("Tata");
        }
        System.out.println(i);
    }

    @Test
    public void testArrays01() {
        int[] arrayOfIntegers = {34, 243445, 243213, 6745};
        printValueOfArray(arrayOfIntegers);
    }

    public void printValueOfArray (int[] inputArray){
        for (int j : inputArray) {
            System.out.println(j);
        }
    }
    @Test
    public void testCalculateTemperatures() {
        int[] existingTemperatures = {12, 2, 4, 30, 22, 11, 10, 8, 1, 22, 27, 31, 40, 50, 100};
        averageTemperature(existingTemperatures);
        rangeOfTemperatures(existingTemperatures);
    }
    private void averageTemperature(int[] inputTemperatures) {
        int sum = 0;
        int avg;
        int validEntries = 0;
        for (int i = 0; i < inputTemperatures.length; i++) {
            if (inputTemperatures[i] > 5 && 30 > inputTemperatures[i]) {
                sum += inputTemperatures[i];
                ++validEntries;
            }
        }
        avg = sum / validEntries;
        System.out.println("Average Temperature: " + avg);
    }
    public void rangeOfTemperatures(int[] inputTemperatures) {
        int[] sorted = new int[inputTemperatures.length];
        System.out.print("Range of temperatures: ");
        for (int i = 0; i < inputTemperatures.length; i++) {
            if (inputTemperatures[i] > 5 && 30 > inputTemperatures[i]) {
                sorted[i] = inputTemperatures[i];
                System.out.print(" " + sorted[i]);
            }
        }
        sumSorted(sorted);
        minMaxSorted(sorted);
    }
    private void sumSorted(int[] sorted) {
        int sum = 0;
        for (int j : sorted) {
            sum += j;
        }
        System.out.printf("%n");
        System.out.println("Sum of temperatures: " + sum);
    }
    private void minMaxSorted(int[] inputData) {
        int max = inputData[0];
        int min = inputData[0];
        for (int i = 0; i < inputData.length; i++) {
            if (inputData[i] > max) max = inputData[i];
            if (inputData[i] !=0 && inputData [i] < min) min = inputData[i];
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
    }


}

