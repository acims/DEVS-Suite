
package ServiceMod;

import view.simView.*;
import model.modeling.*;
import model.simulation.*;
import view.modeling.*;
import GenCol.*;
import GenService.*;
import util.*;
import java.util.*;

	public class VoiceComm extends ServicePublisher{
	
		public VoiceComm(String name, 
						 String descpt, 
						 String svType, 
						 ArrayList <Pair> endpts, 
						 double processingTime){		
			super(name, descpt, svType, endpts, processingTime);	
		}
		
		public Pair performService(Pair data){
			double buffersize = 16;   //buffersize (Kbps)  - 32 48 and ....user choice
			double avgNumOfDatagram = 260;  //average number of datagram				
			double sizeOfmsgs = (avgNumOfDatagram * buffersize);
			ServiceReturn.setSize(sizeOfmsgs);
			return data;
		}
	}

	