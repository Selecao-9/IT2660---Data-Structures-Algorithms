import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      long beginTime = System.currentTimeMillis();
      System.out.println("\n\nBubble sort results ----------------------------------------------");
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      Lab4.outputList(bubbleSortedList);
      long finishTime = System.currentTimeMillis();
      long elapse = finishTime - beginTime;
      System.out.println("\n" + elapse + " miliseconds elapsed.");

      beginTime = System.currentTimeMillis();
      System.out.println("\n\nInsertion sort results -------------------------------------------");
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);
      Lab4.outputList(insertionSortedList);
      finishTime = System.currentTimeMillis();
      elapse = finishTime - beginTime;
      System.out.println("\n" + elapse + " miliseconds elapsed.");
    }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here
    for(int i = 1; i < integerList.size(); i++){
      int currentValue = integerList.get(i);
      int pointer = i - 1;
      while (pointer >= 0 && integerList.get(pointer) > currentValue) {
            integerList.set(pointer + 1, integerList.get(pointer));
            pointer--;
      }
      integerList.set(pointer + 1, currentValue);

    }

    return integerList;
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here
    boolean swapping = true;
    while(swapping)  {
      swapping = false;
      for(int i = 0; i < integerList.size() - 1; i++ ) {
        if (integerList.get(i) > integerList.get(i + 1)) {
          swapping = true;
          int swap = integerList.get(i);
          integerList.set(i, integerList.get(i + 1));
          integerList.set(i + 1, swap);
        }
      }
    }
    return integerList;
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("Lab 4/integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

    public static void outputList(ArrayList<Integer> integerList) {
      for (int i = 0; i < integerList.size(); i++) {
          System.out.print(integerList.get(i) + " ");
      }
    }
  }