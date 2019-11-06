package org.apache.account;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class AccountIdProcessor implements Processor {

	@Override
	public void process(Exchange ex) throws Exception {
		String id = (String) ex.getIn().getHeader("id");
		AccountRequest ar = new AccountRequest();
		ar.setId(Long.parseLong(id));
		ex.getOut().setBody(ar);
	}	
}
