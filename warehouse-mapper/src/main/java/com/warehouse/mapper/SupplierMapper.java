package com.warehouse.mapper;

import com.warehouse.bean.Supplier;
import com.warehouse.bean.SupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier
     *
     * @mbg.generated Wed Apr 25 12:25:01 CST 2018
     */
    long countByExample(SupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier
     *
     * @mbg.generated Wed Apr 25 12:25:01 CST 2018
     */
    int deleteByExample(SupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier
     *
     * @mbg.generated Wed Apr 25 12:25:01 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier
     *
     * @mbg.generated Wed Apr 25 12:25:01 CST 2018
     */
    int insert(Supplier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier
     *
     * @mbg.generated Wed Apr 25 12:25:01 CST 2018
     */
    int insertSelective(Supplier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier
     *
     * @mbg.generated Wed Apr 25 12:25:01 CST 2018
     */
    List<Supplier> selectByExample(SupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier
     *
     * @mbg.generated Wed Apr 25 12:25:01 CST 2018
     */
    Supplier selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier
     *
     * @mbg.generated Wed Apr 25 12:25:01 CST 2018
     */
    int updateByExampleSelective(@Param("record") Supplier record, @Param("example") SupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier
     *
     * @mbg.generated Wed Apr 25 12:25:01 CST 2018
     */
    int updateByExample(@Param("record") Supplier record, @Param("example") SupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier
     *
     * @mbg.generated Wed Apr 25 12:25:01 CST 2018
     */
    int updateByPrimaryKeySelective(Supplier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier
     *
     * @mbg.generated Wed Apr 25 12:25:01 CST 2018
     */
    int updateByPrimaryKey(Supplier record);
}