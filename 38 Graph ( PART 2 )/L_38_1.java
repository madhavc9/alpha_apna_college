package lecture;
import java.util.*;
public class L_38_1 {

	static class Edge{
		int src;
		int dest;
		
		public Edge(int s,int d) {
			this.src=s;
			this.dest=d; 
		}
	}
	public static void bfs(ArrayList<Edge>[] graph) {
		boolean vis[]=new boolean[graph.length];
		for(int i=0;i<graph.length;i++) {
			if(!vis[i]) {
				bfsUtil(graph,vis);
			}
		}
	}
	
	public static void bfsUtil(ArrayList<Edge>[] graph,boolean vis[]) {
		Queue<Integer> q=new LinkedList<>();
		boolean vis2[]=new boolean[graph.length];
		q.add(0);
		
		while(!q.isEmpty()) {
			int curr=q.remove(); 
			if(!vis[curr]) {
				System.out.print(curr+" ");
				vis[curr]=true;
				for(int i=0;i<graph[curr].size();i++) {
					Edge e=graph[curr].get(i);
					q.add(e.dest);
				}
			} 
		}
	}
	
	public static void dfs (ArrayList<Edge>[]graph) {
		boolean vis[]=new boolean[graph.length];
		for(int i=0;i<graph.length;i++) {
			dfsUtil(graph,i,vis);
		}
	}
	
	public static void dfsUtil (ArrayList<Edge>[]graph,int curr,boolean vis[]){
		System.out.print(curr+" ");
		vis[curr]=true;
		
		for(int i=0;i<graph[curr].size();i++) {
			Edge e=graph[curr].get(i);
			if(!vis[e.dest]) {
				dfsUtil(graph,e.dest,vis);
			}
		}
	}
	
	public static void main(String[] args) {
	

	}

}
