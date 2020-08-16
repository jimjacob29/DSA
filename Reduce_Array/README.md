Given a binary array (a binary array is an array consisting only of zeroes and ones) of size N. You can do following operation on the array any number of times. In an operation you can select any subarray of size 3 of the array such that all three elements of that subarray are not same and replace that subarray with a single element which is the element with frequency 2 in that subarray. For example if we are given array [0, 1, 0, 1, 1, 0] if we select subarray (0-2) then we will replace [0, 1, 0] with [0] so the array finally becomes [0, 1, 1, 0]. You have to find if it is possible to apply this operation some number of times to finally reduce the array to size 1.
Input
First line of input contains a single integer N, size of the array.
Second line contains N integers denoting the binary array.

Constraints:
3 <= N <= 100000
0 <= Arr[i] <= 1
Output
Print 1 if it is possible to finally reduce the array to size 1 else print 0.