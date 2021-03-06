package com.unicom.msg.client.service;

import com.unicom.common.model.ResultBody;
import com.unicom.msg.client.model.SmsMessage;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 推送通知
 * @author woodev
 */
public interface ISmsClient {
    /**
     * 短信通知
     * @param message
     * @return
     */
    @ApiOperation("发送短信")
    @PostMapping("/sms")
    ResultBody<String> send(
            @RequestBody SmsMessage message
    );

}
