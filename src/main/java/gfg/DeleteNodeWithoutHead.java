package gfg;

import java.util.Scanner;

class Node {
  int data;
  Node next;

  Node(int d) {
    data = d;
    next = null;
  }
}

class DeleteNodeWithoutHead {
  Node head;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t > 0) {
      int n = sc.nextInt();
      DeleteNodeWithoutHead llist = new DeleteNodeWithoutHead();
      // int n=Integer.parseInt(br.readLine());
      int a1 = sc.nextInt();
      Node head = new Node(a1);
      llist.addToTheLast(head);
      for (int i = 1; i < n; i++) {
        int a = sc.nextInt();
        llist.addToTheLast(new Node(a));
      }

      int k = sc.nextInt();
      Node del = DeleteNodeWithoutHead.search_Node(llist.head, k);

      NodeDeleter g = new NodeDeleter();
      if (del != null && del.next != null) {
        NodeDeleter.deleteNode(del);
      }
      DeleteNodeWithoutHead.printList(llist.head);
      t--;
    }
  }

  static void printList(Node head) {
    Node tnode = head;
    while (tnode != null) {
      System.out.print(tnode.data + " ");
      tnode = tnode.next;
    }
    System.out.println();
  }

  static Node search_Node(Node head, int k) {
    Node current = head;
    while (current != null) {
      if (current.data == k) {
        break;
      }
      current = current.next;
    }
    return current;
  }

  void addToTheLast(Node node) {

    if (head == null) {
      head = node;
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }

      temp.next = node;
    }
  }
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* Linked List
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
// This function should delete node from linked list. The function
// may assume that node exists in linked list and is not last node
class NodeDeleter {
  static void deleteNode(Node del) {
    // System.out.println(del.data);
    Node currentNode = del;
    Node nextNode = null;
    Node previousNode = null;
    while (currentNode.next != null) {
      nextNode = currentNode.next;
      currentNode.data = nextNode.data;

      previousNode = currentNode;
      currentNode = nextNode;
    }

    previousNode.next = null;
  }
}
