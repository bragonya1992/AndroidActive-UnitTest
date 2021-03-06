package com.example.brayany.testsyncadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;
import com.example.brayany.testsyncadapter.model.Team;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        deteletAll();
        saveATeam();
        List<Team> teams = getAll();
        teams.clear();
    }


    public void saveATeam(){
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
        team.alertLevel.save();
        team.save();
    }

    public static List<Team> getAll() {
        return new Select()
                .from(Team.class)
                .execute();
    }

    public void deteletAll(){
        new Delete().from(Team.class).execute();
    }
}
