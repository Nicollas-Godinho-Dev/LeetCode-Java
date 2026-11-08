# 94. Binary Tree Inorder Traversal

**Difficulty:** Easy  
**Language:** Java  
**Topic:** Binary Tree, Depth-First Search, Recursion

## Problem

Given the root of a binary tree, return the inorder traversal of its nodes' values.

Inorder traversal visits the nodes in the following order:

1. Left subtree
2. Root node
3. Right subtree

## Example

**Input:**
```text
root = [1,null,2,3]
```

**Output:**
```text
[1,3,2]
```

## Approach

This solution uses **recursion** to traverse the binary tree.

A helper method called `percorrer()` is responsible for visiting each node.

The algorithm follows three steps:

1. Recursively visit the left subtree.
2. Add the current node's value to the result list.
3. Recursively visit the right subtree.

The recursion stops when the current node is `null`.

The `inorderTraversal()` method creates an `ArrayList`, calls the helper method, and returns the result.

## Complexity Analysis

- **Time Complexity:** O(n) — Each node is visited exactly once.
- **Space Complexity:** O(h) — The recursive call stack depends on the height of the tree, excluding the output list.

Where:
- `n` = Number of nodes in the tree.
- `h` = Height of the tree.

## What I Learned

- Binary Tree traversal.
- Inorder traversal (Left → Root → Right).
- Recursion and recursive helper methods.
- Base cases in recursive algorithms.
- Using `ArrayList` and `List` in Java.
- Passing a collection as a method parameter.

## Key Takeaway

Inorder traversal demonstrates how recursion can simplify tree traversal by dividing the problem into smaller subproblems.

**Practice, consistency, and continuous improvement.**