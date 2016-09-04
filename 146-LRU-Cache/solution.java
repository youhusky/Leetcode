class LRUCache {
    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;
    int capacity;
    
    public LRUCache(int capacity) {
        map = new HashMap<Integer, Integer>(capacity);
        list = new ArrayList<Integer>(capacity);
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if (map.get(key) == null) return -1;
        list.remove(new Integer(key)); 
        list.add(key);
        return map.get(key);
    }
    
    public void set(int key, int value) {
    	if (map.get(key) != null) {//原来存在key
    		map.put(key, value);
    		list.remove(new Integer(key)); 
            list.add(key);
    	} else {//原来不存在key
    		if (map.size() < capacity) {//容量不满
    			map.put(key, value);
    			list.add(key);
    		} else {//容量满
    			int leastkey = list.remove(0);
                list.add(key);
                map.remove(leastkey);
                map.put(key, value);
    		}
    	}
    }
}