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
        classicInfo.setId(1);
        classicInfo.setContent("人生不能像做菜，把所有的料准备好才下锅");
        classicInfo.setFavNumber(12);
        classicInfo.setImage("https://gss3.bdstatic.com/-Po3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=32c85338c2177f3e0439f45f11a650a2/aa18972bd40735fa05cd8f3795510fb30f24087b.jpg");
        classicInfo.setIssueNumber(7);
        classicInfo.setLikeStatus(0);
        classicInfo.setTitle("李安<<饮食男女>>");
        classicInfo.setType(100);
       repository.save(classicInfo);
    }

   @Test
    public void deleteTest(){
        repository.deleteById(2);
   }
}