// Write a program that determines and prints the largest integer among the five given integers (To print an integer, simply use System.out.println(intVarName);

import java.util.*;

public class printLargestNumber{
  public static void main(String[] args) 
  {
      int[] number = new int[5];
      int max = 0;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter five numbers: ");
      for(int i = 0; i < 5; i++)
      {
      number[i] = in.nextInt();
      if(number[i] > max)
      max = number[i];
      }  
      System.out.println("Largest number = " + max);
      in.close();
  }
}
