
## Instructions ##
Congratulations! You just wrote your first program! You got the idea now:
programming is nothing more than giving simple instructions to the computer that
blindly apply them. The main difficulty is to explain stuff to someone as stupid
as a computer...

Programs are mainly suites of method calls, which are no more than a list of
simple order given to the machine. It is very similar to a recipe stating *Melt the chocolate pieces, add sugar, cool the mix and serve* .
In your programs, such built instructions are called functions or methods, and you
should add parenthesis to invoke them, as in 
<pre> nameOfTheMethod()</pre>

<java>

Java want to have the instructions separated by semi-columns (;).
The previous example would thus be written in a similar way:

</java> 
<java> 
<pre> meltTheChocolatePieces();
addSugar();
coolMix();
serve();</pre>
</java> 
<python>

Python want to have the instructions
separated by either semi-columns (;) or by new lines. The previous example would thus
be written the following way.

</python> 
<python> 
<pre> meltTheChocolatePieces()
addSugar()
coolMix()
serve()</pre>
</python> 
<python>

It could also be written in the following way, but it's generally considered as a bad
practice to group several instructions on the same line since it greatly hinders the
readability.

</python> 
<python> 
<pre> meltTheChocolatePieces(); addSugar(); coolMix(); serve()</pre>
</python> 
<java>

Of course, these specific methods do not exist in Java, but it may be possible
to define them by yourself (we'll see later how to define your how methods).

</java> 
<python>

Of course, these specific methods do not exist in Python, but it may be possible
to define them by yourself (we'll see later how to define your how methods).

</python> 

For now,
we'll simply go for the buggle instructions. There is a method for each button of the
interactive control panel. To achieve the same effect than the **forward** button
(making the buggle moving one step forward), you need to write the following in the
editor: 
<java> 
<pre> forward();</pre>
</java> 
<python> 
<pre> forward()</pre>
</python> Likewise, to achieve the same effect than the **backward** , **turn left** and **turn right** buttons, you need to use respectively: 
<java> 
<pre> backward();
turnLeft();
turnRight();</pre>
</java> 
<python> 
<pre> backward()
turnLeft()
turnRight()</pre>
</python> The **mark** button is a bit particular, since it correspond to two
methods: the first one moves the pen up while the second moves it down. 
<java> 
<pre> brushDown();
brushUp();</pre>
</java> 
<python> 
<pre> brushDown()
brushUp()</pre>
</python> 

The buggle offers other methods, that are presented from the "Help/about
this world" menu and will be introduced on need.


### Exercise goal ###

