package com.five.year.demo.xmlParser;

import com.thoughtworks.xstream.XStream;

/**
 * @Date 2022/11/9 14:44
 * @Created by ltc
 */

public class Demo {
    public static void main(String[] args) {
        String msg = "<xml>\n" +
                "    <ToUserName><![CDATA[gh_dfeaadc167ff]]></ToUserName>\n" +
                "</xml>";

        XStream xstream = new XStream();
        xstream.autodetectAnnotations(true);
        xstream.ignoreUnknownElements();
        xstream.processAnnotations(TicketDataXml.class);
        xstream.allowTypes(new Class[]{TicketDataXml.class});
        TicketDataXml bean = (TicketDataXml) xstream.fromXML(msg);
        System.out.println(bean);
    }
}
