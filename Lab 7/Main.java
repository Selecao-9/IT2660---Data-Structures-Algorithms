class Main {
  public static void main(String[] args) {
    String[] vertices = {"Liberal Arts", "Student Services", "Health Careers & Sciences", "Health Technologies Center", "Recreation Center", "Technology Learning Center", "Business & Technology", "Theatre"};

    int[][] edges = {
      {0,1},
      {0,7},
      {0,6},
      {1,0},
      {1,2},
      {1,4},
      {1,5},
      {1,6},
      {2,1},
      {2,3},
      {2,4},
      {3,2},
      {4,1},
      {4,2},
      {5,1},
      {6,1},
      {6,0},
      {6,7},
      {7,0},
      {7,1},
      {7,6}
    };

    Graph<String> graph = new UnweightedGraph<>(vertices, edges);
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(graph.getIndex("Business & Technology")); // Get a dfs starting at the Business and Technology Building. Change this if you called it something different in your vertices!

    java.util.List<Integer> searchOrders = dfs.getSearchOrder();
    System.out.println(dfs.getNumberOfVerticesFound() + " vertices are searched in this DFS order:");
    for (int i = 0; i < searchOrders.size(); i++)
      System.out.print(graph.getVertex(searchOrders.get(i)) + " ");
    System.out.println();

    for (int i = 0; i < searchOrders.size(); i++)
      if (dfs.getParent(i) != -1)
        System.out.println("parent of " + graph.getVertex(i) +
          " is " + graph.getVertex(dfs.getParent(i)));

    dfs.printPath(3);
    dfs.printPath(1);
    dfs.printPath(4);
    
  }
}