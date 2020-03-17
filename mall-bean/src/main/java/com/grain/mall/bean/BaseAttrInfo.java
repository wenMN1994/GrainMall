package com.grain.mall.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2020/3/17 17:00
 * @description：
 * @modified By：
 * @version: $
 */
@Data
public class BaseAttrInfo implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 获取主键自增！
    private String id;
    @Column
    private String attrName;
    @Column
    private String catalog3Id;

    // baseAttrValue 的集合
    @Transient // 表示当前字段不是表中的字段，是业务需要使用的！
    private List<BaseAttrValue> attrValueList;


}
