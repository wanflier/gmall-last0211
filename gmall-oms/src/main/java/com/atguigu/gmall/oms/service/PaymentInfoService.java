package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.oms.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author Firer
 * @email 897287046@qq.com
 * @date 2021-04-14 18:41:52
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

