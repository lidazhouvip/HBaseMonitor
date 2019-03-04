package com.ldz.hbase.monitor;

import java.io.IOException;

/**
 * @Author: Dazhou Li
 * @Description:
 * @CreateDate: 2019/3/1 0001 14:43
 */
public class MonitorApp {

    public static void main(String[] args) throws Exception {

        StatefulHttpClient client = new StatefulHttpClient(null);
        HadoopUtil.getHdfsSummary(client).printInfo();
        HBaseUtil.getHbaseSummary(client).printInfo();
    }
}
