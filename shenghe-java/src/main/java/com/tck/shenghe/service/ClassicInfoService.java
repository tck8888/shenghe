package com.tck.shenghe.service;

import com.tck.shenghe.dataobject.ClassicInfo;

/**
 * @Author:tck
 * @Description:
 * @Date:2018/11/23
 **/
public interface ClassicInfoService {

    ClassicInfo findLatest();

    void likeAdd(Integer art_id, Integer type);

    void likeCancel(Integer art_id, Integer type);
}
