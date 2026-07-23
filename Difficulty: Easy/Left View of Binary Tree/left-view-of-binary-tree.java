/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> res= new ArrayList<>();
        if(root==null) return res;
        Queue<Node> q=new LinkedList<>();
        q.add(root); // let q=[1, ]
    
        while(!q.isEmpty()){
            int s=q.size(); //s=1
            // traverse all nodes at that level
            for(int i=0;i<s;i++){
                Node curr=q.poll();
                if(i==0){
                    res.add(curr.data); //res=[1,]
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return res;
    }
}