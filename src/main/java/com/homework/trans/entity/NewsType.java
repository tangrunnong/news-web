package com.homework.trans.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author chen_yu
 * @date 2020/12/19 20:25
 */
@Data
@TableName("t_news_type")
public class NewsType {

    @TableId(type = IdType.AUTO)
    private int id;

    private String typeName;

    private LocalDateTime createTime;


    @TableField(exist = false)
    private List<News> newsList;
}
