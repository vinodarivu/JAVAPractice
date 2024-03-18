package HackathonCode;

import java.util.ArrayList;

/*Reverse Order is the best solution , don't do as below because array list rearrange the index*/

public class RemoveArrayListIndex {
	public static void main(String[] args) {
		ArrayList<Integer> firstArrayList = new ArrayList<>();
		ArrayList<Integer> secondArrayList = new ArrayList<>();

		// Add elements to the first and second arraylists
		firstArrayList.add(1);
		firstArrayList.add(3);
		firstArrayList.add(5);

		secondArrayList.add(10);
		secondArrayList.add(20);
		secondArrayList.add(30);
		secondArrayList.add(40);
		secondArrayList.add(50);
		secondArrayList.add(60);

		// Remove elements from second arraylist based on indices in the first arraylist
		for (int index : firstArrayList) {
			if (index >= 0 && index < secondArrayList.size()) {
				secondArrayList.remove(index);
			}
		}

		// Print the modified second arraylist
		System.out.println(secondArrayList); // Output: [10, 30, 50, 60]
	}
}
