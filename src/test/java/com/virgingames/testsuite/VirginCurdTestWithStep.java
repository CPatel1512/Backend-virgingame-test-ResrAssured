package com.virgingames.testsuite;

import com.virgingames.jackpotbingoinfo.VirginGameSteps;
import com.virgingames.testbase.TestBase;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class VirginCurdTestWithStep extends TestBase {

    @Steps
    VirginGameSteps virginGameSteps;

    @Title("This will be get All GBP currency")
    @Test
    public void test001() {
        virginGameSteps.getGamesDataByGBP();
    }

    @Title("This will be get All ERU Currency")
    @Test
    public void test002() {
        virginGameSteps.getGamesDataByERU();
    }

    @Title("This will be get All SEK Currency")
    @Test
    public void test003() {
        virginGameSteps.getGamesDataBySEK();
    }
}
