package Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class CyclicGraph {
	private final int v;
	private final List<List<Integer>>adj;
	public CyclicGraph(int v) {
		this.v=v;
		adj=new ArrayList<>(v);
		for(int i=0;i<v;i++) {
			adj.add(new LinkedList<>());
		}
		}
		private boolean isCyclicutil(int i,boolean[] visited,boolean[] recStack) {
			if(recStack[i])
				return true;
			if(visited[i])
				return false;
			visited[i]=true;
			recStack[i]=true;
			List<Integer>children=adj.get(i);
			for(Integer c: children) {
				if(isCyclicutil(c,visited,recStack))
					return true;
		}
			recStack[i]=false;
			return false;
		}
private void addEdge(int source,int dest) {
	adj.get(source).add(dest);
	
}
private boolean isCyclic() {
	boolean[]visited =new boolean[v];
	boolean[]recStack=new boolean[v];
	for(int i=0;i<v;i++) 
		if(isCyclicutil(i,visited,recStack))
			return true;
		
		return false;
	}
	public static void main(String[] args) {
		CyclicGraph graph=new CyclicGraph(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		if(graph.isCyclic())
			System.out.println("graph contains cycles");
		else
			System.out.println("graph doesn't contains cycle");
		
	}

}
