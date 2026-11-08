# Two Sum

**Platform:** LeetCode  
**Difficulty:** Easy  
**Language:** Java

## Problem Description

Given an array of integers `nums` and an integer `target`, find two different elements whose sum equals `target`.

Return the indices of these two elements.

Each input has exactly one solution, and the same element cannot be used twice.

You can return the answer in any order.

## Examples

### Example 1

**Input:**
```text
nums = [2,7,11,15], target = 9
```

**Output:**
```text
[0,1]
```

**Explanation:**

The sum of `nums[0]` and `nums[1]` is `2 + 7 = 9`.

### Example 2

**Input:**
```text
nums = [3,2,4], target = 6
```

**Output:**
```text
[1,2]
```

**Explanation:**

The sum of `nums[1]` and `nums[2]` is `2 + 4 = 6`.

### Example 3

**Input:**
```text
nums = [3,3], target = 6
```

**Output:**
```text
[0,1]
```

**Explanation:**

The sum of `nums[0]` and `nums[1]` is `3 + 3 = 6`.

## Approach

Used two nested `for` loops to compare pairs of elements in the array.

- The first loop selects the first element.
- The second loop starts at the next position (`i + 1`) to select a different element.
- An `if` statement checks whether the sum of both elements equals the target.
- If a matching pair is found, the method returns their indices.

## What I Learned

- How to iterate through arrays using `for` loops.
- How to use nested loops to compare different pairs of elements.
- How to access array elements using their indices.
- How to use conditional statements to check a condition.
- How to return an array containing the result.