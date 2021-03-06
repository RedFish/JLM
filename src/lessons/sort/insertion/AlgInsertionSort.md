
# Insertion algorithms and variations #

This exercise allows you to experiment with the insertion sort and its major
variations.


## InsertionSort ##

This sorting algorithm is quite simple to understand and write, even if it
is not as efficient as possible. Its asymptotic complexity is in O(n2), but
it is more efficient in practice (linear in best case, ie when the array is
already sorted, and N2/4 on average).

The idea is to traverse all elements of the array, and to insert each of
them into its proper position in the already sorted part of the array. When
we look at an element x, the situation is the following: any elements to the
left of the array are already sorted, and we have to insert x at its
position in the array.

  
  
<img src="lessons/sort/insertion/Insertionsort-before.png" />   
  

Once this is done, the situation is the following:

  
  
<img src="lessons/sort/insertion/Insertionsort-after.png" />   
  

The pseudo-code of this algorithm is thus the following:


<pre> For each i in [1,len]
store the value of i in a variable val
copy the cell i-1 into i if i-1 contains a value bigger than val
copy the cell i-2 into i-1 if i-2 contains a value bigger than val
copy the cell i-3 into i-2 if i-3 contains a value bigger than val
copy the cell i-4 into i-3 if i-4 contains a value bigger than val
...
copy val into the last cell copied above</pre>

Naturally, you should use a loop to write the big permutation within the
given loop. Writing it this way would be really ... counter-productive.

If you've always wondered what computer science researchers do nowadays,
here is part of the answer: They improve fundamental algorithms so that
others can write efficient programs.


## Other variation of insertion sort ##

TreeSort builds a binary search tree to sort them. It leads to a O(n log(n))
on average, but O(n^2) in worst cases. We won't study this algorithm here
since unterstanding its behavior requires to know what a binary tree is,
what is beyond our present goals.

There is other variations over the insertion sort, such as PatienceSort
which builds piles of values and sort each pile afterward. This algorithm
presents a 0(n log(n)) timing worst case and a 0(n) space
complexity. LibrarySort (proposed in 2004) also trades a bit space in
exchange for time since it provide a time complexity of O(n log(n)) but
needs to store some more data.

Wikipedia provides a detailled description of all these algorithms we cannot
present here because of time constraints.

