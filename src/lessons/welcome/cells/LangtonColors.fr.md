
## La fourmi de Langton multicolore ##

Il y a plusieures façons de changer le concept de la fourmi de Langton. Dans
cet exercice, nous allons tout d'abord étudier le fait d'utiliser plus de
deux couleurs. Cela reste très similaire au cas de base : le comportement à
chaque pas dépendra toujours de la couleur du sol, mais vous aurez plus de
deux possibilitées. Cela permet d'avoir plus qu'une seule sorte de fourmi,
selon ce que l'on décide de faire pour chaque couleur. Par exemple, la
fourmi LRL reconnait trois couleurs. Elle tourne à gauche sur la première, à
droite sur la seconde et à gauche sur la troisième. Selon cette définition,
la fourmi de base est de type RL ( puisqu'elle tourne à droite sur les cases
blanches et à gauche sur les noires).

Certaines de ces fourmis dessinent des schémas fascinants ( changez de monde
pour les voir ):LLRR construit une figure symétrique ressemblant vaguement à
une balle. LRRRRRLLR dessine un carré, LLRRRLRLRLLR dessine un schéma
régulier tordu après une période ressemblant à un comportement chaotique, et
RRLLLRLLLRRR semble remplir un sablier...

Métamorphoser votre buggle en une fourmi de Langton générique n'est pas très
compliqué, même si ce n'est pas complètement trivial. Comme précédemment,
vous avez à écrire une fonction ` step` . Mais cette fois, elle
reçoit deux tableaux comme paramètres. Le premier définit les règles à
suivre selon la couleur du sol tandis que le deuxième done la séquence de
couleur à utiliser. Par exemple, la fourmi de base aurait ` {'R',
'L'}` et ` {Color.white, Color.black}` comme arguments.

A chaque pas, vous avez toujours à appliquer le pseudo-code suivant :

  
  
*  Trouver la position de la couleur du sol dans la séquence de couleur;  
*  Tourner à gauche ou à droite selon le contenu du tableau de règle à cette
position;  
*  Marquer le sol de la case courante avec la prochaine couleur dans la
séquence ( la dernière couleur est suivie par la première);  
*  Avancer d'un pas  

Vous devriez maintenant avoir assez d'informations pour réussir.


## Notes bibliographiques ##

Selon Wikipedia, les fourmis de Langton multicolores ont été découvertes en
1995 par Propp et Al. Un autre fait amusant est que les fourmis dont le nom
est une paire de lettres identiques (LL et RR) produisent des dessins
symétriques. Ce fait a même été prouvré formellement.

