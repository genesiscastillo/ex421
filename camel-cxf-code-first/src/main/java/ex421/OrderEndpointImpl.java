package ex421;

import javax.jws.WebService;

import org.apache.log4j.Logger;

@WebService
public class OrderEndpointImpl implements OrderEndpoint	{

	private static final Logger LOGGER = Logger.getLogger(OrderEndpointImpl.class.getName());
	@Override
	public String order(String partName, int amount, String customerName) {
		LOGGER.info("HOLAAAAAA");
		return "HOLA CESAR";
	}
	

}
