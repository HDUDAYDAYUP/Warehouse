package com.eletronic.warehouse.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Enter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tag;
    @Excel(name = "设备名称")
    private String name;
    @Excel(name = "生产厂家")
    private String model;
    @Excel(name = "编号")
    private int id;
    @Excel(name = "生产厂家")
    private String factory;
    @Excel(name = "生产日期")
    private Date manufactureDate;
    @Excel(name = "生命周期")
    private String lifeCycle;
    @Excel(name = "是否损坏")
    private int isBroken;
    @Excel(name = "损坏备注")
    private String damageNote;
    @Excel(name = "库存位置")
    private String location;
    @Excel(name = "上次检验日期")
    private Date lastInspectionDate;
    @Excel(name = "下次检验日期")
    private Date nextInspectionDate;

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(String lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public int getIsBroken() {
        return isBroken;
    }

    public void setIsBroken(int isBroken) {
        this.isBroken = isBroken;
    }

    public String getDamageNote() {
        return damageNote;
    }

    public void setDamageNote(String damageNote) {
        this.damageNote = damageNote;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getLastInspectionDate() {
        return lastInspectionDate;
    }

    public void setLastInspectionDate(Date lastInspectionDate) {
        this.lastInspectionDate = lastInspectionDate;
    }

    public Date getNextInspectionDate() {
        return nextInspectionDate;
    }

    public void setNextInspectionDate(Date nextInspectionDate) {
        this.nextInspectionDate = nextInspectionDate;
    }

    @Override
    public String toString() {
        return "Enter{" +
                "tag=" + tag +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", id=" + id +
                ", factory='" + factory + '\'' +
                ", manufactureDate='" + manufactureDate + '\'' +
                ", lifeCycle='" + lifeCycle + '\'' +
                ", isBroken=" + isBroken +
                ", damageNote='" + damageNote + '\'' +
                ", location='" + location + '\'' +
                ", lastInspectionDate='" + lastInspectionDate + '\'' +
                ", nextInspectionDate='" + nextInspectionDate + '\'' +
                '}';
    }
}
