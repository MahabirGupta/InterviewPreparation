package GraphAlgorithms;

import java.util.*;

public class BreadthFirstSearch {

    public static void main(String[] args) {

        int start = 1;
        Map<Integer,List<Integer>> adjList = new HashMap<>();
        adjList.put(1, Collections.singletonList(5));
        adjList.put(2, Collections.singletonList(8));
        adjList.put(3, Collections.singletonList(6));
        BFS(start,adjList);



    }

    // Example: BFS in a Graph
   public static void BFS(int start, Map<Integer, List<Integer>> adjList) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(start);
        visited.add(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbor : adjList.get(node)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

}
