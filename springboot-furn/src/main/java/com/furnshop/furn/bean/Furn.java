package com.hspedu.furn.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 如果Furn类名和表 furn名字不能对应，可以通过前面讲解的@TableName
 * 如果可以对应上，可以不写
 */
@Data
//@TableName("furn")
public class Furn {

    //这里我们使用@TableId： 表主键标识
    //当我们在 private Integer id 上标识了@TableId
    //说明id 对应的就是表的id字段，而且是主键
    //type = IdType.AUTO 主键类型是自增长
    @TableId(type = IdType.AUTO)
    private Integer id;
    //根据自己的业务需求,来配置相应的注解

    //如果是对String进行非空校验,我们应该使用@NotEmpty
    @NotEmpty(message = "请输入家居名")
    private String name;
    @NotEmpty(message = "请输入厂商名")
    private String maker;

    @NotNull(message = "请输入数字")
    @Range(min = 0, message = "价格不能小于0")
    private BigDecimal price;

    @NotNull(message = "请输入数字")
    @Range(min = 0, message = "销量不能小于0")
    private Integer sales;

    @NotNull(message = "请输入数字")
    @Range(min = 0, message = "库存不能小于0")
    private Integer stock;
}
