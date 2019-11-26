package com.andyadc.dubbo.service;

import com.andyadc.dubbo.api.EchoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author andy.an
 * @since 2018/11/14
 */
public class EchoServiceImpl implements EchoService {

    private static final Logger logger = LoggerFactory.getLogger(EchoServiceImpl.class);

    @Override
    public String echo(String message) {
        logger.info("message={}", message);
        return "Hello " + message;
    }
}
