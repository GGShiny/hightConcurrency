package com.thought.it.service;

import com.thought.it.dao.SkProductDao;
import com.thought.it.entity.SkProductInfo;
import com.thought.it.vo.ConstomSkProductVo;
import com.thought.it.vo.SkProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.channels.SelectionKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/10/18.
 */
@Service
public class SkProductService {

    @Autowired
    private SkProductDao skProductDao;

    /**
     * 申请秒杀商品
     * @param skProductInfo
     */
    public void applySkProduct(SkProductInfo skProductInfo){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        skProductInfo.setApplydate(new Date());
        skProductInfo.setAuditstate(1);
        String startTimeStr = skProductInfo.getStartTimeStr();
        String endTimeStr = skProductInfo.getEndTimeStr();
        try {
            Date startTime = format.parse(startTimeStr);
            Date endTime = format.parse(endTimeStr);
            skProductInfo.setStarttime(startTime);
            skProductInfo.setEndtime(endTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        skProductDao.applySkProduct(skProductInfo);
    }

    /**
     * 秒杀商品列表
     * @param skProductVo
     * @return
     */
    public List<SkProductInfo> listSkProduct(SkProductVo skProductVo){
        return skProductDao.listSkProduct(skProductVo);
    };

    /*
     * 根据id查询商品
     * @param id
     * @return
     */
    public SkProductInfo findSkProductById(int id){
        SkProductInfo skProduct = skProductDao.findSkProductById(id);
        return skProduct;
    }

    /**
     * 删除申请商品
     * @param id
     */
    public void delSkProduct(int id){
        skProductDao.delSkProduct(id);
    };

    /**
     * 更新申请商品
     * @param skProductInfo
     */
    public void updateSkProduct(SkProductInfo skProductInfo){
        skProductDao.updateSkProduct(skProductInfo);
    };

    /**
     * 更新申请商品审核状态
     * @param id
     * @param state
     */
    public void updateSkProductState(int id, int state){
        SkProductVo skProductVo = new SkProductVo();
        ConstomSkProductVo productVo = new ConstomSkProductVo();
        productVo.setId(id);
        productVo.setAuditstate(state);
        skProductVo.setConstomSkProductVo(productVo);
        skProductDao.updateSkProductState(skProductVo);
    };
}
