
package com.minhtri.store.model;

import java.math.BigDecimal;
import java.util.Date;

import com.minhtri.store.enumeric.TypeEnumeric;
import com.minhtri.store.util.AttributeUtil;

/**
 * Stored custom attribute of product.
 * 
 * @author: Tri Vo
 * @version: 1.0
 * @created: 2018-10-24
 */
public class Attribute {

    private String name;
    private TypeEnumeric type;
    private Date dateValue;
    private String textValue;
    private String longTextValue;
    private Float floatValue;
    private BigDecimal decimalValue;

    public Attribute() {
        super();
    }

    /**
     * get name of attribute. For example: description, origin, ...
     * 
     * @return name of attribute.
     */
    public String getName() {
        return name;
    }

    /**
     * set name for attribute. For example: description, origin, ...
     * 
     * @param name
     *            name of attribute.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get type of attribute. For example: DATE, TEXT, ...
     * 
     * @return type of attribute.
     */
    public TypeEnumeric getType() {
        return type;
    }

    /**
     * set type for attribute. For example: DATE, TEXT, ...
     * 
     * @param type
     *            type of attribute.
     */
    public void setType(TypeEnumeric type) {
        this.type = type;
    }

    /**
     * get datetime's data of attribute.
     * 
     * @return datetime's data of attribute. Return <code>null</code> if type is
     *         not DATE.
     */
    public Date getDateValue() {
        return dateValue;
    }

    /**
     * set datetime's data for attribute.
     * 
     * @param dateValue
     *            datetime's data of attribute.
     */
    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * get text's data of attribute.
     * 
     * @return text's data of attribute. Return <code>null</code> if type is not
     *         TEXT.
     */
    public String getTextValue() {
        return textValue;
    }

    /**
     * set text's data for attribute.
     * 
     * @param textValue
     *            text's data of attribute.
     */
    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    /**
     * get longtext's data of attribute.
     * 
     * @return longtext's data of attribute. Return <code>null</code> if type is
     *         not LONG_TEXT.
     */
    public String getLongTextValue() {
        return longTextValue;
    }

    /**
     * set longtext's data for attribute.
     * 
     * @param longTextValue
     *            longtext's data of attribute.
     */
    public void setLongTextValue(String longTextValue) {
        this.longTextValue = longTextValue;
    }

    /**
     * get float's data of attribute.
     * 
     * @return float's data of attribute. Return <code>null</code> if type is
     *         not FLOAT.
     */
    public Float getFloatValue() {
        return floatValue;
    }

    /**
     * set float's data for attribute.
     * 
     * @param floatValue
     *            float's data of attribute.
     */
    public void setFloatValue(Float floatValue) {
        this.floatValue = floatValue;
    }

    /**
     * get decimal's data of attribute.
     * 
     * @return decimal's data of attribute. Return <code>null</code> if type is
     *         not DECIMAL.
     */
    public BigDecimal getDecimalValue() {
        return decimalValue;
    }

    /**
     * set decinal's data for attribute.
     * 
     * @param decimalValue
     *            decimal's data of attribute.
     */
    public void setDecimalValue(BigDecimal decimalValue) {
        this.decimalValue = decimalValue;
    }

    @Override
    public String toString() {
        return "Attribute [name=" + name + ", type=" + type + ", data=" + AttributeUtil.getData(this) + "]";
    }

}
