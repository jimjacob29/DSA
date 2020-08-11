You are given two arrays - value and frequency both containing N elements.
There is also a third array C which is currently empty. Then you perform N insertion operation in the array. For ith operation you insert value[i] to the end of the array frequency[i] number of times.
Finally you have to tell the kth smallest element in the array C.
Input
First line of input contains N.
Second line contains N integers denoting array - value
Third line contains N integers denoting array - frequency
Fourth line contains single integer K.

Constraints
1 <= N, value[i], frequency[i] <= 100000
1 <= k <= frequency[1] + frequency[2] +frequency[3] +........ + frequency[N]
Output
Output a single integer which is the kth smallest element of the array C.