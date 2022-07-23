## Deq(Double-ended Queue, 덱)
<a href="http://melonicedlatte.com/">
    <img src="https://img.shields.io/badge/DataStructure-red"
        style="height : auto; margin-left : 8px; margin-right : 8px;"/>
        <img src="https://img.shields.io/badge/linear-orange"
        style="height : auto; margin-left : 8px; margin-right : 8px;"/>
        <img src="https://img.shields.io/badge/dequeue-yellow"
        style="height : auto; margin-left : 8px; margin-right : 8px;"/>
</a>

### 1. Deq이란?
선형 구조의 덱은 양방향 큐로 불리는데, 양쪽 끝에서 삽입과 삭제가 모두 가능한 자료구조이다.  
스택의 큐의 장점을 모두 갖추고 있는데, 주로 스케줄링과 같은 `우선순위의 결정`이 매번 바뀌는 작업에 사용된다.

### 2. 특징
* `선입 선출`과 `후입 선출`이 모두 가능하다. FIFO(First-In, First-Out), LIFO(Last-In, First-Out)
* `위치 연산자` 두 개를 양 끝에 두고 각각 큐와 스택의 기능으로 사용한다.  
  가장 최근 삽입된 데이터의 메모리 위치를 표시하며, 해당 영역은 각각 삽입과 삭제 연산만 수행한다.
* 구현이 어렵지만 삽입과 삭제의 `속도`가 매우 빠르며, `삭제 결정`이 매번 바뀔 때 마다 사용한다. 
* `Random Access`(임의 원소 선택)이 가능하다.

### 3. 동작 원리
<img width="1056" alt="deq" src="https://user-images.githubusercontent.com/78818063/147883025-4acb96e9-9dd3-4b51-9563-63fc7e456871.png">

`enqueue at front '1'` 데이터 1을 오른쪽으로 삽입한다. front와 rear는 모두 원소 1을 가리킨다.  
`enqueue at front '2'` 데이터 2를 오른쪽으로 삽입한다. front는 2, rear는 1을 가리킨다.  
`enqueue at end '3'` 데이터 3을 왼쪽으로 삽입한다. front는 2, rear는 3을 가리킨다.  
`enqueue at end '4'` 데이터 4를 왼쪽으로 삽입한다. front는 2, rear는 4를 가리킨다.  
`dequeue at front : 2` 오른쪽에서 데이터 '2'를 꺼낸다. front는 1, rear는 4를 가리킨다.  
`dequeue at end : 4` 왼쪽에서 데이터 '4'를 꺼낸다. front는 2, rear는 3을 가리킨다.

### 4. 활용 예시
* 순번 처리 작업(프린터 인쇄, 대기열 업무 등)
* 우선순위 스케줄링  
* 데이터 버퍼 역할(패킷, 스레드, 프로세스 통신 등)

### 5. 시간복잡도
* 삽입과 삭제는 O(1), 검색은 O(N)의 시간 복잡도를 가진다.
* 우선순위의 결정이 바뀔 때 삭제 위치를 조정하면 스택과 큐를 사용하는 것 보다 효율적일 떄가 많다.
