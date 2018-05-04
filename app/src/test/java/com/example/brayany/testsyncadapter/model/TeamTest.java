package com.example.brayany.testsyncadapter.model;
import com.example.brayany.testsyncadapter.source.Builder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class TeamTest {

    @Test
    public void gson_converter_test_not_null(){
        Team team = Builder.getTeam();
        assertNotNull(team);
    }

    @Test
    public void gson_converter_test_correct_id(){
        Team team = Builder.getTeam();
        assertNotNull(team.teamId);
        assertEquals(team.teamId,"365858dfd51a25b2f84aba22");
    }

    @Test
    public void evaluate_down_level_json(){
        Team team = Builder.getTeam();
        AlertLevel alertLevel = team.alertLevel;
        assertNotNull(alertLevel);
        assertEquals(alertLevel.customAlert.get(0),"goal");
    }



}