package smc;


public class MyBiLinkedList implements ListPool.IBiLink {
	ListPool.MyLinkedList.BiNode objRef1 = new ListPool.MyLinkedList.BiNode(); // (7)

	// ListPool.MyLinkedList.ILink ref; // (8) Compile-time error!
}
