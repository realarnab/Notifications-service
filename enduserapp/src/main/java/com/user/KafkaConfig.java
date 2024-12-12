package com.user;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = AppConstant.LOCATION_UPDATE_TOPIC, groupId = AppConstant.GROUP_ID)
    public void updateLocation(String value){

    }
}
