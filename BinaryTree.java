import java.util.*;
    public class BinaryTree
    {
        class BTNode
        {    
            BTNode left, right;
            int data;
             /* Constructor */
            public BTNode()
            {
                left = null;
                right = null;
                data = 0;
            }
            public BTNode(int n)
            {
                left = null;
                right = null;
                data = n;
            }
            /* Function to set left node */
            public void setLeft(BTNode n)
            {
                left = n;
            }
            /* Function to set right node */ 
            public void setRight(BTNode n)
            {
                right = n;
            }
            public BTNode getLeft()
            {
                return left;
            }
            /* Function to get right node */
            public BTNode getRight()
            {
                return right;
            }
            /* Function to set data to node */
            public void setData(int d)
            {
                data = d;
            }
            /* Function to get data from node */
            public int getData()
            {
                return data;
            }     
        }
        class BT
    {
        public BTNode root;
        /* Constructor */
        public BT()
        {
            root = null;
        }
        public boolean isEmpty()
        {
            return root == null;
        }
        /* Functions to insert data */
        public void insert(int data)
        {
            root = insert(root, data);
        }
        public BTNode insert(BTNode node, int data)
        {
            if (node == null)
                node = new BTNode(data);
            else
            {
                if (node.getRight() == null)
                    node.right = insert(node.right, data);
                else
                    node.left = insert(node.left, data);             
            }
            return node;
        }
        public String search(int nextInt) {
            return null;
        }
        public String countNodes() {
            return null;
        }
        public void postorder() {
        }
}
         public static void main(String[] args)
        {            
            try (Scanner scan = new Scanner(System.in)) {
                BT bt = BT(); 
                /*  Perform tree operations  */
                System.out.println("Binary Tree Test\n");
                char ch;        
                do    
                {
                    System.out.println("\nBinary Tree Operations\n");
                    System.out.println("1. insert ");
                    System.out.println("2. search");
                    System.out.println("3. count nodes");
                    System.out.println("4. check empty");
                    int choice = scan.nextInt();            
                    switch (choice)
                    {
                    case 1 : 
                        System.out.println("Enter integer element to insert");
                        bt.insert( scan.nextInt() );                     
                        break;
                    case 2 : 
                        System.out.println("Enter integer element to search");
                        System.out.println("Search result : "+ bt.search( scan.nextInt() ));
                        break;                                          
                    case 3 : 
                        System.out.println("Nodes = "+ bt.countNodes());
                        break;     
                    case 4 : 
                        System.out.println("Empty status = "+ bt.isEmpty());
                        break;            
                    default : 
                        System.out.println("Wrong Entry \n ");
                        break;   
                    }
                /*  Display tree  */ 
                System.out.print("\nPost order : ");
                bt.postorder();
                System.out.print("\nPre order : ");
                bt.postorder();
                System.out.print("\nIn order : ");
                bt.postorder();
                System.out.println("\n\nDo you want to continue (Type y or n) \n");
                ch = scan.next().charAt(0);                        
      } while (ch == 'Y'|| ch == 'y');
            }               
    }
}

            
                          

