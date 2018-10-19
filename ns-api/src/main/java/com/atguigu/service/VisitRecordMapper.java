package com.atguigu.service;

import com.atguigu.bean.VisitRecord;
import com.atguigu.bean.VisitRecordExample;
import com.atguigu.bean.VisitRecordWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    long countByExample(VisitRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int deleteByExample(VisitRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int insert(VisitRecordWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int insertSelective(VisitRecordWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    List<VisitRecordWithBLOBs> selectByExampleWithBLOBs(VisitRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    List<VisitRecord> selectByExample(VisitRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    VisitRecordWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByExampleSelective(@Param("record") VisitRecordWithBLOBs record, @Param("example") VisitRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") VisitRecordWithBLOBs record, @Param("example") VisitRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByExample(@Param("record") VisitRecord record, @Param("example") VisitRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByPrimaryKeySelective(VisitRecordWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(VisitRecordWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByPrimaryKey(VisitRecord record);
}