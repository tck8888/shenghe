package com.tck.shenghe.service.impl;

import com.tck.shenghe.dataobject.ClassicInfo;
import com.tck.shenghe.repository.ClassicInfoRepository;
import com.tck.shenghe.service.ClassicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:tck
 * @Description:
 * @Date:2018/11/23
 **/
@Service
public class ClassicInfoServiceImpl implements ClassicInfoService {

    @Autowired
    private ClassicInfoRepository repository;


    @Override
    public ClassicInfo findLatest() {
        return repository.findById(1).get();
    }

    @Override
    public void likeAdd(Integer art_id, Integer type) {
        ClassicInfo classicInfo = repository.findById(art_id).get();
        classicInfo.setLikeStatus(1);
        classicInfo.setFavNumber(classicInfo.getFavNumber()+1);
        repository.save(classicInfo);
    }

    @Override
    public void likeCancel(Integer art_id, Integer type) {
        ClassicInfo classicInfo = repository.findById(art_id).get();
        classicInfo.setLikeStatus(0);
        classicInfo.setFavNumber(classicInfo.getFavNumber()-1);
        repository.save(classicInfo);
    }
}
