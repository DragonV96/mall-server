package com.glw.mall.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

import lombok.*;

/**
 * 表名：mmall_order_item
*/
@Data
@Entity
@Table(name = "mmall_order_item")
public class MmallOrderItem {
    /**
     * 订单子表id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "order_no")
    private Long orderNo;

    /**
     * 商品id
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 商品图片地址
     */
    @Column(name = "product_image")
    private String productImage;

    /**
     * 生成订单时的商品单价，单位是元,保留两位小数
     */
    @Column(name = "current_unit_price")
    private BigDecimal currentUnitPrice;

    /**
     * 商品数量
     */
    @Column(name = "quantity")
    private Integer quantity;

    /**
     * 商品总价,单位是元,保留两位小数
     */
    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}