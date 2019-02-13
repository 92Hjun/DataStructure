package graphExample;

import java.util.ArrayList;
import java.util.Scanner;

class Edge <W,V> {		// Edge를 하나의 클래스로 표현하여 입력 받음
	private W weight;	// Edge에 부여된 가중치
	private V v;		// Edge 끝 부분에 있는 vertex의 번호
	
	public void set_Edge(W weight, V v) {	// Edge에 값 setting하는 함수
		this.weight = weight;
		this.v = v;
	}
}

public class Adjacency_Test02 {	// 가중치 인접 리스트 코드 구현
	
	static int nV;	// 정점 (node, vertex)
	static int nE;	// 간선 (edge)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Adjacency_Test02 test02 = new Adjacency_Test02();
		
		nV = sc.nextInt();	// 전체 vertex의 갯수를 정한다
		nE = sc.nextInt();	// 전체 edge의 갯수를 정한다
		
		ArrayList<Edge> arrList = new ArrayList<Edge>();
		
		Edge<Integer, Integer> edge = new Edge<Integer, Integer>();
		
		for (int i=0; i<nV;i++) {
			arrList.add(new Edge<Integer, Integer>());
		}
		
		for (int i=0; i<nE; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int w = sc.nextInt();
			
			arrList.get(v1).set_Edge(v2, w);
			arrList.get(v2).set_Edge(v1, w);
			
		}
		
		
		
	}
	
}
