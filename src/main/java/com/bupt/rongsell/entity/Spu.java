package com.bupt.rongsell.entity;

import java.util.Date;

public class Spu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu_use.id
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu_use.title
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu_use.sub_title
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    private String subTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu_use.category_id
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu_use.brand_id
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    private Integer brandId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu_use.spg_id
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    private Integer spgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu_use.saleable
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    private Boolean saleable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu_use.valid
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    private Boolean valid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu_use.create_time
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu_use.last_update_time
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    private Date lastUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_spu_use.is_delete
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    private Boolean isDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu_use.id
     *
     * @return the value of t_spu_use.id
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu_use.id
     *
     * @param id the value for t_spu_use.id
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu_use.title
     *
     * @return the value of t_spu_use.title
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu_use.title
     *
     * @param title the value for t_spu_use.title
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu_use.sub_title
     *
     * @return the value of t_spu_use.sub_title
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu_use.sub_title
     *
     * @param subTitle the value for t_spu_use.sub_title
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu_use.category_id
     *
     * @return the value of t_spu_use.category_id
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu_use.category_id
     *
     * @param categoryId the value for t_spu_use.category_id
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu_use.brand_id
     *
     * @return the value of t_spu_use.brand_id
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu_use.brand_id
     *
     * @param brandId the value for t_spu_use.brand_id
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu_use.spg_id
     *
     * @return the value of t_spu_use.spg_id
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public Integer getSpgId() {
        return spgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu_use.spg_id
     *
     * @param spgId the value for t_spu_use.spg_id
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public void setSpgId(Integer spgId) {
        this.spgId = spgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu_use.saleable
     *
     * @return the value of t_spu_use.saleable
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public Boolean getSaleable() {
        return saleable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu_use.saleable
     *
     * @param saleable the value for t_spu_use.saleable
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public void setSaleable(Boolean saleable) {
        this.saleable = saleable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu_use.valid
     *
     * @return the value of t_spu_use.valid
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public Boolean getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu_use.valid
     *
     * @param valid the value for t_spu_use.valid
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu_use.create_time
     *
     * @return the value of t_spu_use.create_time
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu_use.create_time
     *
     * @param createTime the value for t_spu_use.create_time
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu_use.last_update_time
     *
     * @return the value of t_spu_use.last_update_time
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu_use.last_update_time
     *
     * @param lastUpdateTime the value for t_spu_use.last_update_time
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_spu_use.is_delete
     *
     * @return the value of t_spu_use.is_delete
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_spu_use.is_delete
     *
     * @param isDelete the value for t_spu_use.is_delete
     *
     * @mbg.generated Mon Jun 01 19:45:49 CST 2020
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}