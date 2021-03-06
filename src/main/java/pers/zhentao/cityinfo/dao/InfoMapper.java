package pers.zhentao.cityinfo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.zhentao.cityinfo.pojo.Info;
import pers.zhentao.cityinfo.pojo.InfoExample;

public interface InfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_info
     *
     * @mbggenerated
     */
    int countByExample(InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_info
     *
     * @mbggenerated
     */
    int deleteByExample(InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_info
     *
     * @mbggenerated
     */
    int insert(Info record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_info
     *
     * @mbggenerated
     */
    int insertSelective(Info record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_info
     *
     * @mbggenerated
     */
    List<Info> selectByExample(InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_info
     *
     * @mbggenerated
     */
    Info selectByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Info record, @Param("example") InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Info record, @Param("example") InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Info record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Info record);
}