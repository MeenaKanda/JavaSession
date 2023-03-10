package DynamicArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {
	
	//add() -> used to add the value
	//add(index,value);
	//get(index) -> used to fetch the value using index no.
	//set(index) -> used to update value for specific index
	//size() -> used to get size of an arrayList
	//contains() -> used to find search an element into array  -> return boolean
	//subList(index,index) -> used to get sublist of an arrayList.
	//remove(index) -> used to remove specific value using index no
	//remove(obj) -> used to remove by add value into bracket.
	//removeAll() -> remove all elements in the arrayList
	
	//Collections -> is a class in java
	//Collections.reverse() -> method used to reverse 
	//Colllections.sort() -> sort the value(a-z order)
	//Collections.swap() -> swap two values
	

	public static void main(String[] args) {
		
		List<String> nameList= new ArrayList<String>();
		
		nameList.add("Tom");  //0
		nameList.add("Peter"); //1
		nameList.add("Rashmi");//2
		nameList.add("Ravi");  //3
		nameList.add("Naveen"); //4
		
		System.out.println(nameList.size());  //5
		
//		// 1. print in reverse arrayList: use this for interview
//		for(int i=nameList.size()-1; i>=0; i--) {
//			System.out.println(nameList.get(i));
//		}
		
		System.out.println(nameList);  //[Tom, Peter, Rashmi, Ravi, Naveen]
		
		// 2. reverse ArrayList using Collections without using forloop:
		Collections.reverse(nameList);  
		System.out.println(nameList);    //[Naveen, Ravi, Rashmi, Peter, Tom]
		
		// sort the arrayList:
		Collections.sort(nameList);
		System.out.println(nameList); //[Naveen, Peter, Rashmi, Ravi, Tom]
		
		//swap the values:
		Collections.swap(nameList, 2, 4);
		System.out.println(nameList);  //[Naveen, Peter, Tom, Ravi, Rashmi]
		
		//replace value:
//		Collections.replaceAll(nameList, "Tom", "Meenakshi");
//		System.out.println(nameList);   //[Naveen, Peter, Meenakshi, Ravi, Rashmi]
		

		nameList.add("Amritha");
		System.out.println(nameList);  //[Naveen, Peter, Tom, Ravi, Rashmi, Amritha]
		
		nameList.add(0, "Kath");
		System.out.println(nameList);   //[Kath, Naveen, Peter, Tom, Ravi, Rashmi, Amritha]
		
		
		//it should be continuous memory allocation. you can not skip some index and try to add value on 8th index. at compile it don't give error.
		//but runtime it give IndexOutOfBoundsException. we cannot ignore index in between.(VC=10 at beginning doesn't matter)
//		nameList.add(8, "Vinutha");  //it don't give error in compile time.
//		System.out.println(nameList);  //IndexOutOfBoundsException
	
	
		nameList.remove(1);
		System.out.println(nameList.get(1));  //peter
		System.out.println(nameList);  //[Kath, Peter, Tom, Ravi, Rashmi, Amritha]
	
	}

}
