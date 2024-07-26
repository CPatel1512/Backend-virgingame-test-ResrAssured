package com.virgingames.jackpotbingoinfo;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.rest.SerenityRest;

public class VirginGameSteps {

    @Step
    @Title("This will be get All data")
    public ValidatableResponse getGamesDataByGBP(){
        return SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_Games_WITH_GBP)
                .then().log().all().statusCode(200);
    }

    @Title("This will be get All ERU Currency")
    public ValidatableResponse getGamesDataByERU()
    {
        return SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_GAMES_WITH_EUR)
                .then().log().all().statusCode(200);
    }
    @Title("This will be get All SEK Currency")
    public ValidatableResponse getGamesDataBySEK()
    {
        return SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_GAMES_WITH_SEK)
                .then().log().all().statusCode(200);
    }
}
