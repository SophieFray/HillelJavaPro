package src.main.java.homework8;

public class Main {

    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "2"}, {"1", "2", "3", "4"}, {"1", "3", "3", "4"}, {"1", "2", "3", "4"}};

        try {
            System.out.println("Sum is: " + ArrayValueCalculator.doCalc(array));
        } catch (ArrayValueCalculator.ArrayDataException e) {
            System.out.println("Not an integer in cell [" + e.getRowIndex() + "] [" + e.getColumnIndex() + "]!");
        } catch (ArrayValueCalculator.ArraySizeException e) {
            System.out.println("Invalid array dimensions! You have " + e.getRowCount() + " rows and " + e.getColumnCount() + " columns!");
        }

    }


}
