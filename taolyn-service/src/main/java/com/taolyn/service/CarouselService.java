package com.taolyn.service;

import com.taolyn.pojo.Carousel;

import java.util.List;

/**
 * Created by 陶Lyn
 * on 2020/12/17.
 */
public interface CarouselService {
    /**
     * 查询所有轮播图列表
     * @param isShow
     * @return
     */
    public List<Carousel> queryAll(Integer isShow);


}
