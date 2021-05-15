package harikaaa;

import org.springframework.stereotype.Service;

import harikaa.Pincode;

@Service
public interface Pin {

	public Pincode getDetails(int pincode);

}
