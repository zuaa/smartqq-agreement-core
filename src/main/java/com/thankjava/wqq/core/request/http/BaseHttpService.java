package com.thankjava.wqq.core.request.http;

import java.util.concurrent.atomic.AtomicLong;

import com.thankjava.toolkit3d.http.async.AsyncHttpClient;
import com.thankjava.toolkit3d.http.async.AsyncHttpClientBuilder;
import com.thankjava.toolkit3d.http.async.entity.RequestParams;
import com.thankjava.wqq.consts.ConstsParams;
import com.thankjava.wqq.core.request.Request;
import com.thankjava.wqq.entity.Session;

public abstract class BaseHttpService implements Request{

	protected final Session session = Session.getSession();
	
	protected static final AtomicLong msgId =  new AtomicLong(ConstsParams.INIT_MSG_ID);
	
	public final static AsyncHttpClient asyncHttpClient = AsyncHttpClientBuilder.createDefault();
	
	/**
	 * 组装请求参数
	* <p>Function: buildRequestParams</p>
	* <p>Description: </p>
	* @author zhaoxy@thankjava.com
	* @date 2016年12月19日 上午11:43:02
	* @version 1.0
	* @return
	 */
	protected abstract RequestParams buildRequestParams();
	
}
