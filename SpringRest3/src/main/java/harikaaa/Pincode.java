package harikaaa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import harikaa.Pincode;
@Service
public class Pincode implements Pin {
	
	List<Pincode> pin;

	public Pincode() {
		pin = new ArrayList<>();
		pin.add(new Pincode(289149,"AP","vijayawada","India"));
		pin.add(new Pincode(289145,"AP","vijayanagaram","India"));
		pin.add(new Pincode(287139,"AP","guntur","India"));
		pin.add(new Pincode(263666,"AP","tenali","India"));
		pin.add(new Pincode(263108,"AP","ananthapur","India"));
		pin.add(new Pincode(189049,"AP","Kurnool","India"));
		pin.add(new Pincode(177969,"Delhi","india gate","India"));
		pin.add(new Pincode(113149,"AP","kovur","India"));
		pin.add(new Pincode(289999,"TN","chettinad","India"));
		pin.add(new Pincode(879149,"KR","pallakad","India"));
		pin.add(new Pincode(168769,"AP","nellore","India"));		
	}
	
	public Pincode getDetails(int pincode) {
		for(Pincode p : pin)
			{
			if(p.getPin()==pincode)
				{
				System.out.println(p);
			    return p;
			    }
			}
		return null;
		
	}
	
	
	

}
