package com.thought.it.dao;

import com.thought.it.entity.SeckillUser;
import com.thought.it.vo.SeckillUserVo;

import java.util.List;

/**
 * Created by Administrator on 2019/10/15.
 */
public interface SeckillUserDao {
    public void insertSeckillUser(SeckillUser seckillUser);

    public SeckillUser findSeckillUserById(int id);

    public void updateSeckillUser(SeckillUser seckillUser);

    public void deleteSeckillUserById(int id);

    public List<SeckillUser> findSeckillUserByVo(SeckillUserVo seckillUserVo);

    public SeckillUser findUserByAccount(String userAccount);
}
