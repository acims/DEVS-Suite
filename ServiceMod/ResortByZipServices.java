	package ServiceMod;
	
	import view.simView.*;
	import model.modeling.*;
	import model.simulation.*;
	import view.modeling.*;
	import java.awt.*;
	import java.io.*;

	import GenCol.*;
	import GenService.*;	

import java.util.*;
	
	public class ResortByZipServices extends ServiceCoupledPublishers{
		
		public final static double observation = 70;
		
		
		public ResortByZipServices(){
			super("Resort By Zip Service");
		}	
		
		public void EndpointsConstruct(){
			
			Endpoints.add(new Pair("ResortByZip", "Double"));
			
		}
		
		public void PublisherConstruct(){			
			
			ArrayList <Pair> Endpoints = new ArrayList <Pair> ();	 		
			Endpoints.add(new Pair("CityByZip", "Double"));		
			USZipService Service1 = 
				new USZipService("USZip", "City by Zip Service", "Atomic", Endpoints, 1);
			Service1.setBackgroundColor(Color.CYAN);
			//Construct the publisher list
			PublisherList.add(Service1);
			
			Endpoints = new ArrayList <Pair> ();	 		
			Endpoints.add(new Pair("ResortByCity", "String"));		
			ResortService Service2 = 
				new ResortService("Resort", "Resort by City Service", "Atomic", Endpoints, 1);
			Service2.setBackgroundColor(Color.CYAN);
			PublisherList.add(Service2);
				
		}
		
		
		public void TransducerConstruct(){
			RouterTransd routerTrans  =  new RouterTransd("RouterTransd", observation);
			PublisherTransd PubTrans1 =  new PublisherTransd("USZipTransd", observation);
			PublisherTransd PubTrans2 =  new PublisherTransd("ResortTransd", observation);
			//Add a transducer for each publisher
			
			TransducerList.add(routerTrans);
			TransducerList.add(PubTrans1);
			TransducerList.add(PubTrans2);
		}
		/*
		public void CompositeConstruction(){
			FedexRateByZipServices Service2 = new FedexRateByZipServices();
			CoupledPublishersList.add(Service2);
			
		}*/
   
    /**
     * Automatically generated by the SimView program.
     * Do not edit this manually, as such changes will get overwritten.
     */
    public void layoutForSimView()
    {
        preferredSize = new Dimension(710, 254);
        ((ViewableComponent)withName("USZipTransd")).setPreferredLocation(new Point(-13, 125));
        ((ViewableComponent)withName("RouterTransd")).setPreferredLocation(new Point(149, 50));
        ((ViewableComponent)withName("USZip")).setPreferredLocation(new Point(-11, 188));
        ((ViewableComponent)withName("Resort")).setPreferredLocation(new Point(242, 191));
        ((ViewableComponent)withName("ResortTransd")).setPreferredLocation(new Point(362, 134));
        ((ViewableComponent)withName("Router")).setPreferredLocation(new Point(156, 105));
    }
}
