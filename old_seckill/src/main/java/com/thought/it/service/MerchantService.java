package com.thought.it.service;

import com.thought.it.dao.MerchantDao;
import com.thought.it.entity.Merchant;
import com.thought.it.vo.MerchantVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/10/15.
 */
@Service
public class MerchantService {

    @Autowired
    private MerchantDao merchantDao;

    public void insertMerchant(Merchant merchant){
        merchantDao.insertMerchant(merchant);
    };

    public Merchant findMerchantById(int id){
        return merchantDao.findMerchantById(id);
    };

    public void updateMerchant(Merchant merchant){
        merchantDao.updateMerchant(merchant);
    };

    public void deleteMerchantById(int id){
        merchantDao.deleteMerchantById(id);
    };

    public List<Merchant> findMerchantByVo(MerchantVo merchantVo){
        return merchantDao.findMerchantByVo(merchantVo);
    }

    public Merchant findMerchantByAccount(String merchantAccount){
        return  merchantDao.findMerchantByAccount(merchantAccount);
    };
}
