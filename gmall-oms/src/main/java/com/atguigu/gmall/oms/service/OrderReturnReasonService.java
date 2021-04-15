package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.oms.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author Firer
 * @email 897287046@qq.com
 * @date 2021-04-14 18:41:52
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

