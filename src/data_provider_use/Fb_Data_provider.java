package data_provider_use;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Fb_Data_provider {

  @DataProvider(name ="FBregression" )
  public static String[][] FBtestSet()
  {
	  String data[][]={{"pratiksha","khote","9579815486"},{"ravi","khote","7588433691"},{"tushar","lange","8867543278"}};
	return data;
  }
  
  
}