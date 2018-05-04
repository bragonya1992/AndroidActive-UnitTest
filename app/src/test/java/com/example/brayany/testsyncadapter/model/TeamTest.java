package com.example.brayany.testsyncadapter.model;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class TeamTest {

    @Test
    public void gson_converter_test_not_null(){
        Gson gson = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT, Modifier.STATIC).create();
        Team team = gson.fromJson(
                "{  \n" +
                "   \"teamID\":\"365858dfd51a25b2f84aba22\",\n" +
                "   \"vendorID\":\"Stats.com\",\n" +
                "   \"competition\":\"La Liga\",\n" +
                "   \"originalID\":\"6171\",\n" +
                "   \"label\":\"Real Madrid\",\n" +
                "   \"competition-id\":\"e53c9d872eef08bcb8b30a5f\",\n" +
                "   \"alertLevel\":{  \n" +
                "      \"level\":\"light-fan\",\n" +
                "      \"customAlert\":[  \n" +
                "         \"goal\"\n" +
                "      ]\n" +
                "   }\n" +
                "}",Team.class);
        assertNotNull(team);
    }

    @Test
    public void gson_converter_test_correct_id(){
        Gson gson = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT, Modifier.STATIC).create();
        Team team = gson.fromJson(
                "{  \n" +
                        "   \"teamID\":\"365858dfd51a25b2f84aba22\",\n" +
                        "   \"vendorID\":\"Stats.com\",\n" +
                        "   \"competition\":\"La Liga\",\n" +
                        "   \"originalID\":\"6171\",\n" +
                        "   \"label\":\"Real Madrid\",\n" +
                        "   \"competition-id\":\"e53c9d872eef08bcb8b30a5f\",\n" +
                        "   \"alertLevel\":{  \n" +
                        "      \"level\":\"light-fan\",\n" +
                        "      \"customAlert\":[  \n" +
                        "         \"goal\"\n" +
                        "      ]\n" +
                        "   }\n" +
                        "}",Team.class);
        assertNotNull(team.teamId);
        assertEquals(team.teamId,"365858dfd51a25b2f84aba22");
    }

    @Test
    public void evaluate_down_level_json(){
        Gson gson = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT, Modifier.STATIC).create();
        Team team = gson.fromJson(
                "{  \n" +
                        "   \"teamID\":\"365858dfd51a25b2f84aba22\",\n" +
                        "   \"vendorID\":\"Stats.com\",\n" +
                        "   \"competition\":\"La Liga\",\n" +
                        "   \"originalID\":\"6171\",\n" +
                        "   \"label\":\"Real Madrid\",\n" +
                        "   \"competition-id\":\"e53c9d872eef08bcb8b30a5f\",\n" +
                        "   \"alertLevel\":{  \n" +
                        "      \"level\":\"light-fan\",\n" +
                        "      \"customAlert\":[  \n" +
                        "         \"goal\"\n" +
                        "      ]\n" +
                        "   }\n" +
                        "}",Team.class);
        AlertLevel alertLevel = team.alertLevel;
        assertNotNull(alertLevel);
        assertEquals(alertLevel.customAlert.get(0),"goal");
    }

}