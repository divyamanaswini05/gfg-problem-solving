/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        Node pred = null;
        Node succ = null;
        Node curr = root;
        while(curr!=null){
            if(curr.data == key){
                // pred: rightmost node in the left subtree.
                if(curr.left!=null){
                    Node temp = curr.left;
                    while(temp.right!=null){
                        temp= temp.right;
                    }
                    pred= temp;
                }
                // succ: leftmost node in the right sybtree
                if(curr.right!=null){
                    Node temp = curr.right;
                    while(temp.left!= null){
                        temp = temp.left;
                    }
                    succ = temp;
                }
                break;
            }
            else if(curr.data>key){ // go left
                succ = curr;
                curr = curr.left;
            }
            else{ // go right
                pred = curr;
                curr =curr.right;
                
            }
        }
        ArrayList<Node> res = new ArrayList<>();
        res.add(pred);
        res.add(succ);
        return res;
        
        
        
        
        
        
        
        
    
    //     ArrayList<Node> inorderlist = new ArrayList<>();
    //     inorder(root,inorderlist);
    //     Node pred=null;
    //     Node succ = null;
    //     for(int i=0;i<inorderlist.size();i++){
    //         if(inorderlist.get(i).data<key){
    //             pred = inorderlist.get.data(i);
    //         }
    //         if(inorderlist.get(i).data>key && succ==null){
    //             succ=inorderlist.get.data(i);
    //         }
    //     }
    //     ArrayList<Node> res= new ArrayList<>();
    //     res.add(pred);
    //     res.add(succ);
    //     return res;
        
    // }
    
    // private void inorder(node root,ArrayList<Node>list){
    //     if(node == null){
    //         return;
    //     }
    //     inorder(node.left,inorderlist);
    //     inorderlist.add(node);
    //     inorder(node.right,inorderlist);
    }
}

