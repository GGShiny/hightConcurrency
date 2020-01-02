package com.thought.it.dao;

import com.thought.it.entity.Merchant;
import com.thought.it.vo.MerchantVo;

import java.util.List;

/**
 * Created by Administrator on 2019/10/15.
 */
public interface MerchantDao {
    public void insertMerchant(Merchant merchant);

    public Merchant findMerchantById(int id);

    public void updateMerchant(Merchant merchant);

    public void deleteMerchantById(int id);

    public List<Merchant> findMerchantByVo(MerchantVo merchantVo);

    public Merchant findMerchantByAccount(String merchantAccount);
}
