package cp_15_15;
/*
Define a class StatePair with two generic types (T1 and T2), a constructor, mutators, accessors, and a toString() method.
Three ArrayLists have been pre-filled with StatePair data in main():

ArrayList<StatePair<Integer, String>> zipCodeState: Contains ZIP code/state abbreviation pairs
ArrayList<StatePair<String, String>> abbrevState: Contains state abbreviation/state name pairs
ArrayList<StatePair<String, Integer>> statePopulation: Contains state name/population pairs

Complete main() to use an input ZIP code to retrieve the correct state abbreviation from zipCodeState. Then use the
state abbreviation to retrieve the state name from abbrevState. Lastly, use the state name to retrieve the correct state
name/population pair from statePopulation and output the pair.

Ex: If the input is:

21044
the output is:

Maryland: 6079602
If the input is:

00606
the output is:

Puerto Rico: 3337177
 */
public class StatePair <T1 extends Comparable<T1>, T2 extends Comparable<T2>> {
   private T1 value1;
   private T2 value2;

   public StatePair(T1 item1, T2 item2) {
      this.value1 = item1;
      this.value2 = item2;
   }

   public T1 getValue1() {
      return value1;
   }

   public void setValue1(T1 value1) {
      this.value1 = value1;
   }

   public T2 getValue2() {
      return value2;
   }

   public void setValue2(T2 value2) {
      this.value2 = value2;
   }

   @Override
   public String toString() {
      return this.value1 + ": " + this.value2 ;
   }

}
