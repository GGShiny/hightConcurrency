package com.thought.it.dao;

import com.thought.it.entity.SkProductDetail;

/**
 * Created by Administrator on 2019/10/20.
 */
public interface SkProductDetailDao {
    public void insertSkProductDetail(SkProductDetail skProductDetail);

    public SkProductDetail findProductDetailById(int productid);

    public void updateProductDetail(SkProductDetail skProductDetail);
}
