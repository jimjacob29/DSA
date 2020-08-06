
You are given resistance value of N resistors. Find the net resistance of the system when all of these N resistors are connected in parallel.

If there are three resistors A1, A2, A3, when they are connected in parallel, the net resistance will be 1/((1/A1) + (1/A2) + (1/A3))

Since this number can also have a fraction part, you only have to print the floor of the result obtained.
For example, if value of 1/((1/A1) + (1/A2) + (1/A3)) if 7.54567, you only have to print 7.
Input
First line contains a single integer N denoting the number of resistors.
Next line contains N space separated integers containing the value of different resistors.

Constraints
1 ≤ N ≤ 10^5
1 ≤ Ai ≤ 10^9
Output
Print the integral part or floor of the value obtained from the formula 1/((1/A1) + (1/A2) + ..... + (1/AN)).