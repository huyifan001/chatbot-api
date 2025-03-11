package org.example.chatbot.api.domain.zsxq.model.vo;

/**
 * <h3>chatbot-api</h3>
 * <p>Group</p>
 *
 * @author : hyf
 * @date : 2025-03-10 20:01
 **/
public class Group {

    private String group_id;

    private String name;

    private String type;

    public void setGroup_id(String group_id){
        this.group_id = group_id;
    }
    public String getGroup_id(){
        return this.group_id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }

}
