package graphExample;

import java.util.ArrayList;
import java.util.Scanner;

public class Adjacency_Test01 { // 양방향 인접 리스트
	
	static int nV;	//정점 (node, vertex 갯수)
	static int nE;	//간선 (edge 갯수)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		nV = sc.nextInt();
		nE = sc.nextInt();
		
		// 인접리스트의 초기화
		ArrayList<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>();
		
		for (int i=0; i< nV; i++) {
			arrList.add(new ArrayList<Integer>());
		}
		
		for (int i=0; i < nE; i++) {
			int v1, v2;
			
			v1 = sc.nextInt();	// 정점 값 저장
			v2 = sc.nextInt();	// 정점 값 저장
			
			arrList.get(v1).add(v2);
			arrList.get(v2).add(v1);
			
		}
		
	}
	
	
}
