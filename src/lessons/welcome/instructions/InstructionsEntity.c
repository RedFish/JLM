#include "RemoteBuggle.h"



int main(){
	#line 1 "Instructions"
	/* BEGIN TEMPLATE */
	/* BEGIN SOLUTION */
	brushDown();
	int i;
	for (i=0;i<4;i++) {
		forward(2);
		right();
	}
	brushUp();
	forward(1);
	right();
	forward(1);
	left();
	/* END SOLUTION */
	/* END TEMPLATE */
	return 0;
}
