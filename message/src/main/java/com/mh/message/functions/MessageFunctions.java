package com.mh.message.functions;

import com.mh.message.dto.LowStockMessageDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class MessageFunctions {
    private static final Logger log = LoggerFactory.getLogger(MessageFunctions.class);

    @Bean
    public Function<LowStockMessageDto,LowStockMessageDto> processLowStock() {
        return lowStockMessageDto -> {
            log.info("Sending email with the details : " +  lowStockMessageDto.toString());
            return lowStockMessageDto;
        };
    }

    @Bean
    public Function<LowStockMessageDto,Long> sms() {
        return lowStockMessageDto -> {
            log.info("Sending sms with the details : " +  lowStockMessageDto.toString());
            return lowStockMessageDto.itemId();
        };
    }

}
