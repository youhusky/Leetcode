public class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        //记录入度
        int[] indgree = new int[numCourses];
        //记录有向图的指向节点
        ArrayList[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        //写入有向图的next节点
        for (int i = 0; i < prerequisites.length; i++) {
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
            indgree[prerequisites[i][0]]++;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < indgree.length; i++){
            if(indgree[i] == 0){
                queue.add(i);
            }
        }
        int count = 0;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            res[count++] = cur;
            ArrayList<Integer> list = graph[cur];
            for (Integer tem : list) {
                indgree[tem]--;
                if (indgree[tem] == 0) {
                    queue.offer(tem);
                }
            }
        }
        return count != numCourses ? new int[0] : res;
    }
}