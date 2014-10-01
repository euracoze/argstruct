package algorithms;

public class LinearSearch<T> {

  public int search(T[] items, T key) {

    for (int searchIndex = 0; searchIndex < items.length; searchIndex++) {
      if (key.equals(items[searchIndex])) {
        return searchIndex;
      }
    }

    return -1;

  }

  public static void main(String[] args) {

    LinearSearch<String> ls = new LinearSearch<String>();
    String[] fruitNames = { "apple", "grape", "orange", "banana", "mango"};
    String key = "banana";
    System.out.format("Key %s at %d.\n", key, ls.search(fruitNames, key));

  }

}
