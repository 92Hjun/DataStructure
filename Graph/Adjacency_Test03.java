package graphExample;

import java.util.Scanner;

public class Adjacency_Test03 {
	
	static int nV;
	static int nE;
	
	public static void main(String[] args) { // 단방향 인접 행렬 / 양방향인접 행렬
		
		Scanner sc = new Scanner(System.in);
		
		nV = sc.nextInt();
		nE = sc.nextInt();
		
		int[][] arr = new int[nV +1][nV +1]; // vertex의 이름을 그대로 사용하기 위함.
		
		for (int i=0; i<nE; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			arr[v1][v2] = arr[v2][v1] = 1; // 1대신 가중치를 넣으면 가중치 그래프이다.
		}
		
		
	}
	
}
