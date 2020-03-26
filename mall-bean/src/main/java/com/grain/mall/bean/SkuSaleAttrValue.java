package com.grain.mall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2020/3/26 16:08
 * @description：
 * @modified By：
 * @version: $
 */
@Data
public class SkuSaleAttrValue implements Serializable{

    @Id
    @Column
    String id;

    @Column
    String skuId;

    @Column
    String saleAttrId;

    @Column
    String saleAttrValueId;

    @Column
    String saleAttrName;

    @Column
    String saleAttrValueName;


}
