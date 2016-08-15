public class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
    //check for the single node situation
    List<Integer> queue = new LinkedList<Integer>();
    if (n < 2) {
        queue.add(0);
        return queue;
    }
    //initiate map, indegree, and queue
    int count = n;
    int[] indegree = new int[n];
    Map<Integer, HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>();
    for (int i = 0; i < count; i++) {
        map.put(i, new HashSet<Integer>());
    }
    for (int[] edge: edges) {
        map.get(edge[0]).add(edge[1]);
        map.get(edge[1]).add(edge[0]);
        indegree[edge[0]]++;
        indegree[edge[1]]++;
    }
    for (int i = 0; i < count; i++){
        if (indegree[i] == 1)
            queue.add(i);
    }
    //check from the outer layer to inner layer, stop when count == 1 or 2
    //which means we arrive at the center
    while (count > 2) {
        List<Integer> newqueue = new LinkedList<Integer>();
        for (int cur: queue) {
            count--;
            for (int next: map.get(cur)) {
                map.get(next).remove(cur);
                if (--indegree[next] == 1)
                    newqueue.add(next);
            }
        }
        queue = newqueue;
    }
    return queue;
}
}