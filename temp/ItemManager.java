public class ItemManager {
   public static void main(String[] args) {
      Item<Integer> itemInt = new Item<Integer>(23);
      Item<Character> itemChar = new Item<Character>('g');

      itemInt.updateCount(23);
      itemInt.updateCount(20);

      itemChar.updateCount('p');
      itemChar.updateCount('b');
   }
}