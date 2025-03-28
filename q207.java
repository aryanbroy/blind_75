import java.util.*;

public class q207 {
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = { { 1, 0 } };
        boolean res = canFinish(numCourses, prerequisites);
        System.out.println(res);
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        int max = numCourses;
        int[] inDegree = new int[max];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][0];
            int pre = prerequisites[i][1];

            adj.get(pre).add(course);
            inDegree[course]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                q.offer(i);
            }
        }

        List<Integer> topo = new ArrayList<>();

        while (!q.isEmpty()) {
            int num = q.peek();
            q.remove();
            topo.add(num);

            for (int neighbor : adj.get(num)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    q.offer(neighbor);
                }
            }
        }

        return topo.size() == numCourses;
    }
}