package com.way2automation.http.steps;

import com.way2automation.http.propertyreader.PropertyReader;
import com.way2automation.http.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * Created by Jay Vaghani
 */
public class Hooks extends Utility {

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));

    }

    @After
    public void tearDown(Scenario scenario ){
        if (scenario.isFailed()){
            final byte[] screenshot = getScreenShot();
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
      closeBrowser();
    }

}
