package com.glw.mall.pojo;

import java.util.Date;
import javax.persistence.*;

import lombok.*;

/**
 * 表名：mmall_user
*/
@Data
@Entity
@Table(name = "mmall_user")
public class MmallUser {
    /**
     * 用户表id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;

    /**
     * 用户密码，MD5加密
     */
    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    /**
     * 找回密码问题
     */
    @Column(name = "question")
    private String question;

    /**
     * 找回密码答案
     */
    @Column(name = "answer")
    private String answer;

    /**
     * 角色0-管理员,1-普通用户
     */
    @Column(name = "role")
    private Integer role;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后一次更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;
}