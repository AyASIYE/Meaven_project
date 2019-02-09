package com.cybertek.Xpath;

public class Xpath_note {

    /*
    last time watch to 02:43:00

    https://learn.cybertekschool.com/courses/135/pages/recording-testng-introduction?module_item_id=5819


    1. xpath which uses the hierarchy (parent/child) of elements to locate an object.
     starts with single slash and html. always starts searching from the html

    DO the task in ==> https://the-internet.herokuapp.com/upload

    a
    div
    div
    div
    body
    html

    /html/body/div/div/div/a    "/" ==> mean child

    1.Absolute xPath

         Disadvantages:
        1. absolute xpath relies on page not being changed. if the html tree changes,
         xpath will stop working
        2. tends to get very very long


    2.relative xpath:
     does not depend on html structure, doesn't start with double slashes.
     will search anywhere in the document


    Bellow is "Search" button's Html in the Etsy.com

    tag  attribute   value
    ||      ||        ||
    ||      ||        ||
   <button class="btn btn-primary" type="submit"
     value="Search" aria-label="Search"> Search</button>



     using tag, attribute and name

    //tag[@attribute='value'] ===>formula

    //button[@class='btn btn-primary']

    //button[@class=\"btn btn-primary\"] same with above xpath

    3. Nth child

    /html/body/div/div/div/form/input[2] --> second input child of input

    a
    li: li is the second child ul
    ul
    div
    div
    div
    body
    html

    /html/body/div/div/div/ul/li[2]/a


    4. any single tag

    //tag

    //ul/li[2] : any ul element in the page

    //ul/li[2] = /html/body/div/div/div/ul/li[2]/a

    Note: it should to start with //

    5. by exact text

    //tag[.='text']  or  //tag[text()='sthg']

    <h3>Frames</h3>

    //h3[.='Frames']

    6. by partial text

    //tag[contains(text(), 'text')]

    //h3[contains(text(), 'Fra')]

    7. any element with certain text, attribute


    //*[.='Frames'] : any tag with text 'Frames'

    //*[@class='btn btn-primary']

    8. Nth match

    //a[.='Help']

    page has Help in two places, i want the second one.
    1. i write xpath that matches both
    //a[.='Help']
    2. select the second match by putting the xpath in paranthesis and providing index outside the pranthises

    (//a[.='Help'])[2]
    __


    9. dynamic attributes: contains, starts, ends

    //tag[contains(@attribute,'value')]
    //tag[starts-wth(@attribute,'value')]
    //tag[ends-with(@attribute,'value')]

    <button id="j_idt691" ></button>

    //button[contains(@id, 'j_idt')]

    //button[starts-wth(@id,'j_idt')]

    10. using 2 or more xpath
        1. write an xpath which matches multiple elements

        //a[.='Help']

        2. write an xpath that locates the section of the page where my element is
        //div[@id='navFooter']

         3. Mix and patch

        //div[@id='navFooter']//a[.='Help']

        it will first find the div section then it will look for the a tag within
        that div

    WHAT IS THE BEST XPATH?

    there is no xpath which always works, in general there is not locator which works every time.
     all depends on the element we want to locate.

    There is no best Xpath. There is good tester who use all of them.


     */
}
