# Data Structures & Algorithms Cheatsheet

A quick reference guide for common data structures, algorithms, and their complexities.

## Table of Contents

1. [Time Complexities](#time-complexities)
2. [Data Structures](#data-structures)
3. [Sorting Algorithms](#sorting-algorithms)
4. [Searching Algorithms](#searching-algorithms)
5. [Tree Traversals](#tree-traversals)
6. [Graph Algorithms](#graph-algorithms)
7. [Dynamic Programming Patterns](#dynamic-programming-patterns)
8. [Common Algorithm Techniques](#common-algorithm-techniques)

## Time Complexities

| Notation | Name |
|----------|------|
| O(1) | Constant |
| O(log n) | Logarithmic |
| O(n) | Linear |
| O(n log n) | Linearithmic |
| O(n²) | Quadratic |
| O(n³) | Cubic |
| O(2ⁿ) | Exponential |
| O(n!) | Factorial |

## Data Structures

### Array

- **Description**: Fixed-size, indexed collection of elements
- **Time Complexity**:
  - Access: O(1)
  - Search: O(n)
  - Insertion: O(n)
  - Deletion: O(n)
- **Space Complexity**: O(n)

### Linked List

- **Description**: Linear collection where elements point to the next element
- **Time Complexity**:
  - Access: O(n)
  - Search: O(n)
  - Insertion: O(1)*
  - Deletion: O(1)*
- **Space Complexity**: O(n)
- *Assumes we have reference to the node

### Stack

- **Description**: LIFO (Last In, First Out) data structure
- **Time Complexity**:
  - Push: O(1)
  - Pop: O(1)
  - Peek: O(1)
  - Search: O(n)
- **Space Complexity**: O(n)

### Queue

- **Description**: FIFO (First In, First Out) data structure
- **Time Complexity**:
  - Enqueue: O(1)
  - Dequeue: O(1)
  - Front: O(1)
  - Rear: O(1)
- **Space Complexity**: O(n)

### Hash Table

- **Description**: Key-value pairs with hash function for indexing
- **Time Complexity**:
  - Search: O(1) average, O(n) worst
  - Insertion: O(1) average, O(n) worst
  - Deletion: O(1) average, O(n) worst
- **Space Complexity**: O(n)

### Binary Tree

- **Description**: Hierarchical structure with at most two children per node
- **Time Complexity**:
  - Search: O(h) where h is height
  - Insertion: O(h)
  - Deletion: O(h)
- **Space Complexity**: O(n)

### Binary Search Tree (BST)

- **Description**: Binary tree with left child < parent < right child
- **Time Complexity**:
  - Search: O(log n) average, O(n) worst
  - Insertion: O(log n) average, O(n) worst
  - Deletion: O(log n) average, O(n) worst
- **Space Complexity**: O(n)

### Heap

- **Description**: Complete binary tree with heap property
- **Time Complexity**:
  - Find Min/Max: O(1)
  - Insertion: O(log n)
  - Deletion: O(log n)
- **Space Complexity**: O(n)

### Graph

- **Description**: Collection of vertices and edges
- **Representations**:
  - Adjacency List: O(V + E) space
  - Adjacency Matrix: O(V²) space

## Sorting Algorithms

### Bubble Sort

- **Method**: Repeatedly swap adjacent elements if in wrong order
- **Time Complexity**: O(n²)
- **Space Complexity**: O(1)
- **Stable**: Yes

### Selection Sort

- **Method**: Find minimum element and place it at the beginning
- **Time Complexity**: O(n²)
- **Space Complexity**: O(1)
- **Stable**: No

### Insertion Sort

- **Method**: Build sorted array one element at a time
- **Time Complexity**: O(n²)
- **Space Complexity**: O(1)
- **Stable**: Yes

### Merge Sort

- **Method**: Divide and conquer approach
- **Time Complexity**: O(n log n)
- **Space Complexity**: O(n)
- **Stable**: Yes

### Quick Sort

- **Method**: Partition array around a pivot
- **Time Complexity**: O(n log n) average, O(n²) worst
- **Space Complexity**: O(log n)
- **Stable**: No

### Heap Sort

- **Method**: Use heap data structure
- **Time Complexity**: O(n log n)
- **Space Complexity**: O(1)
- **Stable**: No

## Searching Algorithms

### Linear Search

- **Method**: Check each element sequentially
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)

### Binary Search

- **Method**: Divide search space in half repeatedly
- **Prerequisite**: Sorted array
- **Time Complexity**: O(log n)
- **Space Complexity**: O(1)

## Tree Traversals

### Depth-First Search (DFS)

#### Inorder (Left, Root, Right)

```Text
Algorithm:
1. Traverse left subtree
2. Visit root
3. Traverse right subtree
```

#### Preorder (Root, Left, Right)

```Text
Algorithm:
1. Visit root
2. Traverse left subtree
3. Traverse right subtree
```

#### Postorder (Left, Right, Root)

```Text
Algorithm:
1. Traverse left subtree
2. Traverse right subtree
3. Visit root
```

### Breadth-First Search (BFS)

- **Also Known As**: Level-order traversal
- **Method**: Visit nodes level by level
- **Implementation**: Use queue

## Graph Algorithms

### Breadth-First Search (BFS)

- **Method**: Explore neighbors before going deeper
- **Data Structure**: Queue
- **Time Complexity**: O(V + E)
- **Space Complexity**: O(V)

### Depth-First Search (DFS)

- **Method**: Explore as far as possible along each branch
- **Data Structure**: Stack (recursive or iterative)
- **Time Complexity**: O(V + E)
- **Space Complexity**: O(V)

### Dijkstra's Algorithm

- **Purpose**: Find shortest path in weighted graph
- **Prerequisite**: Non-negative edge weights
- **Data Structure**: Priority Queue (Min-Heap)
- **Time Complexity**: O((V + E) log V)
- **Space Complexity**: O(V)

### Bellman-Ford Algorithm

- **Purpose**: Find shortest path in weighted graph
- **Allows**: Negative edge weights
- **Detects**: Negative weight cycles
- **Time Complexity**: O(VE)
- **Space Complexity**: O(V)

### Floyd-Warshall Algorithm

- **Purpose**: Find shortest paths between all pairs of vertices
- **Time Complexity**: O(V³)
- **Space Complexity**: O(V²)

### Topological Sort

- **Purpose**: Linear ordering of vertices in DAG
- **Method**: DFS-based or Kahn's algorithm
- **Time Complexity**: O(V + E)
- **Space Complexity**: O(V)

## Dynamic Programming Patterns

### 1. Fibonacci-style Problems

- **Pattern**: f(n) = f(n-1) + f(n-2)
- **Examples**: Fibonacci sequence, Climbing stairs

### 2. Zero-One Knapsack

- **Pattern**: Choose to include or exclude an item
- **Examples**: Subset sum, Partition equal subset sum

### 3. Unbounded Knapsack

- **Pattern**: Can use an item unlimited times
- **Examples**: Coin change, Rod cutting

### 4. Longest Common Subsequence (LCS)

- **Pattern**: Find longest sequence common to both strings
- **Examples**: Longest common subsequence, Edit distance

### 5. Longest Increasing Subsequence (LIS)

- **Pattern**: Find longest increasing subsequence
- **Examples**: Russian doll envelopes, Maximum sum increasing subsequence

### 6. Matrix Chain Multiplication

- **Pattern**: Optimal way to parenthesize matrices
- **Examples**: Minimum cost tree from leaf values

### 7. Palindromic Subsequence

- **Pattern**: Find longest palindromic subsequence
- **Examples**: Longest palindromic subsequence, Palindromic partitioning

## Common Algorithm Techniques

### Two Pointers

- **Use Case**: Arrays, linked lists, sorted arrays
- **Patterns**:
  - Left and right pointers moving toward each other
  - Slow and fast pointers (Floyd's cycle detection)

### Sliding Window

- **Use Case**: Arrays, strings
- **Patterns**:
  - Fixed-size window
  - Variable-size window

### Binary Search:

- **Use Case**: Sorted arrays, monotonic functions
- **Variants**:
  - Classical binary search
  - Lower/upper bound
  - Binary search on answer

### Backtracking

- **Use Case**: Problems requiring all possible combinations
- **Pattern**:

```Text
  1. Choose
  2. Explore
  3. Unchoose
  ```

### Divide and Conquer

- **Pattern**:
  1. Divide problem into subproblems
  2. Solve subproblems recursively
  3. Combine solutions

### Greedy Algorithms

- **Use Case**: Optimization problems with greedy choice property
- **Examples**: Activity selection, Huffman coding

### Bit Manipulation

- **Common Operations**:
  - AND (&): Check if bit is set
  - OR (|): Set a bit
  - XOR (^): Toggle bits, find unique element
  - Left Shift (<<): Multiply by power of 2
  - Right Shift (>>): Divide by power of 2

---

*This cheatsheet is meant to be a quick reference. For detailed implementation and edge cases, refer to the full implementations in the repository.*
