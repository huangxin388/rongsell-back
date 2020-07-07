package com.bupt.rongsell.dao;

import com.bupt.rongsell.entity.Spu;
import com.bupt.rongsell.entity.SpuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SpuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu_use
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    long countByExample(SpuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu_use
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    int deleteByExample(SpuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu_use
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu_use
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    int insert(Spu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu_use
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    int insertSelective(Spu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu_use
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    List<Spu> selectByExample(SpuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu_use
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    Spu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu_use
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    int updateByExampleSelective(@Param("record") Spu record, @Param("example") SpuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu_use
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    int updateByExample(@Param("record") Spu record, @Param("example") SpuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu_use
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    int updateByPrimaryKeySelective(Spu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_spu_use
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    int updateByPrimaryKey(Spu record);
}