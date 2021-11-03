# Java-Coding
[LeetCode](https://leetcode.com/explore/featured/card/top-interview-questions-easy/)

## Array
1. Remove Duplicates from Sorted Array

Given an integer array `nums` sorted in **non-decreasing order**, remove the duplicates in-place such that each unique element appears only once. The **relative order** of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the **first part** of the array `nums`. More formally, if there are `k` elements after removing the duplicates, then the first `k` elements of `nums` should hold the final result. It dose not matter what you leave beyond the first `k` elements.

Return `k` after placing the final result in the first `k` slots of `nums`.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

2. Best Time to Buy and Sell Stock II

You are given an integer array `price` where `price[i]` is the price of a given stock on the `i_th` day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.

3. Rotate Array

Given an array, rorate the array to the right by `k` steps, where `k` is non-negative.

4. Contains Duplicate

Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

5. Single Number 

Given a **non-empty** array of integers `nums`, every element appears *twice* except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

5. Intersection of Two Arrays II

Given two integer arrays `nums1` and `nums2`, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in **any order**.

## Strings

1. Reverse String 

Write a function that reverses a string. The input string is given as an array of character `s`.

2. Reverse Integer

Given a signed 32-bit integer `x`, return `x` with its digits reversed. 

3. First Unique Character in a String

Given a string `s`, *find the first non-repeating character in it and return its index*. If it does not exist, return -1;

4. Valid Anagram

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and return `false` otherwise.

5. Valid Palindrome

A phrase is a **palindrome** if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and number.

Given a string `s`, return `true` if it is a **palindrome**, or `false` otherwise. 

## Math
1. Fizz Buzz

Given an integer `n`, return *a string array* `answer` (**1-indexed**) where:
- `answer[i] == "FizzBuzz"` if `i` is divisible by `3` and `5`.
- `answer[i] == "Fizz"` if `i` is divisible by `3`.
- `answer[i] == "Buzz"` if `i` is divisible by `5`.
- `answer[i] == i` if non of the above conditions are true.

2. Count Primes

Given an integer `n`, return *the number of prime number that are strictly less* than `n`. 

3. Power of Three

Given an integer `n`, return `true` if it is a power of three. Otherwise, return `false`.

An integer `n` is a power of three, if there exists an integer `x` such that `n == 3^x`.

4. Roman to Integer

Roman numerals are represented by seven different symbols: `I`, `V`, `X`, `L`, `C`, `D` and `M`.

Symbol | Value
-------- | --------
I | 1
V | 5
X | 10
L | 50
C | 100
D | 500
M | 1000

For example, `2` is written as `II` in Roman numeral, just two one's added together. `12` is written as `XII`, with is simply `X + II`. The number `27` is written `XXVII`, which is `XX + V + II`.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not `IIII`. Instead, the number four is written as `IV`. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as `IX`. There are six instances where subtraction is used:

- `I` can be placed before `V` (5) and `X` (10) to make 4 and 9.
- `X` can be placed before `L` (50) and `C` (100) to make 40 and 90.
- `C` can be placed before `D` (500) and `M` (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

## Others

1. Valid Parentheses

Given a string `s` containing just the characters `(`, `)`, `{`, `}`, `[` and `]`, determine if the input string is valid.

As input string is valid if:
- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.

2. Missing Number

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

# [5 Most used Sorting Algorithms](https://favtutor.com/blogs/sorting-algorithms-java)
1. Merge Sort
- **Time Complexity**: Sorting arrays on different machines. Merge Sort is a recursive algorithm and time complexity can be expressed as following recurrence relation.
```
T(n) = 2T(n/2) + O(n)
```
The above recurrence can be solved either using the Recurrence Tree method or the Master method. It falls in case II of Master Method and the solution of the recurrence is O(nLogn). Time complexity of Merge Sort is O(nLogn) in all 3 cases (worst, average and best) as merge sort always divides the array into two halves and take linear time to merge two halves.
- **Auxiliary Space**: O(n) 
- **Algorithmic Paradigm**: Divide and Conquer
- **Sorting In Place**: No in a typical implementation
- **Stable**: Yes
