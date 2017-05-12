import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class DisjointSet<T> {
	
	private static class Node<T> {
		int rank;
		T parent;

		Node(T parent, int rank) {
			this.parent = parent;
			this.rank = rank;
		}
	}

	private final HashMap<T, Node<T>> objectsToNodes = new HashMap<>();
	
	public T findSet(Object o) {
		DisjointSet.Node<T> node = objectsToNodes.get(o);
		if (node == null) {
			return null;
		}
		if (o != node.parent) {
			System.out.println("REKURSIJA");
			node.parent = findSet(node.parent);
		}
		System.out.println("FIND SET PARENT = " + node.parent.toString());
		return node.parent;
	}

	// o - vertex???
	public void makeSet(T o) {
		objectsToNodes.put(o, new Node<>(o, 0));   // 0 yra rank?
	}
/*
	public void removeSet(Object o) {
		Object set = findSet(o);
		if (set == null) {
			return;
		}
		for (Iterator<T> it = objectsToNodes.keySet().iterator(); it.hasNext();) {
			T next = it.next();
			//remove the set representative last, otherwise findSet will fail
			if (next != set && findSet(next) == set) {
				it.remove();
			}
		}
		objectsToNodes.remove(set);
	}*/
	// naudojamas?????
	/*public void toList(List<? super T> list) {
		list.addAll(objectsToNodes.keySet());
		System.out.println(objectsToNodes.keySet());
	}
*/
	public void union(T x, T y) {
		T setX = findSet(x);
		T setY = findSet(y);
		if (setX == null || setY == null || setX == setY) {
			return;
		}
		Node<T> nodeX = objectsToNodes.get(setX);
		Node<T> nodeY = objectsToNodes.get(setY);
	    
		//join the two sets by pointing the root of one at the root of the other
		System.out.println("NOdeX " + nodeX.rank);
		System.out.println("NodeY " + nodeY.rank);
		//System.out.println("NODEX Parent " + nodeX.parent.toString());
		//System.out.println("NODEY Parent " + nodeY.parent);
		if (nodeX.rank > nodeY.rank) {
			nodeY.parent = x;
		} else {
			nodeX.parent = y;
			if (nodeX.rank == nodeY.rank) {
				nodeY.rank++;
			}
		}
	}
}