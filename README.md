# Purpose

I want to improve your mindset programming skills. 

# Java-Coding
[LeetCode](https://leetcode.com/explore/featured/card/top-interview-questions-easy/)

## Array
### 1. Remove Duplicates from Sorted Array

Given an integer array `nums` sorted in **non-decreasing order**, remove the duplicates in-place such that each unique element appears only once. The **relative order** of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the **first part** of the array `nums`. More formally, if there are `k` elements after removing the duplicates, then the first `k` elements of `nums` should hold the final result. It dose not matter what you leave beyond the first `k` elements.

Return `k` after placing the final result in the first `k` slots of `nums`.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

### 2. Best Time to Buy and Sell Stock II

You are given an integer array `price` where `price[i]` is the price of a given stock on the `i_th` day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.

### 3. Rotate Array

Given an array, rorate the array to the right by `k` steps, where `k` is non-negative.

### 4. Contains Duplicate

Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

### 5. Single Number 

Given a **non-empty** array of integers `nums`, every element appears *twice* except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

### 6. Intersection of Two Arrays II

Given two integer arrays `nums1` and `nums2`, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in **any order**.

### 7. Plus One

You are given a **large integer** represented as an integer array `digits`, where each `digits[i]` is the `i_th` digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading `0`'s.

Increment the large integer by one and return *the resulting array of digits.*

### 8. Move Zeroes

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

**Note** that you must do this in-place without making a copy of the array.

### 9. Two Sum

Given an array of integer `nums` and an integer `target`, return *indices of the two numbers such that they add up to `target`.*

You may assume that each input would have **exactly one solution**, and you may not use the *same element twice.*

You can return the answer in any order.

### 10. Valid Sudoku

Determine if a `9x9` Sudoku board is valid. Only the filled cells need to be validated **according to the following rules.**

- Each row must contain the digits `1-9` without repetition.
- Each column mus contain teh digits `1-9` without repetition.
- Each of the nine `3x3` sub-boxes of the grid must contain the digits `1-9` without repetition.

### 11. Rotate Image

You are given an `nxn` 2D `matrix` representing an image, rotate the image by **90** degrees (clockwise).

You have to rotate the image **in-place**, which means you have to modify the input 2D matrix directly. **DO NOT** allocate another 2D matrix and do the rotation.

### 12. Number of Islands

Given an `m x n` 2D binary grid `grid` which represents a map of `1`s (land) and `0`s (water), return the *number of islands*.

An **island** is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of teh grid are all surrounded by water.

### 13. Squares of a Sorted Array

Given an integer array `nums` sorted in **non-decreasing** order, return *an array of **teh squares of each number** sorted in non-decreasing order.* 

### 14. Container With Most Water

Given `n` non-negative integers `a1, a2, ..., an`, where each represents a point at coordinate `(i, ai)`. `n` vertical lines are drawn such that the two endpoints of the line `i` is at `(i, ai)` and `(i, 0)`. Find two lines, which together with the x-axis forms a container, such that the container contains teh most water. 

**Notice** that you may not slant the container

### 15. 3Sum Closest

Given an integer array `nums` of length `n` adn an integer `target`, find three integer in `nums` such that the sum is closest to `target`.

Return *the sum of the three integers.*

You may assume that each input would have exactly one solution.

### 16. Peak Index in a Mountain Array

Let's call an array `arr` a **mountain** if the following properties hold:
- `arr.length >= 3`
- There exists some `i` with `0 < i < arr.length - 1` such that: 
    - `arr[0] < arr[1] < ... arr[i-1] < arr[i]`
    - `arr[i] > arr[i+1] > ... > arr[arr.length - 1]`

Given an integer array `arr` that is **guaranteed** to be a mountain, return any `i` such that `arr[0] < arr[1] < ... < arr[i-1] < arr[i] > arr[i+1] > ... > arr[arr.length - 1]`.

### 17. Spiral Matrix

Given an `m x n` `matrix`, return *all elements* of the `matrix` in *spiral order*.

### 18. Spiral Matrix II

Given a positive integer `n`, generate an `n x n` `matrix` filled with elements from `1` to `n^2` in spiral oder.

### 19. Unique Morse Code Words

International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes,as follows:
- `'a'` maps to `".-"`,
- `'b'` maps to `"-..."`, and so on. 

Given an array of strings `words` where each can be written as a concatenation of the Morse code of each letter.

Return *the number of different **transformations** among all words* we have.

### 20. Sort Array By Parity

Given an integer array `nums`, move all the even integers at the beginning of the array followed by all the odd integers.

Return **any array** *that satisfies this condition*.

### 21. Array Partition I

Given an integer array `nums` of `2n` integers, group these integers into n pairs `(a1, b1), (a2, b2), ..., (an, bn)` such that the sum of `min(ai, bi)` for all `i` is **maximized**. Return *the maximized sum*.

### 22. Sort Array By Parity II

Given an array of integers `nums`, half of the integers in `nums` are **odd**, and the other half are **even**. Sort the array so that whenever `nums[i]` is odd, `i` is **odd**, and whenever `nums[i]` is even, `i` is **even**.

Return *any answer array that satisfies this condition*.

### 23. Transpose Matrix

Given a 2D integer array `matrix`, return *the **transpose** of `matrix`*. The **transpose** of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

### 24. Minimum Size Subarray Sum

Given an array of positive integers `nums` and a positive integer `target`, return the minimal length of a **contiguous subarray** of which the sum is greater than or equal to `target`. If there is no such subarray, return 0 instead.

### 25. Search a 2D Matrix

Given an efficient algorithm that searches for a value in an `m x n` matrix. This matrix has the following properties:
- Integers in each row are sorted from left to right.
- The first integer of each row is greater than the last integer of the previous row.

### 26. Word Search

Given an `m x n` grid of character `board` and a string `word`, return `true` if `word` *exists in grid*.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

## Strings

### 1. Reverse String 

Write a function that reverses a string. The input string is given as an array of character `s`.

### 2. Reverse Integer

Given a signed 32-bit integer `x`, return `x` with its digits reversed. 

### 3. First Unique Character in a String

Given a string `s`, *find the first non-repeating character in it and return its index*. If it does not exist, return -1;

### 4. Valid Anagram

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and return `false` otherwise.

### 5. Valid Palindrome

A phrase is a **palindrome** if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and number.

Given a string `s`, return `true` if it is a **palindrome**, or `false` otherwise. 

### 6. String to Integer (atoi)

Implement the `myAtoi(String s)` function, which converts a string to a 32-bit signed integer (similar to C/C++ 's `atoi` function).

The algorithm for `myAtoi(String s)` is as follow:

- Read in and ignore any leading whitespace.
- Check if the next character (if not already at the end of the string) is `'-'` or `'+'`. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
- Read in next the character until the next non-digit character or the end of the input is reached. The rest of the string is ignored. 
- Convert these digits into an integer (i.e. `"123" -> 123`, `"0032" -> 32`). If no digits were read, then the integer is `0`. Change the sign as necessary 

### 7. Implement strStr()

Implement **strStr()**

Return the index of the first occurrence of needle in haystack, or `-1` if `needle` is not part of `haystack`.

### 8. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string `""`.

### 9. To Lower Case

Given a string `s`, return *the string after replacing every uppercase letter with the same lowercase letter.*

### 10. Backspace String Compare

Given two strings `s` and `t` , return `true` *if they are equal when both are typed into empty text editors.* `#` means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

### 11. Jewels and Stones

You're given string `jewels` representing the types of stones that are jewels, and `stones` representing the stones you have. Each character in `stones` is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so `"a"` is considered a different type of stone from `"A"`. 

### 12. Reverse Only Letters

Given a string `s`, reverse the string according to the following rules:
- All the characters that are not English letters remain in the same position.
- All teh English letters (lowercase or uppercase) should be reversed.

Return `s` *after reversing it*.

### 13. Unique Email Addresses

Every **valid email** consists of a **local name** and a **domain name**, separated by the `'@'` sign. Besides lowercase letter, the email may contain one or more `'.'` or `'+'`.

If you add periods `'.'` between some characters in the in the **local name** part of an email address, mail sent there will be forwarded to the same address without dots in the local name. Note that this rule **does not apply** to **domain names**.

If you add a plus `'+'` in the **local name**, everything after the first plus sign **will be ignored**. This allows certain emails to be filtered. Note that this rule **does not apply** to **domain names**.

It is possible to use both of these rules at the same.

Given an array of strings `email` where we send one email to each `email[i]`, return **the number of different addresses that actually receive mails*.

### 14. Find Common Characters

Given a string array `words`, return *an array of all characters that show up in all string within the `words` (including duplicates)*. You may return the answer in **any order**.

### 15. Valid Palindrome II

Given a string `s`, return `true` *if the `s` can be palindrome after deleting **at most one** character from it*.

### 16. Word Subsets

You are given two string arrays `words1` and `words2`. A string `b` is a **subset** if string `a` if every letter in `b` occurs in `a` including multiplicity. A string `a` from `words1` is **universal** if for every string `b` in `words2`, `b` is subset of `a`.

Return an array of all the **universal** strings in `words1`. You may return the answer in **any order**.

### 17. Remove K Digits

Given string num representing a non-negative integer `num`, and an integer `k`, return *the smallest possible integer after removing `k` digits from `num`*.
## Math
### 1. Fizz Buzz

Given an integer `n`, return *a string array* `answer` (**1-indexed**) where:
- `answer[i] == "FizzBuzz"` if `i` is divisible by `3` and `5`.
- `answer[i] == "Fizz"` if `i` is divisible by `3`.
- `answer[i] == "Buzz"` if `i` is divisible by `5`.
- `answer[i] == i` if non of the above conditions are true.

### 2. Count Primes

Given an integer `n`, return *the number of prime number that are strictly less* than `n`. 

### 3. Power of Three

Given an integer `n`, return `true` if it is a power of three. Otherwise, return `false`.

An integer `n` is a power of three, if there exists an integer `x` such that `n == 3^x`.

### 4. Roman to Integer

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

### 5. Palindrome Number 

Given an integer `x`, return `true` if `x` is palindrome integer.

An integer is a **palindrome** when it reads the same backward as forward. 

### 6. Pow(x, n)

Implement `pow(x, n)`, which calculate `x` raised to the power `n`

### 7. Power of Four

Given an integer `n`, return `true` if it is a *power of four*. Otherwise, return `false`.

An integer `n` is a power of four, if there exists an integer `x` such that `n == 4 ^ x`

### 8. Add Binary

Given two binary string `a` and `b`, return *their sum* as a binary string.

### 9. Self Dividing Numbers

A **self-dividing number** is a number that is divisible by every digit it contains. A **self-dividing number** is not allowed to contain the digit zero.

Given two integer `left` and `right`, return *a list of all the **self-dividing numbers** in the range `[left, right]`.

## Linked List

### 1. Delete Node in a Linked List

Write a function to **delete a node** in a singly-linked list. You will **not** be given access to the `head` of the list, instead you will be given access to **the node to be deleted** directly.

It is **guaranteed** that the node to be deleted is **not a tail node** in the list.

### 2. Remove Nth Node From End of List

Given the `head` of a linked list, remove the `nth` node from the end of the list and return its head.

### 3. Reverse Linked List

Given the `head` of a singly linked list, reverse the list, and return *the reversed list*.

### 4. Merge Two Sorted Lists

Merge two sorted linked lists and return it as a **sorted** list. The list should be made by splicing together the nodes of the first two lists.

### 5. Palindrome Linked List

Given the `head` of a singly linked list, return `true` if it is a palindrome.

### 6. Odd Even Linked List

Given the `head` of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return *the reorder list.*

The **first** node is considered odd, and the **second** node is **even**, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in `O(1)` extra space complexity and `O(n)` time complexity.

### 7. Middle of the Linked List

Given the `head` of a singly linked list, return *the middle node of the linked list.*
If there are two middle nodes, return **the second middle** node.

### 8. Swap Nodes in Paris

Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the value in the list's nodes (i.e., only nodes themselves may be changed)

### 9. Partition List

Given the `head` of a linked list and a value `x`, partition it such that all nodes **less than** `x` come before nodes **greater than or equal** to `x`.

You should **preserve** the original relation order of the nodes in each of the two partitions.

### 10. Add Two Numbers

You are given two **non-empty** linked list representing two non-negative integers. The digits are stored in **reverse order**, and each of their nodes contains a single digit. Add  the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

## Others

### 1. Valid Parentheses

Given a string `s` containing just the characters `(`, `)`, `{`, `}`, `[` and `]`, determine if the input string is valid.

As input string is valid if:
- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.

### 2. Missing Number

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

## Dynamic Programming

### 1. Climbing Stairs

You are climbing a staircase. It takes `n` steps to reach the top.

Each time you can either climb `1` or `2` steps. In how many distinct ways can you climb to the top?

### 2. Maximum Subarray

Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A **subarray** is a **contiguous** part of an array.

### 3. House Robber

You are a professional robber planning to rob houses along a street. Each houses has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and **it will automatically contact the police if two adjacent houses were broken into on the same night.**

Given an integer array `nums` representing the amount of money of each house, return the maximum amount of money you can rob tonight **without alerting the police.**

## List
### 1. Pascal's Triangle

Given an integer `numRows`, return the first numRows of **Pascal's triangle**.

In the **Pascal's triangle**, each number is the sum of the two numbers directly above.

# [5 Most used Sorting Algorithms](https://favtutor.com/blogs/sorting-algorithms-java)
### 1. Merge Sort
- **Time Complexity**: Sorting arrays on different machines. Merge Sort is a recursive algorithm and time complexity can be expressed as following recurrence relation.
```
T(n) = 2T(n/2) + O(n)
```
The above recurrence can be solved either using the Recurrence Tree method or the Master method. It falls in case II of Master Method and the solution of the recurrence is O(nLogn). Time complexity of Merge Sort is O(nLogn) in all 3 cases (worst, average and best) as merge sort always divides the array into two halves and take linear time to merge two halves.
- **Auxiliary Space**: O(n) 
- **Algorithmic Paradigm**: Divide and Conquer
- **Sorting In Place**: No in a typical implementation
- **Stable**: Yes

### 2. Insertion Sort

- **Time Complexity:** O(n^2)
- **Auxiliary Space:** O(1)

### 3. Selection sort

- **Time Complexity:** O(n^2) as there are two nested loops
- **Auxiliary Space:** O(1)

## Search

### 1. Binary Search
- **Time Complexity:** O(Log n)
