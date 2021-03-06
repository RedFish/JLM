
## Créer des Turmites ##

Cet exercice vous permet de construire vos propres turmites. Pour réussir
cet exercice, vous devez simplement écrire une méthode ` init()` qui initialise ` rule` pour utiliser les tables de transitions
suivantes ( de Wikipedia ), met la position initiale du buggle à (8;33), et
demande de faire 8342 pas.



<table border=1>
	<tr>
	</tr>
	<tr>
	</tr>
	<tr>
	</tr>
	<tr>
		<td > 1 </td>
		<td > R </td>
		<td > 0 </td>
		<td > 1 </td>
		<td > R </td>
		<td > 1 </td>
	</tr>
	<tr>
		<td > 0 </td>
		<td > N </td>
		<td > 0 </td>
		<td > 0 </td>
		<td > N </td>
		<td > 1 </td>
	</tr>
</table>

Où les virages à effectuer sont **L** (90° vers la gauche -- left), **R** (90° vers la droite -- right), **N** (rien -- no turn), **U** (demi tour de 180° -- U-turn).


## Aller plus loin ##

Cet exercice est naturellement une excuse pour vous laisser expérimenter vos
propres turmites. Vous êtes libres de changer la table de transition et le
nombre de pas pour expérimenter par vous-même. A ce propos, vous pouvez
trouver la bibliothèque Ed Pegg Jr's utile. Si vous trouvez de nouveaux
schémas intéressants, envoyez-les nous pas email afin que nous les puissions
les ajouter à cette liste.

De plus, Wikipedia manque désespérement de quelques beaux et colorés
turmites: seuls des noirs et blancs sont décrits. Vous pouvez considérer
l'idée de soumettre vos créations directement à l'encyclopédie libre.


<pre> EdPeggJrTurmiteLibrary = [
# source: http://demonstrations.wolfram.com/Turmites/
# Translated into his later notation: 1=noturn, 2=right, 4=u-turn, 8=left
# (all these are 2-color patterns)
"{{{1, 2, 0}, {0, 8, 0}}}",  # 1: Langton's ant
"{{{1, 2, 0}, {0, 1, 0}}}",  # 2: binary counter
"{{{0, 8, 1}, {1, 2, 1}}, {{1, 1, 0}, {1, 1, 1}}}", # 3: (filled triangle)
"{{{0, 1, 1}, {0, 8, 1}}, {{1, 2, 0}, {0, 1, 1}}}", # 4: spiral in a box
"{{{0, 2, 1}, {0, 8, 0}}, {{1, 8, 1}, {0, 2, 0}}}", # 5: stripe-filled spiral
"{{{0, 2, 1}, {0, 8, 0}}, {{1, 8, 1}, {1, 1, 0}}}", # 6: stepped pyramid
"{{{0, 2, 1}, {0, 1, 1}}, {{1, 2, 1}, {1, 8, 0}}}", # 7: contoured island
"{{{0, 2, 1}, {0, 2, 1}}, {{1, 1, 0}, {0, 2, 1}}}", # 8: woven placemat
"{{{0, 2, 1}, {1, 2, 1}}, {{1, 8, 1}, {1, 8, 0}}}", # 9: snowflake-ish
"{{{1, 8, 0}, {0, 1, 1}}, {{0, 8, 0}, {0, 8, 1}}}", # 10: slow city builder
"{{{1, 8, 0}, {1, 2, 1}}, {{0, 2, 0}, {0, 8, 1}}}", # 11: framed computer art
"{{{1, 8, 0}, {1, 2, 1}}, {{0, 2, 1}, {1, 8, 0}}}", # 12: balloon bursting (makes a spreading highway)
"{{{1, 8, 1}, {0, 8, 0}}, {{1, 1, 0}, {0, 1, 0}}}", # 13: makes a horizontal highway
"{{{1, 8, 1}, {0, 8, 0}}, {{1, 2, 1}, {1, 2, 0}}}", # 14: makes a 45 degree highway
"{{{1, 8, 1}, {0, 8, 1}}, {{1, 2, 1}, {0, 8, 0}}}", # 15: makes a 45 degree highway
"{{{1, 8, 1}, {0, 1, 0}}, {{1, 1, 0}, {1, 2, 0}}}", # 16: spiral in a filled box
"{{{1, 8, 1}, {0, 2, 0}}, {{0, 8, 0}, {0, 8, 0}}}", # 17: glaciers
"{{{1, 8, 1}, {1, 8, 1}}, {{1, 2, 1}, {0, 1, 0}}}", # 18: golden rectangle!
"{{{1, 8, 1}, {1, 2, 0}}, {{0, 8, 0}, {0, 8, 0}}}", # 19: fizzy spill
"{{{1, 8, 1}, {1, 2, 1}}, {{1, 1, 0}, {0, 1, 1}}}", # 20: nested cabinets
"{{{1, 1, 1}, {0, 8, 1}}, {{1, 2, 0}, {1, 1, 1}}}", # 21: (cross)
"{{{1, 1, 1}, {0, 1, 0}}, {{0, 2, 0}, {1, 8, 0}}}", # 22: saw-tipped growth
"{{{1, 1, 1}, {0, 1, 1}}, {{1, 2, 1}, {0, 1, 0}}}", # 23: curves in blocks growth
"{{{1, 1, 1}, {0, 2, 0}}, {{0, 8, 0}, {0, 8, 0}}}", # 24: textured growth
"{{{1, 1, 1}, {0, 2, 1}}, {{1, 8, 0}, {1, 2, 0}}}", # 25: (diamond growth)
"{{{1, 1, 1}, {1, 8, 0}}, {{1, 2, 1}, {0, 1, 0}}}", # 26: coiled rope
"{{{1, 2, 0}, {0, 8, 1}}, {{1, 8, 0}, {0, 1, 1}}}", # 27: (growth)
"{{{1, 2, 0}, {0, 8, 1}}, {{1, 8, 0}, {0, 2, 1}}}", # 28: (square spiral)
"{{{1, 2, 0}, {1, 2, 1}}, {{0, 1, 0}, {0, 1, 1}}}", # 29: loopy growth with holes
"{{{1, 2, 1}, {0, 8, 1}}, {{1, 1, 0}, {0, 1, 0}}}", # 30: Lanton's Ant drawn with squares
"{{{1, 2, 1}, {0, 2, 0}}, {{0, 8, 1}, {1, 8, 0}}}", # 31: growth with curves and blocks
"{{{1, 2, 1}, {0, 2, 0}}, {{0, 1, 0}, {1, 2, 1}}}", # 32: distracted spiral builder
"{{{1, 2, 1}, {0, 2, 1}}, {{1, 1, 0}, {1, 1, 1}}}", # 33: cauliflower stalk (45 deg highway)
"{{{1, 2, 1}, {1, 8, 1}}, {{1, 2, 1}, {0, 2, 0}}}", # 34: worm trails (eventually turns cyclic!)
"{{{1, 2, 1}, {1, 1, 0}}, {{1, 1, 0}, {0, 1, 1}}}", # 35: eventually makes a two-way highway!
"{{{1, 2, 1}, {1, 2, 0}}, {{0, 1, 0}, {0, 1, 0}}}", # 36: almost symmetric mould bloom
"{{{1, 2, 1}, {1, 2, 0}}, {{0, 2, 0}, {1, 1, 1}}}", # 37: makes a 1 in 2 gradient highway
"{{{1, 2, 1}, {1, 2, 1}}, {{1, 8, 1}, {0, 2, 0}}}", # 38: immediately makes a 1 in 3 highway
"{{{0, 2, 1}, {1, 2, 1}}, {{0, 8, 2}, {0, 8, 0}}, {{1, 2, 2}, {1, 8, 0}}}", # 39: squares and diagonals growth
"{{{1, 8, 1}, {0, 1, 0}}, {{0, 2, 2}, {1, 8, 0}}, {{1, 2, 1}, {1, 1, 0}}}", # 40: streak at approx. an 8.1 in 1 gradient
"{{{1, 8, 1}, {0, 1, 2}}, {{0, 2, 2}, {1, 1, 1}}, {{1, 2, 1}, {1, 1, 0}}}", # 41: streak at approx. a 1.14 in 1 gradient
"{{{1, 8, 1}, {1, 8, 1}}, {{1, 1, 0}, {0, 1, 2}}, {{0, 8, 1}, {1, 1, 1}}}", # 42: maze-like growth
"{{{1, 8, 2}, {0, 2, 0}}, {{1, 8, 0}, {0, 2, 0}}, {{0, 8, 0}, {0, 8, 1}}}", # 43: growth by cornices
"{{{1, 2, 0}, {0, 2, 2}}, {{0, 8, 0}, {0, 2, 0}}, {{0, 1, 1}, {1, 8, 0}}}", # 44: makes a 1 in 7 highway
"{{{1, 2, 1}, {0, 8, 0}}, {{1, 2, 2}, {0, 1, 0}}, {{1, 8, 0}, {0, 8, 0}}}", # 45: makes a 4 in 1 highway</pre>

Les fourmis de Langton ne partagent peut être pas la capacité d'expression
des turmites, mais elles restent fascinantes elles aussi. Vous pouvez
expérimenter avec elles en utilisant la méthode initLangton(), fournie dans
le code de base, qui vous permet de construire une table de transition pour
Turmite a partir du nom d'une fourmi de Langton. De petits changements
peuvent engendrer de grandes choses. Par exemple, "RRL" ne semble pas mener
à un quelconque schéma, même après un million de pas, mais "RLL" commence à
construire un dessin très simple de route au bout de moins de 100 pas !

Beaucoup de fourmis de Langton construisent des routes: RL, bien entendu,
mais aussi RLRLRLLRLR ( environ 2500 pas ). Le comportement chaotique des
fourmis avant la route peut être très court ( comme avec RLL qui a seulement
besoin de 100 pas pour converger ) ou très long, comme avec LLLLLLRRLRRR qui
semble chaotique jusqu'à plus de 500 000 pas avant de constuire la route ou
encore RRLLLRRRLRRR qui nécessite 1 170 000 pour commencer à
converger. Certaines sont étroites, d'autres très larges, comme avec
RRLRLLRLRR (200 000 pas). Cette fourmi est aussi notable puisque c'est
quelque peu carré avant même que la route commence, là où d'autres ne
montrent rien de transcendant avant leur route.

Certaines fourmis remplissent des secteurs entiers, comme avec RRLLLRLLLRRR
(16 000 pas), RRLLLRLLLRRR (30 000 pas), RRLLLRRRRRLR (125 000 pas) ou
RRLRLLRRRRRR (20 000 pas). D'autres encore remplissent tout l'espace (RRLRR
après 3000 pas). Certaines de mes favorites sont celles où la fourmi semble
rebondir dans une boite qui devient plus grande à chaque rebond, comme avec
LRRRRRLLR (30 000 pas). LRRRRLLLRRR est encore plus impressionnant puisque
les rebonds dans la boite sont réguliers et puisque la fourmi atteint
rapidement son comportement stable (15 000 pas suffisent).

Enfin, certaines fourmis construisent juste des schémas artistiques. Vous
devriez regarder cette vidéo pour un bel aperçu :
http://www.youtube.com/watch?v=1X-gtr4pEBU .
Si vous voulez les implémenter dans votre code, vous devez les permutter de
un : Par exemple, celle décrite à 3:42 n'est pas RRLRLRLLRL, mais RLRLRLLRLR
(le premier mouvement visible doit être vu comme le dernier).

Comme vous pouvez le constater en explorant l'ensemble ci-dessus de
turmites, elles ne sont généralement pas aussi colorées que les fourmis,
mais c'est peut-être car très peu de couleurs sont nécessaires pour
expliciter des comportements complexes. Par exemple, il y a un classe
spécifique de turmites appelée *busy beavers* qui sont des turmites qui
écrivent énormément de choses avant de s'arrêter ( les *busy beavers* sont généralement des machines de Turing classiques, mais l'idée correpond
parfaitement aux turmites). Il y a une sorte de compétition internationale
où les participants font tout leur possible pour trouver le turmite qui
couvre la plus grande surface avant de s'arrêter.
La page web est ici :
http://code.google.com/p/ruletablerepository/wiki/TwoDimensionalTuringMachines

