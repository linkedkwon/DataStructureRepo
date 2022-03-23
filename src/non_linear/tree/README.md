## 트리(Tree)
<a href="http://melonicedlatte.com/">
    <img src="https://img.shields.io/badge/DataStructure-red"
        style="height : auto; margin-left : 8px; margin-right : 8px;"/>
        <img src="https://img.shields.io/badge/NonLinear-orange"
        style="height : auto; margin-left : 8px; margin-right : 8px;"/>
        <img src="https://img.shields.io/badge/Tree-yellow"
        style="height : auto; margin-left : 8px; margin-right : 8px;"/>
</a>

### 1. 트리(Tree)란?
트리는 그래프의 한 종류로 데이터를 저장하는 `노드(Node)`와 `브랜치(Branch 또는 Edge)`를 이용해 사이클이 이뤄지지 않도록  
연결하여 데이터의 관계를 나타낸 비선형 자료 구조를 의미한다. 연결된 노드의 집합은 `재귀적 형태`를 띄우며, 서로 `계층형 관계`를 이룬다.  
보통 파일같은 디렉토리, 인덱싱, 수의 크기 비교, 검색어 자동완성, 문자열 검사 등의 `탐색`에서 많이 사용된다.


### 2. 트리 용어
트리에서 사용되는 용어들은 다음과 같다.  

<img width="627" alt="tree_terms" src="https://user-images.githubusercontent.com/78818063/159611289-768d8f28-e824-454c-850a-9dda5f81ab8a.png">

* `Node` : 데이터를 저장하는 각 요소
* `Root Node` : 트리의 가장 최상단에 위치한 노드
* `Branch 또는 Edge` : 각 노드를 연결하는 방향의 간선
* `Level, Depth` : 루트 노드를 기준(0을 기준)으로 한 각 트리의 층
* `Height` : 트리의 전체 층의 높이(가장 최하단 노드의 Depth와 같으며, 탐색 시간을 구할 때 사용됨)
* `Parent Node` : 특정 노드에 연결된 상위 노드
* `Child Node` : 특정 노드에 연결된 하위 노드
* `Leaf Node` : 자식 노드가 없는 가장 최하단에 위치한 노드
* `Sibling` : 동일한 부모를 가진 노드

### 3. 트리의 특징
* 트리는 방향성을 띄고 있는 그래프(`DAG`, Directed Acyclic Graph)의 한 종류다.
* 간선의 개수는 모든 노드의 개수 -1 이다.
* 특정 노드간의 Path가 유일하다.
* 각 노드는 어떤 자료형이라도 올 수 있다.

### 4. 트리의 종류
트리는 일반적으로 하나의 노드가 가질 수 있는 자식 노드의 수로 구분할 수 있다.  
아래는 크게 세 가지로 트리를 구분하였는데, 각 트리는 다른 문서에서 자세히 다룬다.  

**(1). 이진 트리(Binary Tree)**  
가장 많이 사용되는 트리로 각 노드가 자식 노드를 최대 2개까지 가질 수 있어 수의 크기를 비교하거나 구간 합, 최대 또는 최솟 값 등  
탐색에 높은 효율을 지닌다. 주로 사용하는 구조로는 `이진 탐색 트리(Binary Search Tree)`, `AVL 트리`, `Heap` 등이 있다.  

<img width="629" alt="binary" src="https://user-images.githubusercontent.com/78818063/159615086-06afd98d-b051-4612-93c1-bd03b1d3ec9d.png">


**(2). 터너리 트리(Ternary Tree)**  
각 노드가 자식 노드를 최대 3개까지 가질 수 있는 구조로 보통 구간 내 최댓값 또는 최솟값을 구하는데 사용된다.

<img width="631" alt="ternary" src="https://user-images.githubusercontent.com/78818063/159615093-2dbf7459-cabc-4cb4-92aa-32bdccd986b2.png">


**(3). 비트리(B-Tree)**  
각 노드가 자식 노드를 최대 2개 이상 가질 수 있는 구조로 이진 트리를 확장한 형태다.  
Key 값을 통해 자식 노드의 주소를 관리하며 데이터를 정렬된 상태로 보관한다. 주요 장점으로 트리의 형태가 균형을 이루고 있어`(Balanced Tree)`  
어떠한 값을 찾아도 탐색 시간이 균일하다. 일반적으로 데이터베이스나 파일 시스템에서 많이 사용된다.  

<img width="631" alt="btree" src="https://user-images.githubusercontent.com/78818063/159615107-052bfdb8-2f9c-48bc-88e1-7f7d36c818f5.png">

### 5. 트리의 순회(Traversal)
기본적으로 그래프의 탐색은 `DFS(Depth First Search)`와 `BFS(Breadth First Search)`의  
두 가지 방법을 사용하는데, 마찬가지로 트리도 위 탐색 방법을 이용해 순회한다.

* **중위 순회(In-Order Traversal)**  
  `왼쪽 자식 -> 자신 -> 오른쪽 자식` 순서로 순회한다.  
  이진 탐색 트리에서 자주 사용되는데, 데이터 저장 방식에 의해 `정렬된 탐색 결과`를 얻을 수 있다.
    

* **전위 순회(Pre-Order Traversal)**  
  `자신 -> 왼쪽 자식 -> 오른쪽 자식` 순서로 순회한다.  
  

* **후위 순회(Post-Order Traversal)**  
  `왼쪽 자식 -> 오른쪽 자식 -> 자신` 순서로 순회한다.
  
위 세 가지 방법은 DFS 방식과 스택(Stack)을 사용해 구현한다.

* **레벨 순서 순회(Level-Order Traversal)**  
  너비 우선 순회(Breadth-First Traversal)라고도 부르며, 각 층에 포함된 노드를 순서대로 방문한다.  
  
위 방식은 BFS 방식과 큐(Queue)를 사용해 구현한다.