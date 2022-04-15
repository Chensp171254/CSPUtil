package com.personal.csp.utils;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.StringRes;

/**
 * @类描述 toast工具类
 * @创建人: chensp
 * @日期: 2022/4/15 10:33
 * @版权: https://www.instrument.com.cn
 */
public class ToastCspUtil {

    public static void showToast(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }
    public static void showToast(Context context, @StringRes int msgId) {
        Toast.makeText(context, msgId, Toast.LENGTH_SHORT).show();
    }
    public static void showToastLong(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
    public static void showToastLong(Context context, @StringRes int msgId) {
        Toast.makeText(context, msgId, Toast.LENGTH_LONG).show();
    }
}
