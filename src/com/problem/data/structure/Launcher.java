package com.problem.data.structure;

import java.util.Arrays;

import com.problem.data.structure.sorting.QuickSort;
import com.problem.data.structure.tree.Node;

public class Launcher
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{5,2,1,3,4,6};
		
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(arr, 0, arr.length - 1);
		
		System.out.println(Arrays.toString(arr));
		
		// 4, 2, 7, 1, 3
		Node node = new Node(4);
		node.insertNode(2);
		node.insertNode(7);
		node.insertNode(1);
		node.insertNode(3);
		node.insertNode(6);
		
		node.printInOrder();
	}
}
