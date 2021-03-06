package com.vmall.mapper.skumapper;

import com.vmall.pojo.VProperties;
import com.vmall.pojo.VProperty;
import com.vmall.pojo.VSku;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VSkuMapper {
    public VSku getVSkuBySkuCode(@Param("skuCode")String skuCode);
    //根据条件查询所有的参数规格
    List<VProperties>getAllSku(@Param("vPropertiesId") int vPropertiesId);
    //根据ID删除某个规格
    int getDelSku(@Param("vPropertiesId") int vPropertiesId);
    //根据ID删除某个规格下的所有子规格
    int getDelSkuChild(@Param("vParentId")int vParentId);
    //根据ID删除某个子规格
    int getDelSkuMoChild(@Param("vPropertiesId")int vPropertiesId);
    //添加规格
    int getInsertSku(@Param("vPropertiesName")String vPropertiesName);
    //修改规格
    int getUpdateSku(@Param("vPropertiesName")String vPropertiesName,@Param("vPropertiesId")int vPropertiesId);
   //根据条件查询所包含规格参数
    List<VProperty>getmoSku(int vParentId);
    //添加规格值
    int getAddSkuGui(@Param("vPropertiesName")String vPropertiesName,@Param("vPropertiesId")int vPropertiesId );

    List<VSku> findAllSku();//查询所有sku
    List<Integer> findskuId(Integer productId);//根据商品id查询skuid
    VSku findskuIdBySkuName(String skuName);//根据shuname查询skuid
    VSku findProductIdBySkuId(Integer Skuid);//根据skuid查询商品id

}
