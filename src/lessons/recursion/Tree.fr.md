
## Arbres ##
Nous allons maintenant dessiner des arbres. Pour cela, nous allons écrire
une fonction doublement récursive de prototype 
<pre> void tree(int steps, double length, double angle, double shrink)</pre>

Pour dessiner un arbre à quatre étages, il faut dessiner un tronc de la
taille indiquée, tourner à droite de l'angle indiqué, faire un arbre à 3
étages, tourner à gauche de deux fois l'angle indiqué, faire un autre arbre
à 3 étages, puis revenir à sa position initiale.

Si le tronc d'un arbre mesure length à l'étage N, il mesure shrink*length à
l'étage N+1.

