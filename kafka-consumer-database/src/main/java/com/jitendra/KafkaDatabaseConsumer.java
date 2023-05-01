package com.jitendra;

import com.jitendra.entity.WikimediaDataEntity;
import com.jitendra.repo.WikimediaDataRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    @Autowired
    private WikimediaDataRepo dataRepository;
    @KafkaListener(topics = "wikimedia_recentchange",groupId = "myGroup")
    public void consume(String eventMessage){

        LOGGER.info("msg rec ---> "+eventMessage);

        WikimediaDataEntity wikimediaDataEntity=new WikimediaDataEntity();
        wikimediaDataEntity.setWikiEventData(eventMessage);

        dataRepository.save(wikimediaDataEntity);
    }

}
