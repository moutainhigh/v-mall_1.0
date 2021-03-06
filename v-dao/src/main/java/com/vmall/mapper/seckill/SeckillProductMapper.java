package com.vmall.mapper.seckill;

import com.vmall.pojo.VSeckillProduct;
import com.vmall.pojo.vo.SeckillProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface SeckillProductMapper {

    /**
     * 新增秒杀商品
     * @param seckillProductVO
     * @return
     */
    int insertSeckillProduct(SeckillProductVO seckillProductVO);


    /**
     * 读取所有秒杀商品
     * @return
     */
    List<VSeckillProduct> listSeckillProducts();


    /**
     * 修改秒杀商品信息
     * @param
     * @return
     */
    int updateSeckillProduct(VSeckillProduct v_seckill_id);


    /**
     * 根据秒杀商品id获取该秒杀商品的数量
     * @param v_seckill_id 秒杀商品id
     * @return 剩余数量
     */
    int getSeckillProductRemain(Integer v_seckill_id);




}
