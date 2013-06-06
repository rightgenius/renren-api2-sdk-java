/**
 * Autogenerated by renren-api2-generator 2013-06-06 15:02:04
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.renren.api.service;

import java.io.File;
import java.util.*;

import com.renren.api.AccessToken;
import com.renren.api.ObjectMappingException;
import com.renren.api.RennException;
import com.renren.api.RennExecutor;
import com.renren.api.RennParam;
import com.renren.api.RennRequest;
import com.renren.api.RennRequest.Method;
import com.renren.api.RennResponse;
import com.renren.api.mapper.JsonMappingException;
import com.renren.api.mapper.ObjectMapper;

public class StatusService {
	private RennExecutor executor;

    private AccessToken token;

    private ObjectMapper mapper;
	
    /**
     * @param executor
     * @param token
     * @param mapper
     */
    public StatusService(RennExecutor executor, AccessToken token, ObjectMapper mapper) {
        super();
        this.executor = executor;
        this.token = token;
        this.mapper = mapper;
    }

    /**
     * 获取用户状态
     * @param statusId 状态ID
     * @param ownerId 状态所有者的用户ID
     * @return Status 状态
     * @throws   RennException 
     * STATUS_NOT_EXIST 该状态不存在或者已删除。 
     */
    public Status getStatus (Long  statusId, Long  ownerId) throws RennException {
        Map<String, String> textParams = new HashMap<String, String>();
        if (statusId != null) {
            textParams.put("statusId", RennParam.asString(statusId));
        }
        if (ownerId != null) {
            textParams.put("ownerId", RennParam.asString(ownerId));
        }
        Map<String, String> bodyParams = new HashMap<String, String>();
        Map<String, File> fileParams = new HashMap<String, File>();
        RennRequest request = new RennRequest("/v2/status/get", Method.GET, textParams, bodyParams, fileParams, token);
        RennResponse response = executor.execute(request);
        try {
            return (Status)mapper.mapCommon(response.getResponse().toString(), Status.class);
        } catch (JsonMappingException e) {
            throw new ObjectMappingException();
        }
    }
    /**
     * 更新用户状态
     * @param content 状态的内容。状态内容不能长于240个字符。内容中的UBB表情代码未经过处理，需要开发者自行进行替换。UBB表情参见：[http://wiki.dev.renren.com/wiki/V2/ubb/list 获取人人网ubb列表]
     * @return Status 状态
     * @throws   RennException 
     * FAST_RATE_COUNT 请不要频繁发布状态。 
     * STATUS_TOO_LONG 状态内容不能长于240个字符。 
     * STATUS_PROHIBITED 抱歉，某些信息不能发布的哦：）谢谢您的谅解。 
     * STATUS_NOT_NULL 状态内容不能为空。 
     */
    public Status putStatus (String  content) throws RennException {
        Map<String, String> textParams = new HashMap<String, String>();
        if (content != null) {
	    textParams.put("content", content);
        }
        Map<String, String> bodyParams = new HashMap<String, String>();
        Map<String, File> fileParams = new HashMap<String, File>();
        RennRequest request = new RennRequest("/v2/status/put", Method.POST, textParams, bodyParams, fileParams, token);
        RennResponse response = executor.execute(request);
        try {
            return (Status)mapper.mapCommon(response.getResponse().toString(), Status.class);
        } catch (JsonMappingException e) {
            throw new ObjectMappingException();
        }
    }
    /**
     * 获取用户状态列表
     * @param ownerId 状态所有者的用户ID
     * @param pageSize 页面大小。取值范围1-100，默认大小20
     * @param pageNumber 页码。取值大于零，默认值为1
     * @return Status 状态
     * @throws   RennException 
     * PAGE_SIZE_NOT_IN_RANGE 页面大小不在1-100范围内。 
     * PAGE_NUMBER_MUST_LARGER_0 页码必须大于0。 
     */
    public Status [] listStatus (Long  ownerId, Integer  pageSize, Integer  pageNumber) throws RennException {
        Map<String, String> textParams = new HashMap<String, String>();
        if (ownerId != null) {
            textParams.put("ownerId", RennParam.asString(ownerId));
        }
        if (pageSize != null) {
            textParams.put("pageSize", RennParam.asString(pageSize));
        }
        if (pageNumber != null) {
            textParams.put("pageNumber", RennParam.asString(pageNumber));
        }
        Map<String, String> bodyParams = new HashMap<String, String>();
        Map<String, File> fileParams = new HashMap<String, File>();
        RennRequest request = new RennRequest("/v2/status/list", Method.GET, textParams, bodyParams, fileParams, token);
        RennResponse response = executor.execute(request);
        try {
            return (Status [])mapper.mapCommon(response.getResponse().toString(), Status.class);
        } catch (JsonMappingException e) {
            throw new ObjectMappingException();
        }
    }
    /**
     * 分享用户状态
     * @param content 状态的内容。状态内容不能长于240个字符。内容中的UBB表情代码未经过处理，需要开发者自行进行替换。UBB表情参见：[http://wiki.dev.renren.com/wiki/V2/ubb/list 获取人人网ubb列表]
     * @param statusId 状态ID
     * @param ownerId 状态所有者的用户ID
     * @return Status 状态
     * @throws   RennException 
     * STATUS_NOT_EXIST 该状态不存在或者已删除。 
     * FAST_RATE_COUNT 请不要频繁发布状态。 
     * STATUS_TOO_LONG 状态内容不能长于240个字符。 
     * STATUS_PROHIBITED 抱歉，某些信息不能发布的哦：）谢谢您的谅解。 
     */
    public Status shareStatus (String  content, Long  statusId, Long  ownerId) throws RennException {
        Map<String, String> textParams = new HashMap<String, String>();
        if (content != null) {
	    textParams.put("content", content);
        }
        if (statusId != null) {
            textParams.put("statusId", RennParam.asString(statusId));
        }
        if (ownerId != null) {
            textParams.put("ownerId", RennParam.asString(ownerId));
        }
        Map<String, String> bodyParams = new HashMap<String, String>();
        Map<String, File> fileParams = new HashMap<String, File>();
        RennRequest request = new RennRequest("/v2/status/share", Method.POST, textParams, bodyParams, fileParams, token);
        RennResponse response = executor.execute(request);
        try {
            return (Status)mapper.mapCommon(response.getResponse().toString(), Status.class);
        } catch (JsonMappingException e) {
            throw new ObjectMappingException();
        }
    }
}
