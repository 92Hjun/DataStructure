package hashExample;

public class Hash {		// Chaining 충돌 방지 방법.
	
	// 데이터를 저장할 Entry는 값과 다음 Entry를 가진다.
	private class Entry{
		private int value;
		private Entry next;
	}
	
	private int size;
	private Entry[] hTable;
	
	public Hash(int size) {															// Hash Table은 size와 배열 테이블을 생성한다.
		this.size = size;
		this.hTable = new Entry[size];
	}
	
	public int hashMethod(int key) {												// key 값으로 HashTable에 저장될 index를 반환한다.
		return key % size;
	}

	public int getKey(int data) {													// 저장될 데이터로 key를 추출한다.	 실제 Hash 에는 특별한 알고리즘이 적용되 hashCode를 얻는다.
		return data;
	}

	public int add(int data) {														// data를 HashTable에 저장한다.
		int key = getKey(data);														// data의 hashCode를 key와 저장할 index를 얻는다.
		int hashValue = this.hashMethod(key);

		Entry entry = new Entry();													// 저장할 Entry 생성
		entry.value = data;

		if (hTable[hashValue] == null) {											// HashTable에 저장할 index가 비어있다면, 저장하고 끝낸다.
			hTable[hashValue] = entry;
			return 0;
		}
		
		Entry pre = null;
		Entry cur = hTable[hashValue];

		while(true) {																	// 해당 index의 연결리스트는 값의 크기가 작은 값 부터 큰 순서로 정렬 되어있다.
			if(cur == null) {															// Hash Table에 저장 할 index가 비어있으면
				hTable[hashValue] = entry; 										// 해당 index에 저장
				return 0;
			}else if (cur.value < key) { 												// 해당 index의 커서 노드의 값이 key보다 작으면
				pre = cur;																// 커서를 하나 뒤로 옮긴다.
				cur = cur.next;
			}else {																		// 첫번째 노드가 아니면
				entry.next = cur;														// 삽입 노드의 다음 노드로 커서노드를 지정하고
				pre.next = entry;														// 전 노드의 다음 노드를 삽입노드로 지정한다.
				return 0;
			}
		}
	}
	
	public  int get(int data) {														// data가 있는 위치를 얻는다.
		int key = getKey(data);
		int hashValue = hashMethod(key);
		
		Entry cur = hTable[hashValue];
		
		while(true) {
			if(cur == null) {															// index가 비어있다면 -1 반환
				return -1;
			}else if (cur.value == key) {											// 커서의 값과 키가 같으면 0 반환
				return hashValue;
			}else if (cur.value > key) {												// 커서의 값이 키보다 크면 -1 반환
				return -1;
			}else if(cur.value < key) {												// 커서의 값이 키보다 작으면 다음 노드로 커서 이동
				cur = cur.next;
			}
		}
	}
	
	public Entry getEntry(int data) {												// data가 있는 노드를 반환한다.
		int key = getKey(data);														// data에 매칭되는 key값 노드 반환
		int hashValue = hashMethod(key);										// key에 매치외는 hashValue값 반환
		
		Entry pre = hTable[hashValue];											// HashTable의 index 첫번째노드와 두번째 노드
		Entry cur = pre.next;
		
		while(true) {
			
			if(cur == null) {															// 커서 노드가 null 이면 null 반환
				return null;
			}else if (cur.value == key) {											// 커서 노드의 값이 키와 같으면 전 노드를 반환
				return pre;
			}else if (cur.value > key) {												// 커서 노드의 값이 키보다 크면 null 반환 
				return null;
			}else if (cur.value < key) {												// 커서 노드의 값이 키보다 작으면 다음으로 이동
				pre = cur;
				cur = cur.next;
			}
			
		}
	}
	
	public int remove(int data) {													// data를 제거
		Entry pre = null;
		
		if((pre = getEntry(data)) == null) {										// data가 있는 노드의 전 노드를 가져오고 null이면 -1 반환
			return -1;
		}
		
		Entry cur = pre.next;															// 전 노드가 data의 다음노드를 가리키게 하고 data 노드를 건너뛰게 연결한다 (제거)
		pre.next = cur.next;
		return 0;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		Entry cur = null;
		
		for (int i = 0; i < size; i ++) {
			result.append(" [" + i + "]\t");
			cur = hTable[i];
			
			if(cur == null) {
				result.append("n ");
			}else {
				
				while(cur != null) {
					result.append(cur.value + "");
					cur = cur.next;
				}
			}
			result.append(" \n");
		}
		return result.toString();
	}
	
	
}
