package com.eletronic.warehouse.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Count {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int size;//数量

    private String type;//类型，包含出库、入库、库存

    private Date computerDate;//统计日期

    public Count() {
    }

    public Count(int size, String type, Date computerDate) {
        this.size = size;
        this.type = type;
        this.computerDate = computerDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getComputerDate() {
        return computerDate;
    }

    public void setComputerDate(Date computerDate) {
        this.computerDate = computerDate;
    }
}
