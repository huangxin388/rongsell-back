package com.bupt.rongsell.dao;

import com.bupt.rongsell.entity.Hobby;
import com.bupt.rongsell.entity.HobbyExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface HobbyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbg.generated Thu Jul 02 13:35:18 CST 2020
     */
    long countByExample(HobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbg.generated Thu Jul 02 13:35:18 CST 2020
     */
    int deleteByExample(HobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbg.generated Thu Jul 02 13:35:18 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbg.generated Thu Jul 02 13:35:18 CST 2020
     */
    int insert(Hobby record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbg.generated Thu Jul 02 13:35:18 CST 2020
     */
    int insertSelective(Hobby record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbg.generated Thu Jul 02 13:35:18 CST 2020
     */
    List<Hobby> selectByExample(HobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbg.generated Thu Jul 02 13:35:18 CST 2020
     */
    Hobby selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbg.generated Thu Jul 02 13:35:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") Hobby record, @Param("example") HobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbg.generated Thu Jul 02 13:35:18 CST 2020
     */
    int updateByExample(@Param("record") Hobby record, @Param("example") HobbyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbg.generated Thu Jul 02 13:35:18 CST 2020
     */
    int updateByPrimaryKeySelective(Hobby record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbg.generated Thu Jul 02 13:35:18 CST 2020
     */
    int updateByPrimaryKey(Hobby record);

    int insertHobby(Hobby hobby);

    List<Hobby> selectHobbys();
}