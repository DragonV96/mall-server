package com.glw.mall.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

import lombok.*;

/**
 * 表名：mmall_product
*/
@Data
@Entity
@Table(name = "mmall_product")
public class MmallProduct {
    /**
     * 商品id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 分类id,对应mmall_category表的主键
     */
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * 商品名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 商品副标题
     */
    @Column(name = "subtitle")
    private String subtitle;

    /**
     * 产品主图,url相对地址
     */
    @Column(name = "main_image")
    private String mainImage;

    /**
     * 价格,单位-元保留两位小数
     */
    @Column(name = "price")
    private BigDecimal price;

    /**
     * 库存数量
     */
    @Column(name = "stock")
    private Integer stock;

    /**
     * 商品状态.1-在售 2-下架 3-删除
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 图片地址,json格式,扩展用
     */
    @Column(name = "sub_images")
    private String subImages;

    /**
     * 商品详情
     */
    @Column(name = "detail")
    private String detail;
}