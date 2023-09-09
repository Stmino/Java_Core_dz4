package dz4;

public class dz4_1 {
  public static void main(String[] args) {
    String[][] array = {
        { "k", "2", "3","4" },
        { "5", "6", "7", "8" },
        { "9", "10", "11", "12" },
        { "13", "14", "15", "16" }

    };
    try {
      int result = sumArrayElements(array);
      System.out.println("sum= " + result);
    } catch (MyArraySizeException e) {
      System.out.println("Исключение: " + e.getMessage());

    } catch (MyArrayDataException e) {
      System.out.println("Исключение: " + e.getMessage());
    }

  }

  public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
    int sum = 0;
    if (!(array.length == 4 && array[0].length == 4)) {
      throw new MyArraySizeException("Неверный размер массива");
    }
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        try {
          sum += Integer.parseInt(array[i][j]);
        } catch (NumberFormatException e) {
          throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
        }
      }
    }
    return sum;

  }

}
