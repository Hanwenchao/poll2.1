package com.briup.apps.poll.dao;

import com.briup.apps.poll.bean.Questionnaire;
import com.briup.apps.poll.bean.QuestionnaireExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionnaireMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Tue Jun 26 15:38:58 CST 2018
     */
    long countByExample(QuestionnaireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Tue Jun 26 15:38:58 CST 2018
     */
    int deleteByExample(QuestionnaireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Tue Jun 26 15:38:58 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Tue Jun 26 15:38:58 CST 2018
     */
    int insert(Questionnaire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Tue Jun 26 15:38:58 CST 2018
     */
    int insertSelective(Questionnaire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Tue Jun 26 15:38:58 CST 2018
     */
    List<Questionnaire> selectByExampleWithBLOBs(QuestionnaireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Tue Jun 26 15:38:58 CST 2018
     */
    List<Questionnaire> selectByExample(QuestionnaireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Tue Jun 26 15:38:58 CST 2018
     */
    Questionnaire selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Tue Jun 26 15:38:58 CST 2018
     */
    int updateByExampleSelective(@Param("record") Questionnaire record, @Param("example") QuestionnaireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Tue Jun 26 15:38:58 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Questionnaire record, @Param("example") QuestionnaireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Tue Jun 26 15:38:58 CST 2018
     */
    int updateByExample(@Param("record") Questionnaire record, @Param("example") QuestionnaireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Tue Jun 26 15:38:58 CST 2018
     */
    int updateByPrimaryKeySelective(Questionnaire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Tue Jun 26 15:38:58 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Questionnaire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Tue Jun 26 15:38:58 CST 2018
     */
    int updateByPrimaryKey(Questionnaire record);
}