package org.ntr.commerce;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CommerceInterface {
	
	@WebMethod
	public String achat(int id, double montant);
	
	@WebMethod
	public String remboursement(int id, double montant);

}
