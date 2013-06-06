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

public class LikeService {
	private RennExecutor executor;

    private AccessToken token;

    private ObjectMapper mapper;
	
    /**
     * @param executor
     * @param token
     * @param mapper
     */
    public LikeService(RennExecutor executor, AccessToken token, ObjectMapper mapper) {
        super();
        this.executor = executor;
        this.token = token;
        this.mapper = mapper;
    }

    /**
     * 取消对站内资源的赞。
     * @param ugcOwnerId UGC所有者的用户ID
     * @param likeUGCType 
     * @param ugcId UGC的ID
     * @return Integer 取消成功返回1
     * @throws   RennException 
     * FAST_OPERATION 请不要频繁进行赞操作。 
     * SERVICE_UNAVAILABLE 服务端临时不可用 
     * UGC_TYPE_ILLEGAL 不支持的赞类型。 
     * HAS_ALREADY_NOT_LIKED 您还没有赞这个资源，不能取消赞。 
     * UGC_OWNER_NOT_EXIST 赞的UGC所有者不存在。 
     * UGC_NOT_EXIST 赞的UGC不存在。 
     */
    public Integer removeLikeUgc (Long  ugcOwnerId, LikeUGCType  likeUGCType, Long  ugcId) throws RennException {
        Map<String, String> textParams = new HashMap<String, String>();
        if (ugcOwnerId != null) {
            textParams.put("ugcOwnerId", RennParam.asString(ugcOwnerId));
        }
        if (likeUGCType != null) {
            textParams.put("likeUGCType", RennParam.asString(likeUGCType));
        }
        if (ugcId != null) {
            textParams.put("ugcId", RennParam.asString(ugcId));
        }
        Map<String, String> bodyParams = new HashMap<String, String>();
        Map<String, File> fileParams = new HashMap<String, File>();
        RennRequest request = new RennRequest("/v2/like/ugc/remove", Method.POST, textParams, bodyParams, fileParams, token);
        RennResponse response = executor.execute(request);
        try {
            return (Integer)mapper.mapCommon(response.getResponse().toString(), Integer.class);
        } catch (JsonMappingException e) {
            throw new ObjectMappingException();
        }
    }
    /**
     * 赞人人内部资源，相册、照片、日志、分享、视频等。
     * @param ugcOwnerId UGC所有者的用户ID
     * @param likeUGCType 
     * @param ugcId UGC的ID
     * @return Integer 赞成功返回1
     * @throws   RennException 
     * FAST_OPERATION 请不要频繁进行赞操作。 
     * SERVICE_UNAVAILABLE 服务端临时不可用 
     * UGC_TYPE_ILLEGAL 不支持的赞类型。 
     * HAS_ALREADY_LIKED 请不要重复喜欢一个资源。 
     * UGC_OWNER_NOT_EXIST 赞的UGC所有者不存在。 
     * UGC_NOT_EXIST 赞的UGC不存在。 
     */
    public Integer putLikeUgc (Long  ugcOwnerId, LikeUGCType  likeUGCType, Long  ugcId) throws RennException {
        Map<String, String> textParams = new HashMap<String, String>();
        if (ugcOwnerId != null) {
            textParams.put("ugcOwnerId", RennParam.asString(ugcOwnerId));
        }
        if (likeUGCType != null) {
            textParams.put("likeUGCType", RennParam.asString(likeUGCType));
        }
        if (ugcId != null) {
            textParams.put("ugcId", RennParam.asString(ugcId));
        }
        Map<String, String> bodyParams = new HashMap<String, String>();
        Map<String, File> fileParams = new HashMap<String, File>();
        RennRequest request = new RennRequest("/v2/like/ugc/put", Method.POST, textParams, bodyParams, fileParams, token);
        RennResponse response = executor.execute(request);
        try {
            return (Integer)mapper.mapCommon(response.getResponse().toString(), Integer.class);
        } catch (JsonMappingException e) {
            throw new ObjectMappingException();
        }
    }
}
