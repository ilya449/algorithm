We want to know how many different ways exist to obtain certain integer number as a sum of smaller
positive numbers, taking into account a certain list of numbers that cannot be used.
Considerations
• If A + B = B + A, only one of them should be indicated
• In addition, A > 0 and B > 0
Input:
Each case is described in one line with an integer number X, which is the value to obtain, and a list of M
positive numbers N0, N1 ... NM-1 separated by a space. These values cannot be used as operands.
Output
For each case T, the output must be the string "#t:" followed by the total number of possible ways. For example:
Sample input
`3 1`
`6 1 3`
Sample output
`#1: 0`
`#2: 2`
In the first case (3), there is no way to get 3 from 1 and 2 without using operand 1. The second case (6)
can be calculated with operations 2 + 2 + 2 and 4 + 2, so there are 2 possible ways without using
operands 1 and 3.
