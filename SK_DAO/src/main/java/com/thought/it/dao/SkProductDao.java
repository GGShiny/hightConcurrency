package com.thought.it.dao;

import com.thought.it.entity.SkProductInfo;
import com.thought.it.vo.SkProductVo;

import java.util.List;

/**
 * Created by Administrator on 2019/10/18.
 */
public interface SkProductDao {
    public void applySkProduct(SkProductInfo skProductInfo);

    public List<SkProductInfo> listSkProduct(SkProductVo skProductVo);

    public SkProductInfo findSkProductById(int id);

    public void delSkProduct(int id);

    public void updateSkProduct(SkProductInfo skProductInfo);

    public void updateSkProductState(SkProductVo skProductVo);
}
