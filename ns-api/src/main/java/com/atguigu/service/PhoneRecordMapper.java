package com.atguigu.service;

import com.atguigu.bean.PhoneRecord;
import com.atguigu.bean.PhoneRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhoneRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    long countByExample(PhoneRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int deleteByExample(PhoneRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int insert(PhoneRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int insertSelective(PhoneRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    List<PhoneRecord> selectByExampleWithBLOBs(PhoneRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    List<PhoneRecord> selectByExample(PhoneRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    PhoneRecord selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByExampleSelective(@Param("record") PhoneRecord record, @Param("example") PhoneRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") PhoneRecord record, @Param("example") PhoneRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByExample(@Param("record") PhoneRecord record, @Param("example") PhoneRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByPrimaryKeySelective(PhoneRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(PhoneRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_record
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByPrimaryKey(PhoneRecord record);
}