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

import view.modeling.ViewableAtomic;
import view.simView.*;


public class classic extends ViewableAtomic{



  public classic(){
}

public classic(String name){
   super(name);
}


public content get_content(message x){
    entity ent = x.read(0);
    return (content)ent;
}

public void  Deltext(double e,content con){
}  //virtual for single input at a time

public void  deltext(double e,message x)
{

    Deltext(e,get_content(x));

}


}

