
package com.minhtri.store.util;

import java.math.BigDecimal;
import java.util.Date;

import com.minhtri.store.enumeric.TypeEnumeric;
import com.minhtri.store.model.Attribute;

/**
 * The AttributeUtil provides method to create attribute object and get data of
 * attribute
 * 
 * @author: Tri Vo
 * @version: 1.0
 * @created: 2018-10-24
 */
public class AttributeUtil {

    private AttributeUtil() {
        // this is utility class
    }

    /**
     * generate attribute by name, type and data for this type.
     * 
     * @param name
     *            name of attribute.
     * @param type
     *            type of attribute.
     * @param data
     *            data for this type of attribute
     * @return the attribute that generate by name, type and data for this type.
     */
    public static Attribute create(String name, TypeEnumeric type, Object data) {
        Attribute attr = new Attribute();

        attr.setName(name);
        attr.setType(type);

        switch (type) {
            case DATE :
                if (data instanceof Date) {
                    attr.setDateValue((Date) data);
                }
                break;
            case TEXT :
                if (data instanceof String) {
                    attr.setTextValue((String) data);
                }
                break;
            case LONG_TEXT :
                if (data instanceof String) {
                    attr.setLongTextValue((String) data);
                }
                break;
            case FLOAT :
                if (data instanceof Float) {
                    attr.setFloatValue((Float) data);
                }
                break;
            case DECIMAL :
                if (data instanceof BigDecimal) {
                    attr.setDecimalValue((BigDecimal) data);
                }
                break;
            default :
                break;
        }

        return attr;
    }

    /**
     * get data of attribute follow the type
     * 
     * @param attr
     *            attribute want to get data
     * @return the data of attribute
     */
    public static Object getData(Attribute attr) {
        Object data = null;
        if (attr != null) {
            TypeEnumeric type = attr.getType();
            switch (type) {
                case DATE :
                    data = attr.getDateValue();
                    break;
                case TEXT :
                    data = attr.getTextValue();
                    break;
                case LONG_TEXT :
                    data = attr.getLongTextValue();
                    break;
                case FLOAT :
                    data = attr.getFloatValue();
                    break;
                case DECIMAL :
                    data = attr.getDecimalValue();
                    break;
                default :
                    break;
            }
        }

        return data;
    }

}
