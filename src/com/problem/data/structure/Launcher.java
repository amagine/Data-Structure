package com.problem.data.structure;

import com.problem.data.structure.tree.Node;

public class Launcher
{
	public static void main(String[] args)
	{
		// Binary Tree
		Node node = new Node(4);
		node.insertNode(2);
		node.insertNode(7);
		node.insertNode(1);
		node.insertNode(3);
		node.insertNode(6);
		
		node.printInOrder();
	}
}
