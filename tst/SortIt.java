import java.util.ArrayList;
import java.util.Collections;

public class SortIt {

public static void main(String[] args) {

ArrayList<String> myList = new ArrayList<String>();

myList.add("xyz");
myList.add("abc");
myList.add("nmq");
myList.add("yui");

Collections.sort(myList);

for (String i : myList) 
	System.out.println(i);

}
}
