package com.qf.www.life.Beans;

/**
 * Created by asus on 2015/4/30.
 */
public class Rows {
    private String rowKey;
    private String rowType;
    private Scenes scenes;

    public Rows(String rowKey, String rowType, Scenes scenes) {
        this.rowKey = rowKey;
        this.rowType = rowType;
        this.scenes = scenes;
    }
}
