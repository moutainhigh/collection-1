package com.atguigu.service;

import com.atguigu.bean.CaseInfo;
import com.atguigu.bean.CaseInfoExample;
import com.atguigu.bean.CaseInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaseInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    long countByExample(CaseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int deleteByExample(CaseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int insert(CaseInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int insertSelective(CaseInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    List<CaseInfoWithBLOBs> selectByExampleWithBLOBs(CaseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    List<CaseInfo> selectByExample(CaseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    CaseInfoWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByExampleSelective(@Param("record") CaseInfoWithBLOBs record, @Param("example") CaseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") CaseInfoWithBLOBs record, @Param("example") CaseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByExample(@Param("record") CaseInfo record, @Param("example") CaseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByPrimaryKeySelective(CaseInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(CaseInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByPrimaryKey(CaseInfo record);
}