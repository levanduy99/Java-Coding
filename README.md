# Purpose

I want to improve my programming skills. 

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

### 27. Max Area of Island

You are given an `m x n` binary matrix `grid`. An island is a group of `1`'s (representing land) connect **4 - directionally** (horizontal or vertical). You may assume all four edges of the gird are surrounded by water.

The **area** of an island is the number of cells with a value `1` in the island.

Return *the maximum **area** of an island in `grid`*. If there is no island, return `0`.

### 28. Island Perimeter

You are given `row x col` `grid` representing a map where `grid[i][j] = 1` represents land and `grid[i][j] = 0` represents water.

Grid cells are connected **horizontally/vertically** (not diagonally). The `grid` is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).

The island doesn't have "lakes", meaning the water inside isn't connected to the water around island. One cell is a square with side length = 1. the grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

### 29. Max Consecutive Ones

Given a binary array `nums`, return *the maximum number of consecutive `1`'s in the array*.

### 30. Fruit Into Baskets

You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees represented by an integer array `fruits` where `fruits[i]` is the **type** of fruit the `i_th` tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

- You only have **two** baskets, and each basket can only hold a **single type** of fruit. There is no limit on the amount of fruit each basket can hold.
- Starting from any tree of your choice, you must pick **exactly one fruit** from **every** tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
- Once you reach a tree with fruit that cannot fit your baskets, you must stop.

Given the integer array `fruits`, return *the **maximum** number of fruits you can pick*.

### 31. Letter Combinations of a Phone Number

Given a string containing digits from `2 - 9` inclusive, return all possible combinations that the number could represent. Return the answer in **any order**.

A mapping of digit to letter (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

### 32. Subarray Sum Equals K

Given an array of integers and an integer **k**, return *the total number of continuous subarray whose sum equals to `k`*.

### 33. Sort Colors

Given an array `nums` with `n` objects colored red, white, or blue, sort them **in-place** so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers `0`, `1` and `2` to present the color red, white, and blue respectively.

You must solve this problem without using the library's sort function. 

### 34. Lemonade Change

At a lemonade stand, each lemonade costs `$5`. Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills). Each customer will only buy one lemonade and pay with either a `$5`, `$10`, or `$20` bill. You must provide the correct change to each customer so that the next transaction is that the customer pays `$5`.

Note that you don't have any change in hand at first. 

Given an integer array `bills` where `bills[i]` is the bill the `i_th` customer pays, return `true` if you can provide every customer with correct change, or `false` otherwise.

### 35. Min Cost Climbing Stairs

You are given an integer array `cost` where `cost[i]` is the cost of `i_th`  step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index `0`, or the step with index `1`. Return *the minimum cost to reach the top of the floor*.

### 36. Find Pivot Index

Given an array of integer `nums`, calculate the **pivot index** of this array. The **pivot index** is the index where the sum of all the numbers **strictly** to the left of the index is equal to the sum of all the numbers **strictly** to the index's right.

If the index is on the left edge of the array, then the left some is `0` because there are no elements to the left. This also applies to the right edge of the array.

Return *the **leftmost pivot index***. If no such index exists, return -1;

### 37. Find First and Last Position of Element in Sorted Array

Given an array of integer `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value. 

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `0(log n)` runtime complexity.

### 38. Flipping an Image

Given an `n x n` binary matrix `image`, flip the image **horizontally**, then invert it, and return *the resulting image*. 

To flip an image horizontally means that each row of the image is reversed.
- For example, flipping `[1,1,0]` horizontally result in `[0,1,1]`.
To invert an image means that each `0` is replaced by `1`, and each `1` is replaced by `0`.
- For example, inverting `[0,1,1]` result in `[1,0,0]`.

### 39. Rectangle Overlap

An axis-aligned rectangle is represented as a list `[x1, y1, x2, y2]`, where `(x1, y1)` is the coordinate of its bottom-left corner, and `(x2, y2)` is the coordinate of its top-right corner. Its top and bottom edges are parallel to the X - axis, and its left and right edges are parallel to the Y - axis.

Two rectangles overlap if the area of their intersection is positive. To be clear, two rectangles that only touch at the corner or edges do not overlap.

Given two axis-aligned rectangles `rec1` and `rec2`, return `true` *if they overlap, otherwise return `false`*.

### 40. Assign Cookies

Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.

Each child `i` has a greed factor `g[i]`, which is the minimum size of a cookie that the child will be content with; and each cookie `j` has a size `s[j]`. If `s[j] >= g[i]`, we can assign the cookie `j` to the child `i`, and the child `i` will be content. Your goal is to maximize the number of your content children and output the maximum number.

### 41. Search in Rotated Sorted Array

There is an integer array `nums` sorted in ascending order (with **distinct** values). 

Prior to being passed to your function, `nums` is **possibly rotated** at an unknown pivot index `k (1 <= k < nums.length)` such that the resulting array is `[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]` (**0-indexed**). For example, `[0,1,2,4,5,6,7]` might be rotated at pivot index `3` and become `[4,5,6,7,0,1,2]`.

Given the array `nums` **after** the possible rotation and an integer **target**, return *the index of `target` if it is in `nums`, or `-1` if it is not in `nums`*.

You must write an algorithm with `O(log n)` runtime complexity.

### 42. Flood Fill

An image is represented by an `m x n` integer grid `image` where `image[i][j]` represents the pixel value of the image.

You are also given three integer `sr`, `sc`, and `newColor`. You should perform a **flood fill** on the image starting from the pixel `image[sr][sc]`.

To perform a **flood fill**, consider the starting pixel, plus any pixels connected **4-directionally** to the starting pixel of the sem color as the starting pixel, push any pixels connected **4-directionally** to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with `newColor`.

Return the *modified image after performing the flood fill*.

### 43. Product of Array Except Self

Given an integer array `nums`, return *an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

The product of any prefix or suffix of `nums` is **guaranteed** to fit in a **32-bit** integer.

You must write an algorithm that runs in `O(n)` time and without using the division operation.

### 44. Find All Duplicates in an Array

Given an integer array `nums` of length `n` where all the integers of `nums` are in the range `[1, n]` and each integer appears **once** or **twice**, return *an array of all the integers that appears **twice***

You must write an algorithm that runs in `O(n)` time and uses only constant extra space.
### 45. Asteroid Collision

We are given an array `asteroids` of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

### 46. Contiguous Array

Given a binary array `nums`, return the maximum *length of a contiguous subarray with an equal number of `0` and `1`.

### 47. Find Minimum is Rotated Sorted Array

Suppose an array of length `n` sorted in ascending order is **rotated** between 1 and n times. Notice that **rotating** an array `[a[0], a[1], a[2], ..., a[n-1]]` 1 time results in the array `[a[n-1], a[0], a[1], a[2], ..., a[n-2]]`.

Given the sorted rotated array `nums` of **unique** elements, return the minimum element of this array.

### 48. Minimum Absolute Difference

Given an array of **distinct** integers `array`, find all pairs of elements with the minimum absolute difference of any two elements.

Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
- `a, b` are from `array`
- `a < b`
- `b - a` equals to the minimum absolute difference of any two elements in `array`

### 47. Unique Number of Occurrences

Given an array of integers `array`, return `true` if the number of occurrences of value in the array is **unique**. or `false` otherwise.

### 48. Reshape the Matrix

In MATLAB, there is a handy function called `reshape` which can reshape an `m x n` matrix into a new one with a different size `r x c` keeping its original data.

You are given an `m x n` matrix `mat` and two integers `r` and `c` representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the `reshape` operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

### 49. Longest Continuous Increasing Subsequence

Given an unsorted array of integers `nums`, *return the length of the longest **continuous increasing subsequence** (i.e. subarray)*. The subsequence must be **strictly** increasing.

A continuous increasing subsequence is defined by two indices `l` and `r` `(l < r)` such that it is `[nums[l], nums[l + 1], ..., nums[r - 1], nums[r]]` and or each `l <= i < r`, `nums[i] < nums[i + 1]`.

### 50. Monotonic Array

An array is **monotonic** if it is either monotone increasing or monotone decreasing.

An array `nums` is monotone increasing if for all `i <= j`, `nums[i] <= nums[j]`. An array `nums` is monotone decreasing is for all `i <= j`, `nums[i] >= nums[j]`.

Given an integer array `nums`, return `true` if the given array is monotonic, or `false` otherwise.

### 51. Subarray Product Less Than K

Given an array of integers `nums` and an integer `k`, return the number of *contiguous subarrays where the product of all the elements in the subarray is strictly less* than `k`. 

### 52. Single Number II

Given an integer array `nums` where every element appears **three times** except for one, which appears exactly once. *Find the single element and return it*.
 
You must implement a solution with a linear runtime complexity and use only constant extra space.

### 53. Battleships in a Board

Given an `m x n` matrix `board` where each cell is a battleship `'X'` or empty `'.'`, return *the number of the **battleships** on `board`*.

**Battleships** can only be placed horizontally and vertically on `board`. In other words, they can only be made of the shape `1 x k` (`1` row, `k` columns) or `k x 1` (`k` rows, `1` column), where `k` can be of any size. At least one horizontal or vertical cell separates between two battleships (i.e., there are no adjacent battleships).

### 55. Kth Largest Element in an Array

Given an integer array `nums` and an integer `k`, return the `k_th` largest element in the array.

Note that it is the `k_th` largest element in the sorted order, not the `k_th` distinct element.

### 56. Unique Paths

There is a robot on an `m x n` grid. The robot is initially located at the **top-left corner** (i.e., `grid[0][0]`). The robot tries to move to the **bottom-right corner** (i.e., `grid[m - 1][n - 1]`). The robot can only move either down or right at any point in time.

Given the two integer `m` and `n`, return *the number of possible unique paths that the robot can take to reach the bottom-right corner.

### 57. Boats to Save People

You are given an array `people[i]` is the weight of the `i_th` person, and an **infinite number of boats** where each boat can carry a maximum weight of `limit`. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most `limit`.

Return *the minimum number of boats to carry every given person*.

### 58. Last Stone Weight

You are given an array of integers `stones` where `stones[i]` is the weight of the `i_th` stone.

We are playing a game with the stones. On each turn, we choose the **heaviest two stones** and smash them together. Suppose the heaviest two stones have weight `x` and `y` with `x <= y`.  The result of this smash is:
- if `x == y`, both stones are destroyed, and
- if `x != y`, the stone of weight `x` is destroyed, and the stone of weight `y` has new weight `y - x`.

At the end of the game, there is at most one stone left.
Return the *smallest possible weight of the left stone*. If there are no stones left, return 0.

### 59. Partition Equal Subset Sum

Given a **non-empty** array `nums` containing **only positive integers**, find if the array can be partitioned into subsets such that the sum of elements in both subsets is equal.

### 60. Find the largest three distinct elements in an array

Given an array with all distinct elements, find the largest three elements. Expected time complexity is O(n) and extra space is O(1).

### 61. Intersection of two lists

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
### 18. Remove All Adjacent Duplicates in String

You are given a string `s` consisting of lowercase English letters. A **duplicate removal** consists of choosing two **adjacent** and **equal** letters and removing them.

We repeatedly make **duplicate removals** on `s` until we no longer can.

Return *the final string after all such duplicate removals have been made*. It can be proven that the answer is **unique**.

### 19. Find Words That Can Be Formed by Characters

You are given an array of strings `words` and a string `chars`. A string is **good** if it can be formed by characters from chars (each character can only be used once).

*Return the sum of lengths of all good strings in words*.

### 20. Rotate String

Given two strings `s` and `goal`, return `true` *if and only if `s` can become `goal` after some number of **shifts** on `s`*. A **shift** on `s` consists of moving the leftmost character of `s` to the rightmost position.

### 21. License Key Formatting

You are given a license key represented as a string `s` that consists of only alphanumeric characters and dashes. The string is separated into `n + 1` groups by `n` dashes. You are also given an integer `k`.

We want to reformat the string `s` such that each group contains exactly `k` characters, except for the first group, which could be shorter  than `k` but still must contain at least one character. Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.

### 22. Longest Substring Without Repeating Characters

Given a string `s`, find the length of the **longest substring** without repeating characters.

### 23. Shortest Distance to a Character

Given a string `s` and a character `c` that occurs in `s`, return an array of integers `answer` where `answer.length == s.length` and `answer[i]` is the **distance** from index `i` to the closest occurrence of character `c` in `s`.

The **distance** between two indices `i` and `j` is `abs(i - j)`.

### 24. Decode String 

Given an encoded string, return its decoded string.

The encoding rule is: `k[encoded_string]`, where the `encoded_string` inside the square brackets is being repeated exactly `k` times. Note that `k` is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, `k`. For example, there won't be input like `3a` or `2[3]`

### 25. Long Pressed Name

Your friend is typing his `name` into a keyboard. Sometimes, when typing a character `c`, the key might get *long pressed*, and the character will be typed 1 or more times.

You examine the `typed` characters of the keyboard. Return `True` if it is possible that it was your friends name, with some characters (possible none) being long pressed.

### 26. Longest Repeating Character Replacement

You are given a string `s` and an integer `k`. You can choose character of the string and change it to any other uppercase English character. You can perform this operation at most `k` times.

Return *the length of the longest substring containing the same letter you can get after performing the above operations*.

### 27. Longest Palindrome

Given a string `s` which consists of lowercase and uppercase letters, return *the length of the **longest palindrome*** that can be built with those letters.

Letters are **case sensitive**, for example, `"Aa"` is not considered a palindrome here.

### 28. Word Pattern

Given a `pattern` and a string `s`, find if `s` follows the same pattern.

Here **follow** means a full match, such that there is a bijection between a letter in `pattern` and a **non-empty** word in `s`.

### 29. Maximum Number of Ballons

Given a string `text`, you want to use the character of `text` to form as many instances of the word **"balloon"** as possible.

You can use each character in `text` **at most once**. Return the maximum number of instances that can be formed.

### 30. Is Subsequence

Given two strings `s` and `t`, return `true` if `s` is a **subsequence** of `t`, or `false` otherwise.

A **subsequence** of a string is a new string that is formed from the original string b deleting some (can be non) of the characters without disturbing the relative positions of the remaining characters.
### 31. Repeated Substring Pattern

Given a string `s`, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

### 32. Minimum Remove to Make Valid Parentheses

Given a string s of `'('` , `')'` and lowercase English characters.

Your task is to remove the minimum number of parentheses ( `'('` or `')'`, in any positions ) so that the resulting parentheses string is valid and return **any** valid string.

Formally, a *parentheses string* is valid if and only if:
- It is the empty string, contains only lowercase characters, or
- It can be written as `AB` (`A` concatenated with `B`), where `A` and `B` are valid strings, or
- It can be written as `(A)`, where `A` is a valid string.

### 33. Find All Anagrams in a String

Given two strings `s` and `p`, return *an array of all the start indices of `p`'s anagrams in `s`. You may return the answer in **any order**.

An **Anagram** is a words or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly one.

### 34. Find the Difference

You are given two strings `s` and `t`. String `t` is generated by random shuffling string `s` and then add one more letter at a random position. 

Return the letter that was added to `t`.

### 35. Sort Characters By Frequency

Given a string `s`, sort it in **decreasing order** based on the **frequency** of the characters. The **frequency** of a character is the number of times it appears in the string.

Return *the sorted string*. If there are multiple answers, return any of them.

### 36. Group Anagrams

Given an array of strings `strs`, group **the anagrams** together. You can return the answer in **any order**.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

### 37. Reorganize String

Given a string `s`, rearrange the characters of `s` so that any two adjacent characters are not the same.

Return *any possible rearrangement of s or return "" if not possible*.

### 38. Defanging an IP Address

Given a valid (IPv4) IP `address`, return a defanged version of that IP address.
A *defanged* address replaces every period `"."` with `"[.]"`.

### 39. Add Strings

Given two non-negative integers, `num1` and `num2` represented as string, return *the sum of num1 and num2 as a string*.

You must solve the problem without using any built-in library for handling large integers (such as `BigInteger`). You must also not convert the inputs to integers directly.

### 40. Detect Capital

We define the usage of capitals in a word to be right when one of the following cases holds:
- All letters in this word are capitals, like `"USA"`.
- All letters in this word are not capitals, like `"leetcode"`.
- Only the first letter in this word is capital, like `"Google"`.

Given a string `word`, return `true` if the usage of capitals in it is right.

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

### 11. Next Greater Node In Linked List

You are given the `head` of a linked list with `n` nodes. For each node in the list, find the value of the **next greater node**. That is, for each node, find the value of the first node that is next to it and has a **strictly larger** value than it.

Return an integer array `answer` where `answer[i]` is the value of the next greater node of the `i_th` node (**1-indexed**). If the `i_th` node does not have a next greater node, set `answer[i] = 0`.

## Others

### 1. Valid Parentheses

Given a string `s` containing just the characters `(`, `)`, `{`, `}`, `[` and `]`, determine if the input string is valid.

As input string is valid if:
- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.

### 2. Missing Number

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

### 3. Generate Parentheses

Given `n` pairs of parentheses, write a function to *generate all combinations of well-formed parentheses*.

### 4. Binary Number with Alternating Bits

Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

### 5. Number Complement

The **complement** of an integer is the integer gou get when you flip all the `0` 's to `1`'s and all the `1`'s to `0`'s in its binary representation.
- For example, the integer `5` is `"101"` in binary and its **complement** is `"010"` which is the integer `2`.

Given an integer `num`, return *its complement*.

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

## SQL

### 1. Duplicate Emails

Table: `Person`

Column Name | Type 
--- | ---
id | int
email | varchar

- id is the primary key column for this table.
- Each row of this table contains an email. The emails will not contain uppercase letters.

Write an SQL query to report all the duplicate emails.
Return the result table in **any order**.

#### Solution 
```
SELECT Email FROM (SELECT Email, COUNT(Email) AS c FROM Person GROUP BY Email) Person WHERE c > 1;
```

### 2. Combine Two Tables

Table: `Person`

Column Name | Type
--- | ---
personId | int
lastName | varchar
firstName | varchar

- personId is the primary key column for this tables.
- This table contains information about the ID of some persons and their first and last names.

Table: `Address`

Column | Type
--- | ---
addressId | int
personId | int
city | varchar
state | varchar

- addressId is the primary key column for this table.
- Each row of this table contains information about the city and state of one person with ID = PersonId.

Write an SQL query to report the first name, last name, city, and state of each person in the `Person` table. If teh address of a `personId` is not present in the `Address` table, report `null` instead.

Return the result table in **any order**.

#### Solution 
```
SELECT Person.firstName, Person.lastName, Address.city, Address.state FROM Person LEFT JOIN Address ON Person.personId = Address.personId;
```

### 3. Customer Who Never Order.

Table: `Customers`

Table: `Orders`

Write an SQL query to report all customers who never order anything. Return the result table in **any order**. 

#### Solution 
```
SELECT
c.Name AS Customers
FROM customers AS c
LEFT JOIN orders AS o
ON c.id = o.customerid
WHERE o.customerid IS NULL;
```

## List
### 1. Pascal's Triangle

Given an integer `numRows`, return the first numRows of **Pascal's triangle**.

### 2. Subsets

Given an integer array `nums` of **unique** elements, return *all possible subsets (the power set)*.
The solution set **must not** contain duplicate subset. Return the solution in **any order**.

In the **Pascal's triangle**, each number is the sum of the two numbers directly above.

### 3. Partition Labels

You are given a string `s`. We want to partition the string into as many parts as possible so that each letter appears in at most one part.

Return a list of integers representing the size of these parts.

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
