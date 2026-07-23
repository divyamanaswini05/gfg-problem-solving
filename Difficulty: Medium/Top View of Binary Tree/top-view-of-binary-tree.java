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
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)return res;
        
        Queue <Node> q = new LinkedList<>();
        Queue<Integer> hdq = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>(); //ordered hashmap
        
        q.add(root);
        hdq.add(0);
        
        while(!q.isEmpty()){
            Node curr = q.poll();
            int hd = hdq.poll();
            if(!map.containsKey(hd)){
                map.put(hd, curr.data);
            }
            if(curr.left != null){
                q.offer(curr.left);
                hdq.offer(hd-1);
                
            }
            if(curr.right != null){
                q.offer(curr.right);
                hdq.offer(hd+1);
                
            }
        }
        for(int val:map.values()){
            res.add(val);
        }
        return res;
    }
}