package com.thought.it.entity;

import java.util.Date;

/**
 * Created by Administrator on 2019/10/18.
 */
public class SkProductInfo {
    private int id; //主键
    private int productid;  //商品id;
    private String producttitle;    //商品标题
    private String productpicture;  //商品图片
    private int seckillprice;   //秒杀价格
    private int originalprice;  //原价格
    private int merchantid; //商家id
    private Date applydate; //申请时间
    private Date auditdate; //审核时间
    private int auditstate; //审核状态  1:未审核 2：审核通过    3：审核未通过
    private Date starttime; //秒杀开始时间
    private Date endtime;   //秒杀结束时间
    private String startTimeStr;    //秒杀开始时间string
    private String endTimeStr;  //秒杀结束时间string
    private int productcount;   //秒杀商品数
    private int stockcount; //商品库存数
    private String desciption;  //商品描述信息

    @Override
    public String toString() {
        return "SkProductInfo{" +
                "id=" + id +
                ", productid=" + productid +
                ", producttitle='" + producttitle + '\'' +
                ", productpicture='" + productpicture + '\'' +
                ", seckillprice=" + seckillprice +
                ", originalprice=" + originalprice +
                ", merchantid=" + merchantid +
                ", applydate=" + applydate +
                ", auditdate=" + auditdate +
                ", auditstate=" + auditstate +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                ", startTimeStr='" + startTimeStr + '\'' +
                ", endTimeStr='" + endTimeStr + '\'' +
                ", productcount=" + productcount +
                ", stockcount=" + stockcount +
                ", desciption='" + desciption + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProducttitle() {
        return producttitle;
    }

    public void setProducttitle(String producttitle) {
        this.producttitle = producttitle;
    }

    public String getProductpicture() {
        return productpicture;
    }

    public void setProductpicture(String productpicture) {
        this.productpicture = productpicture;
    }

    public int getSeckillprice() {
        return seckillprice;
    }

    public void setSeckillprice(int seckillprice) {
        this.seckillprice = seckillprice;
    }

    public int getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(int originalprice) {
        this.originalprice = originalprice;
    }

    public int getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(int merchantid) {
        this.merchantid = merchantid;
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    public int getAuditstate() {
        return auditstate;
    }

    public void setAuditstate(int auditstate) {
        this.auditstate = auditstate;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getStartTimeStr() {
        return startTimeStr;
    }

    public void setStartTimeStr(String startTimeStr) {
        this.startTimeStr = startTimeStr;
    }

    public String getEndTimeStr() {
        return endTimeStr;
    }

    public void setEndTimeStr(String endTimeStr) {
        this.endTimeStr = endTimeStr;
    }

    public int getProductcount() {
        return productcount;
    }

    public void setProductcount(int productcount) {
        this.productcount = productcount;
    }

    public int getStockcount() {
        return stockcount;
    }

    public void setStockcount(int stockcount) {
        this.stockcount = stockcount;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
}
