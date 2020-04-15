package com.grain.mall.manage.mapper;

import com.grain.mall.bean.SkuSaleAttrValue;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2020/3/26 16:12
 * @description：
 * @modified By：
 * @version: $
 */
public interface SkuSaleAttrValueMapper extends Mapper<SkuSaleAttrValue>{

    /**
     * 根据spuId 查询数据
     * @param spuId
     * @return
     */
    List<SkuSaleAttrValue> selectSkuSaleAttrValueListBySpu(String spuId);
}
