/*      Copyright 2002 Arizona Board of regents on behalf of 
 *                  The University of Arizona 
 *                     All Rights Reserved 
 *         (USE & RESTRICTION - Please read COPYRIGHT file) 
 * 
 *  Version    : DEVSJAVA 2.7 
 *  Date       : 08-15-02 
 */ 


package SimpMod;


import java.lang.*;

import GenCol.*;


import model.modeling.*;
import model.simulation.*;

import view.simView.*;


public class passive extends siso{



  public passive(){
    super("passive");
}

public passive(String name){
   super(name);
}

public void initialize(){
     phase = "passive";
     sigma = INFINITY;
     super.initialize();
 }


public void  Deltext(double e,double input){
    passivate();
}



public void  deltint( ){
    passivate();
}


public double sisoOut(){
    return 0;
}

 public void showState(){
  super.showState();
 }


}

