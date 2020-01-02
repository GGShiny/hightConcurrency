package com.thought.it.entity;

import java.util.Date;

/**
 * 秒杀订单
 * Created by Administrator on 2019/10/21.
 */
public class SkOrder {
    private int id; //主键
    private int productid;  //秒杀商品id
    private int payamount;  //支付金额
    private int userid; //用户id
    private int merchantid; //商家id
    private Date createtime;    //创建时间
    private Date paytime;   //支付时间
    private int paystatus;  //支付状态  1.未支付   2.已支付   3.退款成功
    private String recivingaddress; //收货地址
    private int recivingphone;  //收货人电话
    private String recivingname;    //收货人名称
    private String tradeserialnumber;   //交易流水号
    private int num;    //购买数
    private int paytype;    //支付方式

    public int getPaytype() {
        return paytype;
    }

    public void setPaytype(int paytype) {
        this.paytype = paytype;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "SkOrder{" +
                "id=" + id +
                ", productid=" + productid +
                ", payamount=" + payamount +
                ", userid=" + userid +
                ", merchantid=" + merchantid +
                ", createtime=" + createtime +
                ", paytime=" + paytime +
                ", paystatus=" + paystatus +
                ", recivingaddress='" + recivingaddress + '\'' +
                ", recivingphone=" + recivingphone +
                ", recivingname='" + recivingname + '\'' +
                ", tradeserialnumber='" + tradeserialnumber + '\'' +
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

    public int getPayamount() {
        return payamount;
    }

    public void setPayamount(int payamount) {
        this.payamount = payamount;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(int merchantid) {
        this.merchantid = merchantid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public int getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(int paystatus) {
        this.paystatus = paystatus;
    }

    public String getRecivingaddress() {
        return recivingaddress;
    }

    public void setRecivingaddress(String recivingaddress) {
        this.recivingaddress = recivingaddress;
    }

    public int getRecivingphone() {
        return recivingphone;
    }

    public void setRecivingphone(int recivingphone) {
        this.recivingphone = recivingphone;
    }

    public String getRecivingname() {
        return recivingname;
    }

    public void setRecivingname(String recivingname) {
        this.recivingname = recivingname;
    }

    public String getTradeserialnumber() {
        return tradeserialnumber;
    }

    public void setTradeserialnumber(String tradeserialnumber) {
        this.tradeserialnumber = tradeserialnumber;
    }
}
