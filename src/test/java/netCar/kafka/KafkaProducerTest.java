package netCar.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * kafka读写测试类
 * @author miaohongbin
 * @version
 * Date: 2016年6月24日 下午6:22:38 <br/>
 * @since
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration   
({"/spring-application.xml"}) //加载配置文件  
public class KafkaProducerTest {

    @Autowired
    private KafkaTemplate<Integer, String> kafkaTemplate;

    /**
     * 向kafka里写数据.<br/>
     * @author miaohongbin
     * Date:2016年6月24日下午6:22:58
     */
    @Test
    public void testTemplateSend(){
        kafkaTemplate.send("test","hello111");
        kafkaTemplate.sendDefault("teststtss----------");
    }

}
