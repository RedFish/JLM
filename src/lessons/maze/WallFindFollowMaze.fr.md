
## Longer les murs ##

C'est exactement le même labyrinthe que précédemment, mais le buggle ne
commence plus au même emplacement. En particulier, il n'a plus de mur à sa
gauche dès le départ.

Ceci engendre que la méthode que vous avez écrite à l'exercice précédent ne
fonctionne plus ici. Si vous cliquez sur le bouton 'run' sans modification
du code, votre buggle va probablement commencer à tourner sur les quatres
cases à côté de sa position de départ (si ça n'est pas le cas, et bien, vous
n'avez pas réellement suivi la mission de l'exercice précédent. Sentez vous
chanceux et passez à l'exercice suivant une fois que vous aurez lu ce
texte).

C'est parce que votre méthode ` keepHandOnSideWall()` a une **pré-condition** implicite : la méthode marche bien si et seulement si
le buggle a un mur sur sa gauche quand vous appelez cette méthode. De telles
pré-conditions sont très utilisées en programmation. Les spécifier
explicitement aide à comprendre le code écrit par d'autres personnes, et
peuvent même parfois prouver que le code marche correctement.


### Objectif de cet exercice ###

Réparer le problème devrait être très facile. Assurez-vous simplement que la
pré-condition de ` keepHandOnSideWall()` est vérifiée avant de
l'appeler Pour ce faire, mettez à jour votre méthode run() pour tout d'abord
rechercher à avoir un mur à sa gauche avant de rentrer dans la grande boucle ` while` .

