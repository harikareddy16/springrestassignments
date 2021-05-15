package harikaa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Consuption {
	
	private RestTemplate restTemplate;

	@Autowired
	public Consuption(RestTemplateBuilder restTemplateBuilder) {
		this.setRestTemplate(restTemplateBuilder.build());
	}
	
	public Integer add(Integer n1,Integer n2)
	{

		return n2; 
		
	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	

}
