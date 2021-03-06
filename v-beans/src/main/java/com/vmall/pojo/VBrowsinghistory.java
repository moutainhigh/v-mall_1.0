package com.vmall.pojo;


import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 浏览记录类
 */
public class VBrowsinghistory implements Serializable {

  private long vHistoryId; //记录id
  private long vUserId; //用户id
  private long vProductId; //商品id
  private Timestamp vBrowsTime;//浏览时间
  private VProduct vProduct; //商品对象

  public Timestamp getvBrowsTime() {
    return vBrowsTime;
  }

  public void setvBrowsTime(Timestamp vBrowsTime) {
    this.vBrowsTime = vBrowsTime;
  }

  public long getvHistoryId() {
    return vHistoryId;
  }

  public void setvHistoryId(long vHistoryId) {
    this.vHistoryId = vHistoryId;
  }

  public long getvUserId() {
    return vUserId;
  }

  public void setvUserId(long vUserId) {
    this.vUserId = vUserId;
  }

  public long getvProductId() {
    return vProductId;
  }

  public void setvProductId(long vProductId) {
    this.vProductId = vProductId;
  }

  public VProduct getvProduct() {
    return vProduct;
  }

  public void setvProduct(VProduct vProduct) {
    this.vProduct = vProduct;
  }
}
