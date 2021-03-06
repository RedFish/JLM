
# Tris divers #

## CombSort ##

Nous avons vu que le tri cocktail permet d'améliorer un peu les choses pour
les tortues (ie, les petites valeurs près de la fin du tableau), mais on
peut faire mieux. CombSort revient à leur faire prendre un racourci: Au lieu
de comparer les valeurs adjacentes, on compare des valeurs séparés par un
écart plus grand que 1. Ainsi, les tortues vont se déplacer de *ecart* cases à chaque parcours. Bien entendu, il faut appliquer l'algorithme avec
des écarts de plus en plus petit et terminer avec *ecart=1* pour
s'assurer que le tableau est entièrement trié à la fin. Choisir comment
réduire l'écart entre les parcours est une question difficile (voir
wikipédia en anglais sur le thème), mais en pratique, le diviser par 1.3 à
chaque fois amène de bons résultats. Voici le pseudo-code correspondant :


<pre> ecart = lgr;
faire
si ecart>1 alors
ecart = ecart / 1.3
i = O
tant que i+ecartlgr faire:
si i et i+ecart doivent être inversés, le faire
ajouter ecart à i
tant que l'écart est plus grand que 1 ou que le dernier parcours a inversé au moins un élément</pre>

Cet algorithme a été inventé par Wlodek Dobosiewicz en 1980 et redécouvert
et popularisé par Stephen Lacey et Richard Box, qui l'ont décrit dans le
magazine Byte d'avril 1991.

