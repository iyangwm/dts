package com.qiguliuxing.dts.db.dao;

import com.qiguliuxing.dts.db.domain.DtsKeyword;
import com.qiguliuxing.dts.db.domain.DtsKeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtsKeywordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     */
    long countByExample(DtsKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     */
    int deleteByExample(DtsKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     */
    int insert(DtsKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     */
    int insertSelective(DtsKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsKeyword selectOneByExample(DtsKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsKeyword selectOneByExampleSelective(@Param("example") DtsKeywordExample example, @Param("selective") DtsKeyword.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<DtsKeyword> selectByExampleSelective(@Param("example") DtsKeywordExample example, @Param("selective") DtsKeyword.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     */
    List<DtsKeyword> selectByExample(DtsKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsKeyword selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DtsKeyword.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     */
    DtsKeyword selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsKeyword selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DtsKeyword record, @Param("example") DtsKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DtsKeyword record, @Param("example") DtsKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DtsKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DtsKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") DtsKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}