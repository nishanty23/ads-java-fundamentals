# Data Structures & Algorithms in Java

### `ads-java-fundamentals`

A structured collection of **Data Structures and Algorithms implemented in Java**, with a focus on understanding the logic behind the code rather than simply solving problems.

Each implementation is accompanied by **dry runs, complexity analysis, and execution-flow explanations** to make the learning process easier to follow.

---

## Repository Overview

| Area                | Focus                                                                              |
| ------------------- | ---------------------------------------------------------------------------------- |
| **Data Structures** | Arrays, Linked Lists, Stacks, Queues, Trees, Graphs, Heaps, Hash Tables            |
| **Algorithms**      | Searching, Sorting, Recursion, Backtracking, Graph Algorithms, Dynamic Programming |
| **Analysis**        | Time Complexity, Space Complexity, Big-O                                           |
| **Documentation**   | Dry runs, variable tracking, execution flow                                        |
| **Language**        | Java                                                                               |

---

## Why This Repository?

DSA is not just about writing code that produces the correct output.

The goal of this repository is to understand:

```text
Input
  ↓
Data Structure
  ↓
Algorithm
  ↓
Execution Flow
  ↓
Output
```

For each topic, the focus is on understanding **what happens inside the program**, how variables change during execution, and how the choice of an algorithm affects performance.

---

## Contents

```text
ads-java-fundamentals/
│
├── Data-Structures/
│   ├── Arrays/
│   ├── LinkedLists/
│   ├── StacksAndQueues/
│   ├── Trees/
│   └── Graphs/
│
├── Algorithms/
│   ├── Searching/
│   ├── Sorting/
│   ├── Recursion-Backtracking/
│   └── DynamicProgramming/
│
└── README.md
```

---

## Data Structures

| Status | Topic                   |
| :----: | ----------------------- |
|   [ ]  | Arrays & Strings        |
|   [ ]  | Singly Linked Lists     |
|   [ ]  | Doubly Linked Lists     |
|   [ ]  | Circular Linked Lists   |
|   [ ]  | Stacks                  |
|   [ ]  | Queues                  |
|   [ ]  | Binary Trees            |
|   [ ]  | Binary Search Trees     |
|   [ ]  | AVL Trees               |
|   [ ]  | Graphs                  |
|   [ ]  | Heaps & Priority Queues |
|   [ ]  | Hash Tables             |

---

## Algorithms

### Searching

* [ ] Linear Search
* [ ] Binary Search
* [ ] Ternary Search

### Sorting

* [ ] Bubble Sort
* [ ] Selection Sort
* [ ] Insertion Sort
* [ ] Merge Sort
* [ ] Quick Sort
* [ ] Heap Sort

### Recursion & Backtracking

* [ ] Recursion Fundamentals
* [ ] Subsets
* [ ] Permutations
* [ ] N-Queens

### Graph Algorithms

* [ ] Breadth-First Search
* [ ] Depth-First Search
* [ ] Dijkstra's Algorithm
* [ ] Kruskal's Algorithm
* [ ] Prim's Algorithm

### Dynamic Programming

* [ ] 0/1 Knapsack
* [ ] Longest Common Subsequence
* [ ] Longest Increasing Subsequence

---

## Code Documentation

The implementations are kept intentionally straightforward so that the algorithm remains easy to read.

Where applicable, each implementation contains:

* Problem description
* Approach
* Time complexity
* Space complexity
* Dry-run trace
* Important variable changes

### Example

```java
/**
 * Problem: Binary Search (Iterative)
 *
 * Time Complexity: O(log N)
 * Space Complexity: O(1)
 *
 * DRY RUN:
 * Array = [2, 4, 6, 8, 10, 12]
 * Target = 10
 *
 * Pass 1:
 * low = 0, high = 5
 * mid = 2
 * arr[mid] = 6
 * 6 < 10 → low = 3
 *
 * Pass 2:
 * low = 3, high = 5
 * mid = 4
 * arr[mid] = 10
 * 10 == 10 → return 4
 */
```

The idea is to make the code understandable even when revisiting it later without needing to reconstruct the algorithm from scratch.

---

## Complexity Reference

A major part of the repository is understanding how algorithms scale as the input grows.

| Complexity   | Example                  |
| ------------ | ------------------------ |
| `O(1)`       | Array access             |
| `O(log n)`   | Binary Search            |
| `O(n)`       | Linear Search            |
| `O(n log n)` | Merge Sort               |
| `O(n²)`      | Bubble Sort              |
| `O(2ⁿ)`      | Some recursive solutions |

The implementations are accompanied by complexity analysis wherever it is relevant.

---

## Running the Code

### 1. Clone the repository

```bash
git clone https://github.com/nishanty23/ads-java-fundamentals.git
```

### 2. Navigate to the project

```bash
cd ads-java-fundamentals
```

### 3. Compile a Java file

```bash
javac Algorithms/Searching/BinarySearch.java
```

### 4. Run the program

```bash
java Algorithms.Searching.BinarySearch
```

The exact command may vary depending on the package declaration and directory structure of the Java file.

---

## Roadmap

### Foundation

* [x] Set up repository structure
* [ ] Implement fundamental searching algorithms
* [ ] Implement fundamental sorting algorithms
* [ ] Document dry runs and complexity analysis

### Data Structures

* [ ] Linked Lists
* [ ] Stacks
* [ ] Queues
* [ ] Trees
* [ ] Graphs
* [ ] Heaps
* [ ] Hash Tables

### Problem Solving

* [ ] Recursion & Backtracking
* [ ] Standard interview problems
* [ ] Dynamic Programming
* [ ] Graph-based problems
* [ ] Alternative implementations and approaches

---

## Learning Approach

The repository follows a simple pattern:

```text
Learn the concept
      ↓
Implement it
      ↓
Dry run the implementation
      ↓
Analyze complexity
      ↓
Solve variations of the problem
```

This keeps the repository focused on **understanding DSA through implementation**, rather than collecting solutions without context.

---

## Feedback

If you find an issue, a better implementation, or an interesting alternative approach, feel free to open an issue or submit a pull request.

Different approaches are especially useful when they demonstrate a meaningful trade-off, such as:

```text
Iterative  ↔  Recursive
Time       ↔  Space
Simplicity ↔  Optimization
```

---

## Author

**Nishant Yadav**

Computer Science Engineering
Focused on software development, problem solving, and building a strong foundation in computer science.

---

<p align="center">
  <sub>Built while learning, implementing, and revisiting the fundamentals of DSA.</sub>
</p>
