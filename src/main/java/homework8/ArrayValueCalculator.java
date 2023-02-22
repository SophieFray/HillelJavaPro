package src.main.java.homework8;

public class ArrayValueCalculator {

    public static int doCalc(String[][] stringArray) throws ArraySizeException, ArrayDataException {

        if (stringArray.length != 4 || stringArray[0].length != 4)
            throw new ArraySizeException(stringArray.length, stringArray[0].length);

        int sum = 0;

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(stringArray[i][j]);
                } catch (Exception e) {
                    throw new ArrayDataException(i, j);
                }
            }
        }
        return sum;

    }


    public static class ArrayDataException extends Exception {
        private int rowIndex = 0;
        private int columnIndex = 0;

        public ArrayDataException(int rowIndex, int columnIndex) {
            this.rowIndex = rowIndex;
            this.columnIndex = columnIndex;
        }

        public int getRowIndex() {
            return rowIndex;
        }

        public int getColumnIndex() {
            return columnIndex;
        }
    }


    public static class ArraySizeException extends Exception {

        private int rowCount = 0;
        private int columnCount = 0;

        public ArraySizeException(int rowCount, int columnCount) {
            this.rowCount = rowCount;
            this.columnCount = columnCount;
        }

        public int getRowCount() {
            return rowCount;
        }

        public int getColumnCount() {
            return columnCount;
        }
    }
}
