package org.example.chatbot.api.domain.zsxq.model.req;

/**
 * <h3>chatbot-api</h3>
 * <p>AnswerReq</p>
 *
 * @author : hyf
 * @date : 2025-03-11 14:12
 **/
public class AnswerReq {

    private ReqData req_data;

    public AnswerReq(ReqData req_data) {
        this.req_data = req_data;
    }

    public ReqData getReq_data() {
        return req_data;
    }

    public void setReq_data(ReqData req_data) {
        this.req_data = req_data;
    }

}