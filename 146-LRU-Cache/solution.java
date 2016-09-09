public class LRUCache {
    class Node{
        Integer key,value;
        Node prev, next;
        Node(Integer key, Integer value){
            this.key = key;
            this.value = value;
            prev = null;
            next = null;
        }
    }
    
    private HashMap<Integer, Node> map;
    private int capacity;
    private Node head;
    private Node tail;
    
    public LRUCache(int capacity) {
        //init
        map = new HashMap();
        this.capacity = capacity;
        head = new Node(null,null);
        tail = new Node(null,null);
        head.next = tail;
        head.prev = tail;
        tail.next = head;
        tail.prev = head;
    }
    
    void detach(Node node){
        //move point
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.prev = null;
        node.next = null;
        
    }
    
    void attach(Node node){
        node.next = tail;
        node.prev = tail.prev;
        tail.prev.next = node;
        tail.prev = node;
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if (node != null){
            detach(node);
            attach(node);
        }
        return node == null? -1: node.value;
    }
    
    public void set(int key, int value) {
        Node node = map.get(key);
        if (node == null){
            //new node
            if (map.size() == capacity){
                //delete twice
                map.remove(head.next.key);
                detach(head.next);
            }
            node = new Node(key, value);
            map.put(key, node);
            attach(node);
        }else{
            node.value = value;
            detach(node);
            attach(node);
        }
    }
}