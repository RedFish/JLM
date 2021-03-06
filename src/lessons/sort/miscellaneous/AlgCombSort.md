
# Miscellaneous sorting #

## CombSort ##

We saw that CocktailSort improve a bit for turtles (i.e. small values near to
the end of the array), but it is still possible to achieve better. ComboSort
comes down to providing them a short cut: instead of comparing adjacent
values, we compare values separated by a gap bigger than 1. That way,
turtles we traverse *gap* cells at each traversal. Naturally, we have
to apply the algorithm with decreasing gaps, and finish with *gap=1* to
ensure that the array is correctly sorted afterward. Choosing the right gap
and how to decrease it is a difficult question, but in practice, dividing it
by 1.3 after each traversal leads to good performance. Here is the
corresponding pseudo-code:


<pre> gap = len;
do
if gap>1 then
gap = gap / 1.3
i = O
while i+gaplen do:
if i and i+gap must be swapped, do it
increase i by the gap
while the gap is bigger than 1 or the last traversal swapped at least one pair</pre>

This algorithm was invented by Wlodek Dobosiewicz in 1980, and later
rediscovered and popularized by Stephen Lacey and Richard Box, who described
it in Byte Magazine in April 1991.

