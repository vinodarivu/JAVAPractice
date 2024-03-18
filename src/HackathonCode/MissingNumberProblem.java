package HackathonCode;

//Given an array of non-duplicating numbers from 1 to n where one number is missing, 
//write an efficient java program to find that missing number.
//Idea is to find the sum of n natural numbers using the formula and then finding 
//the sum of numbers in the given array. Subtracting these two sums results in the number that is the actual missing
//number. 
//This results in O(n) time complexity and O(1) space complexity.

public class MissingNumberProblem {
	
	  public static void main(String[] args) {

	       int[] array={4,3,8,1,5,2,6};
	       int missingNumber = findMissingNum(array);
	       System.out.println("Missing Number is "+ missingNumber); 
	   }

	   public static int findMissingNum(int[] array) {
	       int n=array.length+1;
	       int sumOfFirstNNums=n*(n+1)/2;
	       int actualSumOfArr=0;
	       for (int i = 0; i < array.length; i++) {
	           actualSumOfArr+=array[i];
	       }
	       return sumOfFirstNNums-actualSumOfArr;
	   }
	}



