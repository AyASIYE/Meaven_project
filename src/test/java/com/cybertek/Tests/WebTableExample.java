package com.cybertek.Tests;

import com.cyberrtek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableExample extends TestBase {

    // print whole table
    @Test
    public void printwholeTbale() {
        login();

        WebElement table = driver.findElement(By.xpath("//table[@class='SampleTable']"));
                //driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody"));
                // driver.findElement(By.id("ctl00_MainContent_orderGrid"));
        System.out.println(table.getText());
    }

    public void login() {
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");

        //4. Enter user name “Tester”

        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");

        //5. Enter password  “test”

        WebElement password = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]"));
        password.sendKeys("test");

        //6. Click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]"));
        loginButton.click();

    }

    // Printing the all headers
    @Test
    public void printAllHearders() {

        login();

        List<WebElement> ll = driver.findElements(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[1]"));
        for (WebElement header : ll) {
           System.out.println(header.getText());
        }

        List<WebElement> headers = driver.findElements(
                By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th"));
                   //  //*[@id="ctl00_MainContent_orderGrid"]/tbody/tr[1]/th
                    // //*[@id="ctl00_MainContent_orderGrid"]/tbody/tr[1]

        for (WebElement header : headers) {
            System.out.println(header.getText());
        }
    }

    // prints the number of rows
    //prints the certain rows
    @Test
    public void printRow(){
        login();
        List<WebElement> allRows = driver.findElements(
          By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr"));

        System.out.println("number of rows: " + allRows.size());

        for (WebElement header:allRows) {
            System.out.println(header.getText());

        }

        // print the nth
        System.out.println("printing row " + 4);
        System.out.println(allRows.get(3).getText());
    }



    @Test
    public void printTableSize(){
        login();
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        System.out.println("Number of rows: " + allRows.size());

        List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/th"));
        System.out.println("Number of columns: " + allHeaders.size());


    }

    @Test
    public void printRow2(){
        login();
        WebElement row = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[5]"));
        System.out.println(row.getText());
    }

    /*
    print all the cells of a raw whose index is given in xpath
     */
    @Test
    public void printAllCellsInOneRow(){
        login();
        List<WebElement> cells = driver.findElements(
       By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr[4]"));

        for (WebElement header:cells) {
            System.out.println(header.getText());

        }
        driver.close();
    }


    /*
        print by coordinates : based on row and column number
    */
    @Test
    public void printByCordinator(){



        login();
        WebElement cell = driver.findElement(
      By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[11]"));

        System.out.println(cell.getText());
        System.out.println(getCell(6,11).getText());


    }

    public WebElement getCell(int row, int col){
        String xpath = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+row+"]/td["+col+"]";
        return driver.findElement(By.xpath(xpath));
    }

    /*
    print all the values in single column
     */
    @Test
    public void printCoulumn(){

        login();
        //table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]

        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

        for(WebElement names:allNames){
            System.out.println(names.getText());
        }

        driver.close();

    }

    @Test
    // find the select checkbox for given name
    public void slectCheckBox(){
        login();
        WebElement checkbox = driver.findElement(
                By.xpath("//td[.='Susan McLaren']/../td[1]/input"));
                                                //.. ==> go to parent

        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());

        driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();

    }

    /*
    Verify that name 'someone' exists in the name column:
    Verify that city 'anytown' exists in the cities column:
     */

    @Test
    public void test(){
        login();
        int nameIndex =  getColumnIndex("Card");
        System.out.println(nameIndex);

        List<WebElement> allNames = driver.findElements(
                By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td["+nameIndex+"]"));
        boolean found =false;

        for (int i = 0; i < allNames.size(); i++) {
            if (allNames.get(i).getText().equals("American Express")){
                found = true;
                break;
            }
        }
        Assert.assertTrue(found);

        found = false;
        int cityIndex = getColumnIndex("City");
        List<WebElement> allCities = driver.findElements(
                By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td["+cityIndex+"]"));

        for (int i = 0; i < allCities.size(); i++) {
            if (allCities.get(i).getText().equals("Whitestone, British")){
                found = true;
                break;
            }
        }
        Assert.assertTrue(found);
    }

    /*
    gets a column name as a parameters
    returns the index of the column name
     */
    public int getColumnIndex(String column){
        List<WebElement> allHeader = driver.findElements(
                By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th"));

        for (int i = 0; i < allHeader.size(); i++) {
            if (allHeader.get(i).getText().equals(column)){
                return i+1;
            }
        }
        return 0;
    }

}
