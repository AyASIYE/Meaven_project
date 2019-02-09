package com.cybertek.Xpath;

public class iframe_Note {

    /*

    Iframe/frame: They are used to put one html document inside another html
    document.

            html
                title
                text
                link
                iframe
                html
                link

    selenium can deal with only one html document at a time.

    selenium can see only one html document at a time.

    selenium can see the iframe element, but cannot see whats inside it.

    in order to deal with iframe, we need to change the focus of selenium
    into the iframe. we need to swtich to iframe.



    how do I go back from frame 2 to the default frame:

    2 options.

    1. driver.switchTo().defaultContent() : takes us back to the top level, to
    the default content.

    If there are multiple iframe, it it dfoes not matter, will go to the top
    level

    2. driver.switchTo().parentFrame();  --> it takes you to the parent of the
    current frame.



    driver.switchTo().parentFrame();  it takes me from Iframe 2 to Iframe 1

    driver.switchTo().parentFrame();it takes me from iframe 1 to default content



     */
}
