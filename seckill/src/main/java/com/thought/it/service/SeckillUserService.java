package com.thought.it.service;

import com.thought.it.dao.SeckillUserDao;
import com.thought.it.entity.SeckillUser;
import com.thought.it.vo.SeckillUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/10/16.
 */
@Service
public class SeckillUserService {
    
    @Autowired
    private SeckillUserDao seckillUserDao;

    public void insertSeckillUser(SeckillUser seckillUser){
        seckillUserDao.insertSeckillUser(seckillUser);
    };

    public SeckillUser findSeckillUserById(int id){
        SeckillUser seckillUser = seckillUserDao.findSeckillUserById(id);
        return seckillUser;
    };

    public void updateSeckillUser(SeckillUser seckillUser){
        seckillUserDao.updateSeckillUser(seckillUser);
    };

    public void deleteSeckillUserById(int id){
        seckillUserDao.deleteSeckillUserById(id);
    };

    public List<SeckillUser> findSeckillUserByVo(SeckillUserVo seckillUserVo){
        List<SeckillUser> seckillUserList = seckillUserDao.findSeckillUserByVo(seckillUserVo);
        return seckillUserList;
    };

    public SeckillUser findUserByAccount(String userAccount){
        return seckillUserDao.findUserByAccount(userAccount);
    };
}
