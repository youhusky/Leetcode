public class RandomizedSet {

    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    Random rnd = new Random();

    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }
        
        map.put(val, list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }
        
        int idx = map.remove(val);
        int last = list.remove(list.size() - 1);
        if(val != last) {
            list.set(idx, last);
            map.put(last, idx);
        }
        return true;
    }
    
    public int getRandom() {
        return list.get(rnd.nextInt(list.size()));
    }
}