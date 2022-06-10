package com.accountbook.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("test")
public class Test {
    @TableId(type = IdType.UUID)
    //用户id
    private String Id;
    //用户名
    private String Name;
    //用户手机号
    private String Tel;
}
