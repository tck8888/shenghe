package com.tck.shenghe.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
public class ClassicInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String content;
    private String image;
    private Integer type;
    private Integer fav_nums;
    private Integer index;
    private Integer like_status;

}


/*CREATE TABLE `classic_info` (
	`id` INT NOT NULL auto_increment COMMENT '期刊在数据中序号，供点赞使用',
	`title` VARCHAR ( 64 ) NOT NULL COMMENT '期刊题目',
	`content` VARCHAR ( 64 ) NOT NULL COMMENT '期刊内容',
	`image` VARCHAR ( 256 ) NOT NULL COMMENT '图片',
	`type` INT NOT NULL COMMENT '期刊类型,这里的类型分为:100 电影 200 音乐 300 句子',
	`fav_nums` INT NOT NULL COMMENT '点赞次数',
	`index` INT NOT NULL COMMENT '期号',
	`like_status` TINYINT ( 2 ) NOT NULL DEFAULT '0' COMMENT '订单状态, 默认为新下单',
	`pubdate` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布日期',
	`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
PRIMARY KEY ( `id` )
);*/