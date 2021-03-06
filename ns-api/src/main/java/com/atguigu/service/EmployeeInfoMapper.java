package com.atguigu.service;

import com.atguigu.bean.EmployeeInfo;
import com.atguigu.bean.EmployeeInfoExample;
import com.atguigu.bean.EmployeeInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    long countByExample(EmployeeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int deleteByExample(EmployeeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int insert(EmployeeInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int insertSelective(EmployeeInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    List<EmployeeInfoWithBLOBs> selectByExampleWithBLOBs(EmployeeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    List<EmployeeInfo> selectByExample(EmployeeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    EmployeeInfoWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByExampleSelective(@Param("record") EmployeeInfoWithBLOBs record, @Param("example") EmployeeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") EmployeeInfoWithBLOBs record, @Param("example") EmployeeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByExample(@Param("record") EmployeeInfo record, @Param("example") EmployeeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByPrimaryKeySelective(EmployeeInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(EmployeeInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByPrimaryKey(EmployeeInfo record);
}