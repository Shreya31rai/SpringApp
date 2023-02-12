package org.antwalk.acctype;

import org.antwalk.interfaces.Account;
import org.springframework.stereotype.Component;

@Component("save")
public class Saving implements Account{
   public String showAccount() {
	   return "savings";
   }
}
