public class Solution {  
    public boolean canFinish(int numCourses, int[][] prerequisites) {  
        // init the adjacency list  
        List<Set> posts = new ArrayList<Set>();  
        for (int i = 0; i < numCourses; i++) {  
            posts.add(new HashSet<Integer>());  
        }  
          
        // fill the adjacency list  
        for (int i = 0; i < prerequisites.length; i++) {  
            posts.get(prerequisites[i][1]).add(prerequisites[i][0]);  
        }  
          
        // count the pre-courses  
        int[] preNums = new int[numCourses];  
        for (int i = 0; i < numCourses; i++) {  
            Set set = posts.get(i);  
            Iterator<Integer> it = set.iterator();  
            while (it.hasNext()) {  
                preNums[it.next()]++;  
            }  
        }  
          
        // remove a non-pre course each time  
        for (int i = 0; i < numCourses; i++) {  
            // find a non-pre course  
            int j = 0;  
            for ( ; j < numCourses; j++) {  
                if (preNums[j] == 0) break;  
            }  
              
            // if not find a non-pre course  
            if (j == numCourses) return false;  
              
            preNums[j] = -1;  
              
            // decrease courses that post the course  
            Set set = posts.get(j);  
            Iterator<Integer> it = set.iterator();  
            while (it.hasNext()) {  
                preNums[it.next()]--;  
            }  
        }  
          
        return true;  
    }  
}  