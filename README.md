# DAA-Practicles
# Data Structures & Algorithms Lab Programs

This repository contains Java programs for common **Data Structures and Algorithms (DSA) lab experiments**, including searching, sorting, greedy algorithms, dynamic programming, graph algorithms, and backtracking problems. Each program includes theory, stepwise algorithm, Java implementation, time and space complexity, and applications.

---

## Table of Contents

1. [Binary Search](#binary-search)
2. [Quick Sort & Merge Sort](#quick-sort--merge-sort)
3. [Knapsack Problem (Greedy Method)](#knapsack-problem-greedy-method)
4. [Optimal Merge Pattern (Greedy Method)](#optimal-merge-pattern-greedy-method)
5. [Minimum Cost Spanning Tree (Prim's & Kruskal's)](#minimum-cost-spanning-tree-prims--kruskals)
6. [Shortest Paths (Dijkstra's Algorithm)](#shortest-paths-dijkstras-algorithm)
---

## Binary Search

**Theory:** Search an element in a **sorted array** by repeatedly dividing the search interval in half.  

**Algorithm Steps:**  
1. Compare the target with the middle element.  
2. If equal, return index.  
3. If smaller, search in left half; if larger, search in right half.  
4. Repeat recursively until found or array ends.  

**Time Complexity:** O(log n)  
**Space Complexity:** O(log n) (for recursion)  

**Applications:** Searching in databases, libraries, or large sorted datasets.  

[DAA Programs](./StudentRollSearch.java)

---

## Quick Sort & Merge Sort

**Theory:** Sorting algorithms that use **divide and conquer**.  

**Quick Sort:** Choose a pivot, partition array, sort partitions.  
**Merge Sort:** Divide array, recursively sort, merge sorted halves.  

**Time Complexity:** O(n log n)  
**Space Complexity:** Quick Sort O(log n), Merge Sort O(n)  

**Applications:** Libraries, databases, large dataset sorting, numeric and string sorting.  

[DAA Programs](./EmployeeSalaryMergeSort.java)

---

## Knapsack Problem (Greedy Method)

**Theory:** Maximize profit within knapsack capacity using **fractional items**.  

**Time Complexity:** O(n log n)  
**Space Complexity:** O(1)  

**Applications:** Resource allocation, cargo loading, investment planning, budget optimization.  

[DAA Programs](./CargoKnapsackApp.java)

---

## Optimal Merge Pattern (Greedy Method)

**Theory:** Minimize total cost of merging **sorted files**.  

**Time Complexity:** O(n log n)  
**Space Complexity:** O(n)  

**Applications:** File merging, Huffman coding, database query optimization, external sorting.  

[DAA Programs](./DataMergeApp.java)

---

## Minimum Cost Spanning Tree (Prim's & Kruskal's)

**Theory:** Find **MST** to connect all vertices with minimum edge cost.  

**Time Complexity:** Prim O(V²), Kruskal O(E log E)  
**Space Complexity:** Prim O(V), Kruskal O(V)  

**Applications:** Network design, road/railway construction, pipeline planning, clustering, electrical circuits.  

[DAA Programs](./NetworkDesignApp.java)

---

## Shortest Paths (Dijkstra's Algorithm)

**Theory:** Single source shortest paths for **non-negative weighted graphs**.  

**Time Complexity:** O(V²)  
**Space Complexity:** O(V)  

**Applications:** GPS navigation, network routing, traffic systems, telecommunication networks, robotics.  

[DAA Programs](./CityRouteApp.java)
---

## Author

**Name:** Shruti Sanjay Gade  
**Class:** SYIT(Batch-I4)
**Course:** Information Technology 
**Subject:** Design and Analysis Algorithm

---
