import java.util.HashSet;

public class MyEvenNumbers {
   public static void main(String[] args) {
      HashSet<Integer> evenNumbers = new HashSet<Integer>();
      evenNumbers.add(2);
      evenNumbers.add(4);
      evenNumbers.add(6);
      evenNumbers.add(2);
      System.out.println(evenNumbers.size());
   }
}