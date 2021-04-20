package com.eletronic.warehouse.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Excel(name = "标签id")
    private int machineTag;
    @Excel(name = "设备名称")
    private String machineName;
    @Excel(name = "型号")
    private String model;
    @Excel(name = "编号")
    private int machineId;
    @Excel(name = "生产厂家")
    private String factory;
    @Excel(name = "生产日期")
    private Date manufactureDate;
    @Excel(name = "设备状态")
    private int machineStatus;
    @Excel(name = "是否损坏")
    private int isBroken;
    @Excel(name = "损坏备注")
    private String damageNote;
    @Excel(name = "上次检验日期")
    private Date lastInspectionDate;
    @Excel(name = "下次检验日期")
    private Date nextInspectionDate;
    @Excel(name = "借用者工号")
    private int empId;
    @Excel(name = "借用者")
    private String empName;
    @Excel(name = "借用原因")
    private String reason;
    @Excel(name = "使用地点")
    private String useLocation;
    @Excel(name = "库存位置")
    private String storeLocation;

    private String borrowDate;
    private int housekeeperId;
    private String housekeeperName;
    private String note;

    @Override
    public String toString() {
        return "Borrow{" +
                "id=" + id +
                ", machineTag=" + machineTag +
                ", machineName='" + machineName + '\'' +
                ", empId=" + empId +
                ", empName='" + empName + '\'' +
                ", reason='" + reason + '\'' +
                ", useLocation='" + useLocation + '\'' +
                ", storeLocation='" + storeLocation + '\'' +
                ", borrowDate='" + borrowDate + '\'' +
                ", housekeeperId=" + housekeeperId +
                ", housekeeperName='" + housekeeperName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMachineTag() {
        return machineTag;
    }

    public void setMachineTag(int machineTag) {
        this.machineTag = machineTag;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
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

    public int getMachineStatus() {
        return machineStatus;
    }

    public void setMachineStatus(int machineStatus) {
        this.machineStatus = machineStatus;
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

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getUseLocation() {
        return useLocation;
    }

    public void setUseLocation(String useLocation) {
        this.useLocation = useLocation;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getHousekeeperId() {
        return housekeeperId;
    }

    public void setHousekeeperId(int housekeeperId) {
        this.housekeeperId = housekeeperId;
    }

    public String getHousekeeperName() {
        return housekeeperName;
    }

    public void setHousekeeperName(String housekeeperName) {
        this.housekeeperName = housekeeperName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
