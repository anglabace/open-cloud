package com.unicom.msg.client.service;

import com.unicom.common.model.ResultBody;
import com.unicom.msg.client.model.WebHookMessage;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 推送通知
 *
 * @author woodev
 */
public interface IWebHookClient {

    /**
     * Webhook异步通知
     *
     * @param message
     * @return
     */
    @ApiOperation("Webhook异步通知")
    @PostMapping("/webhook")
    ResultBody<String> send(
            @RequestBody WebHookMessage message
    ) throws Exception;
}
