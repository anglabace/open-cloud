package com.unicom.msg.server.service;

import com.unicom.common.mybatis.base.service.IBaseService;
import com.unicom.msg.client.model.entity.EmailConfig;

import java.util.List;

/**
 * 邮件发送配置 服务类
 *
 * @author admin
 * @date 2019-07-25
 */
public interface EmailConfigService extends IBaseService<EmailConfig> {
    /**
     * 加载缓存配置
     */
   void loadCacheConfig();

    /**
     * 获取缓存的配置
     *
     * @return
     */
    List<EmailConfig> getCacheConfig();
}
