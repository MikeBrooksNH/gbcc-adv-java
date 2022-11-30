public class SortScores {
   public static <T extends Comparable<T>> 
   T mScore(T scr1, T scr2, T scr3) {
      T matchScore = scr1; 
      if (scr2.compareTo(matchScore) > 0) {
         matchScore = scr2;
      }
      if (scr3.compareTo(matchScore) > 0) {
         matchScore = scr3;
      }
      return matchScore;
   } 
   public static void main(String[] args) {
      mScore str = new mScore();
      mScore num = new mScore();


      System.out.println(num.mScore(27,87,18));
      System.out.println(str.mScore("d","e","f"));
   }
}

