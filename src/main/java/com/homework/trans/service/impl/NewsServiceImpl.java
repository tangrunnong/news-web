package com.homework.trans.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.homework.trans.entity.News;
import com.homework.trans.mapper.NewsMapper;
import com.homework.trans.service.NewsService;
import org.springframework.stereotype.Service;

/**
 * @author chen_yu
 * @date 2020/12/19 20:47
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements NewsService{
}
