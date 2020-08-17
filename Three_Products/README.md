You are given a sequence a1, a2, . . . , an consisting of n integers.
You have to calculate three following values:
1. the number of pairs of indices (l, r) (l ≤ r) such that al · al+1 . . . ar−1 · ar is negative;
2. the number of pairs of indices (l, r) (l ≤ r) such that al · al+1 . . . ar−1 · ar is zero;
3. the number of pairs of indices (l, r) (l ≤ r) such that al · al+1 . . . ar−1 · ar is positive;
Input
The first line contains one integer n — the number of elements in the sequence.
The second line contains n integers a1, a2, . . . , an — the elements of the sequence.

Constraints
1 ≤ n ≤ 200000
−10^9 ≤ ai ≤ 10^9
Output
Print three integers — the number of subsegments with negative product, the number of subsegments
with product equal to zero and the number of subsegments with positive product, respectively.