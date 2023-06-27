package com.personal.csp.network;

import java.util.HashMap;

import retrofit2.Retrofit;

/**
 * @类描述
 * @创建人: chensp
 * @日期: 2021/8/4 16:58
 * @版权: https://www.instrument.com.cn
 * @param <T> API interfaces
 * other attention:  Retrofit API interfaces must not extend other interfaces.
 */
public abstract class BaseModel<T> {

    public HashMap<Retrofit, T> mHashMap = new HashMap<>();

    //封装一个获取唯一接口实例的方法  继承类必须重写此方法
    public abstract T getSingleService(Retrofit retrofit);
}
