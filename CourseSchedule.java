class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites == null){
            return true;
        }
        int[][] mat = new int[numCourses][numCourses];
        int[] degrees = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++){
            int ready = prerequisites[i][0];
            int pre = prerequisites[i][1];
            if(mat[pre][ready] == 0){
                degrees[ready]++;
            }
            mat[pre][ready] = 1;
        }
        // BFS
        int count = 0;
        Queue<Integer> queue = new LinkedList();
        for (int i = 0; i < degrees.length; i++){
            if(degrees[i] == 0){   // start point
                queue.offer(i);
            }
        }
        
        while(!queue.isEmpty()){
            int course = queue.poll();
            count++;
            for (int i = 0; i < numCourses; i++){
                if( mat[course][i] != 0){
                    if(--degrees[i] == 0){
                        queue.offer(i);
                    }
                }
            }
        }
        
        return count == numCourses;
        
    }
    
}