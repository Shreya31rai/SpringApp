package org.antwalk.acctype;
import org.antwalk.interfaces.Account;
import org.springframework.stereotype.Component;

@Component("curr")
public class Current implements Account{
   public String showAccount() {
	   return "current";
   }
}

