package extras;

public class BinarySearchTreeDemo {

   public static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root;

    public BinarySearchTreeDemo() {
        this.root = null;
    }

    public void insert(int data){
        root= findAndInsert(root,data);
    }



    public Node findAndInsert(Node root, int data){
        if(root==null){
            root = new Node(data);
            return root;
        }

        else if(data >= root.data){
            root.right = findAndInsert(root.right,data);
        }
        else{
            root.left = findAndInsert(root.left,data);
        }

        return root;
    }



    /*
     * Case 1:- No child
     * Case 2:- 1 child
     * case 3:- 2 child
     * */
    public void deleteANode(Node node) {
        deleteNode(this.root, node);
    }

    private Node deleteNode(Node root, Node node) {
        // check for node initially
        if (root == null) {
            return null;
        } else if (node.data < root.data) {
            // process the left sub tree
            root.left = deleteNode(root.left, node);
        } else if (node.data > root.data) {
            // process the right sub tree
            root.right = deleteNode(root.right, node);
        } else if(root.data==node.data){
            // case 3: 2 child
            if (root.left != null && root.right != null) {
                int lmax = findMaxData(root.left);
                root.data = lmax;
                root.left = deleteNode(root.left, new Node(lmax));
                return root;
            }
            //case 2: one child
            // case i-> has only left child
            else if (root.left != null) {
                return root.left;
            }
            // case ii-> has only right child
            else if (root.right != null) {
                return root.right;
            }
            //case 1:- no child
            else {
                return null;
            }
        }
        return root;
    }

    // inorder successor of given node
    public int findMaxData(Node root) {
        if (root.right != null) {
            return findMaxData(root.right);
        } else {
            return root.data;
        }
    }



    //Traversal
    public void preorder() {
        preorder(root);
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void main(String[] args) {
        BinarySearchTreeDemo bst = new BinarySearchTreeDemo();
        // call the method insert
        bst.insert(2);
        bst.insert(4);
        bst.insert(1);
        bst.insert(3);
        bst.insert(5);
        bst.preorder();
        bst.deleteANode(new Node(1));
        System.out.println("\n");
        bst.preorder();
    }

}
