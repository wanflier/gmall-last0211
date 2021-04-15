package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Firer
 * @email 897287046@qq.com
 * @date 2021-04-14 18:41:52
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
