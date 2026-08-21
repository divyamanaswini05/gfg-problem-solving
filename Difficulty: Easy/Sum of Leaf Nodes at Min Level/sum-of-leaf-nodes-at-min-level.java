/* Structure of tree Node
class Node {
  public:
    int data;
    Node left;
    Node right;

    public Node(int x) {
        data = x;
        left = null;
        right = null;
    }
};*/
class Solution {
    public int minLeafSum(Node root) {
        // code here
        if(root == null){
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            int sum=0;
            boolean flag =false;
            for(int i=0;i<size;i++){
                Node curr = q.poll();
                if(curr.left == null && curr.right == null){
                    sum+=curr.data;
                    flag=true;
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            if (flag==true){
                return sum;
            }
        }
        return 0;
    }
}