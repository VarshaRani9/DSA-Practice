import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

class BT_Node<T>{
	T data;
//	Left child reference
	BT_Node<T> left;
//	Right child reference
	BT_Node<T> right;
	public BT_Node(T data) {
		this.data = data;
//		by default left and right is null so no need of following 2 line
//		left = null;
//		right = null;
	}
}
class BT_Operations{
	String nodeName = "root";
	Scanner sc = new Scanner(System.in);
	BT_Node<Integer> insert() {
		System.out.println("Enter the data for : "+nodeName+" or -1 for exit");
		int data = sc.nextInt();
		if(data == -1)return null;
//		prepare a node
		BT_Node<Integer> node = new BT_Node<>(data);
//		prepare a left node
		nodeName = "left";
		node.left = insert();
//		backtrack
		nodeName = "right";
		node.right = insert();
//		backtrack
		nodeName = "root";
		return node;
	}
	void print(BT_Node<Integer> root){
      if(root == null){
          return;
      }
      // Branch Recursion
      // DFT
      String result = "";
      result += root.data+" -> ";
      // checking current node left exist
      if(root.left!=null){
          result += " Left "+root.left.data;
      }
      if(root.right!=null){
          result +=" Right "+root.right.data;
      }
      System.out.println(result);
      print(root.left);
      print(root.right);

  }


// DFT
	//	InOrder (LPR)
	void inOrder(BT_Node<Integer> root){
        if(root == null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
	void inOrderItr(BT_Node<Integer> root){
		Stack<BT_Node<Integer>> stack = new Stack<>();
		BT_Node<Integer> curNode = root;
		while(curNode!=null || !stack.isEmpty()) {
			while(curNode!=null) {
				stack.push(curNode);
				curNode = curNode.left;
			}
			curNode = stack.pop();
			System.out.print(curNode.data+" ");
			curNode = curNode.right;
		}
    }
	
    // Pre-Order (PLR)
    void preOrder(BT_Node<Integer> root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    void preOrderItr(BT_Node<Integer> root){
        if(root == null){
            return;
        }
        Stack<BT_Node<Integer>> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
        	BT_Node<Integer> curNode = stack.pop();
        	System.out.print(curNode.data+" ");
        	if(curNode.right!=null)stack.push(curNode.right);
        	if(curNode.left!=null)stack.push(curNode.left);
        }
        System.out.println();
    }
    
    // PostOrder (LRP)
    void preOrderItr2(BT_Node<Integer> root){
        if(root == null){
            return;
        }
        Stack<BT_Node<Integer>> stack = new Stack<>();
        BT_Node<Integer> curNode = root;
        while(curNode!=null || !stack.isEmpty()) {
        	while(curNode!=null) {
        		System.out.print(curNode.data+" ");
        		if(curNode.right!=null)stack.push(curNode.right);
        		curNode = curNode.left;
        	}
        	if(!stack.isEmpty()) {
        		curNode = stack.pop();
        	}
        }
        System.out.println();
    }
    void postOrder(BT_Node<Integer> root){
        if(root == null){
            return ;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    
// BFT
    void levelOrder(BT_Node<Integer> root){
    	LinkedList<BT_Node<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
        	BT_Node<Integer> node = queue.removeFirst();
        	System.out.print(node.data+" ");
        	if(node.left!=null)queue.add(node.left);
        	if(node.right!=null)queue.add(node.right);
        }
        System.out.println();
    }
    void levelOrder2(BT_Node<Integer> root){
    	LinkedList<BT_Node<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
        	int count = queue.size();
        	for(int i =0;i<count;i++) {
        		BT_Node<Integer> curNode = queue.poll();
        		System.out.print(curNode.data+" ");
        		if(curNode.left!=null)queue.addLast(curNode.left);
        		if(curNode.right!=null)queue.addLast(curNode.right);
        	}
        	System.out.println();
        }
    }
    
    int height(BT_Node<Integer> root) {
    	if(root == null)return 0;
    	int lHeight = height(root.left);
    	int rHeight = height(root.right);
    	int val = Math.max(lHeight, rHeight);
    	return val+1;
    }
    int countNodes(BT_Node<Integer> root) {
    	if(root==null)return 0;
    	int counter = 1;
    	counter+=countNodes(root.left);
    	counter+=countNodes(root.right);
    	return counter;
    }
    
//    T.C, S.C - O(height)
    int maxLevel = 0;
    void printLeftView(BT_Node<Integer> root, int curLevel) {
    	if(root == null)return;
    	if(maxLevel<curLevel) {
    		System.out.print(root.data+" ");
    		maxLevel = curLevel;
    	}
    	printLeftView(root.left,curLevel+1);
    	printLeftView(root.right,curLevel+1);
    }
    void printLeftViewItr(BT_Node<Integer> root) {
    	if(root == null)return;
    	Queue<BT_Node<Integer>> q = new LinkedList<>();
    	q.add(root);
    	while(!q.isEmpty()) {
    		int qSize = q.size();
    		for(int i =0;i<qSize;i++) {
    			BT_Node<Integer> cur = q.poll();
    			if(i==0)System.out.print(cur.data+" ");
    			if(cur.left!=null)q.add(cur.left);
    			if(cur.right!=null)q.add(cur.right);
    		}
    	}
    }
    
    int maxLevelr = 0;
    void printRightView(BT_Node<Integer> root, int curLevel) {
    	if(root == null)return;
    	if(maxLevelr<curLevel) {
    		System.out.print(root.data+" ");
    		maxLevelr = curLevel;
    	}
    	printRightView(root.right,curLevel+1);
    	printRightView(root.left,curLevel+1);
    }
    void printRightViewItr(BT_Node<Integer> root) {
    	if(root == null)return;
    	Queue<BT_Node<Integer>> q = new LinkedList<>();
    	q.add(root);
    	while(!q.isEmpty()) {
    		int qSize = q.size();
    		for(int i =0;i<qSize;i++) {
    			BT_Node<Integer> cur = q.poll();
    			if(i==qSize-1)System.out.print(cur.data+" ");
    			if(cur.right!=null)q.add(cur.right);
    			if(cur.left!=null)q.add(cur.left);
    		}
    	}
    }
    
    void verticalOrder(BT_Node<Integer> root, int distance, TreeMap<Integer,ArrayList<Integer>>map) {
    	if(root == null)return;
    	if(map.get(distance)==null) {
//    		if no distance exists create new ArrayList
    		ArrayList<Integer> list = new ArrayList<>();
    		list.add(root.data);
    		map.put(distance, list);
    	}
    	else {
    		ArrayList<Integer> l = map.get(distance);
    		l.add(root.data);
    		map.put(distance, l);
    	}
    	verticalOrder(root.left,distance-1,map);
    	verticalOrder(root.right,distance+1,map);
    }
    void printVerticalOrder(BT_Node<Integer> root) {
    	TreeMap<Integer,ArrayList<Integer>>map = new TreeMap<>();
    	verticalOrder(root,0,map);
    	for(Map.Entry<Integer,ArrayList<Integer>> m : map.entrySet()) {
    		System.out.println(m.getKey()+" "+m.getValue());
    	}
    }
    public void printTopView(BT_Node<Integer> root){
        TreeMap<Integer, ArrayList<Integer>> map  = new TreeMap<>();
        topView(root, 0, map);
        for(Map.Entry<Integer, ArrayList<Integer>> m: map.entrySet() ){
            System.out.println(m.getValue());
        }

    }

    public void topView(BT_Node<Integer> root, int distance, TreeMap<Integer,ArrayList<Integer>> map ){
        // Termination Case
        if(root == null){
            return ;
        }
        if(map.get(distance)==null){ // No Distance Exist
            // Create Fresh ArrayList
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.data);
            map.put(distance,list);
        }
        // else { // Distance Exist
        //     // get the old list
        //     // and add new element
        //     ArrayList<Integer> l = map.get(distance);
        //     l.add(root.data);
        //     map.put(distance, l);
        // }
        topView(root.left, distance -1 , map);
        topView(root.right, distance +1 , map);
    }

    public void printBottomView(BT_Node<Integer> root){
        TreeMap<Integer, ArrayList<Integer>> map  = new TreeMap<>();
        verticalOrder(root, 0, map);
        for(Map.Entry<Integer, ArrayList<Integer>> m: map.entrySet() ){
            ArrayList<Integer> l = m.getValue();
            System.out.println(l.get(l.size()-1));
        }

    }
    
    
    boolean search(BT_Node<Integer> root, int searchElement, ArrayList<BT_Node<Integer>> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == searchElement){
            return true;
        }
        if(search(root.left, searchElement,path ) || search(root.right, searchElement,path ) ){
            return true;
        }
        return false;
    }
    BT_Node<Integer> lca(BT_Node<Integer> root, int n1 , int n2){
        ArrayList<BT_Node<Integer>> path1 = new ArrayList<>();
        ArrayList<BT_Node<Integer>> path2 = new ArrayList<>();
        if(!search(root, n1, path1) || !search(root, n2, path2)){
            return null;
        }
        

       for(int i = path1.size()-1;i>=0; i--){
        for(int j = path2.size()-1; j>=0; j--){
            if(path1.get(i).data == path2.get(j).data){
                System.out.println("LCA "+path1.get(i).data);
                return path1.get(i);
            }
        }
       }
       return null;
    }
    
    boolean isChildrenSum(BT_Node<Integer> root) {
    	if(root == null)return true;
    	if(root.left==null && root.right==null)return true;
    	int sum = 0;
    	if(root.left!=null)sum+=root.left.data;
    	if(root.right!=null)sum+=root.right.data;
    	return (root.data == sum && isChildrenSum(root.left) && isChildrenSum(root.right));	
    }
    
}
public class BinaryTree {

	public static void main(String[] args) {
		BT_Operations opr = new BT_Operations();
	      Scanner scanner = new Scanner(System.in);
	      BT_Node<Integer> root = null;
	      while(true){
	      System.out.println("\nBinary Tree Operations ");
	      System.out.println("1.Insert, 2.Print, 3.PreOrder Traversal(recursive), 4.PreOrder Traversal(Iterative), 5.PreOrder Traversal(Iterative2),"
	      		+ " 6.Inorder Traversal(recursive)\n7.Inorder Traversal(Iterative), 8.PostOrder Traversal(recursive), 9.LCA,"
	      		+ " 10.Level Order traversal, 11. Level Order Optimized, 12.Height\n13.Node Count, 14.Left View(rec), 15.Left View(Itr),"
	      		+ " 16.Right View(rec), 17.Right View(Itr), 18.Vertical Oreder Traversal\n19.Children sum Tree, 20.Top View, 21.Bottom View, 22.Search, 23.Exit");
	      System.out.println("Enter the Choice");
	      int choice = scanner.nextInt();
	      
	      switch(choice){
	        case 1:
	        	root = opr.insert();
	        break;
	        case 2: 
	        	opr.print(root);
	        break;  
	        case 3:
	        	opr.preOrder(root);
	        	break;
	        case 4:
	        	opr.preOrderItr(root);
	        	break;
	        case 5: 
	        	opr.preOrderItr2(root);
	        break;  
	        case 6:
	        	opr.inOrder(root);
	        	break;
	        case 7:
	        	opr.inOrderItr(root);
	        	break;
	        case 8:
	        	opr.postOrder(root);
	        	break;
	        case 9:
	        	BT_Node<Integer> node = opr.lca(root,30,40);
	        	System.out.println(node.data);
	        	break;
	        case 10:
	        	opr.levelOrder(root);
	        	break;
	        case 11:
	        	opr.levelOrder2(root);
	        case 12:
	        	System.out.println(opr.height(root));
	        	break;
	        case 13:
	        	System.out.println(opr.countNodes(root));
	        	break;
	        case 14:
	        	opr.printLeftView(root, 1);
	        	break;
	        case 15:
	        	opr.printLeftViewItr(root);
	        	break;
	        case 16:
	        	opr.printRightView(root, 1);
	        	break;
	        case 17:
	        	opr.printRightViewItr(root);
	        	break;
	        case 18:
	        	opr.printVerticalOrder(root);
	        	break;
	        case 19:
	        	System.out.println(opr.isChildrenSum(root)?"Yes":"No");
	        	break;
	        case 20:
	        	opr.printTopView(root);
	        	break;
	        case 21:
	        	opr.printBottomView(root);
	        	break;
	        case 22:
	        	ArrayList<BT_Node<Integer>> l = new ArrayList<>();
	        	opr.search(root, 20, l);
	        	System.out.println(l);
	        	break;
	        case 23:
	        	return ;  
	      }
	      
	    }
	}

}

