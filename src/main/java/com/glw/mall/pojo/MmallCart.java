package com.glw.mall.pojo;

import java.util.Date;
import javax.persistence.*;

import lombok.*;

/**
 * 表名：mmall_cart
*/
@Data
@Entity
@Table(name = "mmall_cart")
public class MmallCart {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    /**
     * 商品id
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 数量
     */
    @Column(name = "quantity")
    private Integer quantity;

    /**
     * 是否选择,1=已勾选,0=未勾选
     */
    @Column(name = "checked")
    private Integer checked;

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
}