package Sandbox;

import DataStructures.LinkedList;

public class Sandbox {
	public static void main(String[] args) {
		LinkedList MyLinkedList = new LinkedList(1);
		
		MyLinkedList.Add(2);
		MyLinkedList.Add(3);
		MyLinkedList.Add(4);
		MyLinkedList.Add(7);
		
		MyLinkedList.Iterate();
		
		System.out.println("The length of the linked list is: " + MyLinkedList.Length);
	}
}
