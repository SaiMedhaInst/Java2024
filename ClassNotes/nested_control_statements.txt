NESTED CONDITIONAL STATEMENTS
===========================
NESTED IF 
================================
	if(condition){
		//stmnts
		if(cond2){
		//stmnts
			if(cond3){
				//stmnts
			}
		}
	}
	
NESTED IF ELSE 
===============================
	if(cond1){
		if(cond2){
			//stmnts
		}
		else{
			//stmnts
		}
	}
	else{
		
		if(cond2){
			//stmnts
		}
		else{
			//stmnts
		}
	}
	
NESTED IF ELSE IF ELSE IF 
===================================
	if(cond1){
		//stmns
	}
	
	else if(cond2){
		if(cond3){
			//stmnts
		}
		else if(cond4){
			//stmnts
		}
	}
	
	else{
		//smtns
	}


NESTED SWITCH
=======================

switch(n){
  // code to be executed if n = 1;
  case 1:   
  // Nested switch
  switch(num) {
    // code to be executed if num = 10
    case 10: 
      statement 1;
      break;
      
    // code to be executed if num = 20
    case 20: 
      statement 2;
      break;
      
    // code to be executed if num = 30
    case 30: 
      statement 3;
      break;
      
      // code to be executed if num 
      // doesn't match any cases
      default: 
  }
  break;
    
  // code to be executed if n = 2;
  case 2:
    statement 2;
    break;
  
  // code to be executed if n = 3;
  case 3: 
    statement 3;
    break;
  
   // code to be executed if n doesn't match any cases
   default: 
}