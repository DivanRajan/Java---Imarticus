package Graph;

import java.util.Arrays;

public class PGraph {
public void Prim(int G[][],int v) {
	int INF=9999999;
	int no_edge;
	boolean[]selected=new boolean[v];
	Arrays.fill(selected, false);
	no_edge=0;
	selected[0]=true;
	System.out.println("edge:weight");
	while(no_edge<v-1) {
		int min=INF;
		int x=0;
		int y=0;
		for(int i=0;i<v;i++) {
			if(selected[i]==true) {
				for(int j=0;j<v;j++) {
					if(!selected[j]&&G[i][j]!=0) {
						if(min>G[i][j]) {
							min=G[i][j];
							x=i;
							y=j;
						}
					}
				}
			}
		 }
		System.out.println(x+"-"+y+":"+G[x][y]);
		no_edge++;
		}
	}
	public static void main(String[]args) {
		PGraph g=new PGraph();
		int v=5;
		int[][]G= {  {0,9,75,0,0},
				     {9,0,95,19,42},
				     {75,95,0,51,66},
				     {0,19,51,0,31},
				     {0,42,66,31,0}		};
		g.Prim(G, v);
	}
}
