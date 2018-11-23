package com.tck.shenghe.controller;



import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.tck.shenghe.VO.ResultVO;
import com.tck.shenghe.dataobject.ClassicInfo;
import com.tck.shenghe.dto.ClassicRequestBody;
import com.tck.shenghe.service.ClassicInfoService;
import com.tck.shenghe.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:tck
 * @Description:
 * @Date:2018/11/23
 **/
@RestController
@RequestMapping("/classic")
public class ClassicInfoController {

    @Autowired
    private ClassicInfoService classicInfoService;

    @GetMapping("/latest")
    public ResultVO findLatest() {
        ClassicInfo classicInfo = classicInfoService.findLatest();
        return ResultVOUtil.success(classicInfo);
    }

    @PostMapping("/like/add")
    public ResultVO likeAdd(@RequestBody ClassicRequestBody requestBody) {
        classicInfoService.likeAdd(requestBody.getArt_id(), requestBody.getType());
        return ResultVOUtil.success();
    }

    @PostMapping("/like/cancel")
    public ResultVO likeCancel(@RequestBody ClassicRequestBody requestBody) {
        classicInfoService.likeCancel(requestBody.getArt_id(), requestBody.getType());
        return ResultVOUtil.success();
    }
}
