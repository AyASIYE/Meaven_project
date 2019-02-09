package com.cybertek.Tests;

import com.cyberrtek.utilities.ConfigurationReader;
import com.cyberrtek.utilities.TestBase;
import com.pages.HomePage;
import org.testng.annotations.Test;

public class LoginWithTheProperties extends TestBase {

//    @Test
//    public void readPropertyTest(){
//
//        String browser = ConfigurationReader.getProperty("url");
//
//        System.out.println(browser);
//    }

    @Test
    public void readPropertyTest() {

        driver.get(ConfigurationReader.getProperty("url"));

        HomePage homePage = new HomePage();
        String userName = ConfigurationReader.getProperty("username");
        String passWord = ConfigurationReader.getProperty("password");
        homePage.login(userName, passWord);
    }
        /*


   @Test
   public void readPropertyTest(){



       String username = ConfigurationReader.getProperty("username");
       String password = ConfigurationReader.getProperty("password");
       homePage.login(username, password);
   }
}
         */

}
