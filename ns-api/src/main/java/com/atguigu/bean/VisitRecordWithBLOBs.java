package com.atguigu.bean;

public class VisitRecordWithBLOBs extends VisitRecord {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_record.require
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    private String require;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_record.apply_reason
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    private String applyReason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_record.approve_opinion
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    private String approveOpinion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_record.remark
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_record.visit_report
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    private String visitReport;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_record.visit_address
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    private String visitAddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_record.require
     *
     * @return the value of visit_record.require
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    public String getRequire() {
        return require;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_record.require
     *
     * @param require the value for visit_record.require
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    public void setRequire(String require) {
        this.require = require == null ? null : require.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_record.apply_reason
     *
     * @return the value of visit_record.apply_reason
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    public String getApplyReason() {
        return applyReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_record.apply_reason
     *
     * @param applyReason the value for visit_record.apply_reason
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason == null ? null : applyReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_record.approve_opinion
     *
     * @return the value of visit_record.approve_opinion
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    public String getApproveOpinion() {
        return approveOpinion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_record.approve_opinion
     *
     * @param approveOpinion the value for visit_record.approve_opinion
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    public void setApproveOpinion(String approveOpinion) {
        this.approveOpinion = approveOpinion == null ? null : approveOpinion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_record.remark
     *
     * @return the value of visit_record.remark
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_record.remark
     *
     * @param remark the value for visit_record.remark
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_record.visit_report
     *
     * @return the value of visit_record.visit_report
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    public String getVisitReport() {
        return visitReport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_record.visit_report
     *
     * @param visitReport the value for visit_record.visit_report
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    public void setVisitReport(String visitReport) {
        this.visitReport = visitReport == null ? null : visitReport.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_record.visit_address
     *
     * @return the value of visit_record.visit_address
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    public String getVisitAddress() {
        return visitAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_record.visit_address
     *
     * @param visitAddress the value for visit_record.visit_address
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    public void setVisitAddress(String visitAddress) {
        this.visitAddress = visitAddress == null ? null : visitAddress.trim();
    }
}