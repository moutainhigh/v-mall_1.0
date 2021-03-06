package com.vmall.pojo;


import java.io.Serializable;
import java.util.List;

/**
 * 购物车类
 */
public class VShoppingcart implements Serializable {

  private long vCartId; //购物车id
  private long vCartProductId; //购物车商品对象id
  private long vUserId; //用户id
  private List<VCartproduct> vCartproduct; //购物车商品对象


  public long getvCartId() {
    return vCartId;
  }

  public void setvCartId(long vCartId) {
    this.vCartId = vCartId;
  }

  public long getvCartProductId() {
    return vCartProductId;
  }

  public void setvCartProductId(long vCartProductId) {
    this.vCartProductId = vCartProductId;
  }

  public long getvUserId() {
    return vUserId;
  }

  public void setvUserId(long vUserId) {
    this.vUserId = vUserId;
  }

  public List<VCartproduct> getvCartproduct() {
    return vCartproduct;
  }

  public void setvCartproduct(List<VCartproduct> vCartproduct) {
    this.vCartproduct = vCartproduct;
  }
}
