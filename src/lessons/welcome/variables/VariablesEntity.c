#include "RemoteBuggle.h"

void run(){
	#line 1 "Variables"
	/* BEGIN SOLUTION */
	int cpt = 0;
	while (!isOverBaggle()) {
		cpt++;
		forward(1);
	}
	pickupBaggle();
	while (cpt>0) {
		backward(1);
		cpt--;
	}
	dropBaggle();
	/* END SOLUTION */
}
