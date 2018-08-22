package com.reizx.luaj.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.reizx.luaj.util.LogUtil;

/**
 * 开机启动广播
 */
public class BootBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        LogUtil.d(BootBroadcast.class.toString(),"receive BootBroadcast");
    }
}
