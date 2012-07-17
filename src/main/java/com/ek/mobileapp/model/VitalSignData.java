package com.ek.mobileapp.model;

public class VitalSignData {

    private Long id;
    private String patientId;//住院号
    private String visitId;//就诊次数
    private String addDate;//保存日期
    private String timePoint;//时间点
    private String timeCode;//时间点编号
    private String itemCode;//指标编号
    private String itemName;//指标
    private String value1;//一日一次指标的数值
    private String unit;//单位
    private String value2;//一日多次指标的数值
    private String measureTypeCode;//测量类别编号
    private String state;//标记是否进行过保存,Y则提交给his

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public String getTimePoint() {
        return timePoint;
    }

    public void setTimePoint(String timePoint) {
        this.timePoint = timePoint;
    }

    public String getTimeCode() {
        return timeCode;
    }

    public void setTimeCode(String timeCode) {
        this.timeCode = timeCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getMeasureTypeCode() {
        return measureTypeCode;
    }

    public void setMeasureTypeCode(String measureTypeCode) {
        this.measureTypeCode = measureTypeCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}