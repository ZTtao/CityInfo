package pers.zhentao.cityinfo.pojo;

public class Type {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_type.id
     *
     * @mbggenerated
     */
    private Short id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_type.type_sign
     *
     * @mbggenerated
     */
    private Short typeSign;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_type.type_name
     *
     * @mbggenerated
     */
    private String typeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_type.type_intro
     *
     * @mbggenerated
     */
    private String typeIntro;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_type.id
     *
     * @return the value of tb_type.id
     *
     * @mbggenerated
     */
    public Short getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_type.id
     *
     * @param id the value for tb_type.id
     *
     * @mbggenerated
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_type.type_sign
     *
     * @return the value of tb_type.type_sign
     *
     * @mbggenerated
     */
    public Short getTypeSign() {
        return typeSign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_type.type_sign
     *
     * @param typeSign the value for tb_type.type_sign
     *
     * @mbggenerated
     */
    public void setTypeSign(Short typeSign) {
        this.typeSign = typeSign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_type.type_name
     *
     * @return the value of tb_type.type_name
     *
     * @mbggenerated
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_type.type_name
     *
     * @param typeName the value for tb_type.type_name
     *
     * @mbggenerated
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_type.type_intro
     *
     * @return the value of tb_type.type_intro
     *
     * @mbggenerated
     */
    public String getTypeIntro() {
        return typeIntro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_type.type_intro
     *
     * @param typeIntro the value for tb_type.type_intro
     *
     * @mbggenerated
     */
    public void setTypeIntro(String typeIntro) {
        this.typeIntro = typeIntro == null ? null : typeIntro.trim();
    }
}