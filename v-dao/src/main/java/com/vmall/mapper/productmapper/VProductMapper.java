package com.vmall.mapper.productmapper;

import com.vmall.pojo.*;
import com.vmall.pojo.vo.CategoryVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VProductMapper {

    //库存减少
    Integer updateVProductStoreByProductId(@Param("productId") long productId, @Param("num") long num);
    //根据商品名称查询商品id
    VProduct getVProductIdByProductName(String vProductName);
    //查询所有的商品
    List<VProduct> listProduct(@Param("vProductName")String vProductName, @Param("PageNo") Integer PageNo, @Param("pageSize")Integer pageSize);
    int count(@Param("vProductName")String vProductName);
    //查看商品
    VProduct chakanvproduct(@Param("id")Integer id);
    //根据商品的id查询库存
    //修改前
    List<VProduct>productid(@Param("id") Integer id);
    //修改商品
    int upd(VProduct product);
    //添加商品
    int add(VProduct product);
    //删除商品
    int del(@Param("id") Integer id);

    public VProduct getVProductNameByProductId(String productId);//根据商品id查询商品名称

    //修改预警货品
    int updearly(VProduct product);
    //修改库存
    int inventory(VProduct vProduct);
    //上架下架
    int putawayproduct(VProduct vProduct);
    //用solr查询商品
    List<VProduct>solrvProduct(@Param("vProductName")String vProductName, @Param("PageNo") Integer PageNo, @Param("pageSize")Integer pageSize);

    //一级分类
    List<VCategory>getVCategoryLevel1();
    //二三级分类
    List<VCategory>getVCategoryLevel2(@Param("vCategoryId") int vCategoryId);
    //删除目录
   int getDelCategoryLv1ById(@Param("vCategoryId") int vCategoryId);
   //查找不同分级
    List<VCategory>getVCategoryLevelfen(@Param("vType") int vType);
    //新增分类
    int addClassification(@Param("vType") int vType,@Param("vParentCategoryId") int vParentCategoryId,@Param("vCategoryName") String vCategoryName);
    //查找所有订单内容
    List<VOrder>allOrder();
    //某订单下的订单详情
    List<VOrderDetails>allOrderDetails(int vOrderId);
    //修改某商品的销售总量
    int updateProductVolume(@Param("vSalesVolume") int vSalesVolume,@Param("vProductId")int vProductId);
    VProduct getSelectProductById(int vProductId);
    List<VProduct>getSelectProductTop(@Param("vSalesVolume")String vSalesVolume,@Param("vCreateDate")String vCreateDate,@Param("vCommonsCount")String vCommonsCount);
    /**
     * 根据查询指定分类下的所有商品数据
     * @param categoryVO
     * @return
     */
    List<VProduct> listProductsByLevels(CategoryVO categoryVO);


    /**
     * 根据商品id查询规格信息
     * @param productId 商品id
     * @return
     */
    List<VSku> listSkuByProductId(Integer productId);

    //查询查询分类id
    List<VCategory>vcategoryid(Integer id);

    //Product getVProductNameByProductId(String productId);//根据商品id查询商品名称

    Integer shuStore(@Param("productId") Integer productId,@Param("num")Integer num);//根据商品id修改库存

}
