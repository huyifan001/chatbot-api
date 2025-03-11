package org.example.chatbot.api.domain.zsxq.model.res;

import org.example.chatbot.api.domain.zsxq.model.vo.Topics;

import java.util.List;

/**
 * <h3>chatbot-api</h3>
 * <p>RespData</p>
 *
 * @author : hyf
 * @date : 2025-03-11 14:11
 **/
public class RespData {

    private List<Topics> topics;

    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }

}
