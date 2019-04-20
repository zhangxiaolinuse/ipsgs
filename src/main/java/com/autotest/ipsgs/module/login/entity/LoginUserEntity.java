package com.autotest.ipsgs.module.login.entity;

import lombok.Data;

import java.util.List;

@Data
//@(Value="ppe_zp")
//@Entity
//@Table(name = "user")
public class LoginUserEntity {

    //  @GeneratedValue(strategy = GenerationType.IDENTITY)  //如果对应表的时候，这个标识唯一标识
//  @Id    //这个标识是主键
//  private Integer id;
//  @Column(name = "location_polygon",columnDefinition = "polygon")  name代表对应的列，如果有驼峰的时候会使用；columnDefinition这个表示如果不是数据库的基础类型需要指定
//  private Polygon locationPolygon;
//    @Type(type = "json")  json数据格式类型
//    @Column(columnDefinition = "json")  json列
//    private List<Attachment> attachment;
    private String id;

    private String username;

    private String password;
}
