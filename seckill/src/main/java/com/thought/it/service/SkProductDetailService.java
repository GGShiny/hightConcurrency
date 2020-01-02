package com.thought.it.service;

import com.thought.it.dao.SkProductDetailDao;
import com.thought.it.entity.SkProductDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/10/20.
 */
@Service
public class SkProductDetailService {
    @Autowired
    private SkProductDetailDao skProductDetailDao;

    public void insertSkProductDetail(SkProductDetail skProductDetail){
        skProductDetailDao.insertSkProductDetail(skProductDetail);
    };

    public SkProductDetail findProductDetailById(int productid){
        return skProductDetailDao.findProductDetailById(productid);
    };

    public void updateProductDetail(SkProductDetail skProductDetail){
        skProductDetailDao.updateProductDetail(skProductDetail);
    };
}
