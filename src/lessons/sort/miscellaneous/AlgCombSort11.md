
# Miscellaneous sorting #

## CombSort11 ##

The authors of this algorithm observed that the performance is increased if
we make sure that the last values of the gap are (11, 8, 6, 4, 3, 2, 1)
rather than (9, 6, 4, 3, 2, 1) or (10, 7, 5, 3, 2, 1). Rework the code of
CombSort to ensure just after the gap update that if it is 9 or 10, we
should use 11 instead.

