package com.example.brayany.testsyncadapter.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
@Table(name = "AlertLevel")
public class AlertLevel extends Model{
    @SerializedName("level")
    @Expose
    @Column
    public String level;
    @SerializedName("customAlert")
    @Expose
    @Column
    public List<String> customAlert = null;

    public AlertLevel(){
        super();
    }

    public AlertLevel(String level, List<String> customAlert) {
        super();
        this.level = level;
        this.customAlert = customAlert;
    }
}
