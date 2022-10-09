/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        
        List<List<Integer>> list = new ArrayList<>();
        
        if(root == null) return list;
        queue.add(root);
        List<Integer> listTemp = new ArrayList();
        
        while(queue.size() != 0){
            int size = queue.size();
            listTemp = new ArrayList();
            
            while(size-- != 0){
                Node rem = queue.remove();
                listTemp.add(rem.val);
                
                for(Node child : rem.children){
                    queue.add(child);
                }
            }
            
            list.add(listTemp);
        }
        
        return list;
    }
}
