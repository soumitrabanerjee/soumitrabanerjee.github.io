import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    int height;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
        height = 1;
    }
}

public class abs{
        Node root;

        public int max(int a, int b){
            return a>b?a:b;
        }

        public int height(Node node){
            if(node==null){
                return 0;
            }
            return node.height;
        }

        public int getBalance(Node node){
            if(node==null)
                return 0;
            return (height(node.left)-height(root.right));
        }

        public Node rotateLeft(Node root){

        }
        public Node insert(int data, Node root){
            if(root==null){
                return new Node(data);
            }
            else if(root.data < data){
                root.right = insert(data, root.right);
            }
            else if(root.data > data){
                root.left = insert(data, root.left);
            }

            root.height = 1 + max(height(root.left), height(root.right));

            int balanceFactor = getBalance(root);
            
            if(balanceFactor > 1 && )
            return root;
        }

        void printTree(Node root){
            if(root==null){
                return;
            }
            printTree(root.left);
            System.out.println(root.data);
            printTree(root.right);
        }
        public static void main(String[] args){
            abs tree = new abs();
            tree.root = null;
            int[] arr = {45,8,29,45,87,89,342,897,1};
            for(int val : arr){
                tree.root = tree.insert(val, tree.root);
            }
            tree.printTree(tree.root);          
    }
}