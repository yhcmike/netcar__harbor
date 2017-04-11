package org.netCar.handle;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.listener.MessageListener;

public class KafkaConsumer implements MessageListener<String, String> {
    protected final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);
    
    public KafkaConsumer(){
    	System.out.println("miks sb");
    }

    /**
     * 监听器自动执行该方法
     *     消费消息
     *     自动提交offset
     *     执行业务代码
     *     （high level api 不提供offset管理，不能指定offset进行消费）
     */
    @Override
    public void onMessage(ConsumerRecord<String, String> record) {
    	log.info("=============kafkaConsumer开始消费=============");
        String topic = record.topic();
        String key = record.key();
        String value = record.value();
        long offset = record.offset();
        int partition = record.partition();
        log.info("-------------topic:"+topic);
        log.info("-------------value:"+value);
        log.info("-------------key:"+key);
        log.info("-------------offset:"+offset);
        log.info("-------------partition:"+partition);
        log.info("~~~~~~~~~~~~~kafkaConsumer消费结束~~~~~~~~~~~~~");
    }
}
