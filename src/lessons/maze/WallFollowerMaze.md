
## Following the walls ##

This time, the maze is a bit more complicated. Random won't be enough, we
ough to be smart!

Hopefully, this maze is simpler that it seems at the first glance:
every wall are connected to each other. To get out of this kind of
maze, the buggle only have to follow a wall (the one on its left or
the one on its right, it doesn't matter).  While keeping a paw on the
wall, the buggle must move forward until it finds the maze exit
and this biscuit it loves so much.

This algorithm works here because there is no island of isolated
walls, so our buggle cannot loop around for ever without encountering
the baggle it looks for.


### Exercise goal ###
The goal of this exercise is to write an algorithm allowing the buggle to
get out of this maze.

As said in the introduction, it is exactly the same if you decide
to follow the left wall or the right one. Simply, the demo follows the
left one, so you should do the same in your solution to ease the
comparison of your solution and the demo.

Write a method ` void keepHandOnSideWall()` which lets the buggle
move one step forward while keeping the paw on the wall of the selected
side. You thus have to ensure that the buggle always keep the paw on the
wall, but also that it won't crash into a wall. You can check the tip
for more info on this, but only do so if you're stuck. Try to do it
without the tip first.

Then, write a ` run()` method which traverse the maze step
by step (using ` void keepHandOnSideWall()` ) until it finds
the biscuit and the exit. Don't forget to pick the baggle up once
you've found it.

  
  

When your buggle has a wall on the left, there is three situations to
consider, depending on the surrounding walls. The following table
depicts each initial situation, and where you should let your buggle
end after one step.



<table border=1>
	<tr>
		<td > </td>
		<td > Case 1 </td>
		<td > Case 2 </td>
		<td > Case 3 </td>
	</tr>
	<tr>
		<td > Initial situation </td>
		<td > <img src="lessons/maze/1A.png" /> </td>
		<td > <img src="lessons/maze/2A.png" /> </td>
		<td > <img src="lessons/maze/3A.png" /> </td>
	</tr>
	<tr>
		<td > Where is the next step </td>
		<td > <img src="lessons/maze/1B.png" /> </td>
		<td > <img src="lessons/maze/2B.png" /> </td>
		<td > <img src="lessons/maze/3B.png" /> </td>
	</tr>
</table>

If you do a ` turnRight()` in any case at the end of your
function, it's possible to write it in 3 lines with a ` while()` loop.
