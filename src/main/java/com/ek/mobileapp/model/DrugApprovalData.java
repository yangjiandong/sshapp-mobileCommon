package com.ek.mobileapp.model;

//用药审批
public class DrugApprovalData {

    private Long id;
    private Long appNo;//审批编号
    private String patientId;//住院号
    private String visitId;//就诊次数
    private String patientName;//病人姓名
    private String sex;//性别
    private String age;//年龄
    private String chargeType;//医保费别
    private String bedNo;//床位号
    private String deptCode;//所在病区代码
    private String deptName;//所在病区
    private String meddleType;//干预类型
    private String diagnosis;//主要诊断
    private String useReasion;//使用原因
    private String drugCode;//药品代码
    private String drugName;//药品名称
    private String drugSpec;//药品规格
    private String result;//审批结果,Y同意,N不同意
    private String note;//备注
    private String appDate;//申请时间
    private String appWho;//申请人
    private String appWhoCode;//申请人代码
    private String receiveWho;//接收人
    private String receiveWhoCode;//接收人代码
    private String receiveDeptName;//接收科室
    private String receiveDeptCode;//接收科室代码
    private String dealDate;//审批时间
    private String dealWho;//审批人
    private String dealWhoCode;//审批人代码
    private int state;//1未审核,2已审核未提交,3已提交

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppNo() {
        return appNo;
    }

    public void setAppNo(Long appNo) {
        this.appNo = appNo;
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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getUseReasion() {
        return useReasion;
    }

    public void setUseReasion(String useReasion) {
        this.useReasion = useReasion;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugSpec() {
        return drugSpec;
    }

    public void setDrugSpec(String drugSpec) {
        this.drugSpec = drugSpec;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getMeddleType() {
        return meddleType;
    }

    public void setMeddleType(String meddleType) {
        this.meddleType = meddleType;
    }

    public String getAppDate() {
        return appDate;
    }

    public void setAppDate(String appDate) {
        this.appDate = appDate;
    }

    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }

    public String getDealWho() {
        return dealWho;
    }

    public void setDealWho(String dealWho) {
        this.dealWho = dealWho;
    }

    public String getDealWhoCode() {
        return dealWhoCode;
    }

    public void setDealWhoCode(String dealWhoCode) {
        this.dealWhoCode = dealWhoCode;
    }

    public String getAppWho() {
        return appWho;
    }

    public void setAppWho(String appWho) {
        this.appWho = appWho;
    }

    public String getAppWhoCode() {
        return appWhoCode;
    }

    public void setAppWhoCode(String appWhoCode) {
        this.appWhoCode = appWhoCode;
    }

    public String getReceiveWho() {
        return receiveWho;
    }

    public void setReceiveWho(String receiveWho) {
        this.receiveWho = receiveWho;
    }

    public String getReceiveWhoCode() {
        return receiveWhoCode;
    }

    public void setReceiveWhoCode(String receiveWhoCode) {
        this.receiveWhoCode = receiveWhoCode;
    }

    public String getReceiveDeptName() {
        return receiveDeptName;
    }

    public void setReceiveDeptName(String receiveDeptName) {
        this.receiveDeptName = receiveDeptName;
    }

    public String getReceiveDeptCode() {
        return receiveDeptCode;
    }

    public void setReceiveDeptCode(String receiveDeptCode) {
        this.receiveDeptCode = receiveDeptCode;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

}