/*      Copyright 2002 Arizona Board of regents on behalf of
 *                  The University of Arizona
 *                     All Rights Reserved
 *         (USE & RESTRICTION - Please read COPYRIGHT file)
 *
 *  Version    : DEVSJAVA 2.7
 *  Date       : 08-15-02
 */

package SimpMod;

import java.awt.*;

import GenCol.*;


import model.modeling.*;
import model.simulation.*;

import view.modeling.ViewableComponent;
import view.modeling.ViewableDigraph;
import view.simView.*;


public class efp extends ViewableDigraph {


public efp (){
    super("efp");
   // ViewableDigraph sp = new procSpec("proc",25);
   // ViewableAtomic sp = new proc("proc",25);
   //ViewableDigraph  sp  = new DandC3("d",29);
  // ViewableDigraph  sp  = new divideAndConquer("d",29,3);
   //  ViewableDigraph  sp  = new pipe3("p",30);
   // ViewableDigraph  sp  = new pipeLine("p",30,3);
   //ViewableDigraph  sp  = new Multi3("m",3);
 ViewableDigraph  sp  = new multiServer("m",10,10);



    ViewableDigraph  expf = new ef("ExpFrame",5,50000);



    add(expf);

    add(sp);

    addTestInput("start",new entity());

     addCoupling(this,"start",expf,"start");
     addCoupling(this,"stop",expf,"stop");

     addCoupling(expf,"out",sp,"in");
     addCoupling(sp,"out",expf,"in");

   initialize();

    preferredSize = new Dimension(549, 181);
    expf.setPreferredLocation(new Point(239, 23));
    sp.setPreferredLocation(new Point(15, 50));
 }
    /**
     * Automatically generated by the SimView program.
     * Do not edit this manually, as such changes will get overwritten.
     */
    public void layoutForSimView()
    {
        preferredSize = new Dimension(1108, 928);
        ((ViewableComponent)withName("ExpFrame")).setPreferredLocation(new Point(34, 40));
        ((ViewableComponent)withName("m")).setPreferredLocation(new Point(33, 246));
    }
 }