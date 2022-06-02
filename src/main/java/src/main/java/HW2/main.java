package HW2;

public class main {
    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "4", "3", "-4"}, {"5", "6", "-7", "8"}, {"1", "1", "a", "3"}, {"4", "3", "2", "1"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Error: change the size of the array");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Error: change the meaning of the array");
            System.out.println("Error in the cell: " + e.i + "x" + e.j);
        }

    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("test exception message1");
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("test exception message2");
            }
            for (int j = 1; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}
