## Stack(스택)
<a href="http://melonicedlatte.com/">
    <img src="https://img.shields.io/badge/DataStructure-red"
        style="height : auto; margin-left : 8px; margin-right : 8px;"/>
        <img src="https://img.shields.io/badge/linear-orange"
        style="height : auto; margin-left : 8px; margin-right : 8px;"/>
        <img src="https://img.shields.io/badge/stack-yellow"
        style="height : auto; margin-left : 8px; margin-right : 8px;"/>
</a>

### 1. Stack이란?
선형구조의 일종으로 가장 `최근에 저장한 데이터`를 가장 먼저 읽는 자료구조다.  
한 쪽 끝에서 `단방향`으로 삽입과 삭제 연산이 가능하며, 주로 데이터를 일시적으로 저장할 때 많이 사용된다.



### 2. 특징
* `후입 선출` LIFO(Last-In, First-Out)
* `위치 연산자`를 사용해 가장 최근 삽입된 데이터의 메모리 위치를 표시한다.
* 구현이 매우 간단하고 삽입과 삭제 `속도`가 매우 빠르다.
* 자료를 보관하는 `push`, 자료를 꺼내는 `pop`의 두 가지 연산을 이용한다.

### 3. 동작 원리
<img width="960" alt="stack" src="https://user-images.githubusercontent.com/78818063/147757332-b2919d6f-6fda-46b9-94ad-3056e8c2fe71.png">

`push '1'` 데이터 1을 추가한다. top의 위치는 1을 가리킨다.  
`push '2'` 데이터 2를 추가한다. top의 위치는 2을 가리킨다.  
`pop : 2` 가장 최근에 삽입된 데이터 2를 꺼내온다. top의 위치는 1을 가리킨다.  
`pop : 1` 가장 최근에 삽입된 데이터 1을 꺼내온다. 스택은 빈 상태가 된다.

### 4. 활용 예시
* 실행취소(Ctrl Z)
* 메모리 콜 스택
* 웹 브라우저 방문 기록
* 재귀적 알고리즘

### 5. 시간복잡도
* 삽입과 삭제는 O(1), 검색은 O(N)의 시간 복잡도를 가진다.
* 검색이 많이 일어나는 경우는 배열을, 삽입과 삭제가 많은 경우는 연결리스트로 구현하는 것이 효율적이다.
* 특징 그대로 가장 최근에 사용했던 데이터의 우선순위가 높을 때 사용하면 좋은데,  
  최신 값으로 이전 값들을 갱신 가능한 경우 시간복잡도를 O(N<sup>2</sup>)에서 O(N)으로 줄일 수 있다.

      건물의 높이가 일렬로 n개가 주어질 때 가장 오른쪽에서 볼 수 있는 건물의 수를 구한다고 가정해보자.
      5개의 높이 2 5 4 3 1가 차례로 주어질 때 일반적인 방법은 각 순번의 높이와 이전에 주어진 높이를 모두 비교하면 된다.
      위 방법으로 모든 경우의 수를 비교하면 총 (n-1)*(n-2)/2로 n의 제곱만큼의 시간 복잡도가 걸린다.
      하지만 스택을 사용하면 비교하지 않아도 될 높이, 즉 현재 값보다 낮은 높이를 pop시켜주며 비교할 수 있고 
      결과적으로 O(N)의 시간 복잡도로 문제를 해결할 수 있다.

  (해당 문제들)
  * https://www.acmicpc.net/problem/17608
  * https://www.acmicpc.net/problem/2493
  * https://www.acmicpc.net/problem/2812
