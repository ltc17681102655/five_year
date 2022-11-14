package com.five.year.demo.xmlParser;

import com.thoughtworks.xstream.annotations.XStreamAlias;


@XStreamAlias("xml")
public class TicketDataXml extends BaseDataXml {

    @XStreamAlias("AppId")
    private String appId;

    @XStreamAlias("Encrypt")
    private String encrypt;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }

    @Override
    public String toString() {
        return "TicketDataXml{" +
                "appId='" + appId + '\'' +
                ", encrypt='" + encrypt + '\'' +
                '}';
    }
}
