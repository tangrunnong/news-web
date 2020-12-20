package com.homework.trans.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author chen_yu
 * @date 2020/12/19 20:25
 */
@Data
@TableName("t_news")
public class News {


    @TableId(type = IdType.AUTO)
    private int id;
    private String newsTitle;
    private int newsTypeId;
    private String newsContent;
    private String coverUrl;
    private LocalDateTime createTime;


}
