package com.nit.util;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Demo {
  
  public String show()
  {
    return "Welcome to Git";
  }

  public static void main(String[] args) {
	  Logger logger=null;
	  logger=Logger.getLogger(Demo.class);
	  BasicConfigurator.configure();
	
	  logger.info("Welcome to Log4j");
}
}
