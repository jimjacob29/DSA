There are n people in a circle, numbered from 1 to n, each of whom always tells the truth or always lies.
Each person i makes a claim of the form: “the number of truth-tellers in this circle is between ai and bi, inclusive.”
Compute the maximum number of people who could be telling the truth.
Input
The first line contains a single integer n (1 ≤ n ≤ 10^3).
Each of the next n lines contains two space-separated integers ai and bi
(0 ≤ ai ≤ bi ≤ n).
Output
Print, on a single line, the maximum number of people who could be telling the truth. If the given
set of statements are inconsistent, print -1 instead.