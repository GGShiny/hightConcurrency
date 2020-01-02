package com.thought.it.vo;

import com.thought.it.entity.SkProductInfo;

/**
 * Created by Administrator on 2019/10/18.
 */
public class ConstomSkProductVo extends SkProductInfo {
    private int startSeckillprice;  //秒杀价格范围查询最低价格
    private int endSeckillprice;    //秒杀价格范围查询最高价格

    private int startOriginalprice; //商品原价格范围查询最低价格
    private int endOriginalprice;   //商品原价格范围查询最高价格

    private String startApplydate;    //提交审核范围查询开始时间
    private String endApplydate;  //提交审核范围查询结束时间

    private String startAuditdate;    //审核通过范围查询开始时间
    private String endAuditdate;  //审核通过范围查询结束时间

    private String startStarttime;    //秒杀开始时间范围查询开始
    private String endStarttime;  //秒杀开始时间范围查询结束

    private String startEndtime;  //秒杀结束时间范围查询开始
    private String endEndtime;    //秒杀结束时间范围查询结束

    private int startProductCount;      //秒杀商品数范围查询开始
    private int endProductCount;    //秒杀商品数范围查询结束

    private int startStockCount;    //秒杀商品库存数范围查询开始
    private int endStockCount;  //

    public int getStartSeckillprice() {
        return startSeckillprice;
    }

    public void setStartSeckillprice(int startSeckillprice) {
        this.startSeckillprice = startSeckillprice;
    }

    public int getEndSeckillprice() {
        return endSeckillprice;
    }

    public void setEndSeckillprice(int endSeckillprice) {
        this.endSeckillprice = endSeckillprice;
    }

    public int getStartOriginalprice() {
        return startOriginalprice;
    }

    public void setStartOriginalprice(int startOriginalprice) {
        this.startOriginalprice = startOriginalprice;
    }

    public int getEndOriginalprice() {
        return endOriginalprice;
    }

    public void setEndOriginalprice(int endOriginalprice) {
        this.endOriginalprice = endOriginalprice;
    }

    public String getStartApplydate() {
        return startApplydate;
    }

    public void setStartApplydate(String startApplydate) {
        this.startApplydate = startApplydate;
    }

    public String getEndApplydate() {
        return endApplydate;
    }

    public void setEndApplydate(String endApplydate) {
        this.endApplydate = endApplydate;
    }

    public String getStartAuditdate() {
        return startAuditdate;
    }

    public void setStartAuditdate(String startAuditdate) {
        this.startAuditdate = startAuditdate;
    }

    public String getEndAuditdate() {
        return endAuditdate;
    }

    public void setEndAuditdate(String endAuditdate) {
        this.endAuditdate = endAuditdate;
    }

    public String getStartStarttime() {
        return startStarttime;
    }

    public void setStartStarttime(String startStarttime) {
        this.startStarttime = startStarttime;
    }

    public String getEndStarttime() {
        return endStarttime;
    }

    public void setEndStarttime(String endStarttime) {
        this.endStarttime = endStarttime;
    }

    public String getStartEndtime() {
        return startEndtime;
    }

    public void setStartEndtime(String startEndtime) {
        this.startEndtime = startEndtime;
    }

    public String getEndEndtime() {
        return endEndtime;
    }

    public void setEndEndtime(String endEndtime) {
        this.endEndtime = endEndtime;
    }

    public int getStartProductCount() {
        return startProductCount;
    }

    public void setStartProductCount(int startProductCount) {
        this.startProductCount = startProductCount;
    }

    public int getEndProductCount() {
        return endProductCount;
    }

    public void setEndProductCount(int endProductCount) {
        this.endProductCount = endProductCount;
    }

    public int getStartStockCount() {
        return startStockCount;
    }

    public void setStartStockCount(int startStockCount) {
        this.startStockCount = startStockCount;
    }

    public int getEndStockCount() {
        return endStockCount;
    }

    public void setEndStockCount(int endStockCount) {
        this.endStockCount = endStockCount;
    }
}
