package com.weborders.step_definitions;

import com.weborders.utilities.Driver;
import org.junit.After;

public class Hooks {

    // after hook
    // will close browser after every test
    @After
    public void teardown(){
        Driver.close();
    }
}
