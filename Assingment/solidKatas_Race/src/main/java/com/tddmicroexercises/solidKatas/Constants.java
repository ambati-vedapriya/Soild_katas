package com.tddmicroexercises.solidKatas;

import java.util.Random;

public class Constants

{
    public  static  final  String  DIAGNOSTIC_MESSAGE="AT#UD";
    public static final  String STATEMENT="\"   \\\"LAST TX rate................ 100 MBPS\\\\r\\\\n\\\"\\n\" +\n" +
            "            \"                            + \\\"HIGHEST TX rate............. 100 MBPS\\\\r\\\\n\\\"\\n\" +\n" +
            "            \"                            + \\\"LAST RX rate................ 100 MBPS\\\\r\\\\n\\\"\\n\" +\n" +
            "            \"                            + \\\"HIGHEST RX rate............. 100 MBPS\\\\r\\\\n\\\"\\n\" +\n" +
            "            \"                            + \\\"BIT RATE.................... 100000000\\\\r\\\\n\\\"\\n\" +\n" +
            "            \"                            + \\\"WORD LEN.................... 16\\\\r\\\\n\\\"\\n\" +\n" +
            "            \"                            + \\\"WORD/FRAME.................. 511\\\\r\\\\n\\\"\\n\" +\n" +
            "            \"                            + \\\"BITS/FRAME.................. 8192\\\\r\\\\n\\\"\\n\" +\n" +
            "            \"                            + \\\"MODULATION TYPE............. PCM/FM\\\\r\\\\n\\\"\\n\" +\n" +
            "            \"                            + \\\"TX Digital Los.............. 0.75\\\\r\\\\n\\\"\\n\" +\n" +
            "            \"                            + \\\"RX Digital Los.............. 0.10\\\\r\\\\n\\\"\\n\" +\n" +
            "            \"                            + \\\"BEP Test.................... -5\\\\r\\\\n\\\"\\n\" +\n" +
            "            \"                            + \\\"Local Rtrn Count............ 00\\\\r\\\\n\\\"\\n\" +\n" +
            "            \"                            + \\\"Remote Rtrn Count........... 00\\\";\";\n";

    public  static  final Random connectionEventsSimulator = new Random(42);
    public static final String DiagnosticChannelConnectionString = "*111#";
}

