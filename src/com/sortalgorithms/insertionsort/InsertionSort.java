package com.sortalgorithms.insertionsort;

import java.security.SecureRandom;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		//In this sort algorithm we have to partitions, one sorted and the other one unsorted
				int primerIndexNoOrdenado;
				int nuevoElemento;
				int nRandomNumbers;	
				int array[],i2;
				//The program ask for the length of an random numbers array
				Scanner input=new Scanner(System.in);
				System.out.print("How many random numbers do you want?: ");
				nRandomNumbers=input.nextInt();
				array=new int[nRandomNumbers];
				//Most of the time I prefer to use SecureRandom instead of Math.Random()
				//when I need to create random numbers
				SecureRandom anums = new SecureRandom();
				for(int i=0;i<array.length;i++)
				{
					array[i]=anums.nextInt(100);
				}
				System.out.println("The random numbers created are: ");
				for(int x:array)
				{	
					System.out.print(x+" ");
				}
				System.out.println("");
				//why primerIndexNoOrdenado is equals to 1? because we assuming that the element at position zero is in the sorted partition
				//By the way is very important to understand that as long as the primerIndexNoOrdenado index is less than the length of the array,
				//we are going to examine all the elements right up to the end of the array, and after each iteration the primerIndexNoOrdenado
				//will be incremented by one, 'cause we are growing the sorted partition from left to right
				for(primerIndexNoOrdenado=1;primerIndexNoOrdenado<array.length;primerIndexNoOrdenado++)
				{
					//First at all, we need to save the value that we are going to insert, because that element
					//is going to be ovewritten
					nuevoElemento=array[primerIndexNoOrdenado];
					//now I implement the loop for the element that I need to insert(nuevoElemento) in the right position (if is necesary) 
					//i2=primerIndexNoOrdenado, 'cause the element we want to insert is that first inserted index
					//i2>0 as long as i2 is greater than 0 (the back of the array) and than the value at index i2-1 greater than nuevoElemento
					//we are looking for the right position 
					for(i2=primerIndexNoOrdenado;i2>0&&array[i2-1]>nuevoElemento;i2--)
					{
						//here we are moving the position of numbers in the sorted partition where nuevoElemento needs to be
						array[i2]=array[i2-1];
					}
					//when we fing the right position , we assign nuevoElemento to array[i2]
					array[i2]=nuevoElemento;
				}
				System.out.println("These are the numbers but sorted with insertion method:");
				for(int x:array)
				{
					System.out.print(x+" ");
				}

	}

}
