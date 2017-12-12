package com.problem.data.structure.tree;

public class Node
{
	private Node left;
	private Node right;
	private int data;
	
	public Node(int data)
	{
		this.data = data;
	}
	
	public void insertNode(int value)
	{
		if (value <= data)
		{
			if (left == null)
			{
				left = new Node(value);
			}
			else
			{
				left.insertNode(value);
			}
		}
		else
		{
			if (right == null)
			{
				right = new Node(value);
			}
			else
			{
				right.insertNode(value);
			}
		}
	}
	
	public boolean findNode(int value)
	{
		if (value == data)
		{
			return true;
		}
		else if (value < data)
		{
			if (left == null)
			{
				return false;
			}
			else
			{
				return left.findNode(value);
			}
		}
		else
		{
			if (right == null)
			{
				return false;
			}
			else
			{
				return right.findNode(value);
			}
		}
	}
	
	public void printInOrder()
	{
		if (left != null)
		{
			left.printInOrder();
		}
		
		System.out.print(data + " ");
		
		if (right != null)
		{
			right.printInOrder();
		}
	}
}
