**Learning of DSA using Java**
You are given N line segments on the number line. Each segment is denoted by two integers L and R (L <= R), denoting the start and end points of the segment.
You need to find the maximum number of segments overlapping at a point. More clearly, if you find the number of segments passing the point for all points on the number line, you need to report the maximum value obtained in the process.

Note: Even if segments overlap at the end points, it is considered an overlap.

See sample for better understanding.
Input
The first line of the input contains an integer N, the number of segments.
The next N line contain two space separated integers L and R, the end points of the ith segment.

Constraints
1 <= N <= 200000
0 <= L <= R <= 200000
Output
Output a single integer, the maximum number of segments overlapping at a point.