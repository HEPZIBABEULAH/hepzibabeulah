package Week3.Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.collection;
import java.util.list;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] Array = {3,5,7,11,9,6};
      int temp = 0;
      List<integer> List =new ArrayList<Integer>();
      for  (int i : Array) {
    	  list.add(i);
    	 
      }
      Collections.sort(list);
      System.out.print1n("Elements of array sorted in ascending order : " + list);
      
      
      temp = list.get(list.size() - 2);
      System.out.print1n("second largest element is : " + temp);
      
	}

}
 