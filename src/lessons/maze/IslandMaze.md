
## Lost between islands ##

You thought that your algorithm was enough to escape mazes? Well,
not every mazes...

The *wall follower algorithm* we used so far only works if the entry and the exit
are placed near to walls connected to the external wall. But if the
buggle begins in the middle of the maze, it may exist wall sections
disconnected from the external wall.

That is why the previous strategy would let the buggle round around for
ever. Indeed, the maze you should now escape from contains islands,
and the buggle does not start along one of the external walls. Just
give it a try if you want: push the run button and see your previous
solution fail miserabily.

The method of following a wall is still good and allow to escape
very efficiently some sections of the maze, so we do not want to
remove it entierely. Instead, we want to stop following the wall under
some conditions. Notice that the baggle lays near to the external
border of the maze. So, we want to reach the border and then follow
that wall. We need for example to search for the north wall before
following it to the baggle.

To find the north wall, you simply run to the north as long as it's
possible, and when facing an obstacle, you avoid it (using previous
method).

  
  

<pre> ` Our new run() method will consist in two modes: our
buggle will alternate between the "north runner mode" and the "left
follower mode". You begin in "north runner mode", and switch to "left
follower" when you have a wall at the north (do not forget to make
sure you have a wall at your left before switching to "left follower"
mode). You switch to "north runner" as soon as your buggle is facing
north and is not in front of a wall during its trip around its left
wall. The easiest way to write such a state machine is something likeint state=0;
switch (state) {
case 0:
...
state = 1;
break;
case 1:
...
state = 0;
break;
}` </pre>
  
  

Don't forget to let the buggle pick the baggle at the end of your code.

You're up. That should be enough for you to figure out how to escape this
maze, but if not, you can always request for the tip. But you do not
need any more help, do you?
