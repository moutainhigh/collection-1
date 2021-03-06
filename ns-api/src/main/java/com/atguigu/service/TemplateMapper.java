package com.atguigu.service;

import com.atguigu.bean.Template;
import com.atguigu.bean.TemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    long countByExample(TemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int deleteByExample(TemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int insert(Template record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int insertSelective(Template record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    List<Template> selectByExampleWithBLOBs(TemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    List<Template> selectByExample(TemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    Template selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByExampleSelective(@Param("record") Template record, @Param("example") TemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Template record, @Param("example") TemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByExample(@Param("record") Template record, @Param("example") TemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByPrimaryKeySelective(Template record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Template record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbg.generated Thu Oct 18 15:28:41 CST 2018
     */
    int updateByPrimaryKey(Template record);
}