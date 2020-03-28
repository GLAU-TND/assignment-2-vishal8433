/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyQueue preQueue = new MyQueue();
        MyQueue postQueue= new MyQueue();
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree(preQueue,postQueue);
        myBinarySearchTree.insert(15);
        myBinarySearchTree.insert(10);
        myBinarySearchTree.insert(50);
        myBinarySearchTree.insert(55);
        myBinarySearchTree.insert(60);
        myBinarySearchTree.postOrder(myBinarySearchTree.getRoot());
        myBinarySearchTree.preOrder(myBinarySearchTree.getRoot());
        System.out.println("PreOrder:");
        preQueue.show();
        System.out.println("PostOrder:");
        postQueue.show();
        System.out.println();
    }
}
