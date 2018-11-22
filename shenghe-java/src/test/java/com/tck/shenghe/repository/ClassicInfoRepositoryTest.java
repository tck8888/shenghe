package com.tck.shenghe.repository;

import com.tck.shenghe.dataobject.ClassicInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassicInfoRepositoryTest {

    @Autowired
    private ClassicInfoRepository repository;

    @Test
    public void saveTest() {
        ClassicInfo classicInfo = new ClassicInfo();
        classicInfo.setContent("人生不能像做菜，把所有的料准备好才下锅");
        classicInfo.setFav_nums(12);
        classicInfo.setImage("http://127.0.0.1:5000/images/movie.7.png");
        classicInfo.setIndex(7);
        classicInfo.setLike_status(1);
        classicInfo.setTitle("李安<<饮食男女>>");
        classicInfo.setType(100);
        repository.save(classicInfo);
    }
}