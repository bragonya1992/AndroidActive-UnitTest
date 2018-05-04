package com.example.brayany.testsyncadapter.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Table(name = "Teams")
public class Team extends Model{
    @SerializedName("teamID")
    @Expose
    @Column(name = "teamId")
    public String teamId;
    @SerializedName("vendorID")
    @Expose
    @Column(name = "vendorID")
    public String vendorID;
    @SerializedName("competition")
    @Expose
    @Column(name = "competition")
    public String competition;
    @SerializedName("competition-id")
    @Expose
    @Column(name = "competition_id")
    public String competition_id;
    @SerializedName("label")
    @Expose
    @Column(name = "team_name")
    public String teamName;
    @SerializedName("originalID")
    @Expose
    @Column(name = "originalID")
    public String originalID;
    @SerializedName("alertLevel")
    @Expose
    @Column(name = "alertLevel")
    public AlertLevel alertLevel;


    public Team(){
        super();
    }
    public Team(String teamId, String vendorID, String competition, String competition_id, String teamName, String originalID, AlertLevel alertLevel) {
        this.teamId = teamId;
        this.vendorID = vendorID;
        this.competition = competition;
        this.competition_id = competition_id;
        this.teamName = teamName;
        this.originalID = originalID;
        this.alertLevel = alertLevel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("teamID", teamId).append("vendorID", vendorID).append("competition", competition).append("originalID", originalID).append("label", teamName).append("competitionId", competition_id).append("alertLevel", alertLevel).toString();
    }
}
