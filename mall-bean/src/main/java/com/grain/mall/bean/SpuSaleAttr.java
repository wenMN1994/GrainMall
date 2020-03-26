package com.grain.mall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2020/3/26 14:07
 * @description：
 * @modified By：
 * @version: $
 */
@Data
public class SpuSaleAttr implements Serializable {

    @Id
    @Column
    String id ;

    @Column
    String spuId;

    @Column
    String saleAttrId;

    @Column
    String saleAttrName;

    @Transient
    List<SpuSaleAttrValue> spuSaleAttrValueList;
}

