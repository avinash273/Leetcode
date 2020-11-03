package Amazon;

import java.util.Stack;

/**
 * T: O(V + E)
 * S: O(V + E)
 */
public class CourseSchedule {
    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            int[] inDegree = new int[numCourses];
            int count = 0;
            //topological sort or Kahn's Algorithm
            //Step1: Get Indegree
            for (int i = 0; i < prerequisites.length; i++)
                inDegree[prerequisites[i][0]]++;

            //Step2: push all nodes with indegree zero into a stack
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < numCourses; i++)
                if (inDegree[i] == 0) stack.push(i);

            //Step3: loop until stack is empty and pop it. Add new zero indegree nodes
            while (!stack.isEmpty()) {
                int currCourse = stack.pop();
                count++;

                //Step4: decrement inDegree when u find dependent course
                for (int i = 0; i < prerequisites.length; i++) {
                    if (prerequisites[i][1] == currCourse) {
                        inDegree[prerequisites[i][0]]--;
                        if (inDegree[prerequisites[i][0]] == 0)
                            stack.push(prerequisites[i][0]);
                    }
                }
            }
            //step5: count must be equal to numCourses
            return count == numCourses;

        }
    }

}
