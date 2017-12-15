package com.fei.main.part3.section16_4;

public class Client {
    private static MXList mxl;

    public static void main(String[] args)
            throws Exception {
        mxl = MXList.getInstance("dns://dnsO1390.ny.jeffcorp.com",
                "jeffcorp.com");
        for (int i = 0; i < mxl.size(); i++) {
            System.out.println(
                            (1 + i)
                            + "） priority = "
                            + ((MailServer) mxl.elementAt(i)).getPriority()
                            + ", Name = "
                            + ((MailServer)
                            mxl.elementAt(i)).getServer()
            );
        }
    }
}