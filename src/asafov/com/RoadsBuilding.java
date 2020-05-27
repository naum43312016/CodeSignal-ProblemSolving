package asafov.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoadsBuilding {

    static void addEdge(ArrayList<ArrayList<Integer>> adj,
                        int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex" + i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> "+adj.get(i).get(j));
            }
            System.out.println();
        }
    }


    static int[][] roadsBuilding(int cities, int[][] roads) {
        if (cities<2) return new int[0][0];
        // Creating a graph with 5 vertices
        int V = cities;
        ArrayList<ArrayList<Integer> > adj
                = new ArrayList<ArrayList<Integer> >(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        // Adding edges one by one
        for (int[] road : roads){
            addEdge(adj, road[0], road[1]);
        }
        List<int[]> list = new ArrayList<>();
        for (int i=0;i<adj.size();i++){
            List<Integer> ver = adj.get(i);
            int j=0;
            while (j<cities){
                if (!ver.contains(j) && j!=i){
                    addEdge(adj,i,j);
                    int[] newRoad = new int[2];
                    newRoad[0]=i;
                    newRoad[1]=j;
                    list.add(newRoad);
                }
                j++;
            }
        }
        int[][] ans = new int[list.size()][2];
        int k=0;
        for (int[] l : list){
            ans[k]=l;
            k++;
        }
        //printGraph(adj);
        return ans;
    }
    public static void main(String[] args) {
        int cities=4;
        int[][] arr = {
                {0, 1}, {1, 2}, {2, 0}
        };
        int[][] ans = roadsBuilding(cities,arr);
        for (int[] a : ans){
            System.out.println(Arrays.toString(a));
        }
    }
}
