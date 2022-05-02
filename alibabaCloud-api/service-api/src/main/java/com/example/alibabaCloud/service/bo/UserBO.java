package com.example.alibabaCloud.service.bo;

/**
 * @Author: kangerbao
 * @createTime: 2022年05月02日 15:33:03
 * @version: 1.0
 * @Description:
 */
public class UserBO {
    /**
     * 编号
     */
    private String id;

    /**
     * 用户名
     */
    private Integer age;

    /**
     * 密码
     */
    private Integer height;

    private Integer weight;


    public String getId() {
        return id;
    }

    public UserBO setId(String id) {
        this.id = id;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public UserBO setAge(Integer age)
    {
        this.age=age;
        return this;
    }


    public Integer getHeight() {
        return height;
    }

    public UserBO setHeight(Integer height)
    {
        this.height=height;
        return this;
    }

    public Integer getWeight() {
        return weight;
    }

    public UserBO setWeight(Integer weight)
    {
        this.weight=weight;
        return this;
    }
}
