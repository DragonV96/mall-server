package com.glw.mall.pojo;

import java.util.Date;
import javax.persistence.*;

import lombok.*;

/**
 * 表名：mmall_category
*/
@Data
@Entity
@Table(name = "mmall_category")
public class MmallCategory {
    /**
     * 类别Id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 父类别id当id=0时说明是根节点,一级类别
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 类别名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 类别状态1-正常,2-已废弃
     */
    @Column(name = "status")
    private Boolean status;

    /**
     * 排序编号,同类展示顺序,数值相等则自然排序
     */
    @Column(name = "sort_order")
    private Integer sortOrder;

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