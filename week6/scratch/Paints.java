import java.util.LinkedList; 
import java.util.Deque; 

public class Paints {
   public static void main(String[] args) {
      Deque<String> myColors = new LinkedList<String>();
      myColors.addFirst("Violet");
      myColors.addFirst("Indigo");
      myColors.addFirst("Blue");
      myColors.addFirst("Green");
      System.out.println(myColors.removeLast());
      System.out.println(myColors.removeLast());
   }
}
