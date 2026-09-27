# ads-java-fundamentals
Java implementations and step-by-step dry runs of fundamental Data Structures and Algorithms designed to build core CS concepts.

🚀 Data Structures & Algorithms in Java (ads-java-fundamentals)

Welcome to the Data Structures and Algorithms repository! This project serves as a structured collection of core DSA implementations in Java, complete with step-by-step dry runs and line-by-line conceptual explanations designed to strengthen fundamental computer science concepts.

📌 Repository Purpose

Understanding Data Structures and Algorithms isn't just about memorizing code; it's about mastering how memory, execution, and logic work together.

This repository focuses on:

Core Concepts: Clear, un-bloated Java implementations of essential algorithms.

Dry Runs: Step-by-step trace tables and variable tracking to understand execution flow.

Time & Space Complexity: Big-O analysis for every algorithm and data structure.

📂 Structure & Contents

├── Data-Structures/
│   ├── Arrays/
│   ├── LinkedLists/
│   ├── StacksAndQueues/
│   ├── Trees/
│   └── Graphs/
├── Algorithms/
│   ├── Searching/
│   ├── Sorting/
│   ├── Recursion-Backtracking/
│   └── DynamicProgramming/
└── README.md


🛠️ Topics Covered

1. Data Structures

[ ] Arrays & Strings

[ ] Linked Lists (Singly, Doubly, Circular)

[ ] Stacks & Queues (Array & LL Implementations)

[ ] Trees (Binary Trees, BST, AVL)

[ ] Graphs (Adjacency Matrix & List)

[ ] Heaps & Priority Queues

[ ] Hash Tables

2. Core Algorithms

[ ] Searching: Binary Search, Linear Search, Ternary Search

[ ] Sorting: Bubble, Selection, Insertion, Merge Sort, Quick Sort, Heap Sort

[ ] Recursion & Backtracking: N-Queens, Subsets, Permutations

[ ] Graph Algorithms: BFS, DFS, Dijkstra's, Kruskal's, Prim's

[ ] Dynamic Programming: Knapsack, LCS, LIS

✍️ Code Format & Dry Run Example

Every code file includes a structured comment header explaining the logic, time/space complexity, and a dry-run trace:

/**
 * Problem: Binary Search (Iterative)
 * Time Complexity: O(log N)
 * Space Complexity: O(1)
 *
 * DRY RUN TRACE:
 * Array: [2, 4, 6, 8, 10, 12], Target: 10
 * 
 * Pass 1: low = 0, high = 5 -> mid = 2 (val = 6)  -> 6 < 10 -> low = mid + 1 = 3
 * Pass 2: low = 3, high = 5 -> mid = 4 (val = 10) -> 10 == 10 -> Return Index 4
 */

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        
        return -1;
    }
}


💻 How to Run

Clone the repository:

git clone https://github.com/nishanty23/ads-java-fundamentals.git


Navigate to the directory:

cd ads-java-fundamentals


Compile and run any Java file:

javac Algorithms/Searching/BinarySearch.java
java Algorithms.Searching.BinarySearch


🌟 Goals & Roadmap

[x] Set up repository structure.

[ ] Implement fundamental searching and sorting algorithms with dry runs.

[ ] Add linear data structures (LinkedLists, Stacks, Queues).

[ ] Add non-linear data structures (Trees, Graphs).

[ ] Solve and document standard interview/concept problems.

🤝 Contributing & Feedback

Suggestions, corrections, and alternate implementations (e.g., recursive vs. iterative) are welcome! Feel free to open an issue or submit a pull request.
