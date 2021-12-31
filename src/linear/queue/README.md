## Queue(큐)
<a href="http://melonicedlatte.com/">
    <img src="https://img.shields.io/badge/DataStructure-red"
        style="height : auto; margin-left : 8px; margin-right : 8px;"/>
        <img src="https://img.shields.io/badge/linear-orange"
        style="height : auto; margin-left : 8px; margin-right : 8px;"/>
        <img src="https://img.shields.io/badge/queue-yellow"
        style="height : auto; margin-left : 8px; margin-right : 8px;"/>
</a>

### 1. Queue란?
선형 구조의 일종으로 `가장 먼저 저장한 데이터`를 가장 먼저 꺼내는 자료구조다.  
단방향으로 삽입이 가능한데, 한 쪽에서 삽입과 삭제가 일어나는 스택과는 달리 삽입된 위치의 `반대 방향`에서 출력이 일어난다.  
주로 `입력된 시간 순서`에 따라 처리해야 하는 상황과 데이터를 주고 받을 때 일시적으로 저장하는 `버퍼`로 사용된다.


### 2. 특징
* `선입 선출` FIFO(First-In, First-Out)
* `위치 연산자` 두 개(`front`, `rear`)를 사용해 가장 먼저 삽입된 데이터와  
  가장 최근 삽입된 데이터의 메모리 위치를 표시하며, 해당 영역은 각각 삽입과 삭제 연산만 수행한다.
* 구현이 매우 간단하며 삽입과 삭제의 `속도`가 매우 빠르다.
* 데이터를 삽입하는 `enqueue`, 삭제하는 `dequeue`의 두 가지 연산을 주로 이용한다.

### 3. 동작 원리
<img width="922" alt="queue" src="https://user-images.githubusercontent.com/78818063/147838038-70efc5e1-302d-4b4e-8214-32bae990d196.png">

`enqueue '1'` 데이터 1을 추가한다. front의 위치는 0, rear의 위치는 1을 가리킨다.  
`enqueue '2'` 데이터 2를 추가한다. front의 위치는 0, rear의 위치는 2을 가리킨다.  
`dequeue : 1` 가장 먼저 삽입된 데이터 1를 꺼내온다. front의 위치는 0, rear의 위치는 1을 가리킨다.  
`dequeue : 2` 가장 먼저 삽입된 데이터 2을 꺼내온다. 큐는 빈 상태가 된다.

### 4. 활용 예시
* 순번 처리 작업(프린터 인쇄, 대기열 업무 등)
* `메시지 큐`(Message Queue)
* 파이프라인
* 운영체제 프로세스 관리
* 데이터 버퍼 역할(네트워크, 스레드, 프로세스 통신 등)

### 5. 시간복잡도
* 삽입과 삭제는 O(1), 검색은 O(N)의 시간 복잡도를 가진다.
* 검색이 많이 일어나는 경우 배열로 구현하는 것이 효율적이지만, 삽입과 삭제 과정에서  
  front와 rear 위치를 옮길 때마다 사용 가능한 공간이 좁아지는 문제가 생긴다.  
  따라서 삭제가 일어날 때 마다 모든 원소를 한 칸씩 밀어줘야 하는데, 이는 시간 및 공간적 측면에서 상당히 비효율적이다.
* 위 단점을 보완하기 위해 일반적으로 `원형 큐`(Circular Queue)의 형태나 `연결리스트`를 사용하여 큐를 구현한다.