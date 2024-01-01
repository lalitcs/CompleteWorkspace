package Tree;

public class Test {

	public static void main(String[] args) {
		BST b=new BST();
		int[] arr= {50,20,8,35,90,65,98,5,12,61,75};
		Node root=new Node(arr[0]);
		for(int i=0;i<arr.length;i++) {
			b.insert(root,arr[ i]);
		}
		System.out.println("======Pre Order===========");
		b.preOrder(root);
		System.out.println();
		
		System.out.println("=====In Order========");
		b.inOrder(root);
		System.out.println();
		
		System.out.println("=====Post Order=========");
		b.postOrder(root);
		System.out.println();
	}
}