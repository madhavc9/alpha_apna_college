// CYCLE DETECTION , Undirected Graph using DFS 

package lecture;
import java.util.*;
public class L_38_2 {

	static class Edge{
		int src;
		int dest;
		
		public Edge(int s,int d) {
			this.src=s;
			this.dest=d; 
		}
	}
	
	static void createGraph(ArrayList<Edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<>();
		}
		
		// 0 Vertex
		graph[0].add(new Edge(0,1));
		graph[0].add(new Edge(0,2));
		graph[0].add(new Edge(0,3));
		
		// 1 Vertex
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,2));
		
		// 2 Vertex
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,1));	
		
		// 3 Vertex
		graph[3].add(new Edge(3,0));
		graph[3].add(new Edge(3,4));
		
		// 4 Vertex
		graph[4].add(new Edge(4,3));
	}
	
	public static boolean detectCycle(ArrayList<Edge>[] graph) {
		boolean vis[]=new boolean[graph.length];
		// loop isliye ki alag alag components ko check krne k liye 
		for(int i=0;i<graph.length;i++) { 
			if(!vis[i]) {
				if(detectCycleUtil(graph,vis,i,-1)) {
					return true;
					// cycle exists in one of the part
				}
			}
		}
		return false;
	}
	
	public static boolean detectCycleUtil(ArrayList<Edge>[] graph,boolean vis[],int curr,int par ) {
		vis[curr]=true;
		for(int i=0;i<graph[curr].size();i++) {
			Edge e=graph[curr].get(i);
			// case 3 ie .. neighbour not visited but after visiting returns true that visited 
			if(!vis[e.dest]) {
				if(detectCycleUtil(graph,vis,e.dest,curr)) {
					return true;
				}
			}
				// case 1 
				// ie visited hai and parent bhi nahi hai 
				else if(vis[e.dest]&&e.dest!=par) {
					return true;
				}
				// case2
				// do nothing -> loop automatically chalta rhega
			}
		return false;
	}
	public static void main(String[] args) {
		 int V=5;
		 ArrayList<Edge> graph[]=new ArrayList[V];
		 createGraph(graph);
		 System.out.println(detectCycle(graph));

	}

}
